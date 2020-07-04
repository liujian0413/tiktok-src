package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchm.zzb.C16267d.C16269b;
import java.io.IOException;

public final class bca extends bbg<bca> {

    /* renamed from: c */
    public bbz[] f41414c;

    /* renamed from: d */
    private C16269b f41415d;

    /* renamed from: e */
    private byte[] f41416e;

    /* renamed from: f */
    private byte[] f41417f;

    /* renamed from: g */
    private Integer f41418g;

    public bca() {
        this.f41415d = null;
        this.f41414c = bbz.m48397d();
        this.f41416e = null;
        this.f41417f = null;
        this.f41418g = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f41414c != null && this.f41414c.length > 0) {
            for (bbz bbz : this.f41414c) {
                if (bbz != null) {
                    bbf.mo40467a(2, (bbl) bbz);
                }
            }
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f41414c != null && this.f41414c.length > 0) {
            for (bbz bbz : this.f41414c) {
                if (bbz != null) {
                    a += bbf.m48356b(2, (bbl) bbz);
                }
            }
        }
        return a;
    }
}
