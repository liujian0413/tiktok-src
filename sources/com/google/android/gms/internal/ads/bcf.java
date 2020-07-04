package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcf extends bbg<bcf> {

    /* renamed from: c */
    public String f41432c;

    /* renamed from: d */
    public Long f41433d;

    /* renamed from: e */
    public Boolean f41434e;

    public bcf() {
        this.f41432c = null;
        this.f41433d = null;
        this.f41434e = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f41432c != null) {
            bbf.mo40468a(1, this.f41432c);
        }
        if (this.f41433d != null) {
            long longValue = this.f41433d.longValue();
            bbf.mo40472c(2, 0);
            bbf.mo40471a(longValue);
        }
        if (this.f41434e != null) {
            bbf.mo40469a(3, this.f41434e.booleanValue());
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f41432c != null) {
            a += bbf.m48357b(1, this.f41432c);
        }
        if (this.f41433d != null) {
            a += bbf.m48354b(2) + bbf.m48359b(this.f41433d.longValue());
        }
        if (this.f41434e == null) {
            return a;
        }
        this.f41434e.booleanValue();
        return a + bbf.m48354b(3) + 1;
    }
}
