package com.facebook.common.p688e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.e.a */
public final class C13291a extends FilterInputStream {

    /* renamed from: a */
    private int f35189a;

    /* renamed from: b */
    private int f35190b;

    public final int available() throws IOException {
        return Math.min(this.in.available(), this.f35189a);
    }

    public final int read() throws IOException {
        if (this.f35189a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f35189a--;
        }
        return read;
    }

    public final void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f35190b != -1) {
            this.in.reset();
            this.f35189a = this.f35190b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f35190b = this.f35189a;
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, (long) this.f35189a));
        this.f35189a = (int) (((long) this.f35189a) - skip);
        return skip;
    }

    public C13291a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.f35189a = i;
            this.f35190b = -1;
        } else {
            throw new IllegalArgumentException("limit must be >= 0");
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f35189a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.f35189a));
        if (read > 0) {
            this.f35189a -= read;
        }
        return read;
    }
}
