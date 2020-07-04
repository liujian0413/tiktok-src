package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Creator<CircleOptions> CREATOR = new C16775g();

    /* renamed from: a */
    public LatLng f46773a;

    /* renamed from: b */
    public double f46774b;

    /* renamed from: c */
    public float f46775c = 10.0f;

    /* renamed from: d */
    public int f46776d = -16777216;

    /* renamed from: e */
    public int f46777e;

    /* renamed from: f */
    public float f46778f;

    /* renamed from: g */
    public boolean f46779g = true;

    /* renamed from: h */
    public boolean f46780h;

    /* renamed from: i */
    public List<PatternItem> f46781i;

    public CircleOptions() {
    }

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f46773a = latLng;
        this.f46774b = d;
        this.f46775c = f;
        this.f46776d = i;
        this.f46777e = i2;
        this.f46778f = f2;
        this.f46779g = z;
        this.f46780h = z2;
        this.f46781i = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46773a, i, false);
        C15269a.m44445a(parcel, 3, this.f46774b);
        C15269a.m44446a(parcel, 4, this.f46775c);
        C15269a.m44447a(parcel, 5, this.f46776d);
        C15269a.m44447a(parcel, 6, this.f46777e);
        C15269a.m44446a(parcel, 7, this.f46778f);
        C15269a.m44459a(parcel, 8, this.f46779g);
        C15269a.m44459a(parcel, 9, this.f46780h);
        C15269a.m44468c(parcel, 10, this.f46781i, false);
        C15269a.m44443a(parcel, a);
    }
}
