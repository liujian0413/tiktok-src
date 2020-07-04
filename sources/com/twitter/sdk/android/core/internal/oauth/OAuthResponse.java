package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse implements Parcelable {
    public static final Creator<OAuthResponse> CREATOR = new Creator<OAuthResponse>() {
        /* renamed from: a */
        private static OAuthResponse[] m146657a(int i) {
            return new OAuthResponse[i];
        }

        /* renamed from: a */
        private static OAuthResponse m146656a(Parcel parcel) {
            return new OAuthResponse(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m146656a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m146657a(i);
        }
    };

    /* renamed from: a */
    public final TwitterAuthToken f120218a;

    /* renamed from: b */
    public final String f120219b;

    /* renamed from: c */
    public final long f120220c;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("authToken=");
        sb.append(this.f120218a);
        sb.append(",userName=");
        sb.append(this.f120219b);
        sb.append(",userId=");
        sb.append(this.f120220c);
        return sb.toString();
    }

    private OAuthResponse(Parcel parcel) {
        this.f120218a = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f120219b = parcel.readString();
        this.f120220c = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f120218a, i);
        parcel.writeString(this.f120219b);
        parcel.writeLong(this.f120220c);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String str, long j) {
        this.f120218a = twitterAuthToken;
        this.f120219b = str;
        this.f120220c = j;
    }
}
