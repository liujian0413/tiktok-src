package com.p280ss.android.ugc.effectmanager.common.exception;

/* renamed from: com.ss.android.ugc.effectmanager.common.exception.StatusCodeException */
public class StatusCodeException extends Exception {
    private int mStatusCode;

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public StatusCodeException(int i, String str) {
        super(str);
        this.mStatusCode = i;
    }
}
