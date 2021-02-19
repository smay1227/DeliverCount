package com.sms.o2o.model;

/**
 * @author SpiderMan
 * @Date: 2021/1/5
 */
public class ByteDanceReport {

    /**
     * userId : aa
     * mobile : 18888888888
     * sign : a1212xxxxxxxxx
     * ext_code : 0006
     * msg_id : msgid
     * ext : aaaaa
     * service_id : 10699990006
     * cost : 0.024
     * msg_count : 2
     * success_count : 1
     * carrier : 中国电信
     * old_carrier : 中国移动
     * province : Heilongjiang
     * iso_code : CN
     * code : 1
     * msg : 黑名单
     * vendor_revice_time : 1234567890123
     * call_carrier_time : 1234567890123
     * carrier_callback_time : 1234567890123
     * vendor_callback_time : 1234567890123
     */
    /**
     *请求账号
     */
    private String user_id;
    /**
     * 发送的电话号码
     */
    private String mobile;
    /**
     * md5(user_id+password)
     */
    private String sign;
    /**
     * 代理商
     */
    private String vendor = "wxxsxx";
    /**
     * 通道扩展码，最大长度5
     */
    private String ext_code;
    /**
     * 发送时的消息ID
     */
    private String msg_id;
    /**
     * 扩展内容,回执中原样返回,用于自定义扩展
     */
    private String ext;
    /**
     * 发送的通道号码+扩展码
     */
    private String service_id;
    /**
     * 费用，人民币
     */
    private String cost;
    /**
     * 消息条数
     */
    private String msg_count;
    /**
     * 成功消息条数
     */
    private String success_count;
    /**
     * 运营商，（中国联通、中国移动、中国电信）
     */
    private String carrier = "";
    /**
     * 携号转网之前的运营商（能判断则判断，不能的话算了～）
     */
    private String old_carrier = "";
    /**
     * 省份英文,参照下面省份对照表
     */
    private String province = "";
    /**
     * 2位ISO 3166 code，中国为CN
     */
    private String iso_code = "CN";
    /**
     * 回执错误码，0为成功。多条中有1条不成功，则非0。code中失败情况分两种：
     * 1、自己平台错误，传自己平台的错误码
     * 2、运营商返回错误，传运营商的错误码，例如MN:0001，MK:0001
     */
    private String code;
    /**
     * 回执错误描述，对code的描述字段
     * 例如MK:0001 对应的描述为停机、关机、空号、无法接通、呼叫失败
     */
    private String msg;
    /**
     * 接收到请求的13位时间戳
     */
    private String vendor_revice_time;
    /**
     * 发送到运营商的13位时间戳,多条以最后一条为准
     */
    private String call_carrier_time;
    /**
     * 收到运营商回执的13位时间戳,多条以最后一条为准
     */
    private String carrier_callback_time;
    /**
     * 回调字节跳动的13位时间戳
     */
    private String vendor_callback_time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExt_code() {
        return ext_code;
    }

    public void setExt_code(String ext_code) {
        this.ext_code = ext_code;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMsg_count() {
        return msg_count;
    }

    public void setMsg_count(String msg_count) {
        this.msg_count = msg_count;
    }

    public String getSuccess_count() {
        return success_count;
    }

    public void setSuccess_count(String success_count) {
        this.success_count = success_count;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVendor_revice_time() {
        return vendor_revice_time;
    }

    public void setVendor_revice_time(String vendor_revice_time) {
        this.vendor_revice_time = vendor_revice_time;
    }

    public String getCall_carrier_time() {
        return call_carrier_time;
    }

    public void setCall_carrier_time(String call_carrier_time) {
        this.call_carrier_time = call_carrier_time;
    }

    public String getCarrier_callback_time() {
        return carrier_callback_time;
    }

    public void setCarrier_callback_time(String carrier_callback_time) {
        this.carrier_callback_time = carrier_callback_time;
    }

    public String getVendor_callback_time() {
        return vendor_callback_time;
    }

    public void setVendor_callback_time(String vendor_callback_time) {
        this.vendor_callback_time = vendor_callback_time;
    }
}
