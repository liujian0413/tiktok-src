package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.retrofit2.p637a.C12465e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e */
public final class C10141e extends InputStream {

    /* renamed from: a */
    private InputStream f27642a;

    /* renamed from: b */
    private C12465e f27643b;

    public C10141e() {
    }

    public final int available() throws IOException {
        if (this.f27642a != null) {
            return this.f27642a.available();
        }
        return super.available();
    }

    public final boolean markSupported() {
        if (this.f27642a != null) {
            return this.f27642a.markSupported();
        }
        return super.markSupported();
    }

    public final int read() throws IOException {
        if (this.f27642a != null) {
            return this.f27642a.read();
        }
        return -1;
    }

    public final void close() throws IOException {
        try {
            if (this.f27642a != null) {
                this.f27642a.close();
            }
            if (this.f27643b != null) {
                this.f27643b.mo10451b();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    public final synchronized void reset() throws IOException {
        if (this.f27642a != null) {
            this.f27642a.reset();
        } else {
            super.reset();
        }
    }

    public final long skip(long j) throws IOException {
        if (this.f27642a != null) {
            return this.f27642a.skip(j);
        }
        return super.skip(j);
    }

    public final synchronized void mark(int i) {
        if (this.f27642a != null) {
            this.f27642a.mark(i);
        } else {
            super.mark(i);
        }
    }

    public final int read(byte[] bArr) throws IOException {
        if (this.f27642a != null) {
            return this.f27642a.read(bArr);
        }
        return super.read(bArr);
    }

    public C10141e(InputStream inputStream, C12465e eVar) {
        this.f27642a = inputStream;
        this.f27643b = eVar;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27642a != null) {
            return this.f27642a.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }
}
