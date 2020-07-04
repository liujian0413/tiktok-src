package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zaa extends AbstractSafeParcelable implements C15044g {
    public static final Creator<zaa> CREATOR = new C16969b();

    /* renamed from: a */
    private final int f47580a;

    /* renamed from: b */
    private int f47581b;

    /* renamed from: c */
    private Intent f47582c;

    zaa(int i, int i2, Intent intent) {
        this.f47580a = i;
        this.f47581b = i2;
        this.f47582c = intent;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }

    /* renamed from: a */
    public final Status mo38101a() {
        if (this.f47581b == 0) {
            return Status.f38867a;
        }
        return Status.f38871e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f47580a);
        C15269a.m44447a(parcel, 2, this.f47581b);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f47582c, i, false);
        C15269a.m44443a(parcel, a);
    }
}
