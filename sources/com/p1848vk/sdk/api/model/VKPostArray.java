package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPostArray */
public class VKPostArray extends VKList<VKApiPost> {
    public static Creator<VKPostArray> CREATOR = new Creator<VKPostArray>() {
        /* renamed from: a */
        private static VKPostArray[] m147641a(int i) {
            return new VKPostArray[i];
        }

        /* renamed from: a */
        private static VKPostArray m147640a(Parcel parcel) {
            return new VKPostArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147640a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147641a(i);
        }
    };

    public VKPostArray() {
    }

    public VKPostArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiPost.class);
        return this;
    }
}
