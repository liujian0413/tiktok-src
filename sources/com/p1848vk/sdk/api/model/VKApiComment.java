package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiComment */
public class VKApiComment extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiComment> CREATOR = new Creator<VKApiComment>() {
        /* renamed from: a */
        private static VKApiComment[] m147441a(int i) {
            return new VKApiComment[i];
        }

        /* renamed from: a */
        private static VKApiComment m147440a(Parcel parcel) {
            return new VKApiComment(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147440a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147441a(i);
        }
    };

    /* renamed from: a */
    public int f121001a;

    /* renamed from: b */
    public int f121002b;

    /* renamed from: c */
    public long f121003c;

    /* renamed from: d */
    public String f121004d;

    /* renamed from: e */
    public int f121005e;

    /* renamed from: f */
    public int f121006f;

    /* renamed from: g */
    public int f121007g;

    /* renamed from: h */
    public boolean f121008h;

    /* renamed from: i */
    public boolean f121009i;

    /* renamed from: j */
    public VKAttachments f121010j = new VKAttachments();

    public int describeContents() {
        return 0;
    }

    public VKApiComment() {
    }

    public VKApiComment(Parcel parcel) {
        boolean z;
        this.f121001a = parcel.readInt();
        this.f121002b = parcel.readInt();
        this.f121003c = parcel.readLong();
        this.f121004d = parcel.readString();
        this.f121005e = parcel.readInt();
        this.f121006f = parcel.readInt();
        this.f121007g = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121008h = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121009i = z2;
        this.f121010j = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiComment mo118445b(JSONObject jSONObject) {
        this.f121001a = jSONObject.optInt("id");
        this.f121002b = jSONObject.optInt("from_id");
        this.f121003c = jSONObject.optLong("date");
        this.f121004d = jSONObject.optString("text");
        this.f121005e = jSONObject.optInt("reply_to_user");
        this.f121006f = jSONObject.optInt("reply_to_comment");
        this.f121010j.mo118611a(jSONObject.optJSONArray("attachments"));
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        this.f121007g = C47208b.m147656b(optJSONObject, "count");
        this.f121008h = C47208b.m147655a(optJSONObject, "user_likes");
        this.f121009i = C47208b.m147655a(optJSONObject, "can_like");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121001a);
        parcel.writeInt(this.f121002b);
        parcel.writeLong(this.f121003c);
        parcel.writeString(this.f121004d);
        parcel.writeInt(this.f121005e);
        parcel.writeInt(this.f121006f);
        parcel.writeInt(this.f121007g);
        parcel.writeByte(this.f121008h ? (byte) 1 : 0);
        parcel.writeByte(this.f121009i ? (byte) 1 : 0);
        parcel.writeParcelable(this.f121010j, i);
    }
}
