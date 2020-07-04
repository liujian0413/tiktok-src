package com.p280ss.android.pushmanager.app;

import java.io.IOException;

/* renamed from: com.ss.android.pushmanager.app.ApiException */
public class ApiException extends IOException {
    int httpStatus;

    public ApiException(String str, int i) {
        super(str);
        this.httpStatus = i;
    }
}
