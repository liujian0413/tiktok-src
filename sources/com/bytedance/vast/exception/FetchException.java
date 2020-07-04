package com.bytedance.vast.exception;

public class FetchException extends Exception {
    public final String url;

    public FetchException(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("fetch failed ");
        sb.append(str);
        super(sb.toString(), th);
        this.url = str;
    }
}
