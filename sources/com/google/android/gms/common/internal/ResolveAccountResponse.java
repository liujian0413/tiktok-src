package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15256m.C15257a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C15210ab();

    /* renamed from: a */
    public ConnectionResult f39338a;

    /* renamed from: b */
    public boolean f39339b;

    /* renamed from: c */
    public boolean f39340c;

    /* renamed from: d */
    private final int f39341d;

    /* renamed from: e */
    private IBinder f39342e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f39341d = i;
        this.f39342e = iBinder;
        this.f39338a = connectionResult;
        this.f39339b = z;
        this.f39340c = z2;
    }

    /* renamed from: a */
    public final C15256m mo38509a() {
        return C15257a.m44370a(this.f39342e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39341d);
        C15269a.m44450a(parcel, 2, this.f39342e, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f39338a, i, false);
        C15269a.m44459a(parcel, 4, this.f39339b);
        C15269a.m44459a(parcel, 5, this.f39340c);
        C15269a.m44443a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f39338a.equals(resolveAccountResponse.f39338a) && mo38509a().equals(resolveAccountResponse.mo38509a());
    }
}
