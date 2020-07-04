package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Creator<PolygonOptions> CREATOR = new C16783o();

    /* renamed from: a */
    public final List<LatLng> f46828a;

    /* renamed from: b */
    public final List<List<LatLng>> f46829b;

    /* renamed from: c */
    public float f46830c;

    /* renamed from: d */
    public int f46831d;

    /* renamed from: e */
    public int f46832e;

    /* renamed from: f */
    public float f46833f;

    /* renamed from: g */
    public boolean f46834g;

    /* renamed from: h */
    public boolean f46835h;

    /* renamed from: i */
    public boolean f46836i;

    /* renamed from: j */
    public int f46837j;

    /* renamed from: k */
    public List<PatternItem> f46838k;

    public PolygonOptions() {
        this.f46830c = 10.0f;
        this.f46831d = -16777216;
        this.f46834g = true;
        this.f46828a = new ArrayList();
        this.f46829b = new ArrayList();
    }

    PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f46830c = 10.0f;
        this.f46831d = -16777216;
        this.f46834g = true;
        this.f46828a = list;
        this.f46829b = list2;
        this.f46830c = f;
        this.f46831d = i;
        this.f46832e = i2;
        this.f46833f = f2;
        this.f46834g = z;
        this.f46835h = z2;
        this.f46836i = z3;
        this.f46837j = i3;
        this.f46838k = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44468c(parcel, 2, this.f46828a, false);
        C15269a.m44469d(parcel, 3, this.f46829b, false);
        C15269a.m44446a(parcel, 4, this.f46830c);
        C15269a.m44447a(parcel, 5, this.f46831d);
        C15269a.m44447a(parcel, 6, this.f46832e);
        C15269a.m44446a(parcel, 7, this.f46833f);
        C15269a.m44459a(parcel, 8, this.f46834g);
        C15269a.m44459a(parcel, 9, this.f46835h);
        C15269a.m44459a(parcel, 10, this.f46836i);
        C15269a.m44447a(parcel, 11, this.f46837j);
        C15269a.m44468c(parcel, 12, this.f46838k, false);
        C15269a.m44443a(parcel, a);
    }
}
