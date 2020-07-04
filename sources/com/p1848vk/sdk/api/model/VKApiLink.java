package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiLink */
public class VKApiLink extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiLink> CREATOR = new Creator<VKApiLink>() {
        /* renamed from: a */
        private static VKApiLink[] m147491a(int i) {
            return new VKApiLink[i];
        }

        /* renamed from: a */
        private static VKApiLink m147490a(Parcel parcel) {
            return new VKApiLink(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147490a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147491a(i);
        }
    };

    /* renamed from: a */
    public String f121077a;

    /* renamed from: b */
    public String f121078b;

    /* renamed from: c */
    public String f121079c;

    /* renamed from: d */
    public String f121080d;

    /* renamed from: e */
    public String f121081e;

    public VKApiLink() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        return this.f121077a;
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "link";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiLink(String str) {
        this.f121077a = str;
    }

    private VKApiLink(Parcel parcel) {
        this.f121077a = parcel.readString();
        this.f121078b = parcel.readString();
        this.f121079c = parcel.readString();
        this.f121080d = parcel.readString();
        this.f121081e = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiLink mo118445b(JSONObject jSONObject) {
        this.f121077a = jSONObject.optString("url");
        this.f121078b = jSONObject.optString("title");
        this.f121079c = jSONObject.optString("description");
        this.f121080d = jSONObject.optString("image_src");
        this.f121081e = jSONObject.optString("preview_page");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121077a);
        parcel.writeString(this.f121078b);
        parcel.writeString(this.f121079c);
        parcel.writeString(this.f121080d);
        parcel.writeString(this.f121081e);
    }
}
