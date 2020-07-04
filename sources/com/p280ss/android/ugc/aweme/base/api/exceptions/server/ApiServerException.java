package com.p280ss.android.ugc.aweme.base.api.exceptions.server;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.exceptions.ApiException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException */
public class ApiServerException extends ApiException {
    private static C6600e sGson;
    private int blockCode;
    protected String mErrorMsg;
    protected String mPrompt;
    private Object mResponse;
    protected String mUrl;

    private void addMonitor() {
    }

    private void interceptUserWithNotLogin(int i) {
    }

    public int getBlockCode() {
        return this.blockCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public Object getRawResponse() {
        return this.mResponse;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getResponse() {
        return convertResponseToString();
    }

    private static C6600e getGson() {
        if (sGson == null) {
            sGson = new C6600e();
        }
        return sGson;
    }

    public String convertResponseToString() {
        if (this.mResponse instanceof String) {
            return (String) this.mResponse;
        }
        this.mResponse = getGson().mo15979b(this.mResponse);
        return (String) this.mResponse;
    }

    public void addMonitor$___twin___() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.mUrl);
            jSONObject.put("errorCode", getErrorCode());
            jSONObject.put("prompt", this.mPrompt);
            jSONObject.put("errorDesc", this.mErrorMsg);
            C6893q.m21452b("api_error_web_return_log", "", jSONObject);
        } catch (Exception unused) {
        }
    }

    public ApiServerException(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.blockCode = i;
    }

    public ApiServerException setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public ApiServerException setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }

    public ApiServerException setResponse(Object obj) {
        this.mResponse = obj;
        return this;
    }

    public ApiServerException setResponse(String str) {
        this.mResponse = str;
        return this;
    }

    public ApiServerException setUrl(String str) {
        this.mUrl = str;
        addMonitor();
        return this;
    }
}
