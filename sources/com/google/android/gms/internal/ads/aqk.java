package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public class aqk implements aqf<apo> {

    /* renamed from: a */
    private static final Logger f40922a = Logger.getLogger(aqk.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.aqk$a */
    static class C15498a implements apo {

        /* renamed from: a */
        private final aqd<apo> f40923a;

        private C15498a(aqd<apo> aqd) {
            this.f40923a = aqd;
        }

        /* renamed from: a */
        public final byte[] mo39926a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return aum.m47316a(this.f40923a.f40906a.mo39949a(), ((apo) this.f40923a.f40906a.f40909a).mo39926a(bArr, bArr2));
        }
    }

    /* renamed from: a */
    public final Class<apo> mo39950a() {
        return apo.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo39951a(aqd aqd) throws GeneralSecurityException {
        return new C15498a(aqd);
    }
}
