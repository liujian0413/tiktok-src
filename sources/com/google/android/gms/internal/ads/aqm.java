package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqm extends apx<apo, aro, arq> {
    public aqm() throws GeneralSecurityException {
        super(apo.class, aro.class, arq.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        aqg.m46910a((apw<P>) new aqo<P>());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return arq.m47020a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return aro.m47006a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        arq arq = (arq) aza;
        ars ars = (ars) aqg.m46903a("type.googleapis.com/google.crypto.tink.AesCtrKey", (aza) arq.mo39961a());
        return (aro) ((axu) aro.m47012c().mo39959a(ars).mo39960a((atc) aqg.m46903a("type.googleapis.com/google.crypto.tink.HmacKey", (aza) arq.mo39962b())).mo39958a(0).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        aro aro = (aro) aza;
        avs.m47386a(aro.zzfih, 0);
        return new avb((avm) aqg.m46907a("type.googleapis.com/google.crypto.tink.AesCtrKey", (aza) aro.mo39956a(), avm.class), (aqb) aqg.m46907a("type.googleapis.com/google.crypto.tink.HmacKey", (aza) aro.mo39957b(), aqb.class), aro.mo39957b().mo40017a().zzflu);
    }
}
