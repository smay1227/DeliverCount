package com.sms.o2o.model;

import cn.hutool.json.JSONUtil;
import lombok.ToString;

import java.util.List;

/**
 * @author SpiderMan
 * @Date: 2020/4/23
 */
@ToString
public class Report {

    /**
     * phone : 13921350591
     * msgId : -8629637681836384963
     * status : DELIVRD
     * donetime : 20170816153922
     * fee : 2
     * sId : 123456789abcdefg
     */

    private String phone;
    private String msgid;
    private String status;
    private String donetime;
    private int fee;
    private String sId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDonetime() {
        return donetime;
    }

    public void setDonetime(String donetime) {
        this.donetime = donetime;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    @Override
    public String toString() {
        return "Report{" +
                "phone='" + phone + '\'' +
                ", msgid='" + msgid + '\'' +
                ", status='" + status + '\'' +
                ", donetime='" + donetime + '\'' +
                ", fee=" + fee +
                ", sId='" + sId + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<ByteDanceReport> reports = JSONUtil.toList(JSONUtil.parseArray("[{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国联通\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"65579\",\"iso_code\":\"CN\",\"mobile\":\"15605846426\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"c51fd5d4-61c1-47fb-95f3-07b23a538c41\",\"old_carrier\":\"\",\"province\":\"Zhejiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"00468\",\"iso_code\":\"CN\",\"mobile\":\"15201528255\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"a8fd9855-43a7-460f-aac7-0885e130d5bc\",\"old_carrier\":\"\",\"province\":\"Beijing\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"01082\",\"iso_code\":\"CN\",\"mobile\":\"19801990059\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"84c535ba-06e4-4575-9718-5dade12d320a\",\"old_carrier\":\"\",\"province\":\"Hebei\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"75920\",\"iso_code\":\"CN\",\"mobile\":\"15101268944\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"04a80f77-29c5-4008-b254-ea3411dfe640\",\"old_carrier\":\"\",\"province\":\"Gansu\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"93046\",\"iso_code\":\"CN\",\"mobile\":\"18204790914\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"97957159-eb22-4118-943a-6bf30c403e7d\",\"old_carrier\":\"\",\"province\":\"Inner Mongoria\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国联通\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"28303\",\"iso_code\":\"CN\",\"mobile\":\"13105337768\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"ec912998-b6d8-4573-9ffd-ee2382ce6158\",\"old_carrier\":\"\",\"province\":\"Shandong\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"41356\",\"iso_code\":\"CN\",\"mobile\":\"14700738422\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"dc84a322-fba3-4b17-95a4-83c663a82aa0\",\"old_carrier\":\"\",\"province\":\"Shanxi\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"14591\",\"iso_code\":\"CN\",\"mobile\":\"14805513015\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"2a881d59-4b71-4ea7-89f1-da97816e0613\",\"old_carrier\":\"\",\"province\":\"Guangdong\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国联通\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"02870\",\"iso_code\":\"CN\",\"mobile\":\"15605761346\",\"msg\":\"\",\"msg_count\":\"2\",\"msg_id\":\"697aa862-0dc0-4bcc-b3c5-ed2207e03e6c\",\"old_carrier\":\"\",\"province\":\"Zhejiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"67383\",\"iso_code\":\"CN\",\"mobile\":\"13406265829\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"8b7c2243-6050-4b3d-9f31-83c24b80ea5e\",\"old_carrier\":\"\",\"province\":\"Shandong\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"10296\",\"iso_code\":\"CN\",\"mobile\":\"15004552054\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"efa3c68c-9baa-4306-9480-06f1182f5ccb\",\"old_carrier\":\"\",\"province\":\"Heilongjiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国联通\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"11241\",\"iso_code\":\"CN\",\"mobile\":\"18608067873\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"7f1128a1-e3d0-49ae-b5ac-8e23b0904f0f\",\"old_carrier\":\"\",\"province\":\"Sichuan\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国电信\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"72557\",\"iso_code\":\"CN\",\"mobile\":\"17703554593\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"8c0d4567-2f9e-45a2-b3f6-d3cbdf96d2ae\",\"old_carrier\":\"\",\"province\":\"Shanxi\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"60469\",\"iso_code\":\"CN\",\"mobile\":\"16503617727\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"c4962247-0354-4a9e-90f2-8600be9c51a6\",\"old_carrier\":\"\",\"province\":\"Heilongjiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国联通\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.0\",\"ext\":\"11\",\"ext_code\":\"50330\",\"iso_code\":\"CN\",\"mobile\":\"16603405887\",\"msg\":\"\",\"msg_count\":\"2\",\"msg_id\":\"4f7ea624-4986-4bfd-a90e-913cdbc8535b\",\"old_carrier\":\"\",\"province\":\"Shanxi\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},null,{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.42\",\"ext\":\"11\",\"ext_code\":\"89496\",\"iso_code\":\"CN\",\"mobile\":\"18304628651\",\"msg\":\"\",\"msg_count\":\"2\",\"msg_id\":\"4f4eedda-1dad-4f1c-b068-4555bd808a1c\",\"old_carrier\":\"\",\"province\":\"Heilongjiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"74327\",\"iso_code\":\"CN\",\"mobile\":\"17204592946\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"9577f50b-df86-477c-b240-edfa717c8da1\",\"old_carrier\":\"\",\"province\":\"Heilongjiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"},{\"call_carrier_time\":\"1610349960000\",\"carrier\":\"中国移动\",\"carrier_callback_time\":\"1610349960000\",\"code\":\"TESTER_DELIVRD\",\"cost\":\"0.21\",\"ext\":\"11\",\"ext_code\":\"21439\",\"iso_code\":\"CN\",\"mobile\":\"13600681426\",\"msg\":\"\",\"msg_count\":\"1\",\"msg_id\":\"bcb6d2f8-41bf-48af-ac59-8e9dad2f4a6a\",\"old_carrier\":\"\",\"province\":\"Zhejiang\",\"service_id\":\"\",\"sign\":\"41e86d721b35d3753c8a47107d911252\",\"success_count\":\"0\",\"user_id\":\"httpTester0001\",\"vendor\":\"wxxsxx\",\"vendor_callback_time\":\"1610349960874\",\"vendor_revice_time\":\"1610349959000\"}]")
                , ByteDanceReport.class);
        System.out.println(reports.size());
        new Report().init(reports);
    }

    public void init(List<ByteDanceReport> reports){
        reports.forEach(data -> {
            add(data);
        });
    }

    public void add(ByteDanceReport report){
        System.out.println(JSONUtil.toJsonStr(report));
    }
}
