package com.bytedance.frameworks.baselib.network.http.exception;

import java.io.IOException;

public class CdnCacheVerifyException extends IOException {
    public CdnCacheVerifyException() {
    }

    public CdnCacheVerifyException(String str) {
        super(str);
    }

    public CdnCacheVerifyException(Throwable th) {
        initCause(th);
    }

    public CdnCacheVerifyException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
