package com.sms.o2o.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.sms.o2o.model.Report;
import com.sms.o2o.model.Statistics;
import com.sms.o2o.model.Upstream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
@Slf4j
@Service
public class ReceiveServiceImpl implements ReceiveService{

    private static final String DELIVRD = "DELIVRD";
    //private static final String PATH = "D:/datas/statistic.txt";
    private static final String PATH = "/datas/statistic.txt";

    private BlockingQueue<Report> reportBlockingQueue;
    private BlockingQueue<Upstream> upstreamBlockingQueue;

    private final Map<String, Statistics> statisticsMap = new ConcurrentHashMap<>();

    private final AtomicLong count = new AtomicLong();

    //@Scheduled(cron = "*/10 * * * * ?")
    /*public void test() {
        log.info("=================={}==================", count.get());
        LocalDateTime now = LocalDateTime.now();
        if (now.getMinute() % 30 == 0) {
            count.set(0);
        }
    }*/

    @Override
    public Collection<Statistics> info() {
        return statisticsMap.values();
    }

    /**
     * 服务启动后延迟1小时执行，每隔2小时写到文件一次
     */
    @Scheduled(initialDelay = 60 * 60 * 1000, fixedRate = 2 * 60 * 60 * 1000)
    private void deltaSync() {
        save();
    }

    @PostConstruct
    public void init(){
        reportBlockingQueue = new ArrayBlockingQueue<>(10000);
        upstreamBlockingQueue = new ArrayBlockingQueue<>(10000);
        ReportThread reportThread = new ReportThread();
        reportThread.start();
        UpstreamThread upstreamThread = new UpstreamThread();
        upstreamThread.start();

        FileUtil.touch(PATH);

        FileReader fileReader = new FileReader(PATH);
        String json = fileReader.readString();
        if (StrUtil.isNotBlank(json)){
            List<Statistics> statistics = JSONUtil.toList(JSONUtil.parseArray(json), Statistics.class);
            if (statistics != null){
                statistics.forEach(s -> {
                    statisticsMap.put(s.getDate(), s);
                });
            }
        }
        log.info("load statistic size: {}", statisticsMap.size());
    }

    @Override
    public void batchAdd(List<Report> reports) {
        //count.addAndGet(reports.size());
        reports.forEach(this::add);
    }

    @Override
    public void add(Report report) {
        try {
            //count.addAndGet(1);
            reportBlockingQueue.put(report);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void batchAddUp(List<Upstream> reports) {
        reports.forEach(this::add);
    }

    @Override
    public void add(Upstream upstream) {
        try {
            upstreamBlockingQueue.put(upstream);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void takeReport(){
        try {
            Report report = reportBlockingQueue.take();
            String today = DateUtil.today();
            Statistics statistics = statisticsMap.get(today);
            if (statistics == null){
                statistics = new Statistics();
                statistics.setDate(today);
                statisticsMap.put(today, statistics);
            }
            if (DELIVRD.equals(report.getStatus())){
                statistics.reportSuccess ++;
            }
            statistics.reportFee = statistics.reportFee + report.getFee();
            statistics.reportTotal ++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void takeUpstream(){
        try {
            Upstream upstream = upstreamBlockingQueue.take();
            String today = DateUtil.today();
            Statistics statistics = statisticsMap.get(today);
            if (statistics == null){
                statistics = new Statistics();
                statistics.setDate(today);
                statisticsMap.put(today, statistics);
            }
            statistics.upstream ++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save() {
        Collection<Statistics> statistics = statisticsMap.values();
        String json = JSONUtil.toJsonStr(statistics);
        FileWriter fileWriter = new FileWriter(PATH);
        fileWriter.write(json);
    }

    private class ReportThread extends Thread{

        private ReportThread(){
            setName("report-thread");
        }

        @Override
        public void run() {
            while (true){
                takeReport();
            }
        }
    }

    private class UpstreamThread extends Thread{

        private UpstreamThread(){
            setName("upstream-thread");
        }

        @Override
        public void run() {
            while (true){
                takeUpstream();
            }
        }
    }
}
