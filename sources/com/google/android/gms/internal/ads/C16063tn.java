package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tn */
public final class C16063tn extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C15768ip f45052a;

    public C16063tn(C15768ip ipVar, int i) {
        this.f45052a = ipVar;
        this.buf = this.f45052a.mo41661a(Math.max(i, 256));
    }

    public final void close() throws IOException {
        this.f45052a.mo41660a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f45052a.mo41660a(this.buf);
    }

    /* renamed from: a */
    private final void m52188a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f45052a.mo41661a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f45052a.mo41660a(this.buf);
            this.buf = a;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m52188a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m52188a(1);
        super.write(i);
    }
}
