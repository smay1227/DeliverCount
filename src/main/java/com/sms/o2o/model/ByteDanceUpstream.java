package com.sms.o2o.model;

/**
 * @author SpiderMan
 * @Date: 2021/1/6
 */
public class ByteDanceUpstream {


    /**
     * user_id : aa
     * sign : abcd111221xxx
     * mobile : 18888888888
     * ext_code : 0006
     * service_id : 1069999
     * carrier : 中国电信
     * old_carrier : 中国移动
     * province : Heilongjiang
     * iso_code : CN
     * vendor_revice_time : 1234567890123
     * vendor_callback_time : 1234567890123
     * content : 测试上行短信
     */
    /**
     * 请求账号
     */
    private String user_id;
    /**
     * md5(user_id+password)，签名
     */
    private String sign;
    /**
     * 代理商
     */
    private String vendor = "wxxsxx";
    /**
     *发送的电话号码
     */
    private String mobile;
    /**
     * 通道扩展码，最大长度5
     */
    private String ext_code;
    /**
     * 发送的通道号码+扩展码
     */
    private String service_id;
    /**
     * 消息计费数
     */
    private String msg_count;
    /**
     * 运营商，（中国联通、中国移动、中国电信）
     */
    private String carrier;
    /**
     *  携号转网之前的运营商（能判断则判断，不能的话算了～）
     */
    private String old_carrier = "";
    /**
     * 省份英文,参照下面省份对照表
     */
    private String province;
    /**
     * 2位ISO 3166 code，中国为CN
     */
    private String iso_code  = "CN";
    /**
     * 接收到回执的13位时间戳
     */
    private String vendor_revice_time;
    /**
     * 回调字节跳动的13位时间戳
     */
    private String vendor_callback_time;
    /**
     * 回执内容
     */
    private String content;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getExt_code() {
        return ext_code;
    }

    public void setExt_code(String ext_code) {
        this.ext_code = ext_code;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOld_carrier() {
        return old_carrier;
    }

    public void setOld_carrier(String old_carrier) {
        this.old_carrier = old_carrier;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIso_code() {
        return iso_code;
    }

    public void setIso_code(String iso_code) {
        this.iso_code = iso_code;
    }

    public String getVendor_revice_time() {
        return vendor_revice_time;
    }

    public void setVendor_revice_time(String vendor_revice_time) {
        this.vendor_revice_time = vendor_revice_time;
    }

    public String getVendor_callback_time() {
        return vendor_callback_time;
    }

    public void setVendor_callback_time(String vendor_callback_time) {
        this.vendor_callback_time = vendor_callback_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getMsg_count() {
        return msg_count;
    }

    public void setMsg_count(String msg_count) {
        this.msg_count = msg_count;
    }
}
