package com.bytedance.android.live.api.exceptions;

public class ApiException extends Exception {
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ApiException, errorCode = ");
        sb.append(this.mErrorCode);
        sb.append(" ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public ApiException(int i) {
        this.mErrorCode = i;
    }

    public ApiException(int i, Throwable th) {
        super(th);
        this.mErrorCode = i;
    }
}
