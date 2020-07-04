package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.dynamic.C15345b.C15346a;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Creator<MarkerOptions> CREATOR = new C16780l();

    /* renamed from: a */
    public LatLng f46808a;

    /* renamed from: b */
    public String f46809b;

    /* renamed from: c */
    public String f46810c;

    /* renamed from: d */
    public C16769a f46811d;

    /* renamed from: e */
    public float f46812e = 0.5f;

    /* renamed from: f */
    public float f46813f = 1.0f;

    /* renamed from: g */
    public boolean f46814g;

    /* renamed from: h */
    public boolean f46815h = true;

    /* renamed from: i */
    public boolean f46816i;

    /* renamed from: j */
    public float f46817j;

    /* renamed from: k */
    public float f46818k = 0.5f;

    /* renamed from: l */
    public float f46819l;

    /* renamed from: m */
    public float f46820m = 1.0f;

    /* renamed from: n */
    public float f46821n;

    public MarkerOptions() {
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f46808a = latLng;
        this.f46809b = str;
        this.f46810c = str2;
        if (iBinder == null) {
            this.f46811d = null;
        } else {
            this.f46811d = new C16769a(C15346a.m44656a(iBinder));
        }
        this.f46812e = f;
        this.f46813f = f2;
        this.f46814g = z;
        this.f46815h = z2;
        this.f46816i = z3;
        this.f46817j = f3;
        this.f46818k = f4;
        this.f46819l = f5;
        this.f46820m = f6;
        this.f46821n = f7;
    }

    /* renamed from: a */
    public final MarkerOptions mo43420a(LatLng latLng) {
        this.f46808a = latLng;
        return this;
    }

    /* renamed from: a */
    public final MarkerOptions mo43421a(C16769a aVar) {
        this.f46811d = aVar;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46808a, i, false);
        C15269a.m44457a(parcel, 3, this.f46809b, false);
        C15269a.m44457a(parcel, 4, this.f46810c, false);
        C15269a.m44450a(parcel, 5, this.f46811d == null ? null : this.f46811d.f46881a.asBinder(), false);
        C15269a.m44446a(parcel, 6, this.f46812e);
        C15269a.m44446a(parcel, 7, this.f46813f);
        C15269a.m44459a(parcel, 8, this.f46814g);
        C15269a.m44459a(parcel, 9, this.f46815h);
        C15269a.m44459a(parcel, 10, this.f46816i);
        C15269a.m44446a(parcel, 11, this.f46817j);
        C15269a.m44446a(parcel, 12, this.f46818k);
        C15269a.m44446a(parcel, 13, this.f46819l);
        C15269a.m44446a(parcel, 14, this.f46820m);
        C15269a.m44446a(parcel, 15, this.f46821n);
        C15269a.m44443a(parcel, a);
    }
}
