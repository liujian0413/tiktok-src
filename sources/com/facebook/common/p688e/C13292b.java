package com.facebook.common.p688e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.e.b */
public final class C13292b extends FilterInputStream {

    /* renamed from: a */
    private final byte[] f35191a;

    /* renamed from: b */
    private int f35192b;

    /* renamed from: c */
    private int f35193c;

    public final int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        return m38896a();
    }

    /* renamed from: a */
    private int m38896a() {
        if (this.f35192b >= this.f35191a.length) {
            return -1;
        }
        byte[] bArr = this.f35191a;
        int i = this.f35192b;
        this.f35192b = i + 1;
        return bArr[i] & 255;
    }

    public final void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f35192b = this.f35193c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f35193c = this.f35192b;
        }
    }

    public C13292b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr != null) {
            this.f35191a = bArr;
        } else {
            throw new NullPointerException();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = m38896a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
