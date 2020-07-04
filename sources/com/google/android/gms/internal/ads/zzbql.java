package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzbql extends AbstractSafeParcelable {
    public static final Creator<zzbql> CREATOR = new aph();

    /* renamed from: a */
    private final int f45682a;

    /* renamed from: b */
    private final byte[] f45683b;

    zzbql(int i, byte[] bArr) {
        this.f45682a = i;
        this.f45683b = bArr;
    }

    public zzbql(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45682a);
        C15269a.m44460a(parcel, 2, this.f45683b, false);
        C15269a.m44443a(parcel, a);
    }
}
