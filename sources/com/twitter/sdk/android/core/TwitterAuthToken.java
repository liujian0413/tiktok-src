package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;

public class TwitterAuthToken extends C46820a implements Parcelable {
    public static final Creator<TwitterAuthToken> CREATOR = new Creator<TwitterAuthToken>() {
        /* renamed from: a */
        private static TwitterAuthToken[] m146470a(int i) {
            return new TwitterAuthToken[i];
        }

        /* renamed from: a */
        private static TwitterAuthToken m146469a(Parcel parcel) {
            return new TwitterAuthToken(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m146469a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m146470a(i);
        }
    };
    @C6593c(mo15949a = "token")

    /* renamed from: b */
    public final String f120106b;
    @C6593c(mo15949a = "secret")

    /* renamed from: c */
    public final String f120107c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f120106b != null) {
            i = this.f120106b.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f120107c != null) {
            i2 = this.f120107c.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("token=");
        sb.append(this.f120106b);
        sb.append(",secret=");
        sb.append(this.f120107c);
        return sb.toString();
    }

    private TwitterAuthToken(Parcel parcel) {
        this.f120106b = parcel.readString();
        this.f120107c = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAuthToken)) {
            return false;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) obj;
        if (this.f120107c == null ? twitterAuthToken.f120107c != null : !this.f120107c.equals(twitterAuthToken.f120107c)) {
            return false;
        }
        if (this.f120106b == null ? twitterAuthToken.f120106b == null : this.f120106b.equals(twitterAuthToken.f120106b)) {
            return true;
        }
        return false;
    }

    public TwitterAuthToken(String str, String str2) {
        this.f120106b = str;
        this.f120107c = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120106b);
        parcel.writeString(this.f120107c);
    }
}
