package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aue.C15539a;
import java.security.GeneralSecurityException;

public final class arl {

    /* renamed from: a */
    public static final aue f40962a = ((aue) ((axu) aue.m47290a().mo40047a("TINK_MAC_1_0_0").mo40046a(apq.m46864a("TinkMac", "Mac", "HmacKey", 0, true)).mo40293e()));

    /* renamed from: b */
    public static final aue f40963b = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(f40962a)).mo40047a("TINK_MAC").mo40293e()));

    /* renamed from: c */
    private static final aue f40964c = ((aue) ((axu) ((C15539a) aue.m47290a().mo40084a(f40962a)).mo40047a("TINK_MAC_1_1_0").mo40293e()));

    /* renamed from: a */
    public static void m47002a() throws GeneralSecurityException {
        aqg.m46913a("TinkMac", (C15496app<?>) new ark<Object>());
        apq.m46865a(f40963b);
    }

    static {
        try {
            m47002a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
