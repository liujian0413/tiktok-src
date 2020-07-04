package com.google.android.gms.internal.ads;

final class bod {

    /* renamed from: a */
    public final int f42956a;

    /* renamed from: b */
    public int f42957b;

    /* renamed from: c */
    public int f42958c;

    /* renamed from: d */
    public long f42959d;

    /* renamed from: e */
    private final boolean f42960e;

    /* renamed from: f */
    private final bsa f42961f;

    /* renamed from: g */
    private final bsa f42962g;

    /* renamed from: h */
    private int f42963h;

    /* renamed from: i */
    private int f42964i;

    public bod(bsa bsa, bsa bsa2, boolean z) {
        this.f42962g = bsa;
        this.f42961f = bsa2;
        this.f42960e = z;
        bsa2.mo41223c(12);
        this.f42956a = bsa2.mo41235m();
        bsa.mo41223c(12);
        this.f42964i = bsa.mo41235m();
        boolean z2 = true;
        if (bsa.mo41232j() != 1) {
            z2 = false;
        }
        brr.m49874b(z2, "first_chunk must be 1");
        this.f42957b = -1;
    }

    /* renamed from: a */
    public final boolean mo41052a() {
        long j;
        int i = this.f42957b + 1;
        this.f42957b = i;
        if (i == this.f42956a) {
            return false;
        }
        if (this.f42960e) {
            j = this.f42961f.mo41236n();
        } else {
            j = this.f42961f.mo41230h();
        }
        this.f42959d = j;
        if (this.f42957b == this.f42963h) {
            this.f42958c = this.f42962g.mo41235m();
            this.f42962g.mo41225d(4);
            int i2 = this.f42964i - 1;
            this.f42964i = i2;
            this.f42963h = i2 > 0 ? this.f42962g.mo41235m() - 1 : -1;
        }
        return true;
    }
}
