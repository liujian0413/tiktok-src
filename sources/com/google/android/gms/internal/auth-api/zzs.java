package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzs extends AbstractSafeParcelable {
    public static final Creator<zzs> CREATOR = new C16326g();

    /* renamed from: a */
    private final Credential f45814a;

    public zzs(Credential credential) {
        this.f45814a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 1, (Parcelable) this.f45814a, i, false);
        C15269a.m44443a(parcel, a);
    }
}
