package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

final class bik {

    /* renamed from: a */
    public long f42139a;

    /* renamed from: b */
    private final bjm f42140b;

    /* renamed from: c */
    private final int f42141c;

    /* renamed from: d */
    private final bim f42142d = new bim();

    /* renamed from: e */
    private final LinkedBlockingDeque<bjl> f42143e = new LinkedBlockingDeque<>();

    /* renamed from: f */
    private final bin f42144f = new bin();

    /* renamed from: g */
    private final bkj f42145g = new bkj(32);

    /* renamed from: h */
    private long f42146h;

    /* renamed from: i */
    private bjl f42147i;

    /* renamed from: j */
    private int f42148j = this.f42141c;

    public bik(bjm bjm) {
        this.f42140b = bjm;
        this.f42141c = bjm.mo40795b();
    }

    /* renamed from: a */
    public final void mo40758a() {
        this.f42142d.mo40766a();
        while (!this.f42143e.isEmpty()) {
            this.f42140b.mo40794a((bjl) this.f42143e.remove());
        }
        this.f42146h = 0;
        this.f42139a = 0;
        this.f42147i = null;
        this.f42148j = this.f42141c;
    }

    /* renamed from: a */
    public final boolean mo40762a(bhn bhn) {
        return this.f42142d.mo40768a(bhn, this.f42144f);
    }

    /* renamed from: b */
    public final void mo40763b() {
        m48939b(this.f42142d.mo40769b());
    }

    /* renamed from: a */
    public final boolean mo40761a(long j) {
        long a = this.f42142d.mo40765a(j);
        if (a == -1) {
            return false;
        }
        m48939b(a);
        return true;
    }

    /* renamed from: b */
    public final boolean mo40764b(bhn bhn) {
        int i;
        if (!this.f42142d.mo40768a(bhn, this.f42144f)) {
            return false;
        }
        if (bhn.mo40695a()) {
            bin bin = this.f42144f;
            long j = bin.f42159a;
            m48938a(j, this.f42145g.f42382a, 1);
            long j2 = j + 1;
            byte b = this.f42145g.f42382a[0];
            boolean z = (b & 128) != 0;
            byte b2 = b & Byte.MAX_VALUE;
            if (bhn.f42027a.f41877a == null) {
                bhn.f42027a.f41877a = new byte[16];
            }
            m48938a(j2, bhn.f42027a.f41877a, b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                m48938a(j3, this.f42145g.f42382a, 2);
                j3 += 2;
                this.f42145g.mo40809a(0);
                i = this.f42145g.mo40812b();
            } else {
                i = 1;
            }
            int[] iArr = bhn.f42027a.f41878b;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = bhn.f42027a.f41879c;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = i * 6;
                bkj bkj = this.f42145g;
                if (bkj.f42384c < i2) {
                    bkj.mo40810a(new byte[i2], i2);
                }
                m48938a(j3, this.f42145g.f42382a, i2);
                j3 += (long) i2;
                this.f42145g.mo40809a(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = this.f42145g.mo40812b();
                    iArr4[i3] = this.f42145g.mo40818g();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = bhn.f42029c - ((int) (j3 - bin.f42159a));
            }
            bhn.f42027a.mo40603a(i, iArr2, iArr4, bin.f42160b, bhn.f42027a.f41877a, 1);
            int i4 = (int) (j3 - bin.f42159a);
            bin.f42159a += (long) i4;
            bhn.f42029c -= i4;
        }
        if (bhn.f42028b != null) {
            bhn.f42028b.capacity();
        }
        if (bhn.f42028b != null) {
            long j4 = this.f42144f.f42159a;
            ByteBuffer byteBuffer = bhn.f42028b;
            int i5 = bhn.f42029c;
            while (i5 > 0) {
                m48939b(j4);
                int i6 = (int) (j4 - this.f42146h);
                int min = Math.min(i5, this.f42141c - i6);
                byteBuffer.put(((bjl) this.f42143e.peek()).f42315a, i6 + 0, min);
                j4 += (long) min;
                i5 -= min;
            }
        }
        m48939b(this.f42142d.mo40769b());
        return true;
    }

    /* renamed from: a */
    private final void m48938a(long j, byte[] bArr, int i) {
        long j2 = j;
        int i2 = 0;
        while (i2 < i) {
            m48939b(j2);
            int i3 = (int) (j2 - this.f42146h);
            int min = Math.min(i - i2, this.f42141c - i3);
            System.arraycopy(((bjl) this.f42143e.peek()).f42315a, i3 + 0, bArr, i2, min);
            j2 += (long) min;
            i2 += min;
        }
    }

    /* renamed from: b */
    private final void m48939b(long j) {
        int i = ((int) (j - this.f42146h)) / this.f42141c;
        for (int i2 = 0; i2 < i; i2++) {
            this.f42140b.mo40794a((bjl) this.f42143e.remove());
            this.f42146h += (long) this.f42141c;
        }
    }

    /* renamed from: a */
    public final int mo40757a(bie bie, int i) throws IOException, InterruptedException {
        m48940c();
        int min = Math.min(i, this.f42141c - this.f42148j);
        bie.mo40732a(this.f42147i.f42315a, this.f42148j + 0, min);
        this.f42148j += min;
        this.f42139a += (long) min;
        return min;
    }

    /* renamed from: a */
    public final void mo40760a(bkj bkj, int i) {
        int i2 = i;
        while (i2 > 0) {
            m48940c();
            int min = Math.min(i2, this.f42141c - this.f42148j);
            bkj.mo40811a(this.f42147i.f42315a, this.f42148j + 0, min);
            this.f42148j += min;
            i2 -= min;
        }
        this.f42139a += (long) i;
    }

    /* renamed from: a */
    public final void mo40759a(long j, int i, long j2, int i2, byte[] bArr) {
        this.f42142d.mo40767a(j, i, j2, i2, bArr);
    }

    /* renamed from: c */
    private final void m48940c() {
        if (this.f42148j == this.f42141c) {
            this.f42148j = 0;
            this.f42147i = this.f42140b.mo40793a();
            this.f42143e.add(this.f42147i);
        }
    }
}
