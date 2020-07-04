package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.wi */
public final class C16138wi implements Creator<zzaxu> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            if (SafeParcelReader.m44407a(a) != 2) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m44409a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzaxu(parcelFileDescriptor);
    }
}
