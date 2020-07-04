package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiNote */
public class VKApiNote extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiNote> CREATOR = new Creator<VKApiNote>() {
        /* renamed from: a */
        private static VKApiNote[] m147502a(int i) {
            return new VKApiNote[i];
        }

        /* renamed from: a */
        private static VKApiNote m147501a(Parcel parcel) {
            return new VKApiNote(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147501a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147502a(i);
        }
    };

    /* renamed from: a */
    public int f121094a;

    /* renamed from: b */
    public int f121095b;

    /* renamed from: c */
    public String f121096c;

    /* renamed from: d */
    public String f121097d;

    /* renamed from: e */
    public long f121098e;

    /* renamed from: f */
    public int f121099f;

    /* renamed from: g */
    public int f121100g;

    /* renamed from: h */
    public String f121101h;

    public VKApiNote() {
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "note";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("note");
        sb.append(this.f121095b);
        sb.append('_');
        sb.append(this.f121094a);
        return sb;
    }

    public VKApiNote(Parcel parcel) {
        this.f121094a = parcel.readInt();
        this.f121095b = parcel.readInt();
        this.f121096c = parcel.readString();
        this.f121097d = parcel.readString();
        this.f121098e = parcel.readLong();
        this.f121099f = parcel.readInt();
        this.f121100g = parcel.readInt();
        this.f121101h = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiNote mo118445b(JSONObject jSONObject) {
        this.f121094a = jSONObject.optInt("id");
        this.f121095b = jSONObject.optInt("user_id");
        this.f121096c = jSONObject.optString("title");
        this.f121097d = jSONObject.optString("text");
        this.f121098e = jSONObject.optLong("date");
        this.f121099f = jSONObject.optInt("comments");
        this.f121100g = jSONObject.optInt("read_comments");
        this.f121101h = jSONObject.optString("view_url");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121094a);
        parcel.writeInt(this.f121095b);
        parcel.writeString(this.f121096c);
        parcel.writeString(this.f121097d);
        parcel.writeLong(this.f121098e);
        parcel.writeInt(this.f121099f);
        parcel.writeInt(this.f121100g);
        parcel.writeString(this.f121101h);
    }
}
