package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCountry */
public class VKApiCountry extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiCountry> CREATOR = new Creator<VKApiCountry>() {
        /* renamed from: a */
        private static VKApiCountry[] m147467a(int i) {
            return new VKApiCountry[i];
        }

        /* renamed from: a */
        private static VKApiCountry m147466a(Parcel parcel) {
            return new VKApiCountry(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147466a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147467a(i);
        }
    };

    /* renamed from: a */
    public int f121055a;

    /* renamed from: b */
    public String f121056b;

    public VKApiCountry() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121056b;
    }

    public VKApiCountry(Parcel parcel) {
        this.f121055a = parcel.readInt();
        this.f121056b = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiCountry mo118445b(JSONObject jSONObject) {
        this.f121055a = jSONObject.optInt("id");
        this.f121056b = jSONObject.optString("title");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121055a);
        parcel.writeString(this.f121056b);
    }
}
