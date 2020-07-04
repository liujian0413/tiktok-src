package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.net1.NetworkException;

public class NetworkExceptionImpl extends NetworkException {
    private final int mCronetInternalErrorCode;
    private final int mErrorCode;

    public int getCronetInternalErrorCode() {
        return this.mCronetInternalErrorCode;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public boolean immediatelyRetryable() {
        switch (this.mErrorCode) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.mErrorCode);
        if (this.mCronetInternalErrorCode != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.mCronetInternalErrorCode);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    public NetworkExceptionImpl(String str, int i, int i2) {
        super(str, null);
        this.mErrorCode = i;
        this.mCronetInternalErrorCode = i2;
    }
}
