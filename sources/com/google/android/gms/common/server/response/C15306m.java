package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.m */
public final class C15306m implements Creator<SafeParcelResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zak zak = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    parcel2 = SafeParcelReader.m44403B(parcel, a);
                    break;
                case 3:
                    zak = (zak) SafeParcelReader.m44409a(parcel, a, zak.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new SafeParcelResponse(i, parcel2, zak);
    }
}
