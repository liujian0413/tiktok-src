package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class byc implements Creator<zzyz> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        zzyz[] zzyzArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 5:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    i3 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 7:
                    i4 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 8:
                    zzyzArr = (zzyz[]) SafeParcelReader.m44416b(parcel, a, zzyz.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 11:
                    z4 = SafeParcelReader.m44415b(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzyz zzyz = new zzyz(str, i, i2, z, i3, i4, zzyzArr, z2, z3, z4);
        return zzyz;
    }
}
