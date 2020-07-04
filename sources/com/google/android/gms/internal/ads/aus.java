package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

public final class aus implements apu {

    /* renamed from: a */
    private static final byte[] f41049a = new byte[0];

    /* renamed from: b */
    private final ECPrivateKey f41050b;

    /* renamed from: c */
    private final auu f41051c;

    /* renamed from: d */
    private final String f41052d;

    /* renamed from: e */
    private final byte[] f41053e;

    /* renamed from: f */
    private final zzcai f41054f;

    /* renamed from: g */
    private final aur f41055g;

    public aus(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzcai zzcai, aur aur) throws GeneralSecurityException {
        this.f41050b = eCPrivateKey;
        this.f41051c = new auu(eCPrivateKey);
        this.f41053e = bArr;
        this.f41052d = str;
        this.f41054f = zzcai;
        this.f41055g = aur;
    }
}
