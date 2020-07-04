package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

public class LineLoginResult implements Parcelable {
    public static final Creator<LineLoginResult> CREATOR = new Creator<LineLoginResult>() {
        /* renamed from: a */
        private static LineLoginResult[] m61020a(int i) {
            return new LineLoginResult[i];
        }

        /* renamed from: a */
        private static LineLoginResult m61019a(Parcel parcel) {
            return new LineLoginResult(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m61019a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m61020a(i);
        }
    };

    /* renamed from: a */
    public static final LineLoginResult f50244a = new LineLoginResult(LineApiResponseCode.CANCEL, LineApiError.f50177a);

    /* renamed from: b */
    public final LineApiResponseCode f50245b;

    /* renamed from: c */
    public final LineProfile f50246c;

    /* renamed from: d */
    public final LineCredential f50247d;

    /* renamed from: e */
    public final LineApiError f50248e;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f50245b.hashCode() * 31;
        int i2 = 0;
        if (this.f50246c != null) {
            i = this.f50246c.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (this.f50247d != null) {
            i2 = this.f50247d.hashCode();
        }
        return ((i3 + i2) * 31) + this.f50248e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineLoginResult{errorData=");
        sb.append(this.f50248e);
        sb.append(", responseCode=");
        sb.append(this.f50245b);
        sb.append(", lineProfile=");
        sb.append(this.f50246c);
        sb.append(", lineCredential=");
        sb.append(this.f50247d);
        sb.append('}');
        return sb.toString();
    }

    private LineLoginResult(Parcel parcel) {
        this.f50245b = (LineApiResponseCode) parcel.readSerializable();
        this.f50246c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.f50247d = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.f50248e = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.f50245b != lineLoginResult.f50245b) {
            return false;
        }
        if (this.f50246c == null ? lineLoginResult.f50246c != null : !this.f50246c.equals(lineLoginResult.f50246c)) {
            return false;
        }
        if (this.f50247d == null ? lineLoginResult.f50247d == null : this.f50247d.equals(lineLoginResult.f50247d)) {
            return this.f50248e.equals(lineLoginResult.f50248e);
        }
        return false;
    }

    public LineLoginResult(LineApiResponseCode lineApiResponseCode, LineApiError lineApiError) {
        this(lineApiResponseCode, null, null, lineApiError);
    }

    public LineLoginResult(LineProfile lineProfile, LineCredential lineCredential) {
        this(LineApiResponseCode.SUCCESS, lineProfile, lineCredential, LineApiError.f50177a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f50245b);
        parcel.writeParcelable(this.f50246c, i);
        parcel.writeParcelable(this.f50247d, i);
        parcel.writeParcelable(this.f50248e, i);
    }

    private LineLoginResult(LineApiResponseCode lineApiResponseCode, LineProfile lineProfile, LineCredential lineCredential, LineApiError lineApiError) {
        this.f50245b = lineApiResponseCode;
        this.f50246c = lineProfile;
        this.f50247d = lineCredential;
        this.f50248e = lineApiError;
    }
}
