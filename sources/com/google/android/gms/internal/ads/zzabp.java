package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzabp extends AbstractSafeParcelable {
    public static final Creator<zzabp> CREATOR = new C15497aq();

    /* renamed from: a */
    public final int f45501a;

    public zzabp(int i) {
        this.f45501a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 2, this.f45501a);
        C15269a.m44443a(parcel, a);
    }
}
