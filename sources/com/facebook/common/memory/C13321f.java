package com.facebook.common.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13329c;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.memory.f */
public final class C13321f extends InputStream {

    /* renamed from: a */
    private final InputStream f35217a;

    /* renamed from: b */
    private final byte[] f35218b;

    /* renamed from: c */
    private final C13329c<byte[]> f35219c;

    /* renamed from: d */
    private int f35220d = 0;

    /* renamed from: e */
    private int f35221e = 0;

    /* renamed from: f */
    private boolean f35222f = false;

    /* renamed from: b */
    private void m38977b() throws IOException {
        if (this.f35222f) {
            throw new IOException("stream already closed");
        }
    }

    /* renamed from: a */
    private boolean m38976a() throws IOException {
        if (this.f35221e < this.f35220d) {
            return true;
        }
        int read = this.f35217a.read(this.f35218b);
        if (read <= 0) {
            return false;
        }
        this.f35220d = read;
        this.f35221e = 0;
        return true;
    }

    public final int available() throws IOException {
        boolean z;
        if (this.f35221e <= this.f35220d) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        m38977b();
        return (this.f35220d - this.f35221e) + this.f35217a.available();
    }

    public final void close() throws IOException {
        if (!this.f35222f) {
            this.f35222f = true;
            this.f35219c.mo32582a(this.f35218b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f35222f) {
            C13286a.m38863d("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public final int read() throws IOException {
        boolean z;
        if (this.f35221e <= this.f35220d) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        m38977b();
        if (!m38976a()) {
            return -1;
        }
        byte[] bArr = this.f35218b;
        int i = this.f35221e;
        this.f35221e = i + 1;
        return bArr[i] & 255;
    }

    public final long skip(long j) throws IOException {
        boolean z;
        if (this.f35221e <= this.f35220d) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        m38977b();
        long j2 = (long) (this.f35220d - this.f35221e);
        if (j2 >= j) {
            this.f35221e = (int) (((long) this.f35221e) + j);
            return j;
        }
        this.f35221e = this.f35220d;
        return j2 + this.f35217a.skip(j - j2);
    }

    public C13321f(InputStream inputStream, byte[] bArr, C13329c<byte[]> cVar) {
        this.f35217a = (InputStream) C13307g.m38940a(inputStream);
        this.f35218b = (byte[]) C13307g.m38940a(bArr);
        this.f35219c = (C13329c) C13307g.m38940a(cVar);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        if (this.f35221e <= this.f35220d) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        m38977b();
        if (!m38976a()) {
            return -1;
        }
        int min = Math.min(this.f35220d - this.f35221e, i2);
        System.arraycopy(this.f35218b, this.f35221e, bArr, i, min);
        this.f35221e += min;
        return min;
    }
}
