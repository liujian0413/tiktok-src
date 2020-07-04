package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaOrientation> CREATOR = new C16788t();

    /* renamed from: a */
    public final float f46859a;

    /* renamed from: b */
    public final float f46860b;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C16768a {

        /* renamed from: a */
        public float f46861a;

        /* renamed from: b */
        public float f46862b;

        /* renamed from: a */
        public final C16768a mo43445a(float f) {
            this.f46862b = f;
            return this;
        }

        /* renamed from: a */
        public final StreetViewPanoramaOrientation mo43446a() {
            return new StreetViewPanoramaOrientation(this.f46862b, this.f46861a);
        }

        /* renamed from: b */
        public final C16768a mo43447b(float f) {
            this.f46861a = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C15267r.m44395b(z, sb.toString());
        this.f46859a = f + 0.0f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.f46860b = f2 % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f46859a) == Float.floatToIntBits(streetViewPanoramaOrientation.f46859a) && Float.floatToIntBits(this.f46860b) == Float.floatToIntBits(streetViewPanoramaOrientation.f46860b);
    }

    public int hashCode() {
        return C15265q.m44379a(Float.valueOf(this.f46859a), Float.valueOf(this.f46860b));
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("tilt", Float.valueOf(this.f46859a)).mo38611a("bearing", Float.valueOf(this.f46860b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44446a(parcel, 2, this.f46859a);
        C15269a.m44446a(parcel, 3, this.f46860b);
        C15269a.m44443a(parcel, a);
    }
}
