package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLng> CREATOR = new C16778j();

    /* renamed from: a */
    public final double f46798a;

    /* renamed from: b */
    public final double f46799b;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            d2 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f46799b = d2;
        this.f46798a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f46798a) == Double.doubleToLongBits(latLng.f46798a) && Double.doubleToLongBits(this.f46799b) == Double.doubleToLongBits(latLng.f46799b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46798a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46799b);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d = this.f46798a;
        double d2 = this.f46799b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44445a(parcel, 2, this.f46798a);
        C15269a.m44445a(parcel, 3, this.f46799b);
        C15269a.m44443a(parcel, a);
    }
}
