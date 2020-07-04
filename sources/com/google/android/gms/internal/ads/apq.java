package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ato.C15527a;
import java.security.GeneralSecurityException;

public final class apq {
    /* renamed from: a */
    public static ato m46864a(String str, String str2, String str3, int i, boolean z) {
        C15527a a = ato.m47210a().mo40024a(str2);
        String str4 = "type.googleapis.com/google.crypto.tink.";
        String valueOf = String.valueOf(str3);
        return (ato) ((axu) a.mo40026b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4)).mo40023a(0).mo40025a(true).mo40027c(str).mo40293e());
    }

    /* renamed from: a */
    public static void m46865a(aue aue) throws GeneralSecurityException {
        for (ato ato : aue.zzfnv) {
            if (ato.zzflw.isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (ato.zzfmp.isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!ato.zzfms.isEmpty()) {
                C15496app a = aqg.m46900a(ato.zzfms);
                aqg.m46912a(a.mo39928a());
                aqg.m46911a(a.mo39927a(ato.zzflw, ato.zzfmp, ato.zzfmq), ato.zzfmr);
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }
}
