package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzxp.C16280a;
import com.google.android.gms.internal.ads.zzxp.C16282b;
import com.google.android.gms.internal.ads.zzxp.C16286d;
import com.google.android.gms.internal.ads.zzxp.C16288e;
import com.google.android.gms.internal.ads.zzxp.C16290f;
import com.google.android.gms.internal.ads.zzxp.C16292g;
import com.google.android.gms.internal.ads.zzxp.zza;
import java.io.IOException;

public final class bxj extends bbg<bxj> {

    /* renamed from: c */
    public Integer f44078c;

    /* renamed from: d */
    public bxk f44079d;

    /* renamed from: e */
    private zzxt f44080e;

    /* renamed from: f */
    private C16280a f44081f;

    /* renamed from: g */
    private zza[] f44082g;

    /* renamed from: h */
    private C16282b f44083h;

    /* renamed from: i */
    private C16292g f44084i;

    /* renamed from: j */
    private C16290f f44085j;

    /* renamed from: k */
    private C16286d f44086k;

    /* renamed from: l */
    private C16288e f44087l;

    /* renamed from: m */
    private bxp[] f44088m;

    public bxj() {
        this.f44078c = null;
        this.f44080e = null;
        this.f44081f = null;
        this.f44079d = null;
        this.f44082g = new zza[0];
        this.f44083h = null;
        this.f44084i = null;
        this.f44085j = null;
        this.f44086k = null;
        this.f44087l = null;
        this.f44088m = bxp.m50240d();
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f44078c != null) {
            bbf.mo40465a(7, this.f44078c.intValue());
        }
        if (this.f44079d != null) {
            bbf.mo40467a(10, (bbl) this.f44079d);
        }
        if (this.f44082g != null && this.f44082g.length > 0) {
            for (zza zza : this.f44082g) {
                if (zza != null) {
                    bbf.mo40466a(11, (aza) zza);
                }
            }
        }
        if (this.f44088m != null && this.f44088m.length > 0) {
            for (bxp bxp : this.f44088m) {
                if (bxp != null) {
                    bbf.mo40467a(17, (bbl) bxp);
                }
            }
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f44078c != null) {
            a += bbf.m48355b(7, this.f44078c.intValue());
        }
        if (this.f44079d != null) {
            a += bbf.m48356b(10, (bbl) this.f44079d);
        }
        if (this.f44082g != null && this.f44082g.length > 0) {
            int i = a;
            for (zza zza : this.f44082g) {
                if (zza != null) {
                    i += zzccv.m53010c(11, (aza) zza);
                }
            }
            a = i;
        }
        if (this.f44088m != null && this.f44088m.length > 0) {
            for (bxp bxp : this.f44088m) {
                if (bxp != null) {
                    a += bbf.m48356b(17, (bbl) bxp);
                }
            }
        }
        return a;
    }
}
