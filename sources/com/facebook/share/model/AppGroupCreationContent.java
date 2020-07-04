package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppGroupCreationContent implements ShareModel {
    public static final Creator<AppGroupCreationContent> CREATOR = new Creator<AppGroupCreationContent>() {
        /* renamed from: a */
        private static AppGroupCreationContent[] m42070a(int i) {
            return new AppGroupCreationContent[i];
        }

        /* renamed from: a */
        private static AppGroupCreationContent m42069a(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42069a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42070a(i);
        }
    };

    /* renamed from: a */
    public final String f37570a;

    /* renamed from: b */
    public final String f37571b;

    /* renamed from: c */
    public AppGroupPrivacy f37572c;

    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    public final int describeContents() {
        return 0;
    }

    AppGroupCreationContent(Parcel parcel) {
        this.f37570a = parcel.readString();
        this.f37571b = parcel.readString();
        this.f37572c = (AppGroupPrivacy) parcel.readSerializable();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37570a);
        parcel.writeString(this.f37571b);
        parcel.writeSerializable(this.f37572c);
    }
}
