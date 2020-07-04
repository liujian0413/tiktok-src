package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzab extends AbstractSafeParcelable {
    public static final Creator<zzab> CREATOR = new C16331b();

    /* renamed from: a */
    private final int f45819a = 1;

    /* renamed from: b */
    private final String f45820b;

    /* renamed from: c */
    private final int f45821c;

    zzab(int i, String str, int i2) {
        this.f45820b = (String) C15267r.m44384a(str);
        this.f45821c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45819a);
        C15269a.m44457a(parcel, 2, this.f45820b, false);
        C15269a.m44447a(parcel, 3, this.f45821c);
        C15269a.m44443a(parcel, a);
    }
}
