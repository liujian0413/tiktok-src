package com.ttnet.org.chromium.net1;

public abstract class QuicException extends NetworkException {
    public abstract int getQuicDetailedErrorCode();

    protected QuicException(String str, Throwable th) {
        super(str, th);
    }
}
