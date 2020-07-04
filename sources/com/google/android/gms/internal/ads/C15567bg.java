package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.bg */
public final class C15567bg implements Creator<zzacq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 3:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 4:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzacq(z, z2, z3);
    }
}
