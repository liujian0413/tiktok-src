package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class bib implements bie {

    /* renamed from: a */
    private static final byte[] f42085a = new byte[4096];

    /* renamed from: b */
    private final bjp f42086b;

    /* renamed from: c */
    private long f42087c;

    /* renamed from: d */
    private long f42088d;

    public bib(bjp bjp, long j, long j2) {
        this.f42086b = bjp;
        this.f42087c = j;
        this.f42088d = j2;
    }

    /* renamed from: a */
    public final boolean mo40733a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            if (!Thread.interrupted()) {
                int a = this.f42086b.mo39542a(bArr, i3, i4);
                if (a != -1) {
                    i3 += a;
                    i4 -= a;
                } else if (z && i4 == i2) {
                    return false;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f42087c += (long) i2;
        return true;
    }

    /* renamed from: a */
    public final void mo40732a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo40733a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final void mo40731a(int i) throws IOException, InterruptedException {
        int i2 = i;
        while (i2 > 0) {
            if (!Thread.interrupted()) {
                int a = this.f42086b.mo39542a(f42085a, 0, Math.min(f42085a.length, i2));
                if (a != -1) {
                    i2 -= a;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f42087c += (long) i;
    }

    /* renamed from: a */
    public final long mo40730a() {
        return this.f42087c;
    }
}
