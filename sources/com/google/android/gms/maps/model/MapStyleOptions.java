package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Creator<MapStyleOptions> CREATOR = new C16779k();

    /* renamed from: a */
    private static final String f46806a = "MapStyleOptions";

    /* renamed from: b */
    private String f46807b;

    public MapStyleOptions(String str) {
        this.f46807b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f46807b, false);
        C15269a.m44443a(parcel, a);
    }
}
