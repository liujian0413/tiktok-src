package com.kakao.network.exception;

public abstract class ResponseStatusError extends RuntimeException {
    public abstract int getErrorCode();

    public abstract String getErrorMsg();

    public abstract int getHttpStatusCode();

    public ResponseStatusError(String str) {
        super(str);
    }
}
