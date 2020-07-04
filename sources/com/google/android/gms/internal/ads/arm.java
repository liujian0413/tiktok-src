package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public final class arm implements aqf<aqb> {

    /* renamed from: a */
    private static final Logger f40965a = Logger.getLogger(arm.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.arm$a */
    static class C15501a implements aqb {

        /* renamed from: a */
        private final aqd<aqb> f40966a;

        /* renamed from: b */
        private final byte[] f40967b;

        private C15501a(aqd<aqb> aqd) {
            this.f40967b = new byte[]{0};
            this.f40966a = aqd;
        }

        /* renamed from: a */
        public final byte[] mo39947a(byte[] bArr) throws GeneralSecurityException {
            if (this.f40966a.f40906a.f40910b.equals(zzbwz.LEGACY)) {
                return aum.m47316a(this.f40966a.f40906a.mo39949a(), ((aqb) this.f40966a.f40906a.f40909a).mo39947a(aum.m47316a(bArr, this.f40967b)));
            }
            return aum.m47316a(this.f40966a.f40906a.mo39949a(), ((aqb) this.f40966a.f40906a.f40909a).mo39947a(bArr));
        }
    }

    /* renamed from: a */
    public final Class<aqb> mo39950a() {
        return aqb.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo39951a(aqd aqd) throws GeneralSecurityException {
        return new C15501a(aqd);
    }
}
