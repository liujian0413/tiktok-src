package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqq extends apx<apo, asf, ash> {
    public aqq() {
        super(apo.class, asf.class, ash.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return ash.m47100a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return asf.m47091a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        ash ash = (ash) aza;
        avs.m47385a(ash.zzfir);
        return (asf) ((axu) asf.m47090a().mo39980a(zzcce.zzy(avp.m47382a(ash.zzfir))).mo39979a(0).mo40293e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        asf asf = (asf) aza;
        avs.m47386a(asf.zzfih, 0);
        avs.m47385a(asf.zzfip.size());
        return new auk(asf.zzfip.toByteArray());
    }
}
