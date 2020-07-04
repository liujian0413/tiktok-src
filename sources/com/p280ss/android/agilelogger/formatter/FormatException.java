package com.p280ss.android.agilelogger.formatter;

/* renamed from: com.ss.android.agilelogger.formatter.FormatException */
public class FormatException extends RuntimeException {
    private static final long serialVersionUID = -5365630128856068164L;

    public FormatException() {
    }

    public FormatException(String str) {
        super(str);
    }

    public FormatException(Throwable th) {
        super(th);
    }

    public FormatException(String str, Throwable th) {
        super(str, th);
    }
}
