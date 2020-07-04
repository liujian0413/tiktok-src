package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TwitterAuthConfig implements Parcelable {
    public static final Creator<TwitterAuthConfig> CREATOR = new Creator<TwitterAuthConfig>() {
        /* renamed from: a */
        private static TwitterAuthConfig[] m146468a(int i) {
            return new TwitterAuthConfig[i];
        }

        /* renamed from: a */
        private static TwitterAuthConfig m146467a(Parcel parcel) {
            return new TwitterAuthConfig(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m146467a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m146468a(i);
        }
    };

    /* renamed from: a */
    public final String f120104a;

    /* renamed from: b */
    public final String f120105b;

    public int describeContents() {
        return 0;
    }

    private TwitterAuthConfig(Parcel parcel) {
        this.f120104a = parcel.readString();
        this.f120105b = parcel.readString();
    }

    /* renamed from: a */
    private static String m146466a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120104a);
        parcel.writeString(this.f120105b);
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.f120104a = m146466a(str);
        this.f120105b = m146466a(str2);
    }
}
