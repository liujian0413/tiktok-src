package com.bytedance.android.live.base.model.exception;

import java.io.IOException;

public class NetworkErrorException extends IOException {
    private String message;
    public int statusCode;

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public NetworkErrorException(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }

    public NetworkErrorException(int i, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i;
        this.message = str;
    }
}
