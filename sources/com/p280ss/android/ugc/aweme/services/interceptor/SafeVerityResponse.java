package com.p280ss.android.ugc.aweme.services.interceptor;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.SafeVerityResponse */
public class SafeVerityResponse {
    public int requestCode;
    public int resultCode;
    public String ticket;
    public String uid;

    public SafeVerityResponse(String str, int i, int i2, String str2) {
        this.ticket = str;
        this.resultCode = i;
        this.requestCode = i2;
        this.uid = str2;
    }
}
