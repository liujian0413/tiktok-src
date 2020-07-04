package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C14985c();

    /* renamed from: a */
    public int f38816a;

    /* renamed from: b */
    private final int f38817b;

    /* renamed from: c */
    private Bundle f38818c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f38817b = i;
        this.f38816a = i2;
        this.f38818c = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38817b);
        C15269a.m44447a(parcel, 2, this.f38816a);
        C15269a.m44449a(parcel, 3, this.f38818c, false);
        C15269a.m44443a(parcel, a);
    }
}
