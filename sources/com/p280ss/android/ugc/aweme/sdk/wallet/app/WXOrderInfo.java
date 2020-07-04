package com.p280ss.android.ugc.aweme.sdk.wallet.app;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.app.WXOrderInfo */
public class WXOrderInfo {
    public String mOrderId;
    public String mWXAppId;
    public String mWXNonceString;
    public String mWXPartnerId;
    public String mWXPrePayId;
    public String mWXSign;
    public String mWXTimeStamp;

    public String getId() {
        return this.mOrderId;
    }

    public String getWXAppId() {
        return this.mWXAppId;
    }

    public String getWXNonceString() {
        return this.mWXNonceString;
    }

    public String getWXPartnerId() {
        return this.mWXPartnerId;
    }

    public String getWXPrePayId() {
        return this.mWXPrePayId;
    }

    public String getWXSign() {
        return this.mWXSign;
    }

    public String getWXTimeStamp() {
        return this.mWXTimeStamp;
    }
}
