package com.bytedance.ies.geckoclient.exception;

public class DownloadException extends RuntimeException {
    public DownloadException(String str, Throwable th) {
        super(str, th);
    }
}
