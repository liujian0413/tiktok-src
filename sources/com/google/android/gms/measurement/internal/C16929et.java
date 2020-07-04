package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.et */
public final class C16929et implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzfv zzfv = null;
        String str3 = null;
        zzag zzag = null;
        zzag zzag2 = null;
        zzag zzag3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 4:
                    zzfv = (zzfv) SafeParcelReader.m44409a(parcel2, a, zzfv.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 6:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 8:
                    zzag = (zzag) SafeParcelReader.m44409a(parcel2, a, zzag.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 10:
                    zzag2 = (zzag) SafeParcelReader.m44409a(parcel2, a, zzag.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 12:
                    zzag3 = (zzag) SafeParcelReader.m44409a(parcel2, a, zzag.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzo zzo = new zzo(str, str2, zzfv, j, z, str3, zzag, j2, zzag2, j3, zzag3);
        return zzo;
    }
}
