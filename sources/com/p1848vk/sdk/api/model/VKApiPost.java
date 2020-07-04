package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPost */
public class VKApiPost extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiPost> CREATOR = new Creator<VKApiPost>() {
        /* renamed from: a */
        private static VKApiPost[] m147549a(int i) {
            return new VKApiPost[i];
        }

        /* renamed from: a */
        private static VKApiPost m147548a(Parcel parcel) {
            return new VKApiPost(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147548a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147549a(i);
        }
    };

    /* renamed from: a */
    public int f121160a;

    /* renamed from: b */
    public int f121161b;

    /* renamed from: c */
    public int f121162c;

    /* renamed from: d */
    public long f121163d;

    /* renamed from: e */
    public String f121164e;

    /* renamed from: f */
    public int f121165f;

    /* renamed from: g */
    public int f121166g;

    /* renamed from: h */
    public boolean f121167h;

    /* renamed from: i */
    public int f121168i;

    /* renamed from: j */
    public boolean f121169j;

    /* renamed from: k */
    public int f121170k;

    /* renamed from: l */
    public boolean f121171l;

    /* renamed from: m */
    public boolean f121172m;

    /* renamed from: n */
    public boolean f121173n;

    /* renamed from: o */
    public int f121174o;

    /* renamed from: p */
    public boolean f121175p;

    /* renamed from: q */
    public String f121176q;

    /* renamed from: r */
    public VKAttachments f121177r = new VKAttachments();

    /* renamed from: s */
    public VKApiPlace f121178s;

    /* renamed from: t */
    public int f121179t;

    /* renamed from: u */
    public VKList<VKApiPost> f121180u;

    /* renamed from: b */
    public final String mo118446b() {
        return "wall";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPost() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("wall");
        sb.append(this.f121161b);
        sb.append('_');
        sb.append(this.f121160a);
        return sb;
    }

    public VKApiPost(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f121160a = parcel.readInt();
        this.f121161b = parcel.readInt();
        this.f121162c = parcel.readInt();
        this.f121163d = parcel.readLong();
        this.f121164e = parcel.readString();
        this.f121165f = parcel.readInt();
        this.f121166g = parcel.readInt();
        boolean z6 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121167h = z;
        this.f121168i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121169j = z2;
        this.f121170k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f121171l = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f121172m = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f121173n = z5;
        this.f121174o = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        }
        this.f121175p = z6;
        this.f121176q = parcel.readString();
        this.f121177r = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.f121178s = (VKApiPlace) parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.f121179t = parcel.readInt();
    }

    /* renamed from: a */
    public final VKApiPost mo118445b(JSONObject jSONObject) throws JSONException {
        this.f121160a = jSONObject.optInt("id");
        this.f121161b = jSONObject.optInt("to_id");
        this.f121162c = jSONObject.optInt("from_id");
        this.f121163d = jSONObject.optLong("date");
        this.f121164e = jSONObject.optString("text");
        this.f121165f = jSONObject.optInt("reply_owner_id");
        this.f121166g = jSONObject.optInt("reply_post_id");
        this.f121167h = C47208b.m147655a(jSONObject, "friends_only");
        JSONObject optJSONObject = jSONObject.optJSONObject("comments");
        if (optJSONObject != null) {
            this.f121168i = optJSONObject.optInt("count");
            this.f121169j = C47208b.m147655a(optJSONObject, "can_post");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("likes");
        if (optJSONObject2 != null) {
            this.f121170k = optJSONObject2.optInt("count");
            this.f121171l = C47208b.m147655a(optJSONObject2, "user_likes");
            this.f121172m = C47208b.m147655a(optJSONObject2, "can_like");
            this.f121173n = C47208b.m147655a(optJSONObject2, "can_publish");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("reposts");
        if (optJSONObject3 != null) {
            this.f121174o = optJSONObject3.optInt("count");
            this.f121175p = C47208b.m147655a(optJSONObject3, "user_reposted");
        }
        this.f121176q = jSONObject.optString("post_type");
        this.f121177r.mo118611a(jSONObject.optJSONArray("attachments"));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("geo");
        if (optJSONObject4 != null) {
            this.f121178s = new VKApiPlace().mo118445b(optJSONObject4);
        }
        this.f121179t = jSONObject.optInt("signer_id");
        this.f121180u = new VKList<>(jSONObject.optJSONArray("copy_history"), VKApiPost.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121160a);
        parcel.writeInt(this.f121161b);
        parcel.writeInt(this.f121162c);
        parcel.writeLong(this.f121163d);
        parcel.writeString(this.f121164e);
        parcel.writeInt(this.f121165f);
        parcel.writeInt(this.f121166g);
        parcel.writeByte(this.f121167h ? (byte) 1 : 0);
        parcel.writeInt(this.f121168i);
        parcel.writeByte(this.f121169j ? (byte) 1 : 0);
        parcel.writeInt(this.f121170k);
        parcel.writeByte(this.f121171l ? (byte) 1 : 0);
        parcel.writeByte(this.f121172m ? (byte) 1 : 0);
        parcel.writeByte(this.f121173n ? (byte) 1 : 0);
        parcel.writeInt(this.f121174o);
        parcel.writeByte(this.f121175p ? (byte) 1 : 0);
        parcel.writeString(this.f121176q);
        parcel.writeParcelable(this.f121177r, i);
        parcel.writeParcelable(this.f121178s, i);
        parcel.writeInt(this.f121179t);
    }
}
