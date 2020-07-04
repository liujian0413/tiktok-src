package com.ttnet.org.chromium.net.impl;

public class BidirectionalStreamNetworkException extends NetworkExceptionImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public boolean immediatelyRetryable() {
        int i = this.mCronetInternalErrorCode;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }

    public BidirectionalStreamNetworkException(String str, int i, int i2) {
        super(str, i, i2);
    }
}
