package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.ads.internal.s */
public final class C14862s implements Creator<zzar> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
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
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 5:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    f = SafeParcelReader.m44424i(parcel, a);
                    break;
                case 7:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 9:
                    z5 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 10:
                    z6 = SafeParcelReader.m44415b(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzar zzar = new zzar(z, z2, str, z3, f, i, z4, z5, z6);
        return zzar;
    }
}
