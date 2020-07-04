package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzbad extends AbstractSafeParcelable {
    public static final Creator<zzbad> CREATOR = new C16202ys();

    /* renamed from: a */
    public final zzyv f45665a;

    /* renamed from: b */
    public final String f45666b;

    public zzbad(zzyv zzyv, String str) {
        this.f45665a = zzyv;
        this.f45666b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f45665a, i, false);
        C15269a.m44457a(parcel, 3, this.f45666b, false);
        C15269a.m44443a(parcel, a);
    }
}
