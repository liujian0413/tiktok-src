package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.e */
public final class C14951e implements Creator<DeviceMetaData> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 3:
                    j = SafeParcelReader.m44421f(parcel, a);
                    break;
                case 4:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        DeviceMetaData deviceMetaData = new DeviceMetaData(i, z, j, z2);
        return deviceMetaData;
    }
}
