package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import java.io.IOException;

public class CronetIOException extends IOException {
    private C10104a requestInfo;
    private int statusCode;
    private String traceCode;

    public C10104a getRequestInfo() {
        return this.requestInfo;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getTraceCode() {
        return this.traceCode;
    }

    public String getRequestLog() {
        return this.requestInfo.f27521x;
    }

    public CronetIOException(Exception exc, C10104a aVar, String str) {
        super(exc.getMessage(), exc.getCause());
        this.requestInfo = aVar;
        this.traceCode = str;
        if (exc instanceof HttpResponseException) {
            this.statusCode = ((HttpResponseException) exc).getStatusCode();
        }
    }
}
