package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.o */
public final class C16783o implements Creator<PolygonOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        List list = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    arrayList2 = SafeParcelReader.m44418c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m44413a(parcel, a, (List) arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    f = SafeParcelReader.m44424i(parcel, a);
                    break;
                case 5:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m44424i(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 11:
                    i3 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 12:
                    list = SafeParcelReader.m44418c(parcel, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        PolygonOptions polygonOptions = new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, list);
        return polygonOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
