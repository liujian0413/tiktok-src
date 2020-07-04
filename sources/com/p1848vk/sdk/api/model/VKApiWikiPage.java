package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiWikiPage */
public class VKApiWikiPage extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiWikiPage> CREATOR = new Creator<VKApiWikiPage>() {
        /* renamed from: a */
        private static VKApiWikiPage[] m147595a(int i) {
            return new VKApiWikiPage[i];
        }

        /* renamed from: a */
        private static VKApiWikiPage m147594a(Parcel parcel) {
            return new VKApiWikiPage(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147594a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147595a(i);
        }
    };

    /* renamed from: a */
    public int f121314a;

    /* renamed from: b */
    public int f121315b;

    /* renamed from: c */
    public int f121316c;

    /* renamed from: d */
    public String f121317d;

    /* renamed from: e */
    public String f121318e;

    /* renamed from: f */
    public boolean f121319f;

    /* renamed from: g */
    public boolean f121320g;

    /* renamed from: h */
    public int f121321h;

    /* renamed from: i */
    public int f121322i;

    /* renamed from: j */
    public int f121323j;

    /* renamed from: k */
    public long f121324k;

    /* renamed from: l */
    public long f121325l;

    /* renamed from: m */
    public String f121326m;

    /* renamed from: n */
    public String f121327n;

    public VKApiWikiPage() {
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "page";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        StringBuilder sb = new StringBuilder("page");
        sb.append(this.f121315b);
        sb.append('_');
        sb.append(this.f121314a);
        return sb;
    }

    public VKApiWikiPage(Parcel parcel) {
        boolean z;
        this.f121314a = parcel.readInt();
        this.f121315b = parcel.readInt();
        this.f121316c = parcel.readInt();
        this.f121317d = parcel.readString();
        this.f121318e = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121319f = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f121320g = z2;
        this.f121321h = parcel.readInt();
        this.f121322i = parcel.readInt();
        this.f121323j = parcel.readInt();
        this.f121324k = parcel.readLong();
        this.f121325l = parcel.readLong();
        this.f121326m = parcel.readString();
        this.f121327n = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiWikiPage mo118445b(JSONObject jSONObject) {
        this.f121314a = jSONObject.optInt("id");
        this.f121315b = jSONObject.optInt("group_id");
        this.f121316c = jSONObject.optInt("creator_id");
        this.f121317d = jSONObject.optString("title");
        this.f121318e = jSONObject.optString("source");
        this.f121319f = C47208b.m147655a(jSONObject, "current_user_can_edit");
        this.f121320g = C47208b.m147655a(jSONObject, "current_user_can_edit_access");
        this.f121321h = jSONObject.optInt("who_can_view");
        this.f121322i = jSONObject.optInt("who_can_edit");
        this.f121323j = jSONObject.optInt("editor_id");
        this.f121324k = jSONObject.optLong("edited");
        this.f121325l = jSONObject.optLong("created");
        this.f121326m = jSONObject.optString("parent");
        this.f121327n = jSONObject.optString("parent2");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121314a);
        parcel.writeInt(this.f121315b);
        parcel.writeInt(this.f121316c);
        parcel.writeString(this.f121317d);
        parcel.writeString(this.f121318e);
        parcel.writeByte(this.f121319f ? (byte) 1 : 0);
        parcel.writeByte(this.f121320g ? (byte) 1 : 0);
        parcel.writeInt(this.f121321h);
        parcel.writeInt(this.f121322i);
        parcel.writeInt(this.f121323j);
        parcel.writeLong(this.f121324k);
        parcel.writeLong(this.f121325l);
        parcel.writeString(this.f121326m);
        parcel.writeString(this.f121327n);
    }
}
