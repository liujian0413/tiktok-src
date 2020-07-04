package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class arh extends apx<aqb, atc, atf> {
    public arh() {
        super(aqb.class, atc.class, atf.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzb mo39937c() {
        return zzb.SYMMETRIC;
    }

    /* renamed from: a */
    private static void m46993a(ath ath) throws GeneralSecurityException {
        if (ath.zzflu >= 10) {
            switch (ari.f40960a[ath.mo40022a().ordinal()]) {
                case 1:
                    if (ath.zzflu > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 2:
                    if (ath.zzflu > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 3:
                    if (ath.zzflu > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ aza mo39941e(zzcce zzcce) throws zzcdx {
        return atf.m47198a(zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ aza mo39940d(zzcce zzcce) throws zzcdx {
        return atc.m47184a(zzcce);
    }

    /* renamed from: d */
    public final /* synthetic */ aza mo39939d(aza aza) throws GeneralSecurityException {
        atf atf = (atf) aza;
        if (atf.zzfir >= 16) {
            m46993a(atf.mo40021a());
            return (atc) ((axu) atc.m47189b().mo40018a(0).mo40019a(atf.mo40021a()).mo40020a(zzcce.zzy(avp.m47382a(atf.zzfir))).mo40293e());
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39938c(aza aza) throws GeneralSecurityException {
        atc atc = (atc) aza;
        avs.m47386a(atc.zzfih, 0);
        if (atc.zzfip.size() >= 16) {
            m46993a(atc.mo40017a());
            zzbvw a = atc.mo40017a().mo40022a();
            SecretKeySpec secretKeySpec = new SecretKeySpec(atc.zzfip.toByteArray(), "HMAC");
            int i = atc.mo40017a().zzflu;
            switch (ari.f40960a[a.ordinal()]) {
                case 1:
                    return new avn("HMACSHA1", secretKeySpec, i);
                case 2:
                    return new avn("HMACSHA256", secretKeySpec, i);
                case 3:
                    return new avn("HMACSHA512", secretKeySpec, i);
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
        } else {
            throw new GeneralSecurityException("key too short");
        }
    }
}
