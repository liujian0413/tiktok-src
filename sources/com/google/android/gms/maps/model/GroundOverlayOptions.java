package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.dynamic.C15345b.C15346a;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<GroundOverlayOptions> CREATOR = new C16776h();

    /* renamed from: a */
    public C16769a f46786a;

    /* renamed from: b */
    public LatLng f46787b;

    /* renamed from: c */
    public float f46788c;

    /* renamed from: d */
    public float f46789d;

    /* renamed from: e */
    public LatLngBounds f46790e;

    /* renamed from: f */
    public float f46791f;

    /* renamed from: g */
    public float f46792g;

    /* renamed from: h */
    public boolean f46793h = true;

    /* renamed from: i */
    public float f46794i;

    /* renamed from: j */
    public float f46795j = 0.5f;

    /* renamed from: k */
    public float f46796k = 0.5f;

    /* renamed from: l */
    public boolean f46797l;

    public GroundOverlayOptions() {
    }

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f46786a = new C16769a(C15346a.m44656a(iBinder));
        this.f46787b = latLng;
        this.f46788c = f;
        this.f46789d = f2;
        this.f46790e = latLngBounds;
        this.f46791f = f3;
        this.f46792g = f4;
        this.f46793h = z;
        this.f46794i = f5;
        this.f46795j = f6;
        this.f46796k = f7;
        this.f46797l = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44450a(parcel, 2, this.f46786a.f46881a.asBinder(), false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f46787b, i, false);
        C15269a.m44446a(parcel, 4, this.f46788c);
        C15269a.m44446a(parcel, 5, this.f46789d);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f46790e, i, false);
        C15269a.m44446a(parcel, 7, this.f46791f);
        C15269a.m44446a(parcel, 8, this.f46792g);
        C15269a.m44459a(parcel, 9, this.f46793h);
        C15269a.m44446a(parcel, 10, this.f46794i);
        C15269a.m44446a(parcel, 11, this.f46795j);
        C15269a.m44446a(parcel, 12, this.f46796k);
        C15269a.m44459a(parcel, 13, this.f46797l);
        C15269a.m44443a(parcel, a);
    }
}
