package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.i */
public final class C15185i implements Creator<Feature> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 2:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 3:
                    j = SafeParcelReader.m44421f(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new Feature(str, i, j);
    }
}
