package com.ttnet.org.chromium.net1;

public abstract class NetworkException extends CronetException {
    public abstract int getCronetInternalErrorCode();

    public abstract int getErrorCode();

    public abstract boolean immediatelyRetryable();

    protected NetworkException(String str, Throwable th) {
        super(str, th);
    }
}
