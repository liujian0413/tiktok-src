package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

final class aqw extends apx<apu, ass, aso> implements apw<apu> {
    public aqw() {
        super(apu.class, ass.class, aso.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.ASYMMETRIC_PRIVATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return aso.m47115a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return ass.m47125a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        aso aso = (aso) aza;
        are.m46990a(aso.mo39984a());
        KeyPair a = auz.m47342a(auz.m47345a(are.m46987a(aso.mo39984a().mo39985a().mo39997a())));
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (ass) ((axu) ass.m47130b().mo39989a(0).mo39990a((asu) ((axu) asu.m47143b().mo39993a(0).mo39994a(aso.mo39984a()).mo39995a(zzcce.zzy(w.getAffineX().toByteArray())).mo39996b(zzcce.zzy(w.getAffineY().toByteArray())).mo40293e())).mo39991a(zzcce.zzy(eCPrivateKey.getS().toByteArray())).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        ass ass = (ass) aza;
        avs.m47386a(ass.zzfih, 0);
        are.m46990a(ass.mo39988a().mo39992a());
        asq a = ass.mo39988a().mo39992a();
        asw a2 = a.mo39985a();
        aus aus = new aus(auz.m47343a(are.m46987a(a2.mo39997a()), ass.zzfip.toByteArray()), a2.zzfky.toByteArray(), are.m46989a(a2.mo39998b()), are.m46988a(a.mo39987c()), new arg(a.mo39986b().mo39983a()));
        return aus;
    }
}
