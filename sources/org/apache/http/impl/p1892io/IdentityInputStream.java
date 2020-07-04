package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p1893io.SessionInputBuffer;

/* renamed from: org.apache.http.impl.io.IdentityInputStream */
public class IdentityInputStream extends InputStream {
    private boolean closed;

    /* renamed from: in */
    private final SessionInputBuffer f123357in;

    public void close() throws IOException {
        this.closed = true;
    }

    public int read() throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f123357in.read();
    }

    public int available() throws IOException {
        if (this.closed || !this.f123357in.isDataAvailable(10)) {
            return 0;
        }
        return 1;
    }

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        if (sessionInputBuffer != null) {
            this.f123357in = sessionInputBuffer;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f123357in.read(bArr, i, i2);
    }
}
