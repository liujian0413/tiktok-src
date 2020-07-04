package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.C14710a;
import java.util.Date;
import java.util.HashSet;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.qb */
public final class C15970qb {
    /* renamed from: a */
    public static int m51933a(ErrorCode errorCode) {
        switch (C15971qc.f44879a[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C14710a m51934a(zzyv zzyv, boolean z) {
        Gender gender;
        HashSet hashSet = zzyv.f45781e != null ? new HashSet(zzyv.f45781e) : null;
        Date date = new Date(zzyv.f45778b);
        switch (zzyv.f45780d) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        C14710a aVar = new C14710a(date, gender, hashSet, z, zzyv.f45787k);
        return aVar;
    }
}
