package org.apache.http.p1893io;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.io.SessionInputBuffer */
public interface SessionInputBuffer {
    HttpTransportMetrics getMetrics();

    boolean isDataAvailable(int i) throws IOException;

    int read() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    int readLine(CharArrayBuffer charArrayBuffer) throws IOException;
}
