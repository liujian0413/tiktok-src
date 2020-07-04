package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.internal.p763e.C16369b;
import com.google.android.gms.internal.p763e.C16370c;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<TileOverlayOptions> CREATOR = new C16792x();

    /* renamed from: a */
    public C16772d f46870a;

    /* renamed from: b */
    public boolean f46871b = true;

    /* renamed from: c */
    public float f46872c;

    /* renamed from: d */
    public boolean f46873d = true;

    /* renamed from: e */
    public float f46874e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C16369b f46875f;

    public TileOverlayOptions() {
    }

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.f46875f = C16370c.m53337a(iBinder);
        this.f46870a = this.f46875f == null ? null : new C16791w(this);
        this.f46871b = z;
        this.f46872c = f;
        this.f46873d = z2;
        this.f46874e = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44450a(parcel, 2, this.f46875f.asBinder(), false);
        C15269a.m44459a(parcel, 3, this.f46871b);
        C15269a.m44446a(parcel, 4, this.f46872c);
        C15269a.m44459a(parcel, 5, this.f46873d);
        C15269a.m44446a(parcel, 6, this.f46874e);
        C15269a.m44443a(parcel, a);
    }
}
