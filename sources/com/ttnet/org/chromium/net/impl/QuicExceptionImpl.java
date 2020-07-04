package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.QuicException;

public class QuicExceptionImpl extends QuicException {
    private final NetworkExceptionImpl mNetworkException;
    private final int mQuicDetailedErrorCode;

    public int getQuicDetailedErrorCode() {
        return this.mQuicDetailedErrorCode;
    }

    public int getCronetInternalErrorCode() {
        return this.mNetworkException.getCronetInternalErrorCode();
    }

    public int getErrorCode() {
        return this.mNetworkException.getErrorCode();
    }

    public boolean immediatelyRetryable() {
        return this.mNetworkException.immediatelyRetryable();
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(this.mNetworkException.getMessage());
        sb.append(", QuicDetailedErrorCode=");
        sb.append(this.mQuicDetailedErrorCode);
        return sb.toString();
    }

    public QuicExceptionImpl(String str, int i, int i2, int i3) {
        super(str, null);
        this.mNetworkException = new NetworkExceptionImpl(str, i, i2);
        this.mQuicDetailedErrorCode = i3;
    }
}
