package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiAudio */
public class VKApiAudio extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiAudio> CREATOR = new Creator<VKApiAudio>() {
        /* renamed from: a */
        private static VKApiAudio[] m147429a(int i) {
            return new VKApiAudio[i];
        }

        /* renamed from: a */
        private static VKApiAudio m147428a(Parcel parcel) {
            return new VKApiAudio(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147428a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147429a(i);
        }
    };

    /* renamed from: a */
    public int f120984a;

    /* renamed from: b */
    public int f120985b;

    /* renamed from: c */
    public String f120986c;

    /* renamed from: d */
    public String f120987d;

    /* renamed from: e */
    public int f120988e;

    /* renamed from: f */
    public String f120989f;

    /* renamed from: g */
    public int f120990g;

    /* renamed from: h */
    public int f120991h;

    /* renamed from: i */
    public int f120992i;

    /* renamed from: j */
    public String f120993j;

    public VKApiAudio() {
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "audio";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("audio");
        sb.append(this.f120985b);
        sb.append('_');
        sb.append(this.f120984a);
        if (!TextUtils.isEmpty(this.f120993j)) {
            sb.append('_');
            sb.append(this.f120993j);
        }
        return sb;
    }

    public VKApiAudio(Parcel parcel) {
        this.f120984a = parcel.readInt();
        this.f120985b = parcel.readInt();
        this.f120986c = parcel.readString();
        this.f120987d = parcel.readString();
        this.f120988e = parcel.readInt();
        this.f120989f = parcel.readString();
        this.f120990g = parcel.readInt();
        this.f120991h = parcel.readInt();
        this.f120992i = parcel.readInt();
        this.f120993j = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiAudio mo118445b(JSONObject jSONObject) {
        this.f120984a = jSONObject.optInt("id");
        this.f120985b = jSONObject.optInt("owner_id");
        this.f120986c = jSONObject.optString("artist");
        this.f120987d = jSONObject.optString("title");
        this.f120988e = jSONObject.optInt("duration");
        this.f120989f = jSONObject.optString("url");
        this.f120990g = jSONObject.optInt("lyrics_id");
        this.f120991h = jSONObject.optInt("album_id");
        this.f120992i = jSONObject.optInt("genre_id");
        this.f120993j = jSONObject.optString("access_key");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120984a);
        parcel.writeInt(this.f120985b);
        parcel.writeString(this.f120986c);
        parcel.writeString(this.f120987d);
        parcel.writeInt(this.f120988e);
        parcel.writeString(this.f120989f);
        parcel.writeInt(this.f120990g);
        parcel.writeInt(this.f120991h);
        parcel.writeInt(this.f120992i);
        parcel.writeString(this.f120993j);
    }
}
