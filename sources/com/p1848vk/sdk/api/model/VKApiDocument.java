package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiDocument */
public class VKApiDocument extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiDocument> CREATOR = new Creator<VKApiDocument>() {
        /* renamed from: a */
        private static VKApiDocument[] m147477a(int i) {
            return new VKApiDocument[i];
        }

        /* renamed from: a */
        private static VKApiDocument m147476a(Parcel parcel) {
            return new VKApiDocument(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147476a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147477a(i);
        }
    };

    /* renamed from: a */
    public int f121059a;

    /* renamed from: b */
    public int f121060b;

    /* renamed from: c */
    public String f121061c;

    /* renamed from: d */
    public long f121062d;

    /* renamed from: e */
    public String f121063e;

    /* renamed from: f */
    public String f121064f;

    /* renamed from: g */
    public String f121065g;

    /* renamed from: h */
    public String f121066h;

    /* renamed from: i */
    public VKPhotoSizes f121067i = new VKPhotoSizes();

    /* renamed from: j */
    public String f121068j;

    /* renamed from: k */
    public long f121069k = 0;

    /* renamed from: l */
    private boolean f121070l;

    /* renamed from: m */
    private boolean f121071m;

    /* renamed from: b */
    public final String mo118446b() {
        return "doc";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121061c;
    }

    public VKApiDocument() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("doc");
        sb.append(this.f121060b);
        sb.append('_');
        sb.append(this.f121059a);
        if (!TextUtils.isEmpty(this.f121068j)) {
            sb.append('_');
            sb.append(this.f121068j);
        }
        return sb;
    }

    public VKApiDocument(Parcel parcel) {
        boolean z;
        this.f121059a = parcel.readInt();
        this.f121060b = parcel.readInt();
        this.f121061c = parcel.readString();
        this.f121062d = parcel.readLong();
        this.f121063e = parcel.readString();
        this.f121064f = parcel.readString();
        this.f121069k = parcel.readLong();
        this.f121065g = parcel.readString();
        this.f121066h = parcel.readString();
        this.f121067i = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f121068j = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121071m = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121070l = z2;
    }

    /* renamed from: a */
    public final VKApiDocument mo118445b(JSONObject jSONObject) {
        this.f121059a = jSONObject.optInt("id");
        this.f121060b = jSONObject.optInt("owner_id");
        this.f121061c = jSONObject.optString("title");
        this.f121062d = jSONObject.optLong("size");
        this.f121063e = jSONObject.optString("ext");
        this.f121064f = jSONObject.optString("url");
        this.f121068j = jSONObject.optString("access_key");
        this.f121069k = jSONObject.optLong("date", 0) * 1000;
        this.f121065g = jSONObject.optString("photo_100");
        if (!TextUtils.isEmpty(this.f121065g)) {
            this.f121067i.mo118624a((VKApiModel) VKApiPhotoSize.m147522a(this.f121065g, 100, 75));
        }
        this.f121066h = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f121066h)) {
            this.f121067i.mo118624a((VKApiModel) VKApiPhotoSize.m147522a(this.f121066h, 130, 100));
        }
        this.f121067i.mo118656a();
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121059a);
        parcel.writeInt(this.f121060b);
        parcel.writeString(this.f121061c);
        parcel.writeLong(this.f121062d);
        parcel.writeString(this.f121063e);
        parcel.writeString(this.f121064f);
        parcel.writeLong(this.f121069k);
        parcel.writeString(this.f121065g);
        parcel.writeString(this.f121066h);
        parcel.writeParcelable(this.f121067i, i);
        parcel.writeString(this.f121068j);
        parcel.writeByte(this.f121071m ? (byte) 1 : 0);
        parcel.writeByte(this.f121070l ? (byte) 1 : 0);
    }
}
