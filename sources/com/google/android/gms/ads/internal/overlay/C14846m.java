package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzar;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbgz;

/* renamed from: com.google.android.gms.ads.internal.overlay.m */
public final class C14846m implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzbgz zzbgz = null;
        String str4 = null;
        zzar zzar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 2:
                    zzc = (zzc) SafeParcelReader.m44409a(parcel2, a, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m44430o(parcel2, a);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.m44430o(parcel2, a);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.m44430o(parcel2, a);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.m44430o(parcel2, a);
                    break;
                case 7:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 9:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.m44430o(parcel2, a);
                    break;
                case 11:
                    i = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 12:
                    i2 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 13:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 14:
                    zzbgz = (zzbgz) SafeParcelReader.m44409a(parcel2, a, zzbgz.CREATOR);
                    break;
                case 16:
                    str4 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 17:
                    zzar = (zzar) SafeParcelReader.m44409a(parcel2, a, zzar.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.m44430o(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzbgz, str4, zzar, iBinder6);
        return adOverlayInfoParcel;
    }
}
