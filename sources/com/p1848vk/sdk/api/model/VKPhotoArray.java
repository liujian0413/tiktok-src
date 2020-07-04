package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPhotoArray */
public class VKPhotoArray extends VKList<VKApiPhoto> {
    public static Creator<VKPhotoArray> CREATOR = new Creator<VKPhotoArray>() {
        /* renamed from: a */
        private static VKPhotoArray[] m147630a(int i) {
            return new VKPhotoArray[i];
        }

        /* renamed from: a */
        private static VKPhotoArray m147629a(Parcel parcel) {
            return new VKPhotoArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147629a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147630a(i);
        }
    };

    public VKPhotoArray() {
    }

    public VKPhotoArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiPhoto.class);
        return this;
    }
}
