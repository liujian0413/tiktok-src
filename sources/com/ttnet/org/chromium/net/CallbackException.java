package com.ttnet.org.chromium.net;

public abstract class CallbackException extends CronetException {
    protected CallbackException(String str, Throwable th) {
        super(str, th);
    }
}
