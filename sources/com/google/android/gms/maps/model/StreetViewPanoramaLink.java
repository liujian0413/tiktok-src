package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLink> CREATOR = new C16786r();

    /* renamed from: a */
    public final String f46854a;

    /* renamed from: b */
    public final float f46855b;

    public StreetViewPanoramaLink(String str, float f) {
        this.f46854a = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.f46855b = f % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f46854a.equals(streetViewPanoramaLink.f46854a) && Float.floatToIntBits(this.f46855b) == Float.floatToIntBits(streetViewPanoramaLink.f46855b);
    }

    public int hashCode() {
        return C15265q.m44379a(this.f46854a, Float.valueOf(this.f46855b));
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("panoId", this.f46854a).mo38611a("bearing", Float.valueOf(this.f46855b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f46854a, false);
        C15269a.m44446a(parcel, 3, this.f46855b);
        C15269a.m44443a(parcel, a);
    }
}
