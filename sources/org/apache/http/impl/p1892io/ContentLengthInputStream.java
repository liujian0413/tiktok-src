package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p1893io.SessionInputBuffer;

/* renamed from: org.apache.http.impl.io.ContentLengthInputStream */
public class ContentLengthInputStream extends InputStream {
    private boolean closed;
    private long contentLength;

    /* renamed from: in */
    private SessionInputBuffer f123356in;
    private long pos;

    public void close() throws IOException {
        if (!this.closed) {
            try {
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.closed = true;
            }
        }
    }

    public int read() throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.pos >= this.contentLength) {
            return -1;
        } else {
            this.pos++;
            return this.f123356in.read();
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.contentLength - this.pos);
        long j2 = 0;
        while (min > 0) {
            int read = read(bArr, 0, (int) Math.min(2048, min));
            if (read == -1) {
                break;
            }
            long j3 = (long) read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        if (sessionInputBuffer == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (j >= 0) {
            this.f123356in = sessionInputBuffer;
            this.contentLength = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.pos >= this.contentLength) {
            return -1;
        } else {
            if (this.pos + ((long) i2) > this.contentLength) {
                i2 = (int) (this.contentLength - this.pos);
            }
            int read = this.f123356in.read(bArr, i, i2);
            this.pos += (long) read;
            return read;
        }
    }
}
