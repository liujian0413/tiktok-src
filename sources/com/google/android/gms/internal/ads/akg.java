package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;

@C6505uv
public final class akg implements blh {

    /* renamed from: a */
    private final brh f40489a;

    /* renamed from: b */
    private long f40490b;

    /* renamed from: c */
    private long f40491c;

    /* renamed from: d */
    private long f40492d;

    /* renamed from: e */
    private long f40493e;

    /* renamed from: f */
    private int f40494f;

    /* renamed from: g */
    private boolean f40495g;

    akg() {
        this(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT, VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT, 2500, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    private akg(int i, int i2, long j, long j2) {
        this.f40489a = new brh(true, 65536);
        this.f40490b = 15000000;
        this.f40491c = 30000000;
        this.f40492d = 2500000;
        this.f40493e = 5000000;
    }

    /* renamed from: a */
    public final void mo39601a() {
        m46187a(false);
    }

    /* renamed from: a */
    public final void mo39603a(blj[] bljArr, bql bql, bqx bqx) {
        this.f40494f = 0;
        for (int i = 0; i < bljArr.length; i++) {
            if (bqx.mo41176a(i) != null) {
                this.f40494f += bsf.m49942b(bljArr[i].mo40822a());
            }
        }
        this.f40489a.mo41196a(this.f40494f);
    }

    /* renamed from: b */
    public final void mo39606b() {
        m46187a(true);
    }

    /* renamed from: c */
    public final void mo39608c() {
        m46187a(true);
    }

    /* renamed from: d */
    public final brc mo39610d() {
        return this.f40489a;
    }

    /* renamed from: a */
    public final synchronized boolean mo39605a(long j, boolean z) {
        long j2;
        boolean z2;
        if (z) {
            try {
                j2 = this.f40493e;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j2 = this.f40492d;
        }
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public final synchronized boolean mo39604a(long j) {
        boolean z = false;
        char c = j > this.f40491c ? 0 : j < this.f40490b ? (char) 2 : 1;
        boolean z2 = this.f40489a.mo41198e() >= this.f40494f;
        if (c == 2 || (c == 1 && this.f40495g && !z2)) {
            z = true;
        }
        this.f40495g = z;
        return this.f40495g;
    }

    /* renamed from: a */
    public final synchronized void mo39602a(int i) {
        this.f40490b = ((long) i) * 1000;
    }

    /* renamed from: b */
    public final synchronized void mo39607b(int i) {
        this.f40491c = ((long) i) * 1000;
    }

    /* renamed from: c */
    public final synchronized void mo39609c(int i) {
        this.f40492d = ((long) i) * 1000;
    }

    /* renamed from: d */
    public final synchronized void mo39611d(int i) {
        this.f40493e = ((long) i) * 1000;
    }

    /* renamed from: a */
    private final void m46187a(boolean z) {
        this.f40494f = 0;
        this.f40495g = false;
        if (z) {
            this.f40489a.mo41197d();
        }
    }
}
