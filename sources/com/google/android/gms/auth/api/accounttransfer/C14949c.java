package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C14949c implements Creator<zzr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    zzt = (zzt) SafeParcelReader.m44409a(parcel, a, zzt.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = SafeParcelReader.m44429n(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = SafeParcelReader.m44429n(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzr zzr = new zzr(hashSet, i, zzt, str, str2, str3);
            return zzr;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }
}
