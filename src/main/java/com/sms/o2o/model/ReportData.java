package com.sms.o2o.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
@Getter
@Setter
@ToString
public class ReportData {
    private int status;
    private List<Report> result;
}
