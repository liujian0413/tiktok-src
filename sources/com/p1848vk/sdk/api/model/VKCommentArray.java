package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKCommentArray */
public class VKCommentArray extends VKList<VKApiComment> {
    public static Creator<VKCommentArray> CREATOR = new Creator<VKCommentArray>() {
        /* renamed from: a */
        private static VKCommentArray[] m147606a(int i) {
            return new VKCommentArray[i];
        }

        /* renamed from: a */
        private static VKCommentArray m147605a(Parcel parcel) {
            return new VKCommentArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147605a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147606a(i);
        }
    };

    public VKCommentArray() {
    }

    public VKCommentArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiComment.class);
        return this;
    }
}
