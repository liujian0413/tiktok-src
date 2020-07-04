package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter.zaa;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
public final class C15290b implements Creator<StringToIntConverter> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m44418c(parcel, a, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new StringToIntConverter(i, arrayList);
    }
}
