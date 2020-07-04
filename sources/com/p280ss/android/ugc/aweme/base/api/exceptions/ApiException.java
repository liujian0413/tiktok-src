package com.p280ss.android.ugc.aweme.base.api.exceptions;

/* renamed from: com.ss.android.ugc.aweme.base.api.exceptions.ApiException */
public class ApiException extends RuntimeException {
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public ApiException(int i) {
        StringBuilder sb = new StringBuilder("error_code = ");
        sb.append(i);
        super(sb.toString());
        this.mErrorCode = i;
    }

    public ApiException(int i, Throwable th) {
        StringBuilder sb = new StringBuilder("error_code = ");
        sb.append(i);
        super(sb.toString(), th);
        this.mErrorCode = i;
    }
}
