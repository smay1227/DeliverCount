package com.sms.o2o.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by zhangtao on 2021/2/4 16:30.
 */
@Getter
@Setter
public class HuiTongReportBody implements Serializable{
    //手机号码
    private String phone;
    //与提交中的MsgId 一致
    private String msg_id;
    //短信状态
    private String status;
    //短信到达时间
    private String time;
}
