package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPostedPhoto */
public class VKApiPostedPhoto extends VKApiPhoto {
    public static Creator<VKApiPostedPhoto> CREATOR = new Creator<VKApiPostedPhoto>() {
        /* renamed from: a */
        private static VKApiPostedPhoto[] m147555a(int i) {
            return new VKApiPostedPhoto[i];
        }

        /* renamed from: a */
        private static VKApiPostedPhoto m147554a(Parcel parcel) {
            return new VKApiPostedPhoto(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147554a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147555a(i);
        }
    };

    public VKApiPostedPhoto() {
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "posted_photo";
    }

    /* renamed from: c */
    public final VKApiPostedPhoto mo118445b(JSONObject jSONObject) {
        super.mo118445b(jSONObject);
        return this;
    }

    public VKApiPostedPhoto(Parcel parcel) {
        super(parcel);
    }
}
