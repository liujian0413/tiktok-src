package com.p280ss.android.downloadlib.addownload.exception;

/* renamed from: com.ss.android.downloadlib.addownload.exception.OpenAppException */
public class OpenAppException extends Exception {
    private final int mExtStatus;
    private final int mFinalStatus;

    public int getExtStatus() {
        return this.mExtStatus;
    }

    public int getFinalStatus() {
        return this.mFinalStatus;
    }

    public OpenAppException(int i) {
        this(i, 0);
    }

    public OpenAppException(int i, int i2) {
        this.mFinalStatus = i;
        this.mExtStatus = i2;
    }
}
