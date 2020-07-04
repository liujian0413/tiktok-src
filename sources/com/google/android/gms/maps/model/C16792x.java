package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.x */
public final class C16792x implements Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    iBinder = SafeParcelReader.m44430o(parcel, a);
                    break;
                case 3:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 4:
                    f = SafeParcelReader.m44424i(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    f2 = SafeParcelReader.m44424i(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(iBinder, z, f, z2, f2);
        return tileOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
