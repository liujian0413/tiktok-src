package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLngBounds> CREATOR = new C16777i();

    /* renamed from: a */
    public final LatLng f46800a;

    /* renamed from: b */
    public final LatLng f46801b;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C16767a {

        /* renamed from: a */
        private double f46802a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f46803b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f46804c = Double.NaN;

        /* renamed from: d */
        private double f46805d = Double.NaN;

        /* renamed from: a */
        public final C16767a mo43417a(LatLng latLng) {
            this.f46802a = Math.min(this.f46802a, latLng.f46798a);
            this.f46803b = Math.max(this.f46803b, latLng.f46798a);
            double d = latLng.f46799b;
            if (Double.isNaN(this.f46804c)) {
                this.f46804c = d;
            } else {
                boolean z = true;
                if (this.f46804c > this.f46805d ? !(this.f46804c <= d || d <= this.f46805d) : !(this.f46804c <= d && d <= this.f46805d)) {
                    z = false;
                }
                if (!z) {
                    if (LatLngBounds.m55308c(this.f46804c, d) < LatLngBounds.m55309d(this.f46805d, d)) {
                        this.f46804c = d;
                    }
                }
                return this;
            }
            this.f46805d = d;
            return this;
        }

        /* renamed from: a */
        public final LatLngBounds mo43418a() {
            C15267r.m44391a(!Double.isNaN(this.f46804c), (Object) "no included points");
            return new LatLngBounds(new LatLng(this.f46802a, this.f46804c), new LatLng(this.f46803b, this.f46805d));
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C15267r.m44385a(latLng, (Object) "null southwest");
        C15267r.m44385a(latLng2, (Object) "null northeast");
        C15267r.m44396b(latLng2.f46798a >= latLng.f46798a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f46798a), Double.valueOf(latLng2.f46798a));
        this.f46800a = latLng;
        this.f46801b = latLng2;
    }

    /* renamed from: a */
    public static C16767a m55306a() {
        return new C16767a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m55308c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static double m55309d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* renamed from: b */
    public final LatLng mo43412b() {
        double d = (this.f46800a.f46798a + this.f46801b.f46798a) / 2.0d;
        double d2 = this.f46801b.f46799b;
        double d3 = this.f46800a.f46799b;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new LatLng(d, (d2 + d3) / 2.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f46800a.equals(latLngBounds.f46800a) && this.f46801b.equals(latLngBounds.f46801b);
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f46800a, this.f46801b);
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("southwest", this.f46800a).mo38611a("northeast", this.f46801b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46800a, i, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f46801b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
