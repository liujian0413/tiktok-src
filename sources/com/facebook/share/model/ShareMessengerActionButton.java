package com.facebook.share.model;

import android.os.Parcel;

public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a */
    public final String f37619a;

    public int describeContents() {
        return 0;
    }

    ShareMessengerActionButton(Parcel parcel) {
        this.f37619a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37619a);
    }
}
