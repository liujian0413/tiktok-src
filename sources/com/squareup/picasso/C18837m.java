package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.m */
final class C18837m extends InputStream {

    /* renamed from: a */
    private final InputStream f50765a;

    /* renamed from: b */
    private long f50766b;

    /* renamed from: c */
    private long f50767c;

    /* renamed from: d */
    private long f50768d;

    /* renamed from: e */
    private long f50769e;

    public final int available() throws IOException {
        return this.f50765a.available();
    }

    public final void close() throws IOException {
        this.f50765a.close();
    }

    public final boolean markSupported() {
        return this.f50765a.markSupported();
    }

    public final void reset() throws IOException {
        mo50049a(this.f50769e);
    }

    public final int read() throws IOException {
        int read = this.f50765a.read();
        if (read != -1) {
            this.f50766b++;
        }
        return read;
    }

    public C18837m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public final void mark(int i) {
        this.f50769e = mo50048a(i);
    }

    /* renamed from: a */
    public final long mo50048a(int i) {
        long j = this.f50766b + ((long) i);
        if (this.f50768d < j) {
            m61524b(j);
        }
        return this.f50766b;
    }

    public final int read(byte[] bArr) throws IOException {
        int read = this.f50765a.read(bArr);
        if (read != -1) {
            this.f50766b += (long) read;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.f50765a.skip(j);
        this.f50766b += skip;
        return skip;
    }

    /* renamed from: a */
    public final void mo50049a(long j) throws IOException {
        if (this.f50766b > this.f50768d || j < this.f50767c) {
            throw new IOException("Cannot reset");
        }
        this.f50765a.reset();
        m61523a(this.f50767c, j);
        this.f50766b = j;
    }

    /* renamed from: b */
    private void m61524b(long j) {
        try {
            if (this.f50767c >= this.f50766b || this.f50766b > this.f50768d) {
                this.f50767c = this.f50766b;
                this.f50765a.mark((int) (j - this.f50766b));
            } else {
                this.f50765a.reset();
                this.f50765a.mark((int) (j - this.f50767c));
                m61523a(this.f50767c, this.f50766b);
            }
            this.f50768d = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    private C18837m(InputStream inputStream, int i) {
        this.f50769e = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 4096);
        }
        this.f50765a = inputStream;
    }

    /* renamed from: a */
    private void m61523a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f50765a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f50765a.read(bArr, i, i2);
        if (read != -1) {
            this.f50766b += (long) read;
        }
        return read;
    }
}
