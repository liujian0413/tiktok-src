package com.bytedance.frameworks.baselib.network.http.util;

public class DownloadFileTooLargeException extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    public long getLength() {
        return this.length;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public DownloadFileTooLargeException(int i, long j) {
        StringBuilder sb = new StringBuilder("Download file too large: ");
        sb.append(i);
        sb.append(" ");
        sb.append(j);
        super(sb.toString());
        this.maxSize = i;
        this.length = j;
    }
}
