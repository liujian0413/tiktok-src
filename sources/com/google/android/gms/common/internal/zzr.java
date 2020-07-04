package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C15228at();

    /* renamed from: a */
    private final int f39478a;

    zzr(int i) {
        this.f39478a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39478a);
        C15269a.m44443a(parcel, a);
    }
}
