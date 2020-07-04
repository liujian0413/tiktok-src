package com.bytedance.apm.net;

public class HttpResponseException extends Exception {
    public String message;
    public int statusCode;

    public String getMsg() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpResponseException(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
