package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzbr implements Parcelable {
    public static final Creator<zzbr> CREATOR = new C16394an();

    /* renamed from: a */
    public String f46671a;

    /* renamed from: b */
    public String f46672b;

    /* renamed from: c */
    private String f46673c;

    public final int describeContents() {
        return 0;
    }

    public zzbr() {
    }

    zzbr(Parcel parcel) {
        this.f46671a = parcel.readString();
        this.f46673c = parcel.readString();
        this.f46672b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46671a);
        parcel.writeString(this.f46673c);
        parcel.writeString(this.f46672b);
    }
}
