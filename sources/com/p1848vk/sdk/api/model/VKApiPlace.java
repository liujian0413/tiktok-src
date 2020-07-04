package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPlace */
public class VKApiPlace extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiPlace> CREATOR = new Creator<VKApiPlace>() {
        /* renamed from: a */
        private static VKApiPlace[] m147533a(int i) {
            return new VKApiPlace[i];
        }

        /* renamed from: a */
        private static VKApiPlace m147532a(Parcel parcel) {
            return new VKApiPlace(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147532a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147533a(i);
        }
    };

    /* renamed from: a */
    public int f121139a;

    /* renamed from: b */
    public String f121140b;

    /* renamed from: c */
    public double f121141c;

    /* renamed from: d */
    public double f121142d;

    /* renamed from: e */
    public long f121143e;

    /* renamed from: f */
    public int f121144f;

    /* renamed from: g */
    public long f121145g;

    /* renamed from: h */
    public int f121146h;

    /* renamed from: i */
    public int f121147i;

    /* renamed from: j */
    public String f121148j;

    public VKApiPlace() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121148j;
    }

    public VKApiPlace(Parcel parcel) {
        this.f121139a = parcel.readInt();
        this.f121140b = parcel.readString();
        this.f121141c = parcel.readDouble();
        this.f121142d = parcel.readDouble();
        this.f121143e = parcel.readLong();
        this.f121144f = parcel.readInt();
        this.f121145g = parcel.readLong();
        this.f121146h = parcel.readInt();
        this.f121147i = parcel.readInt();
        this.f121148j = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiPlace mo118445b(JSONObject jSONObject) {
        this.f121139a = jSONObject.optInt("id");
        this.f121140b = jSONObject.optString("title");
        this.f121141c = jSONObject.optDouble("latitude");
        this.f121142d = jSONObject.optDouble("longitude");
        this.f121143e = jSONObject.optLong("created");
        this.f121144f = jSONObject.optInt("checkins");
        this.f121145g = jSONObject.optLong("updated");
        this.f121146h = jSONObject.optInt("country");
        this.f121147i = jSONObject.optInt("city");
        this.f121148j = jSONObject.optString("address");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121139a);
        parcel.writeString(this.f121140b);
        parcel.writeDouble(this.f121141c);
        parcel.writeDouble(this.f121142d);
        parcel.writeLong(this.f121143e);
        parcel.writeInt(this.f121144f);
        parcel.writeLong(this.f121145g);
        parcel.writeInt(this.f121146h);
        parcel.writeInt(this.f121147i);
        parcel.writeString(this.f121148j);
    }
}
