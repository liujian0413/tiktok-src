package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aue.C15539a;
import java.security.GeneralSecurityException;

public final class aqj {

    /* renamed from: a */
    public static final aue f40919a = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(arl.f40962a)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo40047a("TINK_AEAD_1_0_0").mo40293e()));

    /* renamed from: b */
    public static final aue f40920b = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(arl.f40963b)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo40046a(apq.m46864a("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true)).mo40047a("TINK_AEAD").mo40293e()));

    /* renamed from: c */
    private static final aue f40921c = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(f40919a)).mo40047a("TINK_AEAD_1_1_0").mo40293e()));

    /* renamed from: a */
    public static void m46919a() throws GeneralSecurityException {
        arl.m47002a();
        aqg.m46913a("TinkAead", (C15496app<?>) new aqi<Object>());
        apq.m46865a(f40920b);
    }

    static {
        try {
            m46919a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
