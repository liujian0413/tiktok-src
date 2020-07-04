package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.d */
public final class C15007d implements Creator<TokenData> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        Long l = null;
        List list = null;
        String str2 = null;
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
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    l = SafeParcelReader.m44422g(parcel, a);
                    break;
                case 4:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    list = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 7:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        TokenData tokenData = new TokenData(i, str, l, z, z2, list, str2);
        return tokenData;
    }
}
