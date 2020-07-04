package com.bytedance.common.utility.reflect;

public class ReflectException extends RuntimeException {
    private static final long serialVersionUID = -2243843843843438438L;

    public ReflectException() {
    }

    public ReflectException(String str) {
        super(str);
    }

    public ReflectException(Throwable th) {
        super(th);
    }

    public ReflectException(String str, Throwable th) {
        super(str, th);
    }
}
