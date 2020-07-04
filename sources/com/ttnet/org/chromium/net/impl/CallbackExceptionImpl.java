package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.CallbackException;

public class CallbackExceptionImpl extends CallbackException {
    public CallbackExceptionImpl(String str, Throwable th) {
        super(str, th);
    }
}
