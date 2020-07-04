package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqv extends apx<apo, aug, asz> {
    public aqv() {
        super(apo.class, aug.class, asz.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return asz.m47161a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return aug.m47300a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        return (aug) ((axu) aug.m47299a().mo40048a(0).mo40049a(zzcce.zzy(avp.m47382a(32))).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        aug aug = (aug) aza;
        avs.m47386a(aug.zzfih, 0);
        if (aug.zzfip.size() == 32) {
            return new avu(aug.zzfip.toByteArray());
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
