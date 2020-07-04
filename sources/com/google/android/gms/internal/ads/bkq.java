package com.google.android.gms.internal.ads;

public abstract class bkq implements blj, blk {

    /* renamed from: a */
    public bll f42390a;

    /* renamed from: b */
    public int f42391b;

    /* renamed from: c */
    private final int f42392c;

    /* renamed from: d */
    private int f42393d;

    /* renamed from: e */
    private bqf f42394e;

    /* renamed from: f */
    private long f42395f;

    /* renamed from: g */
    private boolean f42396g = true;

    /* renamed from: h */
    private boolean f42397h;

    public bkq(int i) {
        this.f42392c = i;
    }

    /* renamed from: a */
    public void mo40825a(int i, Object obj) throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40827a(long j, boolean z) throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40829a(boolean z) throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40830a(zzlg[] zzlgArr, long j) throws zzkt {
    }

    /* renamed from: b */
    public final blk mo40832b() {
        return this;
    }

    /* renamed from: c */
    public brv mo40834c() {
        return null;
    }

    /* renamed from: l */
    public int mo40843l() throws zzkt {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo40844m() throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo40845n() throws zzkt {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo40846o() {
    }

    /* renamed from: a */
    public final int mo40822a() {
        return this.f42392c;
    }

    /* renamed from: a */
    public final void mo40824a(int i) {
        this.f42391b = i;
    }

    /* renamed from: d */
    public final int mo40835d() {
        return this.f42393d;
    }

    /* renamed from: a */
    public final void mo40828a(bll bll, zzlg[] zzlgArr, bqf bqf, long j, boolean z, long j2) throws zzkt {
        brr.m49873b(this.f42393d == 0);
        this.f42390a = bll;
        this.f42393d = 1;
        mo40829a(z);
        mo40831a(zzlgArr, bqf, j2);
        mo40827a(j, z);
    }

    /* renamed from: e */
    public final void mo40836e() throws zzkt {
        boolean z = true;
        if (this.f42393d != 1) {
            z = false;
        }
        brr.m49873b(z);
        this.f42393d = 2;
        mo40844m();
    }

    /* renamed from: a */
    public final void mo40831a(zzlg[] zzlgArr, bqf bqf, long j) throws zzkt {
        brr.m49873b(!this.f42397h);
        this.f42394e = bqf;
        this.f42396g = false;
        this.f42395f = j;
        mo40830a(zzlgArr, j);
    }

    /* renamed from: f */
    public final bqf mo40837f() {
        return this.f42394e;
    }

    /* renamed from: g */
    public final boolean mo40838g() {
        return this.f42396g;
    }

    /* renamed from: h */
    public final void mo40839h() {
        this.f42397h = true;
    }

    /* renamed from: i */
    public final boolean mo40840i() {
        return this.f42397h;
    }

    /* renamed from: a */
    public final void mo40826a(long j) throws zzkt {
        this.f42397h = false;
        this.f42396g = false;
        mo40827a(j, false);
    }

    /* renamed from: j */
    public final void mo40841j() throws zzkt {
        brr.m49873b(this.f42393d == 2);
        this.f42393d = 1;
        mo40845n();
    }

    /* renamed from: k */
    public final void mo40842k() {
        boolean z = true;
        if (this.f42393d != 1) {
            z = false;
        }
        brr.m49873b(z);
        this.f42393d = 0;
        this.f42394e = null;
        this.f42397h = false;
        mo40846o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40823a(blg blg, bmw bmw, boolean z) {
        int a = this.f42394e.mo41111a(blg, bmw, z);
        if (a == -4) {
            if (bmw.mo40986c()) {
                this.f42396g = true;
                if (this.f42397h) {
                    return -4;
                }
                return -3;
            }
            bmw.f42714d += this.f42395f;
        } else if (a == -5) {
            zzlg zzlg = blg.f42499a;
            if (zzlg.f45725o != Long.MAX_VALUE) {
                blg.f42499a = zzlg.mo42352a(zzlg.f45725o + this.f42395f);
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40833b(long j) {
        this.f42394e.mo41112a(j - this.f42395f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo40847p() {
        return this.f42396g ? this.f42397h : this.f42394e.mo41113a();
    }
}
