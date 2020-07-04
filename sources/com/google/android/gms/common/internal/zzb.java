package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzb extends AbstractSafeParcelable {
    public static final Creator<zzb> CREATOR = new C15213ae();

    /* renamed from: a */
    Bundle f39476a;

    /* renamed from: b */
    Feature[] f39477b;

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f39476a = bundle;
        this.f39477b = featureArr;
    }

    public zzb() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44449a(parcel, 1, this.f39476a, false);
        C15269a.m44461a(parcel, 2, (T[]) this.f39477b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
