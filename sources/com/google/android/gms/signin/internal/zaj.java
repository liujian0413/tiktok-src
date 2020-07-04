package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C16976i();

    /* renamed from: a */
    public final ConnectionResult f47585a;

    /* renamed from: b */
    public final ResolveAccountResponse f47586b;

    /* renamed from: c */
    private final int f47587c;

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f47587c = i;
        this.f47585a = connectionResult;
        this.f47586b = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f47587c);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f47585a, i, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f47586b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
