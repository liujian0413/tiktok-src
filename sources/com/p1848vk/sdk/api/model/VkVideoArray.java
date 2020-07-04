package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VkVideoArray */
public class VkVideoArray extends VKList<VKApiVideo> {
    public static Creator<VkVideoArray> CREATOR = new Creator<VkVideoArray>() {
        /* renamed from: a */
        private static VkVideoArray[] m147652a(int i) {
            return new VkVideoArray[i];
        }

        /* renamed from: a */
        private static VkVideoArray m147651a(Parcel parcel) {
            return new VkVideoArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147651a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147652a(i);
        }
    };

    public VkVideoArray() {
    }

    public VkVideoArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiVideo.class);
        return this;
    }
}
