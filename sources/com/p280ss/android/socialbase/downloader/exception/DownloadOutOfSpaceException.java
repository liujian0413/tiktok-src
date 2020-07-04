package com.p280ss.android.socialbase.downloader.exception;

import com.C1642a;

/* renamed from: com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException */
public class DownloadOutOfSpaceException extends BaseException {
    private final long avaliableSpaceBytes;
    private final long requiredSpaceBytes;

    public long getAvaliableSpaceBytes() {
        return this.avaliableSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    public DownloadOutOfSpaceException(long j, long j2) {
        super(1006, C1642a.m8034a("space is not enough required space is : %s but available space is :%s", new Object[]{String.valueOf(j2), String.valueOf(j)}));
        this.avaliableSpaceBytes = j;
        this.requiredSpaceBytes = j2;
    }
}
