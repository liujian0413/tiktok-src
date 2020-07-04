package com.google.android.gms.internal.ads;

import com.C1642a;
import java.security.GeneralSecurityException;

final class aqz implements C15496app<apu> {
    /* renamed from: a */
    public final apw<apu> mo39927a(String str, String str2, int i) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 275448849 && lowerCase.equals("hybriddecrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                c = 0;
            }
            if (c == 0) {
                aqw aqw = new aqw();
                if (i <= 0) {
                    return aqw;
                }
                throw new GeneralSecurityException(C1642a.m8034a("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(C1642a.m8034a("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(C1642a.m8034a("No support for primitive '%s'.", new Object[]{str2}));
    }

    /* renamed from: a */
    public final aqf<apu> mo39928a() {
        return new ara();
    }
}
