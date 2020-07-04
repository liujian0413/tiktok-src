package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VESize */
public class VESize implements Parcelable {
    public static final Creator<VESize> CREATOR = new Creator<VESize>() {
        /* renamed from: a */
        private static VESize[] m142689a(int i) {
            return new VESize[i];
        }

        /* renamed from: a */
        private static VESize m142688a(Parcel parcel) {
            return new VESize(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142688a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142689a(i);
        }
    };

    /* renamed from: a */
    public int f116385a = 720;

    /* renamed from: b */
    public int f116386b = 1280;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo108058a() {
        if (this.f116385a <= 0 || this.f116386b <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f116385a);
        sb.append("*");
        sb.append(this.f116386b);
        return sb.toString();
    }

    protected VESize(Parcel parcel) {
        this.f116385a = parcel.readInt();
        this.f116386b = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VESize)) {
            return false;
        }
        VESize vESize = (VESize) obj;
        if (this.f116385a == vESize.f116385a && this.f116386b == vESize.f116386b) {
            return true;
        }
        return false;
    }

    public VESize(int i, int i2) {
        this.f116385a = i;
        this.f116386b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f116385a);
        parcel.writeInt(this.f116386b);
    }
}
