package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.i */
public final class C16777i implements Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m44409a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) SafeParcelReader.m44409a(parcel, a, LatLng.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
