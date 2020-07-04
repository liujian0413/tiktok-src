package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p1893io.SessionOutputBuffer;

/* renamed from: org.apache.http.impl.io.ContentLengthOutputStream */
public class ContentLengthOutputStream extends OutputStream {
    private boolean closed;
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total;

    public void flush() throws IOException {
        this.out.flush();
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.out.flush();
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            this.out.write(i);
            this.total++;
        }
    }

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        if (sessionOutputBuffer == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (j >= 0) {
            this.out = sessionOutputBuffer;
            this.contentLength = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            long j = this.contentLength - this.total;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.out.write(bArr, i, i2);
            this.total += (long) i2;
        }
    }
}
