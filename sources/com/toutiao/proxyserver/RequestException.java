package com.toutiao.proxyserver;

import java.io.IOException;

public class RequestException extends IOException {
    public int errorCode;

    public RequestException(String str) {
        super(str);
        this.errorCode = 1;
    }

    public RequestException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
