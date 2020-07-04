package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiApplicationContent */
public class VKApiApplicationContent extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiApplicationContent> CREATOR = new Creator<VKApiApplicationContent>() {
        /* renamed from: a */
        private static VKApiApplicationContent[] m147423a(int i) {
            return new VKApiApplicationContent[i];
        }

        /* renamed from: a */
        private static VKApiApplicationContent m147422a(Parcel parcel) {
            return new VKApiApplicationContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147422a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147423a(i);
        }
    };

    /* renamed from: a */
    public int f120979a;

    /* renamed from: b */
    public String f120980b;

    /* renamed from: c */
    public String f120981c;

    /* renamed from: d */
    public String f120982d;

    /* renamed from: e */
    public VKPhotoSizes f120983e = new VKPhotoSizes();

    /* renamed from: b */
    public final String mo118446b() {
        return "app";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        throw new UnsupportedOperationException("Attaching app info is not supported by VK.com API");
    }

    public VKApiApplicationContent() {
    }

    public VKApiApplicationContent(Parcel parcel) {
        this.f120979a = parcel.readInt();
        this.f120980b = parcel.readString();
        this.f120981c = parcel.readString();
        this.f120982d = parcel.readString();
        this.f120983e = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiApplicationContent mo118445b(JSONObject jSONObject) {
        this.f120979a = jSONObject.optInt("id");
        this.f120980b = jSONObject.optString("name");
        this.f120981c = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f120981c)) {
            this.f120983e.mo118624a((VKApiModel) VKApiPhotoSize.m147521a(this.f120981c, 130));
        }
        this.f120982d = jSONObject.optString("photo_604");
        if (!TextUtils.isEmpty(this.f120982d)) {
            this.f120983e.mo118624a((VKApiModel) VKApiPhotoSize.m147521a(this.f120982d, 604));
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120979a);
        parcel.writeString(this.f120980b);
        parcel.writeString(this.f120981c);
        parcel.writeString(this.f120982d);
        parcel.writeParcelable(this.f120983e, i);
    }
}
