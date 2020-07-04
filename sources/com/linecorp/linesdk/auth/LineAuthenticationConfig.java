package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class LineAuthenticationConfig implements Parcelable {
    public static final Creator<LineAuthenticationConfig> CREATOR = new Creator<LineAuthenticationConfig>() {
        /* renamed from: a */
        private static LineAuthenticationConfig[] m61014a(int i) {
            return new LineAuthenticationConfig[i];
        }

        /* renamed from: a */
        private static LineAuthenticationConfig m61013a(Parcel parcel) {
            return new LineAuthenticationConfig(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m61013a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m61014a(i);
        }
    };

    /* renamed from: f */
    private static int f50232f = 1;

    /* renamed from: g */
    private static int f50233g = 2;

    /* renamed from: a */
    public final String f50234a;

    /* renamed from: b */
    public final Uri f50235b;

    /* renamed from: c */
    public final Uri f50236c;

    /* renamed from: d */
    public final boolean f50237d;

    /* renamed from: e */
    public final boolean f50238e;

    /* renamed from: com.linecorp.linesdk.auth.LineAuthenticationConfig$a */
    public static class C18591a {

        /* renamed from: a */
        public final String f50239a;

        /* renamed from: b */
        public Uri f50240b;

        /* renamed from: c */
        public Uri f50241c;

        /* renamed from: d */
        public boolean f50242d;

        /* renamed from: e */
        public boolean f50243e;

        /* renamed from: a */
        public final LineAuthenticationConfig mo48758a() {
            return new LineAuthenticationConfig(this);
        }

        public C18591a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f50239a = str;
                this.f50240b = Uri.parse("https://access.line.me/v2");
                this.f50241c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
                return;
            }
            throw new IllegalArgumentException("channelId is empty.");
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((((this.f50234a.hashCode() * 31) + this.f50235b.hashCode()) * 31) + this.f50236c.hashCode()) * 31) + (this.f50237d ? 1 : 0)) * 31) + (this.f50238e ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineAuthenticationConfig{channelId=");
        sb.append(this.f50234a);
        sb.append(", endPointBaseUrl=");
        sb.append(this.f50235b);
        sb.append(", webLoginPageUrl=");
        sb.append(this.f50236c);
        sb.append(", isLineAppAuthenticationDisabled=");
        sb.append(this.f50237d);
        sb.append(", isEncryptorPreparationDisabled=");
        sb.append(this.f50238e);
        sb.append('}');
        return sb.toString();
    }

    private LineAuthenticationConfig(C18591a aVar) {
        this.f50234a = aVar.f50239a;
        this.f50235b = aVar.f50240b;
        this.f50236c = aVar.f50241c;
        this.f50237d = aVar.f50242d;
        this.f50238e = aVar.f50243e;
    }

    private LineAuthenticationConfig(Parcel parcel) {
        boolean z;
        this.f50234a = parcel.readString();
        this.f50235b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f50236c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z2 = false;
        if ((f50232f & readInt) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f50237d = z;
        if ((readInt & f50233g) > 0) {
            z2 = true;
        }
        this.f50238e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.f50237d == lineAuthenticationConfig.f50237d && this.f50238e == lineAuthenticationConfig.f50238e && this.f50234a.equals(lineAuthenticationConfig.f50234a) && this.f50235b.equals(lineAuthenticationConfig.f50235b)) {
            return this.f50236c.equals(lineAuthenticationConfig.f50236c);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f50234a);
        parcel.writeParcelable(this.f50235b, i);
        parcel.writeParcelable(this.f50236c, i);
        int i3 = 0;
        if (this.f50237d) {
            i2 = f50232f;
        } else {
            i2 = 0;
        }
        int i4 = i2 | 0;
        if (this.f50238e) {
            i3 = f50233g;
        }
        parcel.writeInt(i4 | i3);
    }
}
