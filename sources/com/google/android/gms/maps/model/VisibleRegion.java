package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Creator<VisibleRegion> CREATOR = new C16793y();

    /* renamed from: a */
    public final LatLng f46876a;

    /* renamed from: b */
    public final LatLng f46877b;

    /* renamed from: c */
    public final LatLng f46878c;

    /* renamed from: d */
    public final LatLng f46879d;

    /* renamed from: e */
    public final LatLngBounds f46880e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f46876a = latLng;
        this.f46877b = latLng2;
        this.f46878c = latLng3;
        this.f46879d = latLng4;
        this.f46880e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f46876a.equals(visibleRegion.f46876a) && this.f46877b.equals(visibleRegion.f46877b) && this.f46878c.equals(visibleRegion.f46878c) && this.f46879d.equals(visibleRegion.f46879d) && this.f46880e.equals(visibleRegion.f46880e);
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f46876a, this.f46877b, this.f46878c, this.f46879d, this.f46880e);
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("nearLeft", this.f46876a).mo38611a("nearRight", this.f46877b).mo38611a("farLeft", this.f46878c).mo38611a("farRight", this.f46879d).mo38611a("latLngBounds", this.f46880e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46876a, i, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f46877b, i, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f46878c, i, false);
        C15269a.m44452a(parcel, 5, (Parcelable) this.f46879d, i, false);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f46880e, i, false);
        C15269a.m44443a(parcel, a);
    }
}
