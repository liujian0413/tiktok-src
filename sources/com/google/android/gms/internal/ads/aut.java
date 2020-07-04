package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class aut implements apv {

    /* renamed from: a */
    private static final byte[] f41056a = new byte[0];

    /* renamed from: b */
    private final auv f41057b;

    /* renamed from: c */
    private final String f41058c;

    /* renamed from: d */
    private final byte[] f41059d;

    /* renamed from: e */
    private final zzcai f41060e;

    /* renamed from: f */
    private final aur f41061f;

    public aut(ECPublicKey eCPublicKey, byte[] bArr, String str, zzcai zzcai, aur aur) throws GeneralSecurityException {
        auz.m47347a(eCPublicKey);
        this.f41057b = new auv(eCPublicKey);
        this.f41059d = bArr;
        this.f41058c = str;
        this.f41060e = zzcai;
        this.f41061f = aur;
    }

    /* renamed from: a */
    public final byte[] mo39929a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        auw a = this.f41057b.mo40056a(this.f41058c, this.f41059d, bArr2, this.f41061f.mo39954a(), this.f41060e);
        byte[] a2 = this.f41061f.mo39955a(a.mo40058b()).mo39926a(bArr, f41056a);
        byte[] a3 = a.mo40057a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
