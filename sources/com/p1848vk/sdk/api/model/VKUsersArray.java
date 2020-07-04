package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKUsersArray */
public class VKUsersArray extends VKList<VKApiUserFull> {
    public static Creator<VKUsersArray> CREATOR = new Creator<VKUsersArray>() {
        /* renamed from: a */
        private static VKUsersArray[] m147644a(int i) {
            return new VKUsersArray[i];
        }

        /* renamed from: a */
        private static VKUsersArray m147643a(Parcel parcel) {
            return new VKUsersArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147643a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147644a(i);
        }
    };

    public VKUsersArray() {
    }

    public VKUsersArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiUserFull.class);
        return this;
    }
}
