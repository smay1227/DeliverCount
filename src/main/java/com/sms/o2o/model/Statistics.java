package com.sms.o2o.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author SpiderMan
 * @Date: 2020/6/18
 */
@Getter
@Setter
public class Statistics {
    /**
     * 日期
     * 2020-06-18
     */
    private String date;

    public Long reportTotal = 0L;

    public Long reportSuccess = 0L;

    public Long reportFee = 0L;

    public Long upstream = 0L;
}
