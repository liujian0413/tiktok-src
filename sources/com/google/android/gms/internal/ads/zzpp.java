package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzpp extends zzpu {
    public static final Creator<zzpp> CREATOR = new bpe();

    /* renamed from: a */
    private final String f45746a;

    /* renamed from: b */
    private final String f45747b;

    /* renamed from: d */
    private final int f45748d;

    /* renamed from: e */
    private final byte[] f45749e;

    public zzpp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f45746a = str;
        this.f45748d = 3;
        this.f45749e = bArr;
    }

    zzpp(Parcel parcel) {
        super("APIC");
        this.f45746a = parcel.readString();
        this.f45747b = parcel.readString();
        this.f45748d = parcel.readInt();
        this.f45749e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpp zzpp = (zzpp) obj;
        return this.f45748d == zzpp.f45748d && bsf.m49941a((Object) this.f45746a, (Object) zzpp.f45746a) && bsf.m49941a((Object) this.f45747b, (Object) zzpp.f45747b) && Arrays.equals(this.f45749e, zzpp.f45749e);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f45748d + 527) * 31) + (this.f45746a != null ? this.f45746a.hashCode() : 0)) * 31;
        if (this.f45747b != null) {
            i = this.f45747b.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f45749e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45746a);
        parcel.writeString(this.f45747b);
        parcel.writeInt(this.f45748d);
        parcel.writeByteArray(this.f45749e);
    }
}
