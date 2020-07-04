package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzdy extends AbstractSafeParcelable {
    public static final Creator<zzdy> CREATOR = new C16450cp();

    /* renamed from: a */
    public final long f46674a;

    /* renamed from: b */
    public final long f46675b;

    /* renamed from: c */
    public final boolean f46676c;

    /* renamed from: d */
    public final String f46677d;

    /* renamed from: e */
    public final String f46678e;

    /* renamed from: f */
    public final String f46679f;

    /* renamed from: g */
    public final Bundle f46680g;

    zzdy(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f46674a = j;
        this.f46675b = j2;
        this.f46676c = z;
        this.f46677d = str;
        this.f46678e = str2;
        this.f46679f = str3;
        this.f46680g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44448a(parcel, 1, this.f46674a);
        C15269a.m44448a(parcel, 2, this.f46675b);
        C15269a.m44459a(parcel, 3, this.f46676c);
        C15269a.m44457a(parcel, 4, this.f46677d, false);
        C15269a.m44457a(parcel, 5, this.f46678e, false);
        C15269a.m44457a(parcel, 6, this.f46679f, false);
        C15269a.m44449a(parcel, 7, this.f46680g, false);
        C15269a.m44443a(parcel, a);
    }
}
