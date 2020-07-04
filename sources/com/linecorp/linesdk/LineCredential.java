package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineCredential implements Parcelable {
    public static final Creator<LineCredential> CREATOR = new Creator<LineCredential>() {
        /* renamed from: a */
        private static LineCredential[] m60975a(int i) {
            return new LineCredential[i];
        }

        /* renamed from: a */
        private static LineCredential m60974a(Parcel parcel) {
            return new LineCredential(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m60974a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m60975a(i);
        }
    };

    /* renamed from: a */
    public final LineAccessToken f50180a;

    /* renamed from: b */
    public final List<String> f50181b;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.f50180a.hashCode() * 31) + this.f50181b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineCredential{accessToken=");
        sb.append("#####");
        sb.append(", permission=");
        sb.append(this.f50181b);
        sb.append('}');
        return sb.toString();
    }

    private LineCredential(Parcel parcel) {
        this.f50180a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f50181b = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (!this.f50180a.equals(lineCredential.f50180a)) {
            return false;
        }
        return this.f50181b.equals(lineCredential.f50181b);
    }

    public LineCredential(LineAccessToken lineAccessToken, List<String> list) {
        this.f50180a = lineAccessToken;
        this.f50181b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f50180a, i);
        parcel.writeStringList(this.f50181b);
    }
}
