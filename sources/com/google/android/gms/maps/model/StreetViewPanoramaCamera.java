package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation.C16768a;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaCamera> CREATOR = new C16785q();

    /* renamed from: a */
    public final float f46850a;

    /* renamed from: b */
    public final float f46851b;

    /* renamed from: c */
    public final float f46852c;

    /* renamed from: d */
    public final StreetViewPanoramaOrientation f46853d;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C15267r.m44395b(z, sb.toString());
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.f46850a = f;
        this.f46851b = 0.0f + f2;
        this.f46852c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.f46853d = new C16768a().mo43445a(f2).mo43447b(f3).mo43446a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f46850a) == Float.floatToIntBits(streetViewPanoramaCamera.f46850a) && Float.floatToIntBits(this.f46851b) == Float.floatToIntBits(streetViewPanoramaCamera.f46851b) && Float.floatToIntBits(this.f46852c) == Float.floatToIntBits(streetViewPanoramaCamera.f46852c);
    }

    public int hashCode() {
        return C15265q.m44379a(Float.valueOf(this.f46850a), Float.valueOf(this.f46851b), Float.valueOf(this.f46852c));
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("zoom", Float.valueOf(this.f46850a)).mo38611a("tilt", Float.valueOf(this.f46851b)).mo38611a("bearing", Float.valueOf(this.f46852c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44446a(parcel, 2, this.f46850a);
        C15269a.m44446a(parcel, 3, this.f46851b);
        C15269a.m44446a(parcel, 4, this.f46852c);
        C15269a.m44443a(parcel, a);
    }
}
