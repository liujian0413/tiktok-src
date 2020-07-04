package com.bytedance.vast.exception;

public class ParseException extends Exception {
    public ParseException() {
    }

    public ParseException(String str) {
        super(str);
    }

    public ParseException(Throwable th) {
        super(th);
    }

    public ParseException(String str, Throwable th) {
        super(str, th);
    }
}
