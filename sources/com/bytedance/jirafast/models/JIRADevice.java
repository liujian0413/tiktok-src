package com.bytedance.jirafast.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class JIRADevice implements Parcelable {
    public static final Creator<JIRADevice> CREATOR = new Creator<JIRADevice>() {
        /* renamed from: a */
        private static JIRADevice[] m35078a(int i) {
            return new JIRADevice[i];
        }

        /* renamed from: a */
        private static JIRADevice m35077a(Parcel parcel) {
            return new JIRADevice(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m35077a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m35078a(i);
        }
    };

    /* renamed from: a */
    public String f31923a;

    /* renamed from: b */
    public String f31924b;

    /* renamed from: c */
    public String f31925c;

    /* renamed from: d */
    public String f31926d;

    /* renamed from: e */
    public String f31927e;

    public JIRADevice() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device{os='");
        sb.append(this.f31923a);
        sb.append('\'');
        sb.append(", brand='");
        sb.append(this.f31924b);
        sb.append('\'');
        sb.append(", model='");
        sb.append(this.f31925c);
        sb.append('\'');
        sb.append(", osVersion='");
        sb.append(this.f31926d);
        sb.append('\'');
        sb.append(", resolution='");
        sb.append(this.f31927e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public JIRADevice(Parcel parcel) {
        this.f31923a = parcel.readString();
        this.f31924b = parcel.readString();
        this.f31925c = parcel.readString();
        this.f31926d = parcel.readString();
        this.f31927e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31923a);
        parcel.writeString(this.f31924b);
        parcel.writeString(this.f31925c);
        parcel.writeString(this.f31926d);
        parcel.writeString(this.f31927e);
    }
}
