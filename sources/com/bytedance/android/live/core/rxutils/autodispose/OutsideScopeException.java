package com.bytedance.android.live.core.rxutils.autodispose;

public class OutsideScopeException extends RuntimeException {
    public final synchronized Throwable fillInStackTrace() {
        if (!C3279r.m12343a()) {
            return this;
        }
        return super.fillInStackTrace();
    }

    public OutsideScopeException(String str) {
        super(str);
    }
}
