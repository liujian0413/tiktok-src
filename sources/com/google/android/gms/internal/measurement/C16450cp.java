package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.cp */
public final class C16450cp implements Creator<zzdy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 2:
                    j2 = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 3:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 5:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 6:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m44431p(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzdy zzdy = new zzdy(j, j2, z, str, str2, str3, bundle);
        return zzdy;
    }
}
