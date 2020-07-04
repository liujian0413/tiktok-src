package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcd extends bbg<bcd> {

    /* renamed from: c */
    public Integer f41419c;

    /* renamed from: d */
    public String f41420d;

    /* renamed from: e */
    public byte[] f41421e;

    public bcd() {
        this.f41419c = null;
        this.f41420d = null;
        this.f41421e = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f41419c != null) {
            bbf.mo40465a(1, this.f41419c.intValue());
        }
        if (this.f41420d != null) {
            bbf.mo40468a(2, this.f41420d);
        }
        if (this.f41421e != null) {
            bbf.mo40470a(3, this.f41421e);
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f41419c != null) {
            a += bbf.m48355b(1, this.f41419c.intValue());
        }
        if (this.f41420d != null) {
            a += bbf.m48357b(2, this.f41420d);
        }
        return this.f41421e != null ? a + bbf.m48358b(3, this.f41421e) : a;
    }
}
