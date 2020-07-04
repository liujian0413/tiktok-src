package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzfv extends AbstractSafeParcelable {
    public static final Creator<zzfv> CREATOR = new C16920ek();

    /* renamed from: a */
    public final String f47522a;

    /* renamed from: b */
    public final long f47523b;

    /* renamed from: c */
    public final Long f47524c;

    /* renamed from: d */
    public final String f47525d;

    /* renamed from: e */
    public final String f47526e;

    /* renamed from: f */
    public final Double f47527f;

    /* renamed from: g */
    private final int f47528g;

    /* renamed from: h */
    private final Float f47529h;

    zzfv(C16921el elVar) {
        this(elVar.f47317c, elVar.f47318d, elVar.f47319e, elVar.f47316b);
    }

    zzfv(String str, long j, Object obj, String str2) {
        C15267r.m44386a(str);
        this.f47528g = 2;
        this.f47522a = str;
        this.f47523b = j;
        this.f47526e = str2;
        if (obj == null) {
            this.f47524c = null;
            this.f47529h = null;
            this.f47527f = null;
            this.f47525d = null;
        } else if (obj instanceof Long) {
            this.f47524c = (Long) obj;
            this.f47529h = null;
            this.f47527f = null;
            this.f47525d = null;
        } else if (obj instanceof String) {
            this.f47524c = null;
            this.f47529h = null;
            this.f47527f = null;
            this.f47525d = (String) obj;
        } else if (obj instanceof Double) {
            this.f47524c = null;
            this.f47529h = null;
            this.f47527f = (Double) obj;
            this.f47525d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f47528g = i;
        this.f47522a = str;
        this.f47523b = j;
        this.f47524c = l;
        if (i == 1) {
            this.f47527f = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f47527f = d;
        }
        this.f47525d = str2;
        this.f47526e = str3;
    }

    /* renamed from: a */
    public final Object mo44178a() {
        if (this.f47524c != null) {
            return this.f47524c;
        }
        if (this.f47527f != null) {
            return this.f47527f;
        }
        if (this.f47525d != null) {
            return this.f47525d;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f47528g);
        C15269a.m44457a(parcel, 2, this.f47522a, false);
        C15269a.m44448a(parcel, 3, this.f47523b);
        C15269a.m44456a(parcel, 4, this.f47524c, false);
        C15269a.m44454a(parcel, 5, (Float) null, false);
        C15269a.m44457a(parcel, 6, this.f47525d, false);
        C15269a.m44457a(parcel, 7, this.f47526e, false);
        C15269a.m44453a(parcel, 8, this.f47527f, false);
        C15269a.m44443a(parcel, a);
    }
}
