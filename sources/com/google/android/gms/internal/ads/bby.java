package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bby extends bbg<bby> {

    /* renamed from: c */
    public String f41409c;

    public bby() {
        this.f41409c = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f41409c != null) {
            bbf.mo40468a(1, this.f41409c);
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        return this.f41409c != null ? a + bbf.m48357b(1, this.f41409c) : a;
    }
}
