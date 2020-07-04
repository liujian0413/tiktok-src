package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C14947a implements Creator<zzl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzo = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    arrayList = SafeParcelReader.m44418c(parcel, a, zzr.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    zzo = (zzo) SafeParcelReader.m44409a(parcel, a, zzo.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzl zzl = new zzl(hashSet, i, arrayList, i2, zzo);
            return zzl;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }
}
