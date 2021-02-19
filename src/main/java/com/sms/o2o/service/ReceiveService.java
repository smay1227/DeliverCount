package com.sms.o2o.service;

import com.sms.o2o.model.Report;
import com.sms.o2o.model.Statistics;
import com.sms.o2o.model.Upstream;

import java.util.Collection;
import java.util.List;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
public interface ReceiveService {

    /**
     * 添加
     * @param report
     */
    void add(Report report);

    /**
     * 批量添加
     * @param reports
     */
    void batchAdd(List<Report> reports);

    /**
     * 添加
     * @param report
     */
    void add(Upstream report);

    /**
     * 批量添加
     * @param reports
     */
    void batchAddUp(List<Upstream> reports);

    /**
     * 获取统计信息
     * @return
     */
    Collection<Statistics> info();

    /**
     * 信息保存到文件
     */
    void save();
}
