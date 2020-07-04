package com.p280ss.android.socialbase.downloader.exception;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadFileExistException */
public class DownloadFileExistException extends BaseException {
    private String existTargetFileName;

    public String getExistTargetFileName() {
        return this.existTargetFileName;
    }

    public DownloadFileExistException(String str) {
        this.existTargetFileName = str;
    }
}
