package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzad extends AbstractSafeParcelable {
    public static final Creator<zzad> CREATOR = new C16332c();

    /* renamed from: a */
    private final int f45822a = 1;

    /* renamed from: b */
    private final String f45823b;

    zzad(int i, String str) {
        this.f45823b = (String) C15267r.m44384a(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45822a);
        C15269a.m44457a(parcel, 2, this.f45823b, false);
        C15269a.m44443a(parcel, a);
    }
}
