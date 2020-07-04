package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vv */
public final class C16124vv implements Creator<zzaxe> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m44414b(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzyv zzyv = null;
        zzyz zzyz = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzbgz zzbgz = null;
        Bundle bundle2 = null;
        List list = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzafl zzafl = null;
        List list3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzabp zzabp = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        List list4 = null;
        String str15 = null;
        List list5 = null;
        ArrayList arrayList = null;
        String str16 = null;
        zzaks zzaks = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 2:
                    bundle = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case 3:
                    zzyv = (zzyv) SafeParcelReader.m44409a(parcel2, a, zzyv.CREATOR);
                    break;
                case 4:
                    zzyz = (zzyz) SafeParcelReader.m44409a(parcel2, a, zzyz.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m44409a(parcel2, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m44409a(parcel2, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 9:
                    str3 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 10:
                    str4 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 11:
                    zzbgz = (zzbgz) SafeParcelReader.m44409a(parcel2, a, zzbgz.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case 13:
                    i2 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 14:
                    list = SafeParcelReader.m44402A(parcel2, a);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case 16:
                    z = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 18:
                    i3 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 19:
                    i4 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 20:
                    f = SafeParcelReader.m44424i(parcel2, a);
                    break;
                case 21:
                    str5 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 25:
                    j = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    str6 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    list2 = SafeParcelReader.m44402A(parcel2, a);
                    break;
                case 28:
                    str7 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 29:
                    zzafl = (zzafl) SafeParcelReader.m44409a(parcel2, a, zzafl.CREATOR);
                    break;
                case 30:
                    list3 = SafeParcelReader.m44402A(parcel2, a);
                    break;
                case 31:
                    j2 = SafeParcelReader.m44421f(parcel2, a);
                    break;
                case 33:
                    str8 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case BaseNotice.CHALLENGE /*34*/:
                    f2 = SafeParcelReader.m44424i(parcel2, a);
                    break;
                case 35:
                    i5 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 36:
                    i6 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 37:
                    z3 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 38:
                    z4 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 39:
                    str9 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 40:
                    z2 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case BaseNotice.LIKE /*41*/:
                    str10 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 42:
                    z5 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 43:
                    i7 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case BaseNotice.f89516AT /*45*/:
                    str11 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 46:
                    zzabp = (zzabp) SafeParcelReader.m44409a(parcel2, a, zzabp.CREATOR);
                    break;
                case 47:
                    z6 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.m44431p(parcel2, a);
                    break;
                case 49:
                    str12 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 50:
                    str13 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 51:
                    str14 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 52:
                    z7 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 53:
                    list4 = SafeParcelReader.m44441z(parcel2, a);
                    break;
                case 54:
                    str15 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 55:
                    list5 = SafeParcelReader.m44402A(parcel2, a);
                    break;
                case 56:
                    i8 = SafeParcelReader.m44419d(parcel2, a);
                    break;
                case 57:
                    z8 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 58:
                    z9 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 59:
                    z10 = SafeParcelReader.m44415b(parcel2, a);
                    break;
                case 60:
                    arrayList = SafeParcelReader.m44402A(parcel2, a);
                    break;
                case BaseNotice.TCM /*61*/:
                    str16 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 63:
                    zzaks = (zzaks) SafeParcelReader.m44409a(parcel2, a, zzaks.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.m44429n(parcel2, a);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.m44431p(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel2, b);
        zzaxe zzaxe = new zzaxe(i, bundle, zzyv, zzyz, str, applicationInfo, packageInfo, str2, str3, str4, zzbgz, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzafl, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzabp, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10, arrayList, str16, zzaks, str17, bundle6);
        return zzaxe;
    }
}
