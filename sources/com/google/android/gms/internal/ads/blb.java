package com.google.android.gms.internal.ads;

final class blb {

    /* renamed from: a */
    public final bpt f42469a;

    /* renamed from: b */
    public final Object f42470b;

    /* renamed from: c */
    public final int f42471c;

    /* renamed from: d */
    public final bqf[] f42472d;

    /* renamed from: e */
    public final long f42473e;

    /* renamed from: f */
    public int f42474f;

    /* renamed from: g */
    public long f42475g;

    /* renamed from: h */
    public boolean f42476h;

    /* renamed from: i */
    public boolean f42477i;

    /* renamed from: j */
    public boolean f42478j;

    /* renamed from: k */
    public blb f42479k;

    /* renamed from: l */
    public bra f42480l;

    /* renamed from: m */
    private final boolean[] f42481m;

    /* renamed from: n */
    private final blj[] f42482n;

    /* renamed from: o */
    private final blk[] f42483o;

    /* renamed from: p */
    private final bqy f42484p;

    /* renamed from: q */
    private final blh f42485q;

    /* renamed from: r */
    private final bpv f42486r;

    /* renamed from: s */
    private bra f42487s;

    public blb(blj[] bljArr, blk[] blkArr, long j, bqy bqy, blh blh, bpv bpv, Object obj, int i, int i2, boolean z, long j2) {
        this.f42482n = bljArr;
        this.f42483o = blkArr;
        this.f42473e = j;
        this.f42484p = bqy;
        this.f42485q = blh;
        this.f42486r = bpv;
        this.f42470b = brr.m49869a(obj);
        this.f42471c = i;
        this.f42474f = i2;
        this.f42476h = z;
        this.f42475g = j2;
        this.f42472d = new bqf[bljArr.length];
        this.f42481m = new boolean[bljArr.length];
        this.f42469a = bpv.mo41114a(i2, blh.mo39610d());
    }

    /* renamed from: a */
    public final long mo40884a() {
        return this.f42473e - this.f42475g;
    }

    /* renamed from: a */
    public final void mo40887a(int i, boolean z) {
        this.f42474f = i;
        this.f42476h = z;
    }

    /* renamed from: b */
    public final boolean mo40888b() {
        return this.f42477i && (!this.f42478j || this.f42469a.mo41100e() == Long.MIN_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40889c() throws com.google.android.gms.internal.ads.zzkt {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.bqy r0 = r6.f42484p
            com.google.android.gms.internal.ads.blk[] r1 = r6.f42483o
            com.google.android.gms.internal.ads.bpt r2 = r6.f42469a
            com.google.android.gms.internal.ads.bql r2 = r2.mo41098c()
            com.google.android.gms.internal.ads.bra r0 = r0.mo41173a(r1, r2)
            com.google.android.gms.internal.ads.bra r1 = r6.f42487s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.bqx r5 = r0.f43305b
            int r5 = r5.f43297a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.mo41187a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.f42480l = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.blb.mo40889c():boolean");
    }

    /* renamed from: a */
    public final long mo40885a(long j, boolean z) {
        return mo40886a(j, false, new boolean[this.f42482n.length]);
    }

    /* renamed from: a */
    public final long mo40886a(long j, boolean z, boolean[] zArr) {
        bqx bqx = this.f42480l.f43305b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= bqx.f43297a) {
                break;
            }
            boolean[] zArr2 = this.f42481m;
            if (z || !this.f42480l.mo41187a(this.f42487s, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long a = this.f42469a.mo41089a(bqx.mo41177a(), this.f42481m, this.f42472d, zArr, j);
        this.f42487s = this.f42480l;
        this.f42478j = false;
        for (int i2 = 0; i2 < this.f42472d.length; i2++) {
            if (this.f42472d[i2] != null) {
                brr.m49873b(bqx.mo41176a(i2) != null);
                this.f42478j = true;
            } else {
                brr.m49873b(bqx.mo41176a(i2) == null);
            }
        }
        this.f42485q.mo39603a(this.f42482n, this.f42480l.f43304a, bqx);
        return a;
    }

    /* renamed from: d */
    public final void mo40890d() {
        try {
            this.f42486r.mo41117a(this.f42469a);
        } catch (RuntimeException unused) {
        }
    }
}
