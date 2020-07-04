package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiDialog */
public class VKApiDialog extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiDialog> CREATOR = new Creator<VKApiDialog>() {
        /* renamed from: a */
        private static VKApiDialog[] m147471a(int i) {
            return new VKApiDialog[i];
        }

        /* renamed from: a */
        private static VKApiDialog m147470a(Parcel parcel) {
            return new VKApiDialog(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147470a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147471a(i);
        }
    };

    /* renamed from: a */
    public int f121057a;

    /* renamed from: b */
    public VKApiMessage f121058b;

    public VKApiDialog() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiDialog(Parcel parcel) {
        this.f121057a = parcel.readInt();
        this.f121058b = (VKApiMessage) parcel.readParcelable(VKApiMessage.class.getClassLoader());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiDialog mo118445b(JSONObject jSONObject) throws JSONException {
        this.f121057a = jSONObject.optInt("unread");
        this.f121058b = new VKApiMessage(jSONObject.optJSONObject("message"));
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121057a);
        parcel.writeParcelable(this.f121058b, i);
    }
}
