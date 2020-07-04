package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C14948b implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    list = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 3:
                    list2 = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 4:
                    list3 = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 5:
                    list4 = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 6:
                    list5 = SafeParcelReader.m44402A(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzo zzo = new zzo(i, list, list2, list3, list4, list5);
        return zzo;
    }
}
