package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzxp.zzg;
import com.google.android.gms.internal.ads.zzxp.zzi;
import java.io.IOException;

public final class bxn extends bbg<bxn> {

    /* renamed from: c */
    public String f44102c;

    /* renamed from: d */
    public long[] f44103d;

    /* renamed from: e */
    public bxl f44104e;

    /* renamed from: f */
    public bxj f44105f;

    /* renamed from: g */
    private Integer f44106g;

    /* renamed from: h */
    private Integer f44107h;

    /* renamed from: i */
    private zzxt f44108i;

    /* renamed from: j */
    private bxo f44109j;

    /* renamed from: k */
    private bxm f44110k;

    /* renamed from: l */
    private zzg f44111l;

    /* renamed from: m */
    private zzi f44112m;

    public bxn() {
        this.f44106g = null;
        this.f44102c = null;
        this.f44107h = null;
        this.f44108i = null;
        this.f44109j = null;
        this.f44103d = bbn.f41375b;
        this.f44104e = null;
        this.f44110k = null;
        this.f44111l = null;
        this.f44105f = null;
        this.f44112m = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f44102c != null) {
            bbf.mo40468a(10, this.f44102c);
        }
        if (this.f44103d != null && this.f44103d.length > 0) {
            for (long j : this.f44103d) {
                bbf.mo40472c(14, 0);
                bbf.mo40471a(j);
            }
        }
        if (this.f44104e != null) {
            bbf.mo40467a(15, (bbl) this.f44104e);
        }
        if (this.f44105f != null) {
            bbf.mo40467a(18, (bbl) this.f44105f);
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f44102c != null) {
            a += bbf.m48357b(10, this.f44102c);
        }
        if (this.f44103d != null && this.f44103d.length > 0) {
            int i = 0;
            for (long b : this.f44103d) {
                i += bbf.m48359b(b);
            }
            a = a + i + (this.f44103d.length * 1);
        }
        if (this.f44104e != null) {
            a += bbf.m48356b(15, (bbl) this.f44104e);
        }
        return this.f44105f != null ? a + bbf.m48356b(18, (bbl) this.f44105f) : a;
    }
}
