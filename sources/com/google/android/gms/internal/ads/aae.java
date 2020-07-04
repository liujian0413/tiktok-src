package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class aae implements Creator<zzbbq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        boolean z = false;
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
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 4:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    list = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 7:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 9:
                    list2 = SafeParcelReader.m44402A(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzbbq zzbbq = new zzbbq(str, str2, z, z2, list, z3, z4, list2);
        return zzbbq;
    }
}
