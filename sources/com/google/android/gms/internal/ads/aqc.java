package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.atq.C15529b;
import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

public final class aqc {
    /* renamed from: a */
    public static final apy m46893a(byte[] bArr) throws GeneralSecurityException {
        try {
            atq a = atq.m47226a(bArr);
            m46894a(a);
            return apy.m46888a(a);
        } catch (zzcdx unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* renamed from: a */
    private static void m46894a(atq atq) throws GeneralSecurityException {
        for (C15529b bVar : atq.zzfmv) {
            if (bVar.mo40030b().mo42284a() == zzb.UNKNOWN_KEYMATERIAL || bVar.mo40030b().mo42284a() == zzb.SYMMETRIC) {
                throw new GeneralSecurityException("keyset contains secret key material");
            } else if (bVar.mo40030b().mo42284a() == zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("keyset contains secret key material");
            }
        }
    }
}
