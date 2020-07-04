package org.apache.commons.net.p1891io;

import java.util.EventObject;

/* renamed from: org.apache.commons.net.io.CopyStreamEvent */
public class CopyStreamEvent extends EventObject {
    private static final long serialVersionUID = -964927635655051867L;
    private final int bytesTransferred;
    private final long streamSize;
    private final long totalBytesTransferred;

    public int getBytesTransferred() {
        return this.bytesTransferred;
    }

    public long getStreamSize() {
        return this.streamSize;
    }

    public long getTotalBytesTransferred() {
        return this.totalBytesTransferred;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[source=");
        sb.append(this.source);
        sb.append(", total=");
        sb.append(this.totalBytesTransferred);
        sb.append(", bytes=");
        sb.append(this.bytesTransferred);
        sb.append(", size=");
        sb.append(this.streamSize);
        sb.append("]");
        return sb.toString();
    }

    public CopyStreamEvent(Object obj, long j, int i, long j2) {
        super(obj);
        this.bytesTransferred = i;
        this.totalBytesTransferred = j;
        this.streamSize = j2;
    }
}
