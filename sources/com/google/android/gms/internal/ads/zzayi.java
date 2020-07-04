package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzayi extends AbstractSafeParcelable {
    public static final Creator<zzayi> CREATOR = new C16150wu();

    /* renamed from: a */
    String f45664a;

    public zzayi(String str) {
        this.f45664a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45664a, false);
        C15269a.m44443a(parcel, a);
    }
}
