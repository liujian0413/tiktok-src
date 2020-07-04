package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ars.C15504a;
import com.google.android.gms.internal.ads.asf.C15512a;
import com.google.android.gms.internal.ads.atc.C15523a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class arg implements aur {

    /* renamed from: a */
    private final String f40955a;

    /* renamed from: b */
    private final int f40956b;

    /* renamed from: c */
    private asf f40957c;

    /* renamed from: d */
    private aro f40958d;

    /* renamed from: e */
    private int f40959e;

    arg(atm atm) throws GeneralSecurityException {
        this.f40955a = atm.zzflw;
        if (this.f40955a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                ash a = ash.m47100a(atm.zzflx);
                this.f40957c = (asf) aqg.m46914b(atm);
                this.f40956b = a.zzfir;
            } catch (zzcdx e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f40955a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                arq a2 = arq.m47020a(atm.zzflx);
                this.f40958d = (aro) aqg.m46914b(atm);
                this.f40959e = a2.mo39961a().zzfir;
                this.f40956b = this.f40959e + a2.mo39962b().zzfir;
            } catch (zzcdx e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f40955a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final int mo39954a() {
        return this.f40956b;
    }

    /* renamed from: a */
    public final apo mo39955a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f40956b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f40955a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (apo) aqg.m46907a(this.f40955a, (aza) (asf) ((axu) ((C15512a) asf.m47090a().mo40084a(this.f40957c)).mo39980a(zzcce.zzi(bArr, 0, this.f40956b)).mo40293e()), apo.class);
        } else if (this.f40955a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f40959e);
            atc atc = (atc) ((axu) ((C15523a) atc.m47189b().mo40084a(this.f40958d.mo39957b())).mo40020a(zzcce.zzy(Arrays.copyOfRange(bArr, this.f40959e, this.f40956b))).mo40293e());
            return (apo) aqg.m46907a(this.f40955a, (aza) (aro) ((axu) aro.m47012c().mo39958a(this.f40958d.zzfih).mo39959a((ars) ((axu) ((C15504a) ars.m47030b().mo40084a(this.f40958d.mo39956a())).mo39966a(zzcce.zzy(copyOfRange)).mo40293e())).mo39960a(atc).mo40293e()), apo.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
