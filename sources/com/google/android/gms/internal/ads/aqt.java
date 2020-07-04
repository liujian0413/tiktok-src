package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class aqt implements apo {

    /* renamed from: a */
    private static final byte[] f40924a = new byte[0];

    /* renamed from: b */
    private final atm f40925b;

    /* renamed from: c */
    private final apo f40926c;

    public aqt(atm atm, apo apo) {
        this.f40925b = atm;
        this.f40926c = apo;
    }

    /* renamed from: a */
    public final byte[] mo39926a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g = aqg.m46914b(this.f40925b).mo40082g();
        byte[] a = this.f40926c.mo39926a(g, f40924a);
        byte[] a2 = ((apo) aqg.m46909a(this.f40925b.zzflw, g, apo.class)).mo39926a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
