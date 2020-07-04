package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCommunity */
public class VKApiCommunity extends VKApiOwner implements Parcelable, C47207a {
    public static Creator<VKApiCommunity> CREATOR = new Creator<VKApiCommunity>() {
        /* renamed from: a */
        private static VKApiCommunity[] m147446a(int i) {
            return new VKApiCommunity[i];
        }

        /* renamed from: a */
        private static VKApiCommunity m147445a(Parcel parcel) {
            return new VKApiCommunity(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147445a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147446a(i);
        }
    };

    /* renamed from: a */
    public String f121011a;

    /* renamed from: b */
    public String f121012b;

    /* renamed from: c */
    public int f121013c;

    /* renamed from: d */
    public boolean f121014d;

    /* renamed from: e */
    public int f121015e;

    /* renamed from: f */
    public boolean f121016f;

    /* renamed from: g */
    public int f121017g;

    /* renamed from: h */
    public String f121018h;

    /* renamed from: i */
    public String f121019i;

    /* renamed from: j */
    public String f121020j;

    /* renamed from: k */
    public VKPhotoSizes f121021k = new VKPhotoSizes();

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f121011a;
    }

    public VKApiCommunity() {
    }

    public VKApiCommunity(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f121011a = parcel.readString();
        this.f121012b = parcel.readString();
        this.f121013c = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121014d = z;
        this.f121015e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121016f = z2;
        this.f121017g = parcel.readInt();
        this.f121018h = parcel.readString();
        this.f121019i = parcel.readString();
        this.f121020j = parcel.readString();
        this.f121021k = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public VKApiCommunity mo118471c(JSONObject jSONObject) {
        super.mo118445b(jSONObject);
        this.f121011a = jSONObject.optString("name");
        this.f121012b = jSONObject.optString("screen_name", C1642a.m8034a("club%d", new Object[]{Integer.valueOf(Math.abs(this.f121102F))}));
        this.f121013c = jSONObject.optInt("is_closed");
        this.f121014d = C47208b.m147655a(jSONObject, "is_admin");
        this.f121015e = jSONObject.optInt("admin_level");
        this.f121016f = C47208b.m147655a(jSONObject, "is_member");
        this.f121018h = jSONObject.optString("photo_50", "http://vk.com/images/community_50.gif");
        if (!TextUtils.isEmpty(this.f121018h)) {
            this.f121021k.mo118624a((VKApiModel) VKApiPhotoSize.m147521a(this.f121018h, 50));
        }
        this.f121019i = jSONObject.optString("photo_100", "http://vk.com/images/community_100.gif");
        if (!TextUtils.isEmpty(this.f121019i)) {
            this.f121021k.mo118624a((VKApiModel) VKApiPhotoSize.m147521a(this.f121019i, 100));
        }
        this.f121020j = jSONObject.optString("photo_200", null);
        if (!TextUtils.isEmpty(this.f121020j)) {
            this.f121021k.mo118624a((VKApiModel) VKApiPhotoSize.m147521a(this.f121020j, C34943c.f91127w));
        }
        this.f121021k.mo118656a();
        String optString = jSONObject.optString("type", "group");
        if ("group".equals(optString)) {
            this.f121017g = 0;
        } else if ("page".equals(optString)) {
            this.f121017g = 1;
        } else if ("event".equals(optString)) {
            this.f121017g = 2;
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f121011a);
        parcel.writeString(this.f121012b);
        parcel.writeInt(this.f121013c);
        parcel.writeByte(this.f121014d ? (byte) 1 : 0);
        parcel.writeInt(this.f121015e);
        parcel.writeByte(this.f121016f ? (byte) 1 : 0);
        parcel.writeInt(this.f121017g);
        parcel.writeString(this.f121018h);
        parcel.writeString(this.f121019i);
        parcel.writeString(this.f121020j);
        parcel.writeParcelable(this.f121021k, i);
    }
}
