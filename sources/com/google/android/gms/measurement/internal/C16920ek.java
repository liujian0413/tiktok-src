package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.ek */
public final class C16920ek implements Creator<zzfv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 4:
                    l = SafeParcelReader.m44422g(parcel2, a);
                    break;
                case 5:
                    f = SafeParcelReader.m44425j(parcel2, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 8:
                    d = SafeParcelReader.m44427l(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzfv zzfv = new zzfv(i, str, j, l, f, str2, str3, d);
        return zzfv;
    }
}
