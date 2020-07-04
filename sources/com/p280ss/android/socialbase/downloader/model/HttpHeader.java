package com.p280ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.socialbase.downloader.model.HttpHeader */
public class HttpHeader implements Parcelable {
    public static final Creator<HttpHeader> CREATOR = new Creator<HttpHeader>() {
        /* renamed from: a */
        private static HttpHeader[] m67453a(int i) {
            return new HttpHeader[i];
        }

        /* renamed from: a */
        private static HttpHeader m67452a(Parcel parcel) {
            return new HttpHeader(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m67452a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m67453a(i);
        }
    };

    /* renamed from: a */
    public final String f54980a;

    /* renamed from: b */
    public final String f54981b;

    public int describeContents() {
        return 0;
    }

    protected HttpHeader(Parcel parcel) {
        this.f54980a = parcel.readString();
        this.f54981b = parcel.readString();
    }

    public HttpHeader(String str, String str2) {
        this.f54980a = str;
        this.f54981b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54980a);
        parcel.writeString(this.f54981b);
    }
}
