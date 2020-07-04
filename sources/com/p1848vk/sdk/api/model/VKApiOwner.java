package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiOwner */
public class VKApiOwner extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiOwner> CREATOR = new Creator<VKApiOwner>() {
        /* renamed from: a */
        private static VKApiOwner[] m147506a(int i) {
            return new VKApiOwner[i];
        }

        /* renamed from: a */
        private static VKApiOwner m147505a(Parcel parcel) {
            return new VKApiOwner(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147505a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147506a(i);
        }
    };

    /* renamed from: F */
    public int f121102F;

    public VKApiOwner() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiOwner(Parcel parcel) {
        this.f121102F = parcel.readInt();
    }

    /* renamed from: c */
    public VKApiOwner mo118445b(JSONObject jSONObject) {
        this.f121093E = jSONObject;
        this.f121102F = jSONObject.optInt("id");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121102F);
    }
}
