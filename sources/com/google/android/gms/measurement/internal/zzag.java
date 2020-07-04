package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzag extends AbstractSafeParcelable {
    public static final Creator<zzag> CREATOR = new C16941g();

    /* renamed from: a */
    public final String f47518a;

    /* renamed from: b */
    public final zzad f47519b;

    /* renamed from: c */
    public final String f47520c;

    /* renamed from: d */
    public final long f47521d;

    public zzag(String str, zzad zzad, String str2, long j) {
        this.f47518a = str;
        this.f47519b = zzad;
        this.f47520c = str2;
        this.f47521d = j;
    }

    zzag(zzag zzag, long j) {
        C15267r.m44384a(zzag);
        this.f47518a = zzag.f47518a;
        this.f47519b = zzag.f47519b;
        this.f47520c = zzag.f47520c;
        this.f47521d = j;
    }

    public final String toString() {
        String str = this.f47520c;
        String str2 = this.f47518a;
        String valueOf = String.valueOf(this.f47519b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f47518a, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f47519b, i, false);
        C15269a.m44457a(parcel, 4, this.f47520c, false);
        C15269a.m44448a(parcel, 5, this.f47521d);
        C15269a.m44443a(parcel, a);
    }
}
