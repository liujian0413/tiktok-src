package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Creator<PointOfInterest> CREATOR = new C16782n();

    /* renamed from: a */
    public final LatLng f46825a;

    /* renamed from: b */
    public final String f46826b;

    /* renamed from: c */
    public final String f46827c;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f46825a = latLng;
        this.f46826b = str;
        this.f46827c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46825a, i, false);
        C15269a.m44457a(parcel, 3, this.f46826b, false);
        C15269a.m44457a(parcel, 4, this.f46827c, false);
        C15269a.m44443a(parcel, a);
    }
}
