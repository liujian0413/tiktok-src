package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IntegerParcelable implements Parcelable {
    public static final Creator<IntegerParcelable> CREATOR = new Creator<IntegerParcelable>() {
        /* renamed from: a */
        private static IntegerParcelable[] m28960a(int i) {
            return new IntegerParcelable[i];
        }

        /* renamed from: a */
        private static IntegerParcelable m28959a(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28959a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28960a(i);
        }
    };

    /* renamed from: a */
    public final int f26736a;

    public int describeContents() {
        return 0;
    }

    public IntegerParcelable(int i) {
        this.f26736a = i;
    }

    protected IntegerParcelable(Parcel parcel) {
        this.f26736a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26736a);
    }
}
