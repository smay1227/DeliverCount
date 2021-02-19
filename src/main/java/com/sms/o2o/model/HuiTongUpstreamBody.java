package com.sms.o2o.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zhangtao on 2021/2/5 10:17.
 */
@Getter
@Setter
public class HuiTongUpstreamBody {
    //手机号码
    private String phone;
    //扩展码
    private String ext_code;
    //短信账户
    private String account;
    //短信内容
    private String content;
    //下行短信id
    private String msgId;
    //上送时间
    private String time;
}
