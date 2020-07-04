package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.C14873l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzacq extends AbstractSafeParcelable {
    public static final Creator<zzacq> CREATOR = new C15567bg();

    /* renamed from: a */
    public final boolean f45503a;

    /* renamed from: b */
    public final boolean f45504b;

    /* renamed from: c */
    public final boolean f45505c;

    public zzacq(C14873l lVar) {
        this(lVar.f38508a, lVar.f38509b, lVar.f38510c);
    }

    public zzacq(boolean z, boolean z2, boolean z3) {
        this.f45503a = z;
        this.f45504b = z2;
        this.f45505c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 2, this.f45503a);
        C15269a.m44459a(parcel, 3, this.f45504b);
        C15269a.m44459a(parcel, 4, this.f45505c);
        C15269a.m44443a(parcel, a);
    }
}
