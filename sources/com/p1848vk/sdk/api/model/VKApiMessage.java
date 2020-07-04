package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiMessage */
public class VKApiMessage extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiMessage> CREATOR = new Creator<VKApiMessage>() {
        /* renamed from: a */
        private static VKApiMessage[] m147495a(int i) {
            return new VKApiMessage[i];
        }

        /* renamed from: a */
        private static VKApiMessage m147494a(Parcel parcel) {
            return new VKApiMessage(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147494a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147495a(i);
        }
    };

    /* renamed from: a */
    public int f121082a;

    /* renamed from: b */
    public int f121083b;

    /* renamed from: c */
    public long f121084c;

    /* renamed from: d */
    public boolean f121085d;

    /* renamed from: e */
    public boolean f121086e;

    /* renamed from: f */
    public String f121087f;

    /* renamed from: g */
    public String f121088g;

    /* renamed from: h */
    public VKAttachments f121089h = new VKAttachments();

    /* renamed from: i */
    public VKList<VKApiMessage> f121090i;

    /* renamed from: j */
    public boolean f121091j;

    /* renamed from: k */
    public boolean f121092k;

    public int describeContents() {
        return 0;
    }

    public VKApiMessage() {
    }

    public VKApiMessage(JSONObject jSONObject) throws JSONException {
        mo118445b(jSONObject);
    }

    public VKApiMessage(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f121082a = parcel.readInt();
        this.f121083b = parcel.readInt();
        this.f121084c = parcel.readLong();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121085d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121086e = z2;
        this.f121087f = parcel.readString();
        this.f121088g = parcel.readString();
        this.f121089h = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.f121090i = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f121091j = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f121092k = z4;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiMessage mo118445b(JSONObject jSONObject) throws JSONException {
        this.f121082a = jSONObject.optInt("id");
        this.f121083b = jSONObject.optInt("user_id");
        this.f121084c = jSONObject.optLong("date");
        this.f121085d = C47208b.m147655a(jSONObject, "read_state");
        this.f121086e = C47208b.m147655a(jSONObject, "out");
        this.f121087f = jSONObject.optString("title");
        this.f121088g = jSONObject.optString("body");
        this.f121089h.mo118611a(jSONObject.optJSONArray("attachments"));
        this.f121090i = new VKList<>(jSONObject.optJSONArray("fwd_messages"), VKApiMessage.class);
        this.f121091j = C47208b.m147655a(jSONObject, "emoji");
        this.f121092k = C47208b.m147655a(jSONObject, "deleted");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121082a);
        parcel.writeInt(this.f121083b);
        parcel.writeLong(this.f121084c);
        parcel.writeByte(this.f121085d ? (byte) 1 : 0);
        parcel.writeByte(this.f121086e ? (byte) 1 : 0);
        parcel.writeString(this.f121087f);
        parcel.writeString(this.f121088g);
        parcel.writeParcelable(this.f121089h, i);
        parcel.writeParcelable(this.f121090i, i);
        parcel.writeByte(this.f121091j ? (byte) 1 : 0);
        parcel.writeByte(this.f121092k ? (byte) 1 : 0);
    }
}
