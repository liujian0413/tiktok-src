package com.bytedance.frameworks.baselib.network.http.exception;

import java.io.IOException;

public class NetworkNotAvailabeException extends IOException {
    private static final long serialVersionUID = -7281385706782665299L;

    public NetworkNotAvailabeException() {
    }

    public NetworkNotAvailabeException(String str) {
        super(str);
    }

    public NetworkNotAvailabeException(Throwable th) {
        initCause(th);
    }

    public NetworkNotAvailabeException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
