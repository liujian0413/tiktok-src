package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzpr extends zzpu {
    public static final Creator<zzpr> CREATOR = new bpf();

    /* renamed from: a */
    public final String f45750a;

    /* renamed from: b */
    public final String f45751b;

    /* renamed from: d */
    private final String f45752d;

    public zzpr(String str, String str2, String str3) {
        super("COMM");
        this.f45752d = str;
        this.f45750a = str2;
        this.f45751b = str3;
    }

    zzpr(Parcel parcel) {
        super("COMM");
        this.f45752d = parcel.readString();
        this.f45750a = parcel.readString();
        this.f45751b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpr zzpr = (zzpr) obj;
        return bsf.m49941a((Object) this.f45750a, (Object) zzpr.f45750a) && bsf.m49941a((Object) this.f45752d, (Object) zzpr.f45752d) && bsf.m49941a((Object) this.f45751b, (Object) zzpr.f45751b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f45752d != null ? this.f45752d.hashCode() : 0) + 527) * 31) + (this.f45750a != null ? this.f45750a.hashCode() : 0)) * 31;
        if (this.f45751b != null) {
            i = this.f45751b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45753c);
        parcel.writeString(this.f45752d);
        parcel.writeString(this.f45751b);
    }
}
