package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class bnc implements bne {

    /* renamed from: a */
    private static final byte[] f42722a = new byte[4096];

    /* renamed from: b */
    private final bre f42723b;

    /* renamed from: c */
    private final long f42724c;

    /* renamed from: d */
    private long f42725d;

    /* renamed from: e */
    private byte[] f42726e = new byte[65536];

    /* renamed from: f */
    private int f42727f;

    /* renamed from: g */
    private int f42728g;

    public bnc(bre bre, long j, long j2) {
        this.f42723b = bre;
        this.f42725d = j;
        this.f42724c = j2;
    }

    /* renamed from: a */
    public final int mo41004a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int d = m49419d(bArr, i, i2);
        if (d == 0) {
            d = m49416a(bArr, i, i2, 0, true);
        }
        m49421f(d);
        return d;
    }

    /* renamed from: a */
    public final boolean mo41006a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int d = m49419d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m49416a(bArr, i, i2, d, z);
        }
        m49421f(d);
        return d != -1;
    }

    /* renamed from: b */
    public final void mo41009b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo41006a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final int mo41003a(int i) throws IOException, InterruptedException {
        int d = m49418d(i);
        if (d == 0) {
            d = m49416a(f42722a, 0, Math.min(i, f42722a.length), 0, true);
        }
        m49421f(d);
        return d;
    }

    /* renamed from: b */
    public final void mo41008b(int i) throws IOException, InterruptedException {
        int d = m49418d(i);
        while (d < i && d != -1) {
            d = m49416a(f42722a, -d, Math.min(i, f42722a.length + d), d, false);
        }
        m49421f(d);
    }

    /* renamed from: c */
    public final void mo41012c(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (m49417a(i2, false)) {
            System.arraycopy(this.f42726e, this.f42727f - i2, bArr, i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m49417a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f42727f + i;
        if (i2 > this.f42726e.length) {
            this.f42726e = Arrays.copyOf(this.f42726e, bsf.m49934a(this.f42726e.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f42728g - this.f42727f, i);
        while (min < i) {
            min = m49416a(this.f42726e, this.f42727f, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.f42727f += i;
        this.f42728g = Math.max(this.f42728g, this.f42727f);
        return true;
    }

    /* renamed from: c */
    public final void mo41011c(int i) throws IOException, InterruptedException {
        m49417a(i, false);
    }

    /* renamed from: a */
    public final void mo41005a() {
        this.f42727f = 0;
    }

    /* renamed from: b */
    public final long mo41007b() {
        return this.f42725d;
    }

    /* renamed from: c */
    public final long mo41010c() {
        return this.f42724c;
    }

    /* renamed from: d */
    private final int m49418d(int i) {
        int min = Math.min(this.f42728g, i);
        m49420e(min);
        return min;
    }

    /* renamed from: d */
    private final int m49419d(byte[] bArr, int i, int i2) {
        if (this.f42728g == 0) {
            return 0;
        }
        int min = Math.min(this.f42728g, i2);
        System.arraycopy(this.f42726e, 0, bArr, i, min);
        m49420e(min);
        return min;
    }

    /* renamed from: e */
    private final void m49420e(int i) {
        this.f42728g -= i;
        this.f42727f = 0;
        byte[] bArr = this.f42726e;
        if (this.f42728g < this.f42726e.length - 524288) {
            bArr = new byte[(this.f42728g + 65536)];
        }
        System.arraycopy(this.f42726e, i, bArr, 0, this.f42728g);
        this.f42726e = bArr;
    }

    /* renamed from: a */
    private final int m49416a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f42723b.mo39588a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: f */
    private final void m49421f(int i) {
        if (i != -1) {
            this.f42725d += (long) i;
        }
    }
}
