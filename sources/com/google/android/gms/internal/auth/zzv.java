package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzv extends AbstractSafeParcelable {
    public static final Creator<zzv> CREATOR = new C16339j();

    /* renamed from: a */
    private final int f45831a = 1;

    /* renamed from: b */
    private final String f45832b;

    zzv(int i, String str) {
        this.f45832b = (String) C15267r.m44384a(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45831a);
        C15269a.m44457a(parcel, 2, this.f45832b, false);
        C15269a.m44443a(parcel, a);
    }
}
