package com.bytedance.frameworks.baselib.network.http.exception;

import java.io.IOException;

public class NotAllowUseNetworkException extends IOException {
    private static final long serialVersionUID = -210264743726619965L;

    public NotAllowUseNetworkException() {
    }

    public NotAllowUseNetworkException(String str) {
        super(str);
    }

    public NotAllowUseNetworkException(Throwable th) {
        initCause(th);
    }

    public NotAllowUseNetworkException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
