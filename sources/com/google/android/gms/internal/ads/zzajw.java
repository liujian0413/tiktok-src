package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzajw extends AbstractSafeParcelable {
    public static final Creator<zzajw> CREATOR = new C15765im();

    /* renamed from: a */
    public final boolean f45517a;

    /* renamed from: b */
    public final String f45518b;

    /* renamed from: c */
    public final int f45519c;

    /* renamed from: d */
    public final byte[] f45520d;

    /* renamed from: e */
    public final String[] f45521e;

    /* renamed from: f */
    public final String[] f45522f;

    /* renamed from: g */
    public final boolean f45523g;

    /* renamed from: h */
    public final long f45524h;

    zzajw(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f45517a = z;
        this.f45518b = str;
        this.f45519c = i;
        this.f45520d = bArr;
        this.f45521e = strArr;
        this.f45522f = strArr2;
        this.f45523g = z2;
        this.f45524h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 1, this.f45517a);
        C15269a.m44457a(parcel, 2, this.f45518b, false);
        C15269a.m44447a(parcel, 3, this.f45519c);
        C15269a.m44460a(parcel, 4, this.f45520d, false);
        C15269a.m44462a(parcel, 5, this.f45521e, false);
        C15269a.m44462a(parcel, 6, this.f45522f, false);
        C15269a.m44459a(parcel, 7, this.f45523g);
        C15269a.m44448a(parcel, 8, this.f45524h);
        C15269a.m44443a(parcel, a);
    }
}
