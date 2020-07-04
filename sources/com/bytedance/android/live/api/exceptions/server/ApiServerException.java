package com.bytedance.android.live.api.exceptions.server;

import com.bytedance.android.live.api.exceptions.ApiException;

public class ApiServerException extends ApiException {
    private String mAlert;
    private String mErrorMsg;
    private String mExtra;
    private String mPrompt;

    public String getAlert() {
        return this.mAlert;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ApiServerException, errorMsg = ");
        sb.append(this.mErrorMsg);
        sb.append(" extra = ");
        sb.append(this.mExtra);
        sb.append(" ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public ApiServerException(int i) {
        super(i);
    }

    public ApiServerException setAlert(String str) {
        this.mAlert = str;
        return this;
    }

    public ApiServerException setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public ApiServerException setExtra(String str) {
        this.mExtra = str;
        return this;
    }

    public ApiServerException setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }
}
