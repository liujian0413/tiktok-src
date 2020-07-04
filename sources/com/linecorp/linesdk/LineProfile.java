package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LineProfile implements Parcelable {
    public static final Creator<LineProfile> CREATOR = new Creator<LineProfile>() {
        /* renamed from: a */
        private static LineProfile[] m60977a(int i) {
            return new LineProfile[i];
        }

        /* renamed from: a */
        private static LineProfile m60976a(Parcel parcel) {
            return new LineProfile(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m60976a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m60977a(i);
        }
    };

    /* renamed from: a */
    public final String f50182a;

    /* renamed from: b */
    public final String f50183b;

    /* renamed from: c */
    public final Uri f50184c;

    /* renamed from: d */
    public final String f50185d;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f50182a.hashCode() * 31) + this.f50183b.hashCode()) * 31;
        int i2 = 0;
        if (this.f50184c != null) {
            i = this.f50184c.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (this.f50185d != null) {
            i2 = this.f50185d.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineProfile{displayName='");
        sb.append(this.f50183b);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.f50182a);
        sb.append('\'');
        sb.append(", pictureUrl='");
        sb.append(this.f50184c);
        sb.append('\'');
        sb.append(", statusMessage='");
        sb.append(this.f50185d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private LineProfile(Parcel parcel) {
        this.f50182a = parcel.readString();
        this.f50183b = parcel.readString();
        this.f50184c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f50185d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineProfile lineProfile = (LineProfile) obj;
        if (!this.f50182a.equals(lineProfile.f50182a) || !this.f50183b.equals(lineProfile.f50183b)) {
            return false;
        }
        if (this.f50184c == null ? lineProfile.f50184c != null : !this.f50184c.equals(lineProfile.f50184c)) {
            return false;
        }
        if (this.f50185d != null) {
            return this.f50185d.equals(lineProfile.f50185d);
        }
        if (lineProfile.f50185d == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50182a);
        parcel.writeString(this.f50183b);
        parcel.writeParcelable(this.f50184c, i);
        parcel.writeString(this.f50185d);
    }

    public LineProfile(String str, String str2, Uri uri, String str3) {
        this.f50182a = str;
        this.f50183b = str2;
        this.f50184c = uri;
        this.f50185d = str3;
    }
}
