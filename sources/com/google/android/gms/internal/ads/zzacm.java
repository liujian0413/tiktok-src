package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.p743c.C14741a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzacm extends AbstractSafeParcelable {
    public static final Creator<zzacm> CREATOR = new C15563be();

    /* renamed from: a */
    public final String f45502a;

    public zzacm(C14741a aVar) {
        this.f45502a = aVar.f38092a;
    }

    zzacm(String str) {
        this.f45502a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 15, this.f45502a, false);
        C15269a.m44443a(parcel, a);
    }
}
