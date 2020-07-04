package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPhotoAlbum */
public class VKApiPhotoAlbum extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiPhotoAlbum> CREATOR = new Creator<VKApiPhotoAlbum>() {
        /* renamed from: a */
        private static VKApiPhotoAlbum[] m147518a(int i) {
            return new VKApiPhotoAlbum[i];
        }

        /* renamed from: a */
        private static VKApiPhotoAlbum m147517a(Parcel parcel) {
            return new VKApiPhotoAlbum(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147517a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147518a(i);
        }
    };

    /* renamed from: a */
    public int f121123a;

    /* renamed from: b */
    public String f121124b;

    /* renamed from: c */
    public int f121125c;

    /* renamed from: d */
    public int f121126d;

    /* renamed from: e */
    public String f121127e;

    /* renamed from: f */
    public int f121128f;

    /* renamed from: g */
    public boolean f121129g;

    /* renamed from: h */
    public long f121130h;

    /* renamed from: i */
    public long f121131i;

    /* renamed from: j */
    public int f121132j;

    /* renamed from: k */
    public String f121133k;

    /* renamed from: l */
    public VKPhotoSizes f121134l = new VKPhotoSizes();

    /* renamed from: b */
    public final String mo118446b() {
        return "album";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121124b;
    }

    public VKApiPhotoAlbum() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("album");
        sb.append(this.f121128f);
        sb.append('_');
        sb.append(this.f121123a);
        return sb;
    }

    public VKApiPhotoAlbum(Parcel parcel) {
        boolean z;
        this.f121123a = parcel.readInt();
        this.f121124b = parcel.readString();
        this.f121125c = parcel.readInt();
        this.f121126d = parcel.readInt();
        this.f121127e = parcel.readString();
        this.f121128f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121129g = z;
        this.f121130h = parcel.readLong();
        this.f121131i = parcel.readLong();
        this.f121132j = parcel.readInt();
        this.f121133k = parcel.readString();
        this.f121134l = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiPhotoAlbum mo118445b(JSONObject jSONObject) {
        this.f121123a = jSONObject.optInt("id");
        this.f121132j = jSONObject.optInt("thumb_id");
        this.f121128f = jSONObject.optInt("owner_id");
        this.f121124b = jSONObject.optString("title");
        this.f121127e = jSONObject.optString("description");
        this.f121131i = jSONObject.optLong("created");
        this.f121130h = jSONObject.optLong("updated");
        this.f121125c = jSONObject.optInt("size");
        this.f121129g = C47208b.m147655a(jSONObject, "can_upload");
        this.f121133k = jSONObject.optString("thumb_src");
        if (jSONObject.has("privacy")) {
            this.f121126d = jSONObject.optInt("privacy");
        } else {
            this.f121126d = C47209c.m147658a(jSONObject.optJSONObject("privacy_view"));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
        if (optJSONArray != null) {
            this.f121134l.mo118658a(optJSONArray);
        } else {
            this.f121134l.add(VKApiPhotoSize.m147522a("http://vk.com/images/s_noalbum.png", 75, 55));
            this.f121134l.add(VKApiPhotoSize.m147522a("http://vk.com/images/m_noalbum.png", 130, 97));
            this.f121134l.add(VKApiPhotoSize.m147522a("http://vk.com/images/x_noalbum.png", 432, 249));
            this.f121134l.mo118656a();
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121123a);
        parcel.writeString(this.f121124b);
        parcel.writeInt(this.f121125c);
        parcel.writeInt(this.f121126d);
        parcel.writeString(this.f121127e);
        parcel.writeInt(this.f121128f);
        parcel.writeByte(this.f121129g ? (byte) 1 : 0);
        parcel.writeLong(this.f121130h);
        parcel.writeLong(this.f121131i);
        parcel.writeInt(this.f121132j);
        parcel.writeString(this.f121133k);
        parcel.writeParcelable(this.f121134l, i);
    }
}
