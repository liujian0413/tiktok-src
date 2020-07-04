package com.p280ss.optimizer.live.sdk.base.model;

import java.io.IOException;

/* renamed from: com.ss.optimizer.live.sdk.base.model.HttpResponseException */
public class HttpResponseException extends IOException {
    public final int statusCode;

    public HttpResponseException(int i) {
        this.statusCode = i;
    }
}
