package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LineApiError implements Parcelable {
    public static final Creator<LineApiError> CREATOR = new Creator<LineApiError>() {
        /* renamed from: a */
        private static LineApiError[] m60973a(int i) {
            return new LineApiError[i];
        }

        /* renamed from: a */
        private static LineApiError m60972a(Parcel parcel) {
            return new LineApiError(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m60972a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m60973a(i);
        }
    };

    /* renamed from: a */
    public static final LineApiError f50177a = new LineApiError(-1, "");

    /* renamed from: b */
    public final int f50178b;

    /* renamed from: c */
    public final String f50179c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = this.f50178b * 31;
        if (this.f50179c != null) {
            i = this.f50179c.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineApiError{httpResponseCode=");
        sb.append(this.f50178b);
        sb.append(", message='");
        sb.append(this.f50179c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private LineApiError(Parcel parcel) {
        this.f50178b = parcel.readInt();
        this.f50179c = parcel.readString();
    }

    /* renamed from: a */
    private static String m60971a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a((Throwable) exc, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public LineApiError(Exception exc) {
        this(-1, m60971a(exc));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        if (this.f50178b != lineApiError.f50178b) {
            return false;
        }
        if (this.f50179c != null) {
            return this.f50179c.equals(lineApiError.f50179c);
        }
        if (lineApiError.f50179c == null) {
            return true;
        }
        return false;
    }

    public LineApiError(String str) {
        this(-1, str);
    }

    public LineApiError(int i, Exception exc) {
        this(i, m60971a(exc));
    }

    public LineApiError(int i, String str) {
        this.f50178b = i;
        this.f50179c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50178b);
        parcel.writeString(this.f50179c);
    }
}
