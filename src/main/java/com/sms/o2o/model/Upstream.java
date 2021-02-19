package com.sms.o2o.model;

import lombok.ToString;

/**
 * @author SpiderMan
 * @Date: 2020/4/24
 */
@ToString
public class Upstream {

    /**
     * phone : 13921350591
     * extCode : 682
     * content : 上行回复内容
     * receivetime : 20170816153922
     * sId : 123456789abcdefg
     * msgId : -8629637681836384963
     */

    private String phone;
    private String extCode;
    private String content;
    private String receivetime;
    private String sId;
    private String msgId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(String receivetime) {
        this.receivetime = receivetime;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
