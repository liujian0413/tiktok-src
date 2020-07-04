package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiVideo */
public class VKApiVideo extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiVideo> CREATOR = new Creator<VKApiVideo>() {
        /* renamed from: a */
        private static VKApiVideo[] m147589a(int i) {
            return new VKApiVideo[i];
        }

        /* renamed from: a */
        private static VKApiVideo m147588a(Parcel parcel) {
            return new VKApiVideo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147588a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147589a(i);
        }
    };

    /* renamed from: A */
    public String f121285A;

    /* renamed from: B */
    public String f121286B;

    /* renamed from: C */
    public String f121287C;

    /* renamed from: a */
    public int f121288a;

    /* renamed from: b */
    public int f121289b;

    /* renamed from: c */
    public int f121290c;

    /* renamed from: d */
    public String f121291d;

    /* renamed from: e */
    public String f121292e;

    /* renamed from: f */
    public int f121293f;

    /* renamed from: g */
    public String f121294g;

    /* renamed from: h */
    public long f121295h;

    /* renamed from: i */
    public int f121296i;

    /* renamed from: j */
    public String f121297j;

    /* renamed from: k */
    public String f121298k;

    /* renamed from: l */
    public String f121299l;

    /* renamed from: m */
    public String f121300m;

    /* renamed from: n */
    public VKPhotoSizes f121301n = new VKPhotoSizes();

    /* renamed from: o */
    public String f121302o;

    /* renamed from: p */
    public int f121303p;

    /* renamed from: q */
    public boolean f121304q;

    /* renamed from: r */
    public boolean f121305r;

    /* renamed from: s */
    public boolean f121306s;

    /* renamed from: t */
    public boolean f121307t;

    /* renamed from: u */
    public int f121308u;

    /* renamed from: v */
    public int f121309v;

    /* renamed from: w */
    public int f121310w;

    /* renamed from: x */
    public String f121311x;

    /* renamed from: y */
    public String f121312y;

    /* renamed from: z */
    public String f121313z;

    /* renamed from: b */
    public final String mo118446b() {
        return "video";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121291d;
    }

    public VKApiVideo() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("video");
        sb.append(this.f121289b);
        sb.append('_');
        sb.append(this.f121288a);
        if (!TextUtils.isEmpty(this.f121302o)) {
            sb.append('_');
            sb.append(this.f121302o);
        }
        return sb;
    }

    public VKApiVideo(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f121288a = parcel.readInt();
        this.f121289b = parcel.readInt();
        this.f121290c = parcel.readInt();
        this.f121291d = parcel.readString();
        this.f121292e = parcel.readString();
        this.f121293f = parcel.readInt();
        this.f121294g = parcel.readString();
        this.f121295h = parcel.readLong();
        this.f121296i = parcel.readInt();
        this.f121297j = parcel.readString();
        this.f121298k = parcel.readString();
        this.f121299l = parcel.readString();
        this.f121300m = parcel.readString();
        this.f121301n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f121302o = parcel.readString();
        this.f121303p = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121304q = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121305r = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f121306s = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f121307t = z4;
        this.f121308u = parcel.readInt();
        this.f121309v = parcel.readInt();
        this.f121310w = parcel.readInt();
        this.f121311x = parcel.readString();
        this.f121312y = parcel.readString();
        this.f121313z = parcel.readString();
        this.f121285A = parcel.readString();
        this.f121286B = parcel.readString();
        this.f121287C = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiVideo mo118445b(JSONObject jSONObject) {
        this.f121288a = jSONObject.optInt("id");
        this.f121289b = jSONObject.optInt("owner_id");
        this.f121291d = jSONObject.optString("title");
        this.f121292e = jSONObject.optString("description");
        this.f121293f = jSONObject.optInt("duration");
        this.f121294g = jSONObject.optString("link");
        this.f121295h = jSONObject.optLong("date");
        this.f121296i = jSONObject.optInt("views");
        this.f121303p = jSONObject.optInt("comments");
        this.f121297j = jSONObject.optString("player");
        this.f121302o = jSONObject.optString("access_key");
        this.f121290c = jSONObject.optInt("album_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        if (optJSONObject != null) {
            this.f121308u = optJSONObject.optInt("count");
            this.f121306s = C47208b.m147655a(optJSONObject, "user_likes");
        }
        this.f121304q = C47208b.m147655a(jSONObject, "can_comment");
        this.f121305r = C47208b.m147655a(jSONObject, "can_repost");
        this.f121307t = C47208b.m147655a(jSONObject, "repeat");
        this.f121309v = C47209c.m147658a(jSONObject.optJSONObject("privacy_view"));
        this.f121310w = C47209c.m147658a(jSONObject.optJSONObject("privacy_comment"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("files");
        if (optJSONObject2 != null) {
            this.f121311x = optJSONObject2.optString("mp4_240");
            this.f121312y = optJSONObject2.optString("mp4_360");
            this.f121313z = optJSONObject2.optString("mp4_480");
            this.f121285A = optJSONObject2.optString("mp4_720");
            this.f121286B = optJSONObject2.optString("mp4_1080");
            this.f121287C = optJSONObject2.optString("external");
        }
        this.f121298k = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f121298k)) {
            this.f121301n.add(VKApiPhotoSize.m147521a(this.f121298k, 130));
        }
        this.f121299l = jSONObject.optString("photo_320");
        if (!TextUtils.isEmpty(this.f121299l)) {
            this.f121301n.add(VKApiPhotoSize.m147521a(this.f121299l, 320));
        }
        this.f121300m = jSONObject.optString("photo_640");
        if (!TextUtils.isEmpty(this.f121300m)) {
            this.f121301n.add(VKApiPhotoSize.m147521a(this.f121300m, 640));
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121288a);
        parcel.writeInt(this.f121289b);
        parcel.writeInt(this.f121290c);
        parcel.writeString(this.f121291d);
        parcel.writeString(this.f121292e);
        parcel.writeInt(this.f121293f);
        parcel.writeString(this.f121294g);
        parcel.writeLong(this.f121295h);
        parcel.writeInt(this.f121296i);
        parcel.writeString(this.f121297j);
        parcel.writeString(this.f121298k);
        parcel.writeString(this.f121299l);
        parcel.writeString(this.f121300m);
        parcel.writeParcelable(this.f121301n, i);
        parcel.writeString(this.f121302o);
        parcel.writeInt(this.f121303p);
        parcel.writeByte(this.f121304q ? (byte) 1 : 0);
        parcel.writeByte(this.f121305r ? (byte) 1 : 0);
        parcel.writeByte(this.f121306s ? (byte) 1 : 0);
        parcel.writeByte(this.f121307t ? (byte) 1 : 0);
        parcel.writeInt(this.f121308u);
        parcel.writeInt(this.f121309v);
        parcel.writeInt(this.f121310w);
        parcel.writeString(this.f121311x);
        parcel.writeString(this.f121312y);
        parcel.writeString(this.f121313z);
        parcel.writeString(this.f121285A);
        parcel.writeString(this.f121286B);
        parcel.writeString(this.f121287C);
    }
}
