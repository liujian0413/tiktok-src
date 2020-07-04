package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzy extends AbstractSafeParcelable {
    public static final Creator<zzy> CREATOR = new C16329j();

    /* renamed from: a */
    private final Credential f45815a;

    public zzy(Credential credential) {
        this.f45815a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 1, (Parcelable) this.f45815a, i, false);
        C15269a.m44443a(parcel, a);
    }
}
