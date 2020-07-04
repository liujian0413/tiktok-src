package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.n */
public final class C15164n implements Creator<Status> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = SafeParcelReader.m44419d(parcel, a);
                        break;
                    case 2:
                        str = SafeParcelReader.m44429n(parcel, a);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) SafeParcelReader.m44409a(parcel, a, PendingIntent.CREATOR);
                        break;
                    default:
                        SafeParcelReader.m44410a(parcel, a);
                        break;
                }
            } else {
                i = SafeParcelReader.m44419d(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }
}
