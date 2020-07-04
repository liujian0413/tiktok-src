package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqr extends apx<apo, asj, asz> {
    public aqr() {
        super(apo.class, asj.class, asz.class, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
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
        return asj.m47103a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        return (asj) ((axu) asj.m47102a().mo39981a(0).mo39982a(zzcce.zzy(avp.m47382a(32))).mo40293e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        asj asj = (asj) aza;
        avs.m47386a(asj.zzfih, 0);
        if (asj.zzfip.size() == 32) {
            return new aup(asj.zzfip.toByteArray());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
