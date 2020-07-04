package com.p280ss.ttuploader;

import com.bytedance.frameworks.baselib.network.http.C10122c;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTExternRequestInfo */
public class TTExternRequestInfo {
    private byte[] data;
    private C10122c extraInfo;
    private String method;
    private JSONObject requestHeader;
    private String url;

    public TTExternRequestInfo() {
    }

    public byte[] getData() {
        return this.data;
    }

    public C10122c getExtraInfo() {
        return this.extraInfo;
    }

    public String getMethod() {
        return this.method;
    }

    public JSONObject getRequestHeader() {
        return this.requestHeader;
    }

    public String getUrl() {
        return this.url;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExtraInfo(C10122c cVar) {
        this.extraInfo = cVar;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequestHeader(JSONObject jSONObject) {
        this.requestHeader = jSONObject;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public TTExternRequestInfo(String str, String str2, JSONObject jSONObject, byte[] bArr, C10122c cVar) {
        this.url = str;
        this.method = str2;
        this.data = bArr;
        this.requestHeader = jSONObject;
        this.extraInfo = cVar;
    }
}
