package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class are {
    /* renamed from: a */
    public static void m46990a(asq asq) throws GeneralSecurityException {
        auz.m47345a(m46987a(asq.mo39985a().mo39997a()));
        m46989a(asq.mo39985a().mo39998b());
        if (asq.mo39987c() != zzbuq.UNKNOWN_FORMAT) {
            aqg.m46904a(asq.mo39986b().mo39983a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static String m46989a(zzbvw zzbvw) throws NoSuchAlgorithmException {
        switch (arf.f40952a[zzbvw.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(zzbvw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static zzcag m46987a(zzbvs zzbvs) throws GeneralSecurityException {
        switch (arf.f40953b[zzbvs.ordinal()]) {
            case 1:
                return zzcag.NIST_P256;
            case 2:
                return zzcag.NIST_P384;
            case 3:
                return zzcag.NIST_P521;
            default:
                String valueOf = String.valueOf(zzbvs);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static zzcai m46988a(zzbuq zzbuq) throws GeneralSecurityException {
        switch (arf.f40954c[zzbuq.ordinal()]) {
            case 1:
                return zzcai.UNCOMPRESSED;
            case 2:
                return zzcai.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            case 3:
                return zzcai.COMPRESSED;
            default:
                String valueOf = String.valueOf(zzbuq);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }
}
