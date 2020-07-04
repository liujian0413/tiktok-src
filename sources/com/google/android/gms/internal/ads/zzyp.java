package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzyp extends AbstractSafeParcelable {
    public static final Creator<zzyp> CREATOR = new bxt();

    /* renamed from: a */
    private final String f45775a;

    /* renamed from: b */
    private final String f45776b;

    public zzyp(String str, String str2) {
        this.f45775a = str;
        this.f45776b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f45775a, false);
        C15269a.m44457a(parcel, 2, this.f45776b, false);
        C15269a.m44443a(parcel, a);
    }
}
