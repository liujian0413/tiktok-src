package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzpv extends zzpu {
    public static final Creator<zzpv> CREATOR = new bph();

    /* renamed from: a */
    private final String f45754a;

    /* renamed from: b */
    private final String f45755b;

    public zzpv(String str, String str2, String str3) {
        super(str);
        this.f45755b = str3;
    }

    zzpv(Parcel parcel) {
        super(parcel.readString());
        this.f45754a = parcel.readString();
        this.f45755b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpv zzpv = (zzpv) obj;
        return this.f45753c.equals(zzpv.f45753c) && bsf.m49941a((Object) this.f45754a, (Object) zzpv.f45754a) && bsf.m49941a((Object) this.f45755b, (Object) zzpv.f45755b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f45753c.hashCode() + 527) * 31) + (this.f45754a != null ? this.f45754a.hashCode() : 0)) * 31;
        if (this.f45755b != null) {
            i = this.f45755b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45753c);
        parcel.writeString(this.f45754a);
        parcel.writeString(this.f45755b);
    }
}
