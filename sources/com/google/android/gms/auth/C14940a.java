package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.a */
public final class C14940a implements Creator<AccountChangeEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    j = SafeParcelReader.m44421f(parcel, a);
                    break;
                case 3:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        AccountChangeEvent accountChangeEvent = new AccountChangeEvent(i, j, str, i2, i3, str2);
        return accountChangeEvent;
    }
}
