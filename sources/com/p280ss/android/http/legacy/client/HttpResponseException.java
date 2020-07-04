package com.p280ss.android.http.legacy.client;

/* renamed from: com.ss.android.http.legacy.client.HttpResponseException */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpResponseException(int i, String str) {
        super(str);
        this.statusCode = i;
    }
}
