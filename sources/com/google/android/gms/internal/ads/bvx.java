package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class bvx implements Creator<zzwr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzwr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 4:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 5:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 6:
                    str4 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 9:
                    j2 = SafeParcelReader.m44421f(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzwr zzwr = new zzwr(str, j, str2, str3, str4, bundle, z, j2);
        return zzwr;
    }
}
