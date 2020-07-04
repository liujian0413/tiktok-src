package org.apache.http.impl.p1892io;

import org.apache.http.p1893io.HttpTransportMetrics;

/* renamed from: org.apache.http.impl.io.HttpTransportMetricsImpl */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred;

    public void incrementBytesTransferred(long j) {
        this.bytesTransferred += j;
    }
}
