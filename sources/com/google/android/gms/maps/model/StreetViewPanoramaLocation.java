package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLocation> CREATOR = new C16787s();

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f46856a;

    /* renamed from: b */
    public final LatLng f46857b;

    /* renamed from: c */
    public final String f46858c;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f46856a = streetViewPanoramaLinkArr;
        this.f46857b = latLng;
        this.f46858c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f46858c.equals(streetViewPanoramaLocation.f46858c) && this.f46857b.equals(streetViewPanoramaLocation.f46857b);
    }

    public int hashCode() {
        return C15265q.m44379a(this.f46857b, this.f46858c);
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("panoId", this.f46858c).mo38611a("position", this.f46857b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44461a(parcel, 2, (T[]) this.f46856a, i, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f46857b, i, false);
        C15269a.m44457a(parcel, 4, this.f46858c, false);
        C15269a.m44443a(parcel, a);
    }
}
