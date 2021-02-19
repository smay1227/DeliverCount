package com.sms.o2o.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangtao on 2021/2/5 10:17.
 */
@Getter
@Setter
public class HuiTongUpstream {
    //流水号
    private String serial_no;
    //渠道编号
    private String channel_no;
    //消息类型：1短信
    private String message_type;
    private List<HuiTongUpstreamBody> body = new ArrayList<>();
}
