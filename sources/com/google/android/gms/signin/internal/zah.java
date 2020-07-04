package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zah extends AbstractSafeParcelable {
    public static final Creator<zah> CREATOR = new C16975h();

    /* renamed from: a */
    private final int f47583a;

    /* renamed from: b */
    private final ResolveAccountRequest f47584b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f47583a = i;
        this.f47584b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f47583a);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f47584b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
