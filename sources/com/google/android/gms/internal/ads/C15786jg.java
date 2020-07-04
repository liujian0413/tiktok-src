package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.jg */
public final class C15786jg implements Creator<zzaks> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaks[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            if (SafeParcelReader.m44407a(a) != 1) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                i = SafeParcelReader.m44419d(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzaks(i);
    }
}
