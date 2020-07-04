package com.facebook.common.memory;

import com.facebook.common.internal.C13307g;
import java.io.InputStream;

/* renamed from: com.facebook.common.memory.h */
public final class C13323h extends InputStream {

    /* renamed from: a */
    final PooledByteBuffer f35223a;

    /* renamed from: b */
    int f35224b = 0;

    /* renamed from: c */
    int f35225c = 0;

    public final boolean markSupported() {
        return true;
    }

    public final void reset() {
        this.f35224b = this.f35225c;
    }

    public final int available() {
        return this.f35223a.mo32575a() - this.f35224b;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f35223a;
        int i = this.f35224b;
        this.f35224b = i + 1;
        return pooledByteBuffer.mo32574a(i) & 255;
    }

    public final void mark(int i) {
        this.f35225c = this.f35224b;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public C13323h(PooledByteBuffer pooledByteBuffer) {
        C13307g.m38943a(!pooledByteBuffer.mo32579d());
        this.f35223a = (PooledByteBuffer) C13307g.m38940a(pooledByteBuffer);
    }

    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        int min = Math.min((int) j, available());
        this.f35224b += min;
        return (long) min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f35223a.mo32576a(this.f35224b, bArr, i, min);
        this.f35224b += min;
        return min;
    }
}
