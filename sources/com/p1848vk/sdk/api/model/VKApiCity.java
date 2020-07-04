package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCity */
public class VKApiCity extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiCity> CREATOR = new Creator<VKApiCity>() {
        /* renamed from: a */
        private static VKApiCity[] m147437a(int i) {
            return new VKApiCity[i];
        }

        /* renamed from: a */
        private static VKApiCity m147436a(Parcel parcel) {
            return new VKApiCity(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147436a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147437a(i);
        }
    };

    /* renamed from: a */
    public int f120999a;

    /* renamed from: b */
    public String f121000b;

    public VKApiCity() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121000b;
    }

    public VKApiCity(Parcel parcel) {
        this.f120999a = parcel.readInt();
        this.f121000b = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiCity mo118445b(JSONObject jSONObject) {
        this.f120999a = jSONObject.optInt("id");
        this.f121000b = jSONObject.optString("title");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120999a);
        parcel.writeString(this.f121000b);
    }
}
