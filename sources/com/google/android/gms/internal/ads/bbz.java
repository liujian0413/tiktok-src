package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bbz extends bbg<bbz> {

    /* renamed from: e */
    private static volatile bbz[] f41410e;

    /* renamed from: c */
    public byte[] f41411c;

    /* renamed from: d */
    public byte[] f41412d;

    /* renamed from: d */
    public static bbz[] m48397d() {
        if (f41410e == null) {
            synchronized (bbk.f41370a) {
                if (f41410e == null) {
                    f41410e = new bbz[0];
                }
            }
        }
        return f41410e;
    }

    public bbz() {
        this.f41411c = null;
        this.f41412d = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        bbf.mo40470a(1, this.f41411c);
        if (this.f41412d != null) {
            bbf.mo40470a(2, this.f41412d);
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a() + bbf.m48358b(1, this.f41411c);
        return this.f41412d != null ? a + bbf.m48358b(2, this.f41412d) : a;
    }
}
