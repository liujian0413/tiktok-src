package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKDocsArray */
public class VKDocsArray extends VKList<VKApiDocument> {
    public static Creator<VKDocsArray> CREATOR = new Creator<VKDocsArray>() {
        /* renamed from: a */
        private static VKDocsArray[] m147609a(int i) {
            return new VKDocsArray[i];
        }

        /* renamed from: a */
        private static VKDocsArray m147608a(Parcel parcel) {
            return new VKDocsArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147608a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147609a(i);
        }
    };

    public VKDocsArray() {
    }

    public VKDocsArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiDocument.class);
        return this;
    }
}
