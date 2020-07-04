package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPhoto */
public class VKApiPhoto extends VKApiAttachment implements Parcelable, C47207a {
    public static Creator<VKApiPhoto> CREATOR = new Creator<VKApiPhoto>() {
        /* renamed from: a */
        private static VKApiPhoto[] m147512a(int i) {
            return new VKApiPhoto[i];
        }

        /* renamed from: a */
        private static VKApiPhoto m147511a(Parcel parcel) {
            return new VKApiPhoto(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147511a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147512a(i);
        }
    };

    /* renamed from: a */
    public int f121103a;

    /* renamed from: b */
    public int f121104b;

    /* renamed from: c */
    public int f121105c;

    /* renamed from: d */
    public int f121106d;

    /* renamed from: e */
    public int f121107e;

    /* renamed from: f */
    public String f121108f;

    /* renamed from: g */
    public long f121109g;

    /* renamed from: h */
    public String f121110h;

    /* renamed from: i */
    public String f121111i;

    /* renamed from: j */
    public String f121112j;

    /* renamed from: k */
    public String f121113k;

    /* renamed from: l */
    public String f121114l;

    /* renamed from: m */
    public String f121115m;

    /* renamed from: n */
    public VKPhotoSizes f121116n = new VKPhotoSizes();

    /* renamed from: o */
    public boolean f121117o;

    /* renamed from: p */
    public boolean f121118p;

    /* renamed from: q */
    public int f121119q;

    /* renamed from: r */
    public int f121120r;

    /* renamed from: s */
    public int f121121s;

    /* renamed from: t */
    public String f121122t;

    /* renamed from: b */
    public String mo118446b() {
        return "photo";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPhoto() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("photo");
        sb.append(this.f121105c);
        sb.append('_');
        sb.append(this.f121103a);
        if (!TextUtils.isEmpty(this.f121122t)) {
            sb.append('_');
            sb.append(this.f121122t);
        }
        return sb;
    }

    public VKApiPhoto(Parcel parcel) {
        boolean z;
        this.f121103a = parcel.readInt();
        this.f121104b = parcel.readInt();
        this.f121105c = parcel.readInt();
        this.f121106d = parcel.readInt();
        this.f121107e = parcel.readInt();
        this.f121108f = parcel.readString();
        this.f121109g = parcel.readLong();
        this.f121116n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f121110h = parcel.readString();
        this.f121111i = parcel.readString();
        this.f121112j = parcel.readString();
        this.f121113k = parcel.readString();
        this.f121114l = parcel.readString();
        this.f121115m = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121117o = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121118p = z2;
        this.f121119q = parcel.readInt();
        this.f121120r = parcel.readInt();
        this.f121121s = parcel.readInt();
        this.f121122t = parcel.readString();
    }

    /* renamed from: a */
    public VKApiPhoto mo118445b(JSONObject jSONObject) {
        this.f121104b = jSONObject.optInt("album_id");
        this.f121109g = jSONObject.optLong("date");
        this.f121107e = jSONObject.optInt("height");
        this.f121106d = jSONObject.optInt("width");
        this.f121105c = jSONObject.optInt("owner_id");
        this.f121103a = jSONObject.optInt("id");
        this.f121108f = jSONObject.optString("text");
        this.f121122t = jSONObject.optString("access_key");
        this.f121110h = jSONObject.optString("photo_75");
        this.f121111i = jSONObject.optString("photo_130");
        this.f121112j = jSONObject.optString("photo_604");
        this.f121113k = jSONObject.optString("photo_807");
        this.f121114l = jSONObject.optString("photo_1280");
        this.f121115m = jSONObject.optString("photo_2560");
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        this.f121119q = C47208b.m147656b(optJSONObject, "count");
        this.f121117o = C47208b.m147655a(optJSONObject, "user_likes");
        this.f121120r = C47208b.m147656b(jSONObject.optJSONObject("comments"), "count");
        this.f121121s = C47208b.m147656b(jSONObject.optJSONObject(C38347c.f99557l), "count");
        this.f121118p = C47208b.m147655a(jSONObject, "can_comment");
        this.f121116n.mo118657a(this.f121106d, this.f121107e);
        JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
        if (optJSONArray != null) {
            this.f121116n.mo118658a(optJSONArray);
        } else {
            if (!TextUtils.isEmpty(this.f121110h)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121110h, 's', this.f121106d, this.f121107e));
            }
            if (!TextUtils.isEmpty(this.f121111i)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121111i, 'm', this.f121106d, this.f121107e));
            }
            if (!TextUtils.isEmpty(this.f121112j)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121112j, 'x', this.f121106d, this.f121107e));
            }
            if (!TextUtils.isEmpty(this.f121113k)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121113k, 'y', this.f121106d, this.f121107e));
            }
            if (!TextUtils.isEmpty(this.f121114l)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121114l, 'z', this.f121106d, this.f121107e));
            }
            if (!TextUtils.isEmpty(this.f121115m)) {
                this.f121116n.add(VKApiPhotoSize.m147520a(this.f121115m, 'w', this.f121106d, this.f121107e));
            }
            this.f121116n.mo118656a();
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121103a);
        parcel.writeInt(this.f121104b);
        parcel.writeInt(this.f121105c);
        parcel.writeInt(this.f121106d);
        parcel.writeInt(this.f121107e);
        parcel.writeString(this.f121108f);
        parcel.writeLong(this.f121109g);
        parcel.writeParcelable(this.f121116n, i);
        parcel.writeString(this.f121110h);
        parcel.writeString(this.f121111i);
        parcel.writeString(this.f121112j);
        parcel.writeString(this.f121113k);
        parcel.writeString(this.f121114l);
        parcel.writeString(this.f121115m);
        parcel.writeByte(this.f121117o ? (byte) 1 : 0);
        parcel.writeByte(this.f121118p ? (byte) 1 : 0);
        parcel.writeInt(this.f121119q);
        parcel.writeInt(this.f121120r);
        parcel.writeInt(this.f121121s);
        parcel.writeString(this.f121122t);
    }
}
