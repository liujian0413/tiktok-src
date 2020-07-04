package com.p280ss.video.rtc.base.net;

import com.C1642a;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import okhttp3.RequestBody;

/* renamed from: com.ss.video.rtc.base.net.RtcNetBaseRequestModel */
public abstract class RtcNetBaseRequestModel {
    private String mCallDnsLog = "";
    private HashMap<String, String> queryParameter = new HashMap<>();
    private HashMap<String, String> requestHeader = new HashMap<>();

    /* access modifiers changed from: protected */
    public abstract void addQueryParameter(HashMap<String, String> hashMap);

    /* access modifiers changed from: protected */
    public void addRequestHeader(HashMap<String, String> hashMap) {
    }

    /* access modifiers changed from: protected */
    public int connectTimeout() {
        return 5;
    }

    /* access modifiers changed from: 0000 */
    public String getCallDnsLog() {
        return this.mCallDnsLog;
    }

    /* access modifiers changed from: 0000 */
    public HashMap<String, String> getQueryParameter() {
        return this.queryParameter;
    }

    public RequestBody getRequestBody() throws Exception {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public HashMap<String, String> getRequestHeader() {
        return this.requestHeader;
    }

    /* access modifiers changed from: protected */
    public String getRequestMethod() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public abstract String getRequestUrl();

    /* access modifiers changed from: protected */
    public List<InetAddress> setCustomDnsReslov(String str) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void setHeaderParameter() {
        addRequestHeader(this.requestHeader);
    }

    /* access modifiers changed from: 0000 */
    public void setQueryParameter() {
        addQueryParameter(this.queryParameter);
    }

    /* access modifiers changed from: 0000 */
    public void setCallDnsLog(String str, String str2) {
        this.mCallDnsLog = C1642a.m8034a(" lookupDns:{%s:%s}", new Object[]{str, str2});
    }
}
