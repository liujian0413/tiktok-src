package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzxp.C16300k;
import java.io.IOException;

public final class bxl extends bbg<bxl> {

    /* renamed from: c */
    public String f44094c;

    /* renamed from: d */
    public bxo f44095d;

    /* renamed from: e */
    private C16300k f44096e;

    /* renamed from: f */
    private Integer f44097f;

    /* renamed from: g */
    private Integer f44098g;

    /* renamed from: h */
    private zzxt f44099h;

    /* renamed from: i */
    private zzxt f44100i;

    /* renamed from: j */
    private zzxt f44101j;

    public bxl() {
        this.f44094c = null;
        this.f44096e = null;
        this.f44097f = null;
        this.f44095d = null;
        this.f44098g = null;
        this.f44099h = null;
        this.f44100i = null;
        this.f44101j = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f44094c != null) {
            bbf.mo40468a(1, this.f44094c);
        }
        if (this.f44095d != null) {
            bbf.mo40467a(4, (bbl) this.f44095d);
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f44094c != null) {
            a += bbf.m48357b(1, this.f44094c);
        }
        return this.f44095d != null ? a + bbf.m48356b(4, (bbl) this.f44095d) : a;
    }
}
