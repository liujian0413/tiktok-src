package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzaks extends AbstractSafeParcelable {
    public static final Creator<zzaks> CREATOR = new C15786jg();

    /* renamed from: a */
    public final int f45531a;

    public zzaks(int i) {
        this.f45531a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45531a);
        C15269a.m44443a(parcel, a);
    }
}
