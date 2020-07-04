package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqu extends apx<apo, aty, aua> {
    public aqu() {
        super(apo.class, aty.class, aua.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.REMOTE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return aua.m47284a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return aty.m47272a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        return (aty) ((axu) aty.m47276b().mo40044a((aua) aza).mo40043a(0).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        aty aty = (aty) aza;
        avs.m47386a(aty.zzfih, 0);
        String str = aty.mo40042a().zzfnk;
        return new aqt(aty.mo40042a().mo40045a(), aqa.m46891a(str).mo39944b(str));
    }
}
