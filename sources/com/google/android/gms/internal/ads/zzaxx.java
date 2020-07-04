package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

@C6505uv
public final class zzaxx extends AbstractSafeParcelable {
    public static final Creator<zzaxx> CREATOR = new C16139wj();

    /* renamed from: a */
    private final Bundle f45655a;

    /* renamed from: b */
    private final zzbgz f45656b;

    /* renamed from: c */
    private final ApplicationInfo f45657c;

    /* renamed from: d */
    private final String f45658d;

    /* renamed from: e */
    private final List<String> f45659e;

    /* renamed from: f */
    private final PackageInfo f45660f;

    /* renamed from: g */
    private final String f45661g;

    /* renamed from: h */
    private final boolean f45662h;

    /* renamed from: i */
    private final String f45663i;

    public zzaxx(Bundle bundle, zzbgz zzbgz, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f45655a = bundle;
        this.f45656b = zzbgz;
        this.f45658d = str;
        this.f45657c = applicationInfo;
        this.f45659e = list;
        this.f45660f = packageInfo;
        this.f45661g = str2;
        this.f45662h = z;
        this.f45663i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44449a(parcel, 1, this.f45655a, false);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f45656b, i, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f45657c, i, false);
        C15269a.m44457a(parcel, 4, this.f45658d, false);
        C15269a.m44466b(parcel, 5, this.f45659e, false);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f45660f, i, false);
        C15269a.m44457a(parcel, 7, this.f45661g, false);
        C15269a.m44459a(parcel, 8, this.f45662h);
        C15269a.m44457a(parcel, 9, this.f45663i, false);
        C15269a.m44443a(parcel, a);
    }
}
