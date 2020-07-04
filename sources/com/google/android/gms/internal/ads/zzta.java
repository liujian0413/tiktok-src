package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzta implements Parcelable {
    public static final Creator<zzta> CREATOR = new bsk();

    /* renamed from: a */
    public final int f45756a;

    /* renamed from: b */
    public final int f45757b;

    /* renamed from: c */
    public final int f45758c;

    /* renamed from: d */
    public final byte[] f45759d;

    /* renamed from: e */
    private int f45760e;

    public zzta(int i, int i2, int i3, byte[] bArr) {
        this.f45756a = i;
        this.f45757b = i2;
        this.f45758c = i3;
        this.f45759d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    zzta(Parcel parcel) {
        this.f45756a = parcel.readInt();
        this.f45757b = parcel.readInt();
        this.f45758c = parcel.readInt();
        this.f45759d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzta zzta = (zzta) obj;
        return this.f45756a == zzta.f45756a && this.f45757b == zzta.f45757b && this.f45758c == zzta.f45758c && Arrays.equals(this.f45759d, zzta.f45759d);
    }

    public final String toString() {
        int i = this.f45756a;
        int i2 = this.f45757b;
        int i3 = this.f45758c;
        boolean z = this.f45759d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f45760e == 0) {
            this.f45760e = ((((((this.f45756a + 527) * 31) + this.f45757b) * 31) + this.f45758c) * 31) + Arrays.hashCode(this.f45759d);
        }
        return this.f45760e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45756a);
        parcel.writeInt(this.f45757b);
        parcel.writeInt(this.f45758c);
        parcel.writeInt(this.f45759d != null ? 1 : 0);
        if (this.f45759d != null) {
            parcel.writeByteArray(this.f45759d);
        }
    }
}
