package com.p280ss.android.ugc.aweme.account.login.authorize.platforms;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.ThirdPartyAuthInfo */
public class ThirdPartyAuthInfo implements Parcelable {
    public static final Creator<ThirdPartyAuthInfo> CREATOR = new Creator<ThirdPartyAuthInfo>() {
        /* renamed from: a */
        private static ThirdPartyAuthInfo[] m71737a(int i) {
            return new ThirdPartyAuthInfo[i];
        }

        /* renamed from: a */
        private static ThirdPartyAuthInfo m71736a(Parcel parcel) {
            return new ThirdPartyAuthInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71736a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71737a(i);
        }
    };

    /* renamed from: a */
    public String f57276a;

    /* renamed from: b */
    public long f57277b;

    /* renamed from: c */
    public String f57278c;

    /* renamed from: d */
    public String f57279d;

    /* renamed from: e */
    public String f57280e;

    /* renamed from: f */
    public int f57281f = -1;

    /* renamed from: g */
    public String f57282g = "";

    /* renamed from: h */
    public String f57283h = "";

    /* renamed from: i */
    public String f57284i = "";

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAuthInfo{token='");
        sb.append(this.f57276a);
        sb.append('\'');
        sb.append(", expires=");
        sb.append(this.f57277b);
        sb.append(", uid='");
        sb.append(this.f57278c);
        sb.append('\'');
        sb.append(", code='");
        sb.append(this.f57279d);
        sb.append('\'');
        sb.append(", secret='");
        sb.append(this.f57280e);
        sb.append('\'');
        sb.append(", verifyType=");
        sb.append(this.f57281f);
        sb.append(", verifyTicket='");
        sb.append(this.f57282g);
        sb.append('\'');
        sb.append(", platform='");
        sb.append(this.f57283h);
        sb.append('\'');
        sb.append(", profileKey='");
        sb.append(this.f57284i);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected ThirdPartyAuthInfo(Parcel parcel) {
        this.f57276a = parcel.readString();
        this.f57277b = parcel.readLong();
        this.f57278c = parcel.readString();
        this.f57279d = parcel.readString();
        this.f57280e = parcel.readString();
        this.f57281f = parcel.readInt();
        this.f57282g = parcel.readString();
        this.f57283h = parcel.readString();
        this.f57284i = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57276a);
        parcel.writeLong(this.f57277b);
        parcel.writeString(this.f57278c);
        parcel.writeString(this.f57279d);
        parcel.writeString(this.f57280e);
        parcel.writeInt(this.f57281f);
        parcel.writeString(this.f57282g);
        parcel.writeString(this.f57283h);
        parcel.writeString(this.f57284i);
    }
}
