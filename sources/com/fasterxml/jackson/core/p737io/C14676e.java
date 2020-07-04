package com.fasterxml.jackson.core.p737io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.e */
public final class C14676e extends InputStream {

    /* renamed from: a */
    protected final C14674c f37948a;

    /* renamed from: b */
    final InputStream f37949b;

    /* renamed from: c */
    byte[] f37950c;

    /* renamed from: d */
    int f37951d;

    /* renamed from: e */
    final int f37952e;

    public final void close() throws IOException {
        m42461a();
        this.f37949b.close();
    }

    public final boolean markSupported() {
        if (this.f37950c != null || !this.f37949b.markSupported()) {
            return false;
        }
        return true;
    }

    public final void reset() throws IOException {
        if (this.f37950c == null) {
            this.f37949b.reset();
        }
    }

    /* renamed from: a */
    private void m42461a() {
        byte[] bArr = this.f37950c;
        if (bArr != null) {
            this.f37950c = null;
            if (this.f37948a != null) {
                this.f37948a.mo37195a(bArr);
            }
        }
    }

    public final int available() throws IOException {
        if (this.f37950c != null) {
            return this.f37952e - this.f37951d;
        }
        return this.f37949b.available();
    }

    public final int read() throws IOException {
        if (this.f37950c == null) {
            return this.f37949b.read();
        }
        byte[] bArr = this.f37950c;
        int i = this.f37951d;
        this.f37951d = i + 1;
        byte b = bArr[i] & 255;
        if (this.f37951d >= this.f37952e) {
            m42461a();
        }
        return b;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i) {
        if (this.f37950c == null) {
            this.f37949b.mark(i);
        }
    }

    public final long skip(long j) throws IOException {
        long j2;
        if (this.f37950c != null) {
            long j3 = (long) (this.f37952e - this.f37951d);
            if (j3 > j) {
                this.f37951d += (int) j;
                return j;
            }
            m42461a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            j2 += this.f37949b.skip(j);
        }
        return j2;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37950c == null) {
            return this.f37949b.read(bArr, i, i2);
        }
        int i3 = this.f37952e - this.f37951d;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f37950c, this.f37951d, bArr, i, i2);
        this.f37951d += i2;
        if (this.f37951d >= this.f37952e) {
            m42461a();
        }
        return i2;
    }

    public C14676e(C14674c cVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f37948a = cVar;
        this.f37949b = inputStream;
        this.f37950c = bArr;
        this.f37951d = i;
        this.f37952e = i2;
    }
}
