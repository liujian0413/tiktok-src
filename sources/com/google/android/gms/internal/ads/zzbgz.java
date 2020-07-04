package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.taobao.android.dexposed.ClassUtils;

@C6505uv
public final class zzbgz extends AbstractSafeParcelable {
    public static final Creator<zzbgz> CREATOR = new afr();

    /* renamed from: a */
    public String f45677a;

    /* renamed from: b */
    public int f45678b;

    /* renamed from: c */
    public int f45679c;

    /* renamed from: d */
    public boolean f45680d;

    /* renamed from: e */
    public boolean f45681e;

    public zzbgz(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzbgz(int i, int i2, boolean z, boolean z2) {
        this(15302000, i2, true, false, z2);
    }

    private zzbgz(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str);
        this(sb.toString(), i, i2, z, z3);
    }

    zzbgz(String str, int i, int i2, boolean z, boolean z2) {
        this.f45677a = str;
        this.f45678b = i;
        this.f45679c = i2;
        this.f45680d = z;
        this.f45681e = z2;
    }

    /* renamed from: a */
    public static zzbgz m52673a() {
        return new zzbgz(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45677a, false);
        C15269a.m44447a(parcel, 3, this.f45678b);
        C15269a.m44447a(parcel, 4, this.f45679c);
        C15269a.m44459a(parcel, 5, this.f45680d);
        C15269a.m44459a(parcel, 6, this.f45681e);
        C15269a.m44443a(parcel, a);
    }
}
