package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKNotesArray */
public class VKNotesArray extends VKList<VKApiNote> {
    public static Creator<VKNotesArray> CREATOR = new Creator<VKNotesArray>() {
        /* renamed from: a */
        private static VKNotesArray[] m147627a(int i) {
            return new VKNotesArray[i];
        }

        /* renamed from: a */
        private static VKNotesArray m147626a(Parcel parcel) {
            return new VKNotesArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147626a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147627a(i);
        }
    };

    public VKNotesArray() {
    }

    public VKNotesArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        mo118623a(jSONObject, VKApiNote.class);
        return this;
    }
}
