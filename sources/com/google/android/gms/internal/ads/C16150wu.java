package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.wu */
public final class C16150wu implements Creator<zzayi> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzayi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            if (SafeParcelReader.m44407a(a) != 2) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                str = SafeParcelReader.m44429n(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzayi(str);
    }
}
