package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bxo extends bbg<bxo> {

    /* renamed from: c */
    public Integer f44113c;

    /* renamed from: d */
    public Integer f44114d;

    /* renamed from: e */
    public Integer f44115e;

    public bxo() {
        this.f44113c = null;
        this.f44114d = null;
        this.f44115e = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f44113c != null) {
            bbf.mo40465a(1, this.f44113c.intValue());
        }
        if (this.f44114d != null) {
            bbf.mo40465a(2, this.f44114d.intValue());
        }
        if (this.f44115e != null) {
            bbf.mo40465a(3, this.f44115e.intValue());
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f44113c != null) {
            a += bbf.m48355b(1, this.f44113c.intValue());
        }
        if (this.f44114d != null) {
            a += bbf.m48355b(2, this.f44114d.intValue());
        }
        return this.f44115e != null ? a + bbf.m48355b(3, this.f44115e.intValue()) : a;
    }
}
