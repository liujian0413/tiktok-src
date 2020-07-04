package com.google.android.gms.internal.ads;

import com.p280ss.android.medialib.camera.ImageFrame;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class bqc implements bnm {

    /* renamed from: a */
    public bqe f43225a;

    /* renamed from: b */
    private final brc f43226b;

    /* renamed from: c */
    private final int f43227c;

    /* renamed from: d */
    private final bqa f43228d = new bqa();

    /* renamed from: e */
    private final bqb f43229e = new bqb();

    /* renamed from: f */
    private final bsa f43230f = new bsa(32);

    /* renamed from: g */
    private final AtomicInteger f43231g = new AtomicInteger();

    /* renamed from: h */
    private bqd f43232h = new bqd(0, this.f43227c);

    /* renamed from: i */
    private bqd f43233i = this.f43232h;

    /* renamed from: j */
    private zzlg f43234j;

    /* renamed from: k */
    private boolean f43235k;

    /* renamed from: l */
    private zzlg f43236l;

    /* renamed from: m */
    private long f43237m;

    /* renamed from: n */
    private int f43238n = this.f43227c;

    public bqc(brc brc) {
        this.f43226b = brc;
        this.f43227c = brc.mo41193c();
    }

    /* renamed from: a */
    public final void mo41132a(boolean z) {
        int andSet = this.f43231g.getAndSet(z ? 0 : 2);
        m49735i();
        this.f43228d.mo41124b();
        if (andSet == 2) {
            this.f43234j = null;
        }
    }

    /* renamed from: a */
    public final int mo41130a() {
        return this.f43228d.mo41125c();
    }

    /* renamed from: b */
    public final void mo41134b() {
        if (this.f43231g.getAndSet(2) == 0) {
            m49735i();
        }
    }

    /* renamed from: c */
    public final boolean mo41135c() {
        return this.f43228d.mo41126d();
    }

    /* renamed from: d */
    public final zzlg mo41136d() {
        return this.f43228d.mo41127e();
    }

    /* renamed from: e */
    public final long mo41137e() {
        return this.f43228d.mo41128f();
    }

    /* renamed from: f */
    public final void mo41138f() {
        long g = this.f43228d.mo41129g();
        if (g != -1) {
            m49731a(g);
        }
    }

    /* renamed from: a */
    public final boolean mo41133a(long j, boolean z) {
        long a = this.f43228d.mo41119a(j, z);
        if (a == -1) {
            return false;
        }
        m49731a(a);
        return true;
    }

    /* renamed from: a */
    public final int mo41131a(blg blg, bmw bmw, boolean z, boolean z2, long j) {
        int i;
        switch (this.f43228d.mo41118a(blg, bmw, z, z2, this.f43234j, this.f43229e)) {
            case -5:
                this.f43234j = blg.f42499a;
                return -5;
            case -4:
                if (!bmw.mo40986c()) {
                    if (bmw.f42714d < j) {
                        bmw.mo40983a(Integer.MIN_VALUE);
                    }
                    if (bmw.mo40992e()) {
                        bqb bqb = this.f43229e;
                        long j2 = bqb.f43222b;
                        this.f43230f.mo41217a(1);
                        m49732a(j2, this.f43230f.f43388a, 1);
                        long j3 = j2 + 1;
                        byte b = this.f43230f.f43388a[0];
                        boolean z3 = (b & 128) != 0;
                        byte b2 = b & Byte.MAX_VALUE;
                        if (bmw.f42712b.f42688a == null) {
                            bmw.f42712b.f42688a = new byte[16];
                        }
                        m49732a(j3, bmw.f42712b.f42688a, (int) b2);
                        long j4 = j3 + ((long) b2);
                        if (z3) {
                            this.f43230f.mo41217a(2);
                            m49732a(j4, this.f43230f.f43388a, 2);
                            j4 += 2;
                            i = this.f43230f.mo41226e();
                        } else {
                            i = 1;
                        }
                        int[] iArr = bmw.f42712b.f42689b;
                        if (iArr == null || iArr.length < i) {
                            iArr = new int[i];
                        }
                        int[] iArr2 = iArr;
                        int[] iArr3 = bmw.f42712b.f42690c;
                        if (iArr3 == null || iArr3.length < i) {
                            iArr3 = new int[i];
                        }
                        int[] iArr4 = iArr3;
                        if (z3) {
                            int i2 = i * 6;
                            this.f43230f.mo41217a(i2);
                            m49732a(j4, this.f43230f.f43388a, i2);
                            j4 += (long) i2;
                            this.f43230f.mo41223c(0);
                            for (int i3 = 0; i3 < i; i3++) {
                                iArr2[i3] = this.f43230f.mo41226e();
                                iArr4[i3] = this.f43230f.mo41235m();
                            }
                        } else {
                            iArr2[0] = 0;
                            iArr4[0] = bqb.f43221a - ((int) (j4 - bqb.f43222b));
                        }
                        bnn bnn = bqb.f43224d;
                        bmw.f42712b.mo40988a(i, iArr2, iArr4, bnn.f42736b, bmw.f42712b.f42688a, bnn.f42735a);
                        int i4 = (int) (j4 - bqb.f43222b);
                        bqb.f43222b += (long) i4;
                        bqb.f43221a -= i4;
                    }
                    bmw.mo40991c(this.f43229e.f43221a);
                    long j5 = this.f43229e.f43222b;
                    ByteBuffer byteBuffer = bmw.f42713c;
                    int i5 = this.f43229e.f43221a;
                    m49731a(j5);
                    while (i5 > 0) {
                        int i6 = (int) (j5 - this.f43232h.f43239a);
                        int min = Math.min(i5, this.f43227c - i6);
                        brb brb = this.f43232h.f43242d;
                        byteBuffer.put(brb.f43308a, brb.mo41188a(i6), min);
                        j5 += (long) min;
                        i5 -= min;
                        if (j5 == this.f43232h.f43240b) {
                            this.f43226b.mo41190a(brb);
                            this.f43232h = this.f43232h.mo41139a();
                        }
                    }
                    m49731a(this.f43229e.f43223c);
                }
                return -4;
            case ImageFrame.NV21 /*-3*/:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private final void m49732a(long j, byte[] bArr, int i) {
        m49731a(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f43232h.f43239a);
            int min = Math.min(i - i2, this.f43227c - i3);
            brb brb = this.f43232h.f43242d;
            System.arraycopy(brb.f43308a, brb.mo41188a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f43232h.f43240b) {
                this.f43226b.mo41190a(brb);
                this.f43232h = this.f43232h.mo41139a();
            }
        }
    }

    /* renamed from: a */
    private final void m49731a(long j) {
        while (j >= this.f43232h.f43240b) {
            this.f43226b.mo41190a(this.f43232h.f43242d);
            this.f43232h = this.f43232h.mo41139a();
        }
    }

    /* renamed from: a */
    public final void mo41025a(zzlg zzlg) {
        zzlg zzlg2 = zzlg == null ? null : zzlg;
        boolean a = this.f43228d.mo41123a(zzlg2);
        this.f43236l = zzlg;
        this.f43235k = false;
        if (this.f43225a != null && a) {
            this.f43225a.mo41094a(zzlg2);
        }
    }

    /* renamed from: a */
    public final int mo41022a(bne bne, int i, boolean z) throws IOException, InterruptedException {
        if (!m49733g()) {
            int a = bne.mo41003a(i);
            if (a != -1) {
                return a;
            }
            throw new EOFException();
        }
        try {
            int a2 = m49730a(i);
            brb brb = this.f43233i.f43242d;
            int a3 = bne.mo41004a(brb.f43308a, brb.mo41188a(this.f43238n), a2);
            if (a3 != -1) {
                this.f43238n += a3;
                this.f43237m += (long) a3;
                return a3;
            }
            throw new EOFException();
        } finally {
            m49734h();
        }
    }

    /* renamed from: a */
    public final void mo41024a(bsa bsa, int i) {
        if (!m49733g()) {
            bsa.mo41225d(i);
            return;
        }
        while (i > 0) {
            int a = m49730a(i);
            brb brb = this.f43233i.f43242d;
            bsa.mo41219a(brb.f43308a, brb.mo41188a(this.f43238n), a);
            this.f43238n += a;
            this.f43237m += (long) a;
            i -= a;
        }
        m49734h();
    }

    /* renamed from: a */
    public final void mo41023a(long j, int i, int i2, int i3, bnn bnn) {
        if (!m49733g()) {
            long j2 = j;
            this.f43228d.mo41121a(j);
            return;
        }
        long j3 = j;
        try {
            this.f43228d.mo41122a(j, i, this.f43237m - ((long) i2), i2, bnn);
        } finally {
            m49734h();
        }
    }

    /* renamed from: g */
    private final boolean m49733g() {
        return this.f43231g.compareAndSet(0, 1);
    }

    /* renamed from: h */
    private final void m49734h() {
        if (!this.f43231g.compareAndSet(1, 0)) {
            m49735i();
        }
    }

    /* renamed from: i */
    private final void m49735i() {
        this.f43228d.mo41120a();
        bqd bqd = this.f43232h;
        if (bqd.f43241c) {
            int i = ((int) (this.f43233i.f43239a - bqd.f43239a)) / this.f43227c;
            brb[] brbArr = new brb[((this.f43233i.f43241c ? 1 : 0) + i)];
            for (int i2 = 0; i2 < brbArr.length; i2++) {
                brbArr[i2] = bqd.f43242d;
                bqd = bqd.mo41139a();
            }
            this.f43226b.mo41191a(brbArr);
        }
        this.f43232h = new bqd(0, this.f43227c);
        this.f43233i = this.f43232h;
        this.f43237m = 0;
        this.f43238n = this.f43227c;
        this.f43226b.mo41192b();
    }

    /* renamed from: a */
    private final int m49730a(int i) {
        if (this.f43238n == this.f43227c) {
            this.f43238n = 0;
            if (this.f43233i.f43241c) {
                this.f43233i = this.f43233i.f43243e;
            }
            bqd bqd = this.f43233i;
            brb a = this.f43226b.mo41189a();
            bqd bqd2 = new bqd(this.f43233i.f43240b, this.f43227c);
            bqd.f43242d = a;
            bqd.f43243e = bqd2;
            bqd.f43241c = true;
        }
        return Math.min(i, this.f43227c - this.f43238n);
    }
}
