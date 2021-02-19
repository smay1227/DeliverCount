package com.sms.o2o.controller;

import cn.hutool.json.JSONUtil;
import com.sms.o2o.model.ByteDanceReport;
import com.sms.o2o.model.ByteDanceUpstream;
import com.sms.o2o.model.HuiTong;
import com.sms.o2o.model.HuiTongReport;
import com.sms.o2o.model.HuiTongUpstream;
import com.sms.o2o.model.Report;
import com.sms.o2o.model.ReportData;
import com.sms.o2o.model.Result;
import com.sms.o2o.model.ResultByte;
import com.sms.o2o.model.Statistics;
import com.sms.o2o.model.Upstream;
import com.sms.o2o.model.UpstreamData;
import com.sms.o2o.service.ReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
@Slf4j
@RestController
@RequestMapping("/sms")
public class ReceiveController {

    @Autowired
    ReceiveService receiveService;

    @GetMapping("/info")
    public Collection<Statistics> info(){
        return receiveService.info();
    }

    @GetMapping("/save")
    public String save(){
        receiveService.save();
        return "0";
    }

    @RequestMapping("/v3/report")
    public String report(HttpServletRequest request){
        String body;
        try {
            body = getBody(request);
            String authorization = request.getHeader("Authorization");
            log.error(authorization);
            log.error(body);
            log.error("----------------");
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            return "-1";
        }
        ReportData reportData = JSONUtil.toBean(body, ReportData.class);
        commonDeal(reportData);
        return "0";
    }

    @RequestMapping("/v4/report")
    public Result reportV4(HttpServletRequest request){
        Result result = new Result();
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            result.setStatus(-1);
            return result;
        }
        ReportData reportData = JSONUtil.toBean(body, ReportData.class);
        commonDeal(reportData);
        result.setStatus(0);
        return result;
    }

    AtomicLong countHuiTong = new AtomicLong(0);
    @RequestMapping("/huiTong/report")
    public HuiTong huiTongReport(HttpServletRequest request){
        HuiTong result = new HuiTong();
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            result.setReturn_code("-1");
            return result;
        }
        HuiTongReport reportDatas = JSONUtil.toBean(JSONUtil.parseObj(body), HuiTongReport.class);
        List<Report> reports = new ArrayList<>();
        reportDatas.getBody().forEach(data -> {
            countHuiTong.addAndGet(1);
            Report report = new Report();
            report.setStatus(data.getStatus());
            reports.add(report);
        });
        if (reports.size() > 0){
            receiveService.batchAdd(reports);
        }
        result.setReturn_code("0000");
        return result;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    public void outCount(){
        log.error("count: " + countHuiTong);
        log.error("countUpstream: " + countHuiTongUpStream);
    }

    AtomicLong countHuiTongUpStream = new AtomicLong(0);
    @RequestMapping("/huiTong/upstream")
    public HuiTong upstreamHuiTong(HttpServletRequest request){
        HuiTong result = new HuiTong();
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("upstream body error {}", e.getMessage());
            result.setReturn_code("-1");
            return result;
        }
        HuiTongUpstream datas = JSONUtil.toBean(JSONUtil.parseObj(body), HuiTongUpstream.class);
        List<Upstream> upstreams = new ArrayList<>();
        datas.getBody().forEach(data -> {
            countHuiTongUpStream.addAndGet(1);
            Upstream upstream = new Upstream();
            upstreams.add(upstream);
        });
        if (upstreams.size() > 0){
            receiveService.batchAddUp(upstreams);
        }
        result.setReturn_code("0000");
        return result;
    }

    @RequestMapping("/byte/report")
    public ResultByte reportByte(HttpServletRequest request){
        ResultByte result = new ResultByte();
        String body;
        try {
            body = getBody(request);
            //log.error(body);
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            result.setCode("-1");
            return result;
        }
        List<ByteDanceReport> reportDatas = JSONUtil.toList(JSONUtil.parseArray(body), ByteDanceReport.class);
        List<Report> reports = new ArrayList<>();
        reportDatas.forEach(data -> {
            //count.addAndGet(1);
            Report report = new Report();
            report.setStatus(data.getCode());
            report.setFee(Integer.parseInt(data.getMsg_count()));
            report.setPhone(data.getMobile());
            reports.add(report);
        });
        if (reports.size() > 0){
            receiveService.batchAdd(reports);
        }
        result.setCode("0");
        return result;
    }

    @RequestMapping("/v3/upstream")
    public String upstream(HttpServletRequest request){
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            return "-1";
        }
        UpstreamData data = JSONUtil.toBean(body, UpstreamData.class);
        commonDeal(data);
        return "0";
    }

    @RequestMapping("/v4/upstream")
    public Result upstreamV4(HttpServletRequest request){
        Result result = new Result();
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("report body error {}", e.getMessage());
            result.setStatus(-1);
            return result;
        }
        UpstreamData data = JSONUtil.toBean(body, UpstreamData.class);
        commonDeal(data);
        result.setStatus(0);
        return result;
    }

    @RequestMapping("/byte/upstream")
    public ResultByte upstreamByte(HttpServletRequest request){
        ResultByte result = new ResultByte();
        String body;
        try {
            body = getBody(request);
            log.error(body);
        } catch (Exception e) {
            log.error("upstream body error {}", e.getMessage());
            result.setCode("-1");
            return result;
        }
        List<ByteDanceUpstream> datas = JSONUtil.toList(JSONUtil.parseArray(body), ByteDanceUpstream.class);
        List<Upstream> upstreams = new ArrayList<>();
        datas.stream().parallel().forEach(data -> {
            Upstream upstream = new Upstream();
            upstreams.add(upstream);
        });
        if (upstreams.size() > 0){
            receiveService.batchAddUp(upstreams);
        }
        result.setCode("0");
        return result;
    }

    private void commonDeal(ReportData reportData){
        if (reportData.getStatus() == 0){
            if (reportData.getResult().size() == 0){
                log.info("report result size is 0");
            }
            receiveService.batchAdd(reportData.getResult());
        }else {
            log.info("status is not 0");
        }
    }

    private void commonDeal(UpstreamData data){
        if (data.getStatus() == 0){
            if (data.getResult().size() == 0){
                log.info("report result size is 0");
            }
            receiveService.batchAddUp(data.getResult());
        }else {
            log.info("status is not 0");
        }
    }

    public String getBody(HttpServletRequest request) throws Exception {
        StringBuilder jb = new StringBuilder();
        String line;
        BufferedReader reader = request.getReader();
        while ((line = reader.readLine()) != null) {
            jb.append(line);
        }
        return jb.toString();
    }

}
