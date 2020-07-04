package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class zzpn implements Parcelable {
    public static final Creator<zzpn> CREATOR = new bpd();

    /* renamed from: a */
    private final zza[] f45745a;

    public interface zza extends Parcelable {
    }

    public zzpn(List<? extends zza> list) {
        this.f45745a = new zza[list.size()];
        list.toArray(this.f45745a);
    }

    public final int describeContents() {
        return 0;
    }

    zzpn(Parcel parcel) {
        this.f45745a = new zza[parcel.readInt()];
        for (int i = 0; i < this.f45745a.length; i++) {
            this.f45745a[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final int mo42370a() {
        return this.f45745a.length;
    }

    /* renamed from: a */
    public final zza mo42371a(int i) {
        return this.f45745a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45745a, ((zzpn) obj).f45745a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45745a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45745a.length);
        for (zza writeParcelable : this.f45745a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
