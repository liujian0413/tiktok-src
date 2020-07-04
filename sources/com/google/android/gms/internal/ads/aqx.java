package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqx extends apx<apv, asu, asz> {
    public aqx() {
        super(apv.class, asu.class, asz.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.ASYMMETRIC_PUBLIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return asz.m47161a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return asu.m47138a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        asu asu = (asu) aza;
        avs.m47386a(asu.zzfih, 0);
        are.m46990a(asu.mo39992a());
        asq a = asu.mo39992a();
        asw a2 = a.mo39985a();
        aut aut = new aut(auz.m47344a(are.m46987a(a2.mo39997a()), asu.zzfke.toByteArray(), asu.zzfkf.toByteArray()), a2.zzfky.toByteArray(), are.m46989a(a2.mo39998b()), are.m46988a(a.mo39987c()), new arg(a.mo39986b().mo39983a()));
        return aut;
    }
}
