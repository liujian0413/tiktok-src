package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VkAudioArray */
public class VkAudioArray extends VKList<VKApiAudio> {
    public static Creator<VkAudioArray> CREATOR = new Creator<VkAudioArray>() {
        /* renamed from: a */
        private static VkAudioArray[] m147649a(int i) {
            return new VkAudioArray[i];
        }

        /* renamed from: a */
        private static VkAudioArray m147648a(Parcel parcel) {
            return new VkAudioArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147648a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147649a(i);
        }
    };

    public VkAudioArray() {
    }

    public VkAudioArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiAudio.class);
        return this;
    }
}
