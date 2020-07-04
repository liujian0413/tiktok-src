package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiGetMessagesResponse */
public class VKApiGetMessagesResponse extends VKApiModel implements Parcelable {
    public static Creator<VKApiGetMessagesResponse> CREATOR = new Creator<VKApiGetMessagesResponse>() {
        /* renamed from: a */
        private static VKApiGetMessagesResponse[] m147485a(int i) {
            return new VKApiGetMessagesResponse[i];
        }

        /* renamed from: a */
        private static VKApiGetMessagesResponse m147484a(Parcel parcel) {
            return new VKApiGetMessagesResponse(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147484a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147485a(i);
        }
    };

    /* renamed from: a */
    public int f121075a;

    /* renamed from: b */
    public VKList<VKApiMessage> f121076b;

    public VKApiGetMessagesResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiGetMessagesResponse(Parcel parcel) {
        this.f121075a = parcel.readInt();
        this.f121076b = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiGetMessagesResponse mo118445b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        this.f121075a = optJSONObject.optInt("count");
        this.f121076b = new VKList<>(optJSONObject.optJSONArray("items"), VKApiMessage.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121075a);
        parcel.writeParcelable(this.f121076b, i);
    }
}
