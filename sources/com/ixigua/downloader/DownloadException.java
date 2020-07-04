package com.ixigua.downloader;

public class DownloadException extends Exception {
    private static final long serialVersionUID = 7178564935340416481L;
    private int errorCode;
    private String errorMessage;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DownloadException(Throwable th) {
        super(th);
    }

    public DownloadException(int i, String str) {
        this(i, str, null);
    }

    public DownloadException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
        this.errorMessage = str;
    }
}
