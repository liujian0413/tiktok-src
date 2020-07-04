package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bic implements bip {

    /* renamed from: a */
    public volatile long f42089a = Long.MIN_VALUE;

    /* renamed from: b */
    public volatile bhl f42090b;

    /* renamed from: c */
    private final bik f42091c;

    /* renamed from: d */
    private final bhn f42092d = new bhn(0);

    /* renamed from: e */
    private boolean f42093e = true;

    /* renamed from: f */
    private long f42094f = Long.MIN_VALUE;

    /* renamed from: g */
    private long f42095g = Long.MIN_VALUE;

    public bic(bjm bjm) {
        this.f42091c = new bik(bjm);
    }

    /* renamed from: a */
    public final void mo40735a() {
        this.f42091c.mo40758a();
        this.f42093e = true;
        this.f42094f = Long.MIN_VALUE;
        this.f42095g = Long.MIN_VALUE;
        this.f42089a = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final boolean mo40741b() {
        return this.f42090b != null;
    }

    /* renamed from: c */
    public final boolean mo40743c() {
        return !m48888d();
    }

    /* renamed from: a */
    public final boolean mo40740a(bhn bhn) {
        if (!m48888d()) {
            return false;
        }
        this.f42091c.mo40764b(bhn);
        this.f42093e = false;
        this.f42094f = bhn.f42031e;
        return true;
    }

    /* renamed from: a */
    public final void mo40736a(long j) {
        while (this.f42091c.mo40762a(this.f42092d) && this.f42092d.f42031e < j) {
            this.f42091c.mo40763b();
            this.f42093e = true;
        }
        this.f42094f = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final boolean mo40742b(long j) {
        return this.f42091c.mo40761a(j);
    }

    /* renamed from: d */
    private final boolean m48888d() {
        boolean a = this.f42091c.mo40762a(this.f42092d);
        if (this.f42093e) {
            while (a && !this.f42092d.mo40696b()) {
                this.f42091c.mo40763b();
                a = this.f42091c.mo40762a(this.f42092d);
            }
        }
        if (!a) {
            return false;
        }
        if (this.f42095g == Long.MIN_VALUE || this.f42092d.f42031e < this.f42095g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo40738a(bhl bhl) {
        this.f42090b = bhl;
    }

    /* renamed from: a */
    public final int mo40734a(bie bie, int i) throws IOException, InterruptedException {
        return this.f42091c.mo40757a(bie, i);
    }

    /* renamed from: a */
    public final void mo40739a(bkj bkj, int i) {
        this.f42091c.mo40760a(bkj, i);
    }

    /* renamed from: a */
    public void mo40737a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        this.f42089a = Math.max(this.f42089a, j);
        int i4 = i2;
        this.f42091c.mo40759a(j2, i, (this.f42091c.f42139a - ((long) i4)) - ((long) i3), i4, bArr);
    }
}
