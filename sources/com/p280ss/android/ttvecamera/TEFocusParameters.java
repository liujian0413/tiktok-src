package com.p280ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ttvecamera.TEFocusParameters */
public class TEFocusParameters implements Parcelable {
    public static final Creator<TEFocusParameters> CREATOR = new Creator<TEFocusParameters>() {
        /* renamed from: a */
        private static TEFocusParameters[] m68035a(int i) {
            return new TEFocusParameters[i];
        }

        /* renamed from: a */
        private static TEFocusParameters m68034a(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m68034a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m68035a(i);
        }
    };

    /* renamed from: a */
    public Rect f55531a;

    /* renamed from: b */
    public Rect f55532b;

    /* renamed from: c */
    public int f55533c;

    /* renamed from: d */
    public int f55534d;

    public TEFocusParameters() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("active size is:");
        sb.append(this.f55531a.toString());
        sb.append(" crop size is: ");
        sb.append(this.f55532b.toString());
        sb.append("  max AF regions is: ");
        sb.append(this.f55533c);
        sb.append("  max AE regions is: ");
        sb.append(this.f55534d);
        return sb.toString();
    }

    public TEFocusParameters(Parcel parcel) {
        this.f55531a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f55533c = parcel.readInt();
        this.f55534d = parcel.readInt();
        this.f55532b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f55531a, i);
        parcel.writeInt(this.f55533c);
        parcel.writeInt(this.f55534d);
        parcel.writeParcelable(this.f55532b, i);
    }
}
