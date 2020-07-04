package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.m */
public final class C16781m implements Creator<PatternItem> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 3:
                    f = SafeParcelReader.m44425j(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new PatternItem(i, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PatternItem[i];
    }
}
