package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiGetDialogResponse */
public class VKApiGetDialogResponse extends VKApiModel implements Parcelable {
    public static Creator<VKApiGetDialogResponse> CREATOR = new Creator<VKApiGetDialogResponse>() {
        /* renamed from: a */
        private static VKApiGetDialogResponse[] m147481a(int i) {
            return new VKApiGetDialogResponse[i];
        }

        /* renamed from: a */
        private static VKApiGetDialogResponse m147480a(Parcel parcel) {
            return new VKApiGetDialogResponse(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147480a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147481a(i);
        }
    };

    /* renamed from: a */
    public int f121072a;

    /* renamed from: b */
    public int f121073b;

    /* renamed from: c */
    public VKList<VKApiDialog> f121074c;

    public VKApiGetDialogResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiGetDialogResponse(Parcel parcel) {
        this.f121072a = parcel.readInt();
        this.f121073b = parcel.readInt();
        this.f121074c = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiGetDialogResponse mo118445b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        this.f121072a = optJSONObject.optInt("count");
        this.f121073b = optJSONObject.optInt("unread_dialogs");
        this.f121074c = new VKList<>(optJSONObject.optJSONArray("items"), VKApiDialog.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121072a);
        parcel.writeInt(this.f121073b);
        parcel.writeParcelable(this.f121074c, i);
    }
}
