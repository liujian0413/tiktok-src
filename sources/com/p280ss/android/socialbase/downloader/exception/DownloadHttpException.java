package com.p280ss.android.socialbase.downloader.exception;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadHttpException */
public class DownloadHttpException extends BaseException {
    private final int httpStatusCode;

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.httpStatusCode = i2;
    }
}
