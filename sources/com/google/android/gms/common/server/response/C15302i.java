package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.i */
public final class C15302i implements Creator<Field> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 3:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 4:
                    i3 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 7:
                    i4 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 9:
                    zaa = (zaa) SafeParcelReader.m44409a(parcel, a, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        Field field = new Field(i, i2, z, i3, z2, str, i4, str2, zaa);
        return field;
    }
}
