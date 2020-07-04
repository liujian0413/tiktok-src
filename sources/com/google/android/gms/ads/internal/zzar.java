package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.internal.ads.C6505uv;

@C6505uv
public final class zzar extends AbstractSafeParcelable {
    public static final Creator<zzar> CREATOR = new C14862s();

    /* renamed from: a */
    public final boolean f38496a;

    /* renamed from: b */
    public final boolean f38497b;

    /* renamed from: c */
    public final boolean f38498c;

    /* renamed from: d */
    public final float f38499d;

    /* renamed from: e */
    public final int f38500e;

    /* renamed from: f */
    public final boolean f38501f;

    /* renamed from: g */
    public final boolean f38502g;

    /* renamed from: h */
    public final boolean f38503h;

    /* renamed from: i */
    private final String f38504i;

    public zzar(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    zzar(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f38496a = z;
        this.f38497b = z2;
        this.f38504i = str;
        this.f38498c = z3;
        this.f38499d = f;
        this.f38500e = i;
        this.f38501f = z4;
        this.f38502g = z5;
        this.f38503h = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 2, this.f38496a);
        C15269a.m44459a(parcel, 3, this.f38497b);
        C15269a.m44457a(parcel, 4, this.f38504i, false);
        C15269a.m44459a(parcel, 5, this.f38498c);
        C15269a.m44446a(parcel, 6, this.f38499d);
        C15269a.m44447a(parcel, 7, this.f38500e);
        C15269a.m44459a(parcel, 8, this.f38501f);
        C15269a.m44459a(parcel, 9, this.f38502g);
        C15269a.m44459a(parcel, 10, this.f38503h);
        C15269a.m44443a(parcel, a);
    }
}
