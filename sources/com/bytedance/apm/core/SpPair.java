package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SpPair implements Parcelable {
    public static final Creator<SpPair> CREATOR = new Creator<SpPair>() {
        /* renamed from: a */
        private static SpPair[] m28387a(int i) {
            return new SpPair[i];
        }

        /* renamed from: a */
        private static SpPair m28386a(Parcel parcel) {
            return new SpPair(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28386a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28387a(i);
        }
    };

    /* renamed from: a */
    public String f26209a;

    /* renamed from: b */
    public Object f26210b;

    public int describeContents() {
        return 0;
    }

    protected SpPair(Parcel parcel) {
        this.f26209a = parcel.readString();
        this.f26210b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f26209a = str;
        this.f26210b = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26209a);
        parcel.writeValue(this.f26210b);
    }
}
