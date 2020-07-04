package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.dynamic.C15345b.C15346a;

public class Cap extends AbstractSafeParcelable {
    public static final Creator<Cap> CREATOR = new C16774f();

    /* renamed from: a */
    private static final String f46769a = "Cap";

    /* renamed from: b */
    private final int f46770b;

    /* renamed from: c */
    private final C16769a f46771c;

    /* renamed from: d */
    private final Float f46772d;

    protected Cap(int i) {
        this(i, (C16769a) null, (Float) null);
    }

    Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new C16769a(C15346a.m44656a(iBinder)), f);
    }

    private Cap(int i, C16769a aVar, Float f) {
        C15267r.m44395b(i != 3 || (aVar != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), C1642a.m8034a("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.f46770b = i;
        this.f46771c = aVar;
        this.f46772d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f46770b == cap.f46770b && C15265q.m44381a(this.f46771c, cap.f46771c) && C15265q.m44381a(this.f46772d, cap.f46772d);
    }

    public int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f46770b), this.f46771c, this.f46772d);
    }

    public String toString() {
        int i = this.f46770b;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 2, this.f46770b);
        C15269a.m44450a(parcel, 3, this.f46771c == null ? null : this.f46771c.f46881a.asBinder(), false);
        C15269a.m44454a(parcel, 4, this.f46772d, false);
        C15269a.m44443a(parcel, a);
    }
}
