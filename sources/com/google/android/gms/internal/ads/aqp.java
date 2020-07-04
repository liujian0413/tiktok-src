package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

final class aqp extends apx<apo, ary, asa> {
    public aqp() {
        super(apo.class, ary.class, asa.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return asa.m47083a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return ary.m47047a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        asa asa = (asa) aza;
        avs.m47385a(asa.zzfir);
        if (asa.mo39978a().zzfjb == 12 || asa.mo39978a().zzfjb == 16) {
            return (ary) ((axu) ary.m47052b().mo39971a(zzcce.zzy(avp.m47382a(asa.zzfir))).mo39970a(asa.mo39978a()).mo39969a(0).mo40293e());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        ary ary = (ary) aza;
        avs.m47386a(ary.zzfih, 0);
        avs.m47385a(ary.zzfip.size());
        if (ary.mo39968a().zzfjb == 12 || ary.mo39968a().zzfjb == 16) {
            return new auj(ary.zzfip.toByteArray(), ary.mo39968a().zzfjb);
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
