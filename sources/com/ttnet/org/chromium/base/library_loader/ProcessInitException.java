package com.ttnet.org.chromium.base.library_loader;

public class ProcessInitException extends Exception {
    private int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public ProcessInitException(int i) {
        this.mErrorCode = i;
    }

    public ProcessInitException(int i, Throwable th) {
        super(null, th);
        this.mErrorCode = i;
    }
}
