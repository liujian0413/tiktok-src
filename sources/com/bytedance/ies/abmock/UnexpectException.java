package com.bytedance.ies.abmock;

public class UnexpectException extends RuntimeException {
    public UnexpectException(Throwable th) {
        super(th);
    }
}
