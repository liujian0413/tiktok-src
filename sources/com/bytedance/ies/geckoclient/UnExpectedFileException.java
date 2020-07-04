package com.bytedance.ies.geckoclient;

public class UnExpectedFileException extends Exception {
    public UnExpectedFileException() {
    }

    public UnExpectedFileException(String str) {
        super(str);
    }

    public UnExpectedFileException(Throwable th) {
        super(th);
    }

    public UnExpectedFileException(String str, Throwable th) {
        super(str, th);
    }
}
