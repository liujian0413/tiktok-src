package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bbl {

    /* renamed from: b */
    protected volatile int f41373b = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo40473a() {
        return 0;
    }

    /* renamed from: a */
    public void mo40474a(bbf bbf) throws IOException {
    }

    /* renamed from: c */
    public final int mo40488c() {
        int a = mo40473a();
        this.f41373b = a;
        return a;
    }

    /* renamed from: a */
    public static final byte[] m48381a(bbl bbl) {
        byte[] bArr = new byte[bbl.mo40488c()];
        try {
            bbf a = bbf.m48352a(bArr, 0, bArr.length);
            bbl.mo40474a(a);
            a.mo40464a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return bbm.m48386a(this);
    }

    /* renamed from: b */
    public bbl clone() throws CloneNotSupportedException {
        return (bbl) super.clone();
    }
}
