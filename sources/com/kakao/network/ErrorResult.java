package com.kakao.network;

import com.kakao.network.exception.ResponseStatusError;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

public class ErrorResult {
    private final int CLIENT_ERROR_CODE;
    private final int errorCode;
    protected final String errorMessage;
    protected final Exception exception;
    private final int httpStatus;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Exception getException() {
        return this.exception;
    }

    public int getHttpStatus() {
        return this.httpStatus;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ErrorResult{errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage='");
        sb.append(this.errorMessage);
        sb.append('\'');
        sb.append(", exception='");
        if (this.exception != null) {
            str = this.exception.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public ErrorResult(ResponseStatusError responseStatusError) {
        this.CLIENT_ERROR_CODE = -777;
        this.errorCode = responseStatusError.getErrorCode();
        this.errorMessage = responseStatusError.getErrorMsg();
        this.httpStatus = responseStatusError.getHttpStatusCode();
        this.exception = responseStatusError;
    }

    public ErrorResult(Exception exc) {
        this.CLIENT_ERROR_CODE = -777;
        this.errorCode = -777;
        this.errorMessage = exc.getMessage();
        this.httpStatus = VETransitionFilterParam.TransitionDuration_DEFAULT;
        this.exception = exc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        if (getErrorCode() == errorResult.getErrorCode() && getHttpStatus() == errorResult.getHttpStatus()) {
            return getErrorMessage().equals(errorResult.getErrorMessage());
        }
        return false;
    }
}
