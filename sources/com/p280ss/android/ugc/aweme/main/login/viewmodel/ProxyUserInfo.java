package com.p280ss.android.ugc.aweme.main.login.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.main.login.viewmodel.ProxyUserInfo */
public class ProxyUserInfo implements Parcelable {
    public static final Creator<ProxyUserInfo> CREATOR = new Creator<ProxyUserInfo>() {
        /* renamed from: a */
        private static ProxyUserInfo[] m106748a(int i) {
            return new ProxyUserInfo[i];
        }

        /* renamed from: a */
        private static ProxyUserInfo m106747a(Parcel parcel) {
            return new ProxyUserInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m106747a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m106748a(i);
        }
    };

    /* renamed from: a */
    public int f86026a;

    /* renamed from: b */
    public String f86027b;

    /* renamed from: c */
    public String f86028c;

    /* renamed from: d */
    public String f86029d;

    /* renamed from: e */
    public String f86030e;

    /* renamed from: f */
    public String f86031f;

    /* renamed from: g */
    public String f86032g;

    /* renamed from: h */
    public Boolean f86033h;

    /* renamed from: i */
    public Boolean f86034i;

    /* renamed from: j */
    public String f86035j;

    public int describeContents() {
        return 0;
    }

    protected ProxyUserInfo(Parcel parcel) {
        this.f86026a = parcel.readInt();
        this.f86027b = parcel.readString();
        this.f86028c = parcel.readString();
        this.f86029d = parcel.readString();
        this.f86030e = parcel.readString();
        this.f86031f = parcel.readString();
        this.f86032g = parcel.readString();
        this.f86033h = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f86034i = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f86035j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f86026a);
        parcel.writeString(this.f86027b);
        parcel.writeString(this.f86028c);
        parcel.writeString(this.f86029d);
        parcel.writeString(this.f86030e);
        parcel.writeString(this.f86031f);
        parcel.writeString(this.f86032g);
        parcel.writeValue(this.f86033h);
        parcel.writeValue(this.f86034i);
        parcel.writeString(this.f86035j);
    }
}
