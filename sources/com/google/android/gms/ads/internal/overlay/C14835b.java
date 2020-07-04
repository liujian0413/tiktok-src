package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.ads.internal.overlay.b */
public final class C14835b implements Creator<zzc> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 4:
                    str3 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 5:
                    str4 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 6:
                    str5 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 7:
                    str6 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 8:
                    str7 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.m44409a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzc zzc = new zzc(str, str2, str3, str4, str5, str6, str7, intent);
        return zzc;
    }
}
