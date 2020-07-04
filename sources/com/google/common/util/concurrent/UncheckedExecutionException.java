package com.google.common.util.concurrent;

public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected UncheckedExecutionException() {
    }

    protected UncheckedExecutionException(String str) {
        super(str);
    }

    public UncheckedExecutionException(Throwable th) {
        super(th);
    }

    public UncheckedExecutionException(String str, Throwable th) {
        super(str, th);
    }
}
