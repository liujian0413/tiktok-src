package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.ec */
public final class C15647ec implements Creator<zzafl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        zzacq zzacq = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
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
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 4:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 6:
                    zzacq = (zzacq) SafeParcelReader.m44409a(parcel, a, zzacq.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 8:
                    i4 = SafeParcelReader.m44419d(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzafl zzafl = new zzafl(i, z, i2, z2, i3, zzacq, z3, i4);
        return zzafl;
    }
}
