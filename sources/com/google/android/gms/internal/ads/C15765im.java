package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.im */
public final class C15765im implements Creator<zzajw> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzajw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 3:
                    i = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 4:
                    bArr = SafeParcelReader.m44432q(parcel2, a);
                    break;
                case 5:
                    strArr = SafeParcelReader.m44440y(parcel2, a);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m44440y(parcel2, a);
                    break;
                case 7:
                    z2 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 8:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzajw zzajw = new zzajw(z, str, i, bArr, strArr, strArr2, z2, j);
        return zzajw;
    }
}
