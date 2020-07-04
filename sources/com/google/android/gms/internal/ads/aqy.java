package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aue.C15539a;
import java.security.GeneralSecurityException;

public final class aqy {

    /* renamed from: a */
    public static final aue f40927a = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(aqj.f40919a)).mo40046a(apq.m46864a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo40046a(apq.m46864a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo40047a("TINK_HYBRID_1_0_0").mo40293e()));

    /* renamed from: b */
    public static final aue f40928b = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(f40927a)).mo40047a("TINK_HYBRID_1_1_0").mo40293e()));

    /* renamed from: c */
    public static final aue f40929c = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(aqj.f40920b)).mo40046a(apq.m46864a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo40046a(apq.m46864a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo40047a("TINK_HYBRID").mo40293e()));

    /* renamed from: a */
    private static void m46975a() throws GeneralSecurityException {
        aqj.m46919a();
        aqg.m46913a("TinkHybridEncrypt", (C15496app<?>) new arb<Object>());
        aqg.m46913a("TinkHybridDecrypt", (C15496app<?>) new aqz<Object>());
        apq.m46865a(f40929c);
    }

    static {
        try {
            m46975a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
