package com.bytedance.p263im.core.internal.queue;

/* renamed from: com.bytedance.im.core.internal.queue.CoderException */
public class CoderException extends Exception {
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public CoderException(int i) {
        this.mErrorCode = i;
    }
}
