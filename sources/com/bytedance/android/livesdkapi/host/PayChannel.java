package com.bytedance.android.livesdkapi.host;

public enum PayChannel {
    WEIXIN("WEIXIN"),
    ALIPAY("ALIPAY"),
    TEST("TEST"),
    FIRE("FIRE"),
    GOOGLE("GooglePay"),
    DIAMOND("DIAMOND"),
    ONECARD("OneCard"),
    VISA("Visa"),
    MASTERCARD("MasterCard"),
    BOKU("Pay by mobile"),
    HUOLI("Huoli"),
    CJ("CJ"),
    UNKNOWN("UNKNOWN");
    
    String value;

    public final String getValue() {
        return this.value;
    }

    private PayChannel(String str) {
        this.value = str;
    }
}
