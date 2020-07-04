package com.p280ss.ttuploader;

import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTExternResponseInfo */
public class TTExternResponseInfo {
    public byte[] responseBody;
    public JSONObject responseHeader;
    public String responseHeaderStr;
    public int statusCode;
    public String url;

    public byte[] getResponseBody() {
        return this.responseBody;
    }

    public JSONObject getResponseHeader() {
        return this.responseHeader;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }

    public void setResponseBody(byte[] bArr) {
        this.responseBody = bArr;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setResponseHeader(JSONObject jSONObject) {
        this.responseHeader = jSONObject;
        if (jSONObject != null) {
            this.responseHeaderStr = jSONObject.toString();
        }
    }
}
