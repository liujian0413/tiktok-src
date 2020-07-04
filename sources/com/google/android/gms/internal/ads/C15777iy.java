package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.iy */
public final class C15777iy implements Creator<zzaki> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaki[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 2:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 3:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 4:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzaki(str, z, i, str2);
    }
}
