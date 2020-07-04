package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FavaDiagnosticsEntity> CREATOR = new C15288a();

    /* renamed from: a */
    private final int f39494a;

    /* renamed from: b */
    private final String f39495b;

    /* renamed from: c */
    private final int f39496c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f39494a = i;
        this.f39495b = str;
        this.f39496c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39494a);
        C15269a.m44457a(parcel, 2, this.f39495b, false);
        C15269a.m44447a(parcel, 3, this.f39496c);
        C15269a.m44443a(parcel, a);
    }
}
