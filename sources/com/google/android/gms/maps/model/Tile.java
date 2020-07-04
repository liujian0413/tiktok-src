package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class Tile extends AbstractSafeParcelable {
    public static final Creator<Tile> CREATOR = new C16790v();

    /* renamed from: a */
    public final int f46867a;

    /* renamed from: b */
    public final int f46868b;

    /* renamed from: c */
    public final byte[] f46869c;

    public Tile(int i, int i2, byte[] bArr) {
        this.f46867a = i;
        this.f46868b = i2;
        this.f46869c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 2, this.f46867a);
        C15269a.m44447a(parcel, 3, this.f46868b);
        C15269a.m44460a(parcel, 4, this.f46869c, false);
        C15269a.m44443a(parcel, a);
    }
}
