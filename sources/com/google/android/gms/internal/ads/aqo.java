package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqo extends apx<avm, ars, aru> {
    public aqo() {
        super(avm.class, ars.class, aru.class, "type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* renamed from: a */
    private static void m46928a(arw arw) throws GeneralSecurityException {
        if (arw.zzfjb < 12 || arw.zzfjb > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return aru.m47039a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return ars.m47025a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        aru aru = (aru) aza;
        avs.m47385a(aru.zzfir);
        m46928a(aru.mo39967a());
        return (ars) ((axu) ars.m47030b().mo39965a(aru.mo39967a()).mo39966a(zzcce.zzy(avp.m47382a(aru.zzfir))).mo39964a(0).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        ars ars = (ars) aza;
        avs.m47386a(ars.zzfih, 0);
        avs.m47385a(ars.zzfip.size());
        m46928a(ars.mo39963a());
        return new aui(ars.zzfip.toByteArray(), ars.mo39963a().zzfjb);
    }
}
