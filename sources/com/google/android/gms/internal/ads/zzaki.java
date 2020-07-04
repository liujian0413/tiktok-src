package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzaki extends AbstractSafeParcelable {
    public static final Creator<zzaki> CREATOR = new C15777iy();

    /* renamed from: a */
    private final String f45525a;

    /* renamed from: b */
    private final boolean f45526b;

    /* renamed from: c */
    private final int f45527c;

    /* renamed from: d */
    private final String f45528d;

    public zzaki(String str, boolean z, int i, String str2) {
        this.f45525a = str;
        this.f45526b = z;
        this.f45527c = i;
        this.f45528d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f45525a, false);
        C15269a.m44459a(parcel, 2, this.f45526b);
        C15269a.m44447a(parcel, 3, this.f45527c);
        C15269a.m44457a(parcel, 4, this.f45528d, false);
        C15269a.m44443a(parcel, a);
    }
}
