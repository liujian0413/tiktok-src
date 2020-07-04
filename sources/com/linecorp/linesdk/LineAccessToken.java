package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LineAccessToken implements Parcelable {
    public static final Creator<LineAccessToken> CREATOR = new Creator<LineAccessToken>() {
        /* renamed from: a */
        private static LineAccessToken[] m60970a(int i) {
            return new LineAccessToken[i];
        }

        /* renamed from: a */
        private static LineAccessToken m60969a(Parcel parcel) {
            return new LineAccessToken(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m60969a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m60970a(i);
        }
    };

    /* renamed from: a */
    public final String f50174a;

    /* renamed from: b */
    public final long f50175b;

    /* renamed from: c */
    public final long f50176c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((this.f50174a.hashCode() * 31) + ((int) (this.f50175b ^ (this.f50175b >>> 32)))) * 31) + ((int) (this.f50176c ^ (this.f50176c >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.f50175b);
        sb.append(", issuedClientTimeMillis=");
        sb.append(this.f50176c);
        sb.append('}');
        return sb.toString();
    }

    private LineAccessToken(Parcel parcel) {
        this.f50174a = parcel.readString();
        this.f50175b = parcel.readLong();
        this.f50176c = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.f50175b == lineAccessToken.f50175b && this.f50176c == lineAccessToken.f50176c) {
            return this.f50174a.equals(lineAccessToken.f50174a);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50174a);
        parcel.writeLong(this.f50175b);
        parcel.writeLong(this.f50176c);
    }

    public LineAccessToken(String str, long j, long j2) {
        this.f50174a = str;
        this.f50175b = j;
        this.f50176c = j2;
    }
}
