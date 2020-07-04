package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net.UploadDataProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

public abstract class UrlRequestBase extends ExperimentalUrlRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusValues {
    }

    /* access modifiers changed from: protected */
    public abstract void addHeader(String str, String str2);

    /* access modifiers changed from: protected */
    public abstract void setHttpMethod(String str);

    /* access modifiers changed from: protected */
    public abstract void setRequestTimeout(int i);

    /* access modifiers changed from: protected */
    public abstract void setSocketConnectTimeout(int i);

    /* access modifiers changed from: protected */
    public abstract void setSocketReadTimeout(int i);

    /* access modifiers changed from: protected */
    public abstract void setSocketWriteTimeout(int i);

    /* access modifiers changed from: protected */
    public abstract void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);

    public static int convertLoadState(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            default:
                throw new IllegalArgumentException("No request status found.");
        }
    }
}
