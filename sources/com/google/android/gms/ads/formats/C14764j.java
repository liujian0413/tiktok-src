package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.ads.formats.j */
public final class C14764j implements Creator<PublisherAdViewOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m44430o(parcel, a);
                    break;
                case 3:
                    iBinder2 = SafeParcelReader.m44430o(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }
}
