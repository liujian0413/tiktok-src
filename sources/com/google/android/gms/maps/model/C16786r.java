package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.r */
public final class C16786r implements Creator<StreetViewPanoramaLink> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    f = SafeParcelReader.m44424i(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new StreetViewPanoramaLink(str, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}