package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C16941g implements Creator<zzag> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        zzad zzad = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    zzad = (zzad) SafeParcelReader.m44409a(parcel, a, zzad.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 5:
                    j = SafeParcelReader.m44421f(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzag zzag = new zzag(str, zzad, str2, j);
        return zzag;
    }
}
