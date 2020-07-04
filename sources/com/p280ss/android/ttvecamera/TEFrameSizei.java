package com.p280ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ttvecamera.TEFrameSizei */
public class TEFrameSizei implements Parcelable {
    public static final Creator<TEFrameSizei> CREATOR = new Creator<TEFrameSizei>() {
        /* renamed from: a */
        private static TEFrameSizei[] m68038a(int i) {
            return new TEFrameSizei[i];
        }

        /* renamed from: a */
        private static TEFrameSizei m68037a(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m68037a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m68038a(i);
        }
    };

    /* renamed from: a */
    public int f55535a = 720;

    /* renamed from: b */
    public int f55536b = 1280;

    public int describeContents() {
        return 0;
    }

    public TEFrameSizei() {
    }

    /* renamed from: a */
    public final boolean mo55603a() {
        if (this.f55535a <= 0 || this.f55536b <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f55535a * 65537) + 1 + this.f55536b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55535a);
        sb.append("x");
        sb.append(this.f55536b);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.f55535a == tEFrameSizei.f55535a && this.f55536b == tEFrameSizei.f55536b) {
            return true;
        }
        return false;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f55535a = parcel.readInt();
        this.f55536b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55535a);
        parcel.writeInt(this.f55536b);
    }

    public TEFrameSizei(int i, int i2) {
        this.f55535a = i;
        this.f55536b = i2;
    }
}
