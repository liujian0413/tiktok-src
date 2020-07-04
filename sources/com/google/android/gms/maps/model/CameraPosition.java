package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CameraPosition> CREATOR = new C16773e();

    /* renamed from: a */
    public final LatLng f46761a;

    /* renamed from: b */
    public final float f46762b;

    /* renamed from: c */
    public final float f46763c;

    /* renamed from: d */
    public final float f46764d;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C16766a {

        /* renamed from: a */
        private LatLng f46765a;

        /* renamed from: b */
        private float f46766b;

        /* renamed from: c */
        private float f46767c;

        /* renamed from: d */
        private float f46768d;

        /* renamed from: a */
        public final C16766a mo43397a(float f) {
            this.f46766b = f;
            return this;
        }

        /* renamed from: a */
        public final C16766a mo43398a(LatLng latLng) {
            this.f46765a = latLng;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition mo43399a() {
            return new CameraPosition(this.f46765a, this.f46766b, this.f46767c, this.f46768d);
        }

        /* renamed from: b */
        public final C16766a mo43400b(float f) {
            this.f46767c = f;
            return this;
        }

        /* renamed from: c */
        public final C16766a mo43401c(float f) {
            this.f46768d = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C15267r.m44385a(latLng, (Object) "null camera target");
        C15267r.m44396b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f46761a = latLng;
        this.f46762b = f;
        this.f46763c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f46764d = f3 % 360.0f;
    }

    /* renamed from: a */
    public static C16766a m55299a() {
        return new C16766a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f46761a.equals(cameraPosition.f46761a) && Float.floatToIntBits(this.f46762b) == Float.floatToIntBits(cameraPosition.f46762b) && Float.floatToIntBits(this.f46763c) == Float.floatToIntBits(cameraPosition.f46763c) && Float.floatToIntBits(this.f46764d) == Float.floatToIntBits(cameraPosition.f46764d);
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f46761a, Float.valueOf(this.f46762b), Float.valueOf(this.f46763c), Float.valueOf(this.f46764d));
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("target", this.f46761a).mo38611a("zoom", Float.valueOf(this.f46762b)).mo38611a("tilt", Float.valueOf(this.f46763c)).mo38611a("bearing", Float.valueOf(this.f46764d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46761a, i, false);
        C15269a.m44446a(parcel, 3, this.f46762b);
        C15269a.m44446a(parcel, 4, this.f46763c);
        C15269a.m44446a(parcel, 5, this.f46764d);
        C15269a.m44443a(parcel, a);
    }
}
