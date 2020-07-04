package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiChat */
public class VKApiChat extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiChat> CREATOR = new Creator<VKApiChat>() {
        /* renamed from: a */
        private static VKApiChat[] m147433a(int i) {
            return new VKApiChat[i];
        }

        /* renamed from: a */
        private static VKApiChat m147432a(Parcel parcel) {
            return new VKApiChat(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147432a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147433a(i);
        }
    };

    /* renamed from: a */
    public int f120994a;

    /* renamed from: b */
    public String f120995b;

    /* renamed from: c */
    public String f120996c;

    /* renamed from: d */
    public int f120997d;

    /* renamed from: e */
    public int[] f120998e;

    public VKApiChat() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiChat(Parcel parcel) {
        this.f120994a = parcel.readInt();
        this.f120995b = parcel.readString();
        this.f120996c = parcel.readString();
        this.f120997d = parcel.readInt();
        this.f120998e = parcel.createIntArray();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiChat mo118445b(JSONObject jSONObject) {
        this.f120994a = jSONObject.optInt("id");
        this.f120995b = jSONObject.optString("type");
        this.f120996c = jSONObject.optString("title");
        this.f120997d = jSONObject.optInt("admin_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("users");
        if (optJSONArray != null) {
            this.f120998e = new int[optJSONArray.length()];
            for (int i = 0; i < this.f120998e.length; i++) {
                this.f120998e[i] = optJSONArray.optInt(i);
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120994a);
        parcel.writeString(this.f120995b);
        parcel.writeString(this.f120996c);
        parcel.writeInt(this.f120997d);
        parcel.writeIntArray(this.f120998e);
    }
}
