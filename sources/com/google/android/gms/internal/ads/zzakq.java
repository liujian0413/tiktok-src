package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzakq extends AbstractSafeParcelable {
    public static final Creator<zzakq> CREATOR = new C15785jf();

    /* renamed from: a */
    public final String f45529a;

    /* renamed from: b */
    public final Bundle f45530b;

    public zzakq(String str, Bundle bundle) {
        this.f45529a = str;
        this.f45530b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f45529a, false);
        C15269a.m44449a(parcel, 2, this.f45530b, false);
        C15269a.m44443a(parcel, a);
    }
}
