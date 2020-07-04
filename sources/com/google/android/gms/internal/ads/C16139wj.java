package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wj */
public final class C16139wj implements Creator<zzaxx> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        Bundle bundle = null;
        zzbgz zzbgz = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    bundle = SafeParcelReader.m44431p(parcel, a);
                    break;
                case 2:
                    zzbgz = (zzbgz) SafeParcelReader.m44409a(parcel, a, zzbgz.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m44409a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 5:
                    list = SafeParcelReader.m44402A(parcel, a);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m44409a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 9:
                    str3 = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        zzaxx zzaxx = new zzaxx(bundle, zzbgz, applicationInfo, str, list, packageInfo, str2, z, str3);
        return zzaxx;
    }
}
