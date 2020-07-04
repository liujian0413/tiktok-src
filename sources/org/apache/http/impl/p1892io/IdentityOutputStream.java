package org.apache.http.impl.p1892io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p1893io.SessionOutputBuffer;

/* renamed from: org.apache.http.impl.io.IdentityOutputStream */
public class IdentityOutputStream extends OutputStream {
    private boolean closed;
    private final SessionOutputBuffer out;

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

    public IdentityOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        if (sessionOutputBuffer != null) {
            this.out = sessionOutputBuffer;
            return;
        }
        throw new IllegalArgumentException("Session output buffer may not be null");
    }

    public void write(int i) throws IOException {
        if (!this.closed) {
            this.out.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.closed) {
            this.out.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
