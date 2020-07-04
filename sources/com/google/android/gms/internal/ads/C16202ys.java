package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.ys */
public final class C16202ys implements Creator<zzbad> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        zzyv zzyv = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    zzyv = (zzyv) SafeParcelReader.m44409a(parcel, a, zzyv.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzbad(zzyv, str);
    }
}
