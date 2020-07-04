package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Creator<PolylineOptions> CREATOR = new C16784p();

    /* renamed from: a */
    public final List<LatLng> f46839a;

    /* renamed from: b */
    public float f46840b;

    /* renamed from: c */
    public int f46841c;

    /* renamed from: d */
    public float f46842d;

    /* renamed from: e */
    public boolean f46843e;

    /* renamed from: f */
    public boolean f46844f;

    /* renamed from: g */
    public boolean f46845g;

    /* renamed from: h */
    public Cap f46846h;

    /* renamed from: i */
    public Cap f46847i;

    /* renamed from: j */
    public int f46848j;

    /* renamed from: k */
    public List<PatternItem> f46849k;

    public PolylineOptions() {
        this.f46840b = 10.0f;
        this.f46841c = -16777216;
        this.f46843e = true;
        this.f46846h = new ButtCap();
        this.f46847i = new ButtCap();
        this.f46848j = 0;
        this.f46849k = null;
        this.f46839a = new ArrayList();
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f46840b = 10.0f;
        this.f46841c = -16777216;
        this.f46843e = true;
        this.f46846h = new ButtCap();
        this.f46847i = new ButtCap();
        this.f46848j = 0;
        this.f46849k = null;
        this.f46839a = list;
        this.f46840b = f;
        this.f46841c = i;
        this.f46842d = f2;
        this.f46843e = z;
        this.f46844f = z2;
        this.f46845g = z3;
        if (cap != null) {
            this.f46846h = cap;
        }
        if (cap2 != null) {
            this.f46847i = cap2;
        }
        this.f46848j = i2;
        this.f46849k = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44468c(parcel, 2, this.f46839a, false);
        C15269a.m44446a(parcel, 3, this.f46840b);
        C15269a.m44447a(parcel, 4, this.f46841c);
        C15269a.m44446a(parcel, 5, this.f46842d);
        C15269a.m44459a(parcel, 6, this.f46843e);
        C15269a.m44459a(parcel, 7, this.f46844f);
        C15269a.m44459a(parcel, 8, this.f46845g);
        C15269a.m44452a(parcel, 9, (Parcelable) this.f46846h, i, false);
        C15269a.m44452a(parcel, 10, (Parcelable) this.f46847i, i, false);
        C15269a.m44447a(parcel, 11, this.f46848j);
        C15269a.m44468c(parcel, 12, this.f46849k, false);
        C15269a.m44443a(parcel, a);
    }
}
