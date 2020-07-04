package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUser */
public class VKApiUser extends VKApiOwner implements Parcelable {
    public static Creator<VKApiUser> CREATOR = new Creator<VKApiUser>() {
        /* renamed from: a */
        private static VKApiUser[] m147569a(int i) {
            return new VKApiUser[i];
        }

        /* renamed from: a */
        private static VKApiUser m147568a(Parcel parcel) {
            return new VKApiUser(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147568a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147569a(i);
        }
    };

    /* renamed from: a */
    public static final String f121203a = TextUtils.join(",", new String[]{"online", "online_mobile", "photo_50", "photo_100", "photo_200"});

    /* renamed from: b */
    public String f121204b = "DELETED";

    /* renamed from: c */
    public String f121205c = "DELETED";

    /* renamed from: d */
    public boolean f121206d;

    /* renamed from: e */
    public boolean f121207e;

    /* renamed from: f */
    public String f121208f = "http://vk.com/images/camera_c.gif";

    /* renamed from: g */
    public String f121209g = "http://vk.com/images/camera_b.gif";

    /* renamed from: h */
    public String f121210h = "http://vk.com/images/camera_a.gif";

    /* renamed from: i */
    public String f121211i = "http://vk.com/images/camera_a.gif";

    /* renamed from: j */
    public String f121212j = "";

    /* renamed from: k */
    public String f121213k = "http://vk.com/images/camera_b.gif";

    /* renamed from: l */
    public String f121214l = "http://vk.com/images/camera_a.gif";

    /* renamed from: m */
    public String f121215m = "";

    /* renamed from: n */
    public VKPhotoSizes f121216n = new VKPhotoSizes();

    /* renamed from: o */
    private String f121217o;

    public int describeContents() {
        return 0;
    }

    public VKApiUser() {
    }

    public String toString() {
        if (this.f121217o == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f121204b);
            sb.append(' ');
            sb.append(this.f121205c);
            this.f121217o = sb.toString();
        }
        return this.f121217o;
    }

    public VKApiUser(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f121204b = parcel.readString();
        this.f121205c = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121206d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121207e = z2;
        this.f121208f = parcel.readString();
        this.f121209g = parcel.readString();
        this.f121210h = parcel.readString();
        this.f121216n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f121217o = parcel.readString();
        this.f121212j = parcel.readString();
        this.f121213k = parcel.readString();
        this.f121214l = parcel.readString();
        this.f121215m = parcel.readString();
    }

    /* renamed from: a */
    public VKApiUser mo118471c(JSONObject jSONObject) {
        super.mo118445b(jSONObject);
        this.f121204b = jSONObject.optString("first_name", this.f121204b);
        this.f121205c = jSONObject.optString("last_name", this.f121205c);
        this.f121206d = C47208b.m147655a(jSONObject, "online");
        this.f121207e = C47208b.m147655a(jSONObject, "online_mobile");
        this.f121208f = m147564a(jSONObject.optString("photo_50", this.f121208f), 50);
        this.f121209g = m147564a(jSONObject.optString("photo_100", this.f121209g), 100);
        this.f121210h = m147564a(jSONObject.optString("photo_200", this.f121210h), C34943c.f91127w);
        this.f121212j = jSONObject.optString("photo_400_orig", this.f121212j);
        this.f121213k = jSONObject.optString("photo_max", this.f121213k);
        this.f121214l = jSONObject.optString("photo_max_orig", this.f121214l);
        this.f121215m = jSONObject.optString("photo_big", this.f121215m);
        this.f121216n.mo118656a();
        return this;
    }

    /* renamed from: a */
    private String m147564a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f121216n.add(VKApiPhotoSize.m147521a(str, i));
        }
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f121204b);
        parcel.writeString(this.f121205c);
        parcel.writeByte(this.f121206d ? (byte) 1 : 0);
        parcel.writeByte(this.f121207e ? (byte) 1 : 0);
        parcel.writeString(this.f121208f);
        parcel.writeString(this.f121209g);
        parcel.writeString(this.f121210h);
        parcel.writeParcelable(this.f121216n, i);
        parcel.writeString(this.f121217o);
        parcel.writeString(this.f121212j);
        parcel.writeString(this.f121213k);
        parcel.writeString(this.f121214l);
        parcel.writeString(this.f121215m);
    }
}
