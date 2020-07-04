package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C1642a;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUniversity */
public class VKApiUniversity extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiUniversity> CREATOR = new Creator<VKApiUniversity>() {
        /* renamed from: a */
        private static VKApiUniversity[] m147563a(int i) {
            return new VKApiUniversity[i];
        }

        /* renamed from: a */
        private static VKApiUniversity m147562a(Parcel parcel) {
            return new VKApiUniversity(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147562a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147563a(i);
        }
    };

    /* renamed from: a */
    public int f121191a;

    /* renamed from: b */
    public int f121192b;

    /* renamed from: c */
    public int f121193c;

    /* renamed from: d */
    public String f121194d;

    /* renamed from: e */
    public String f121195e;

    /* renamed from: f */
    public String f121196f;

    /* renamed from: g */
    public int f121197g;

    /* renamed from: h */
    public String f121198h;

    /* renamed from: i */
    public int f121199i;

    /* renamed from: j */
    public String f121200j;

    /* renamed from: k */
    public String f121201k;

    /* renamed from: l */
    private String f121202l;

    public VKApiUniversity() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (this.f121202l == null) {
            StringBuilder sb = new StringBuilder(this.f121194d);
            sb.append(" '");
            sb.append(C1642a.m8034a("%02d", new Object[]{Integer.valueOf(this.f121199i % 100)}));
            if (!TextUtils.isEmpty(this.f121196f)) {
                sb.append(", ");
                sb.append(this.f121196f);
            }
            if (!TextUtils.isEmpty(this.f121198h)) {
                sb.append(", ");
                sb.append(this.f121198h);
            }
            this.f121202l = sb.toString();
        }
        return this.f121202l;
    }

    public VKApiUniversity(Parcel parcel) {
        this.f121191a = parcel.readInt();
        this.f121192b = parcel.readInt();
        this.f121193c = parcel.readInt();
        this.f121194d = parcel.readString();
        this.f121195e = parcel.readString();
        this.f121196f = parcel.readString();
        this.f121197g = parcel.readInt();
        this.f121198h = parcel.readString();
        this.f121199i = parcel.readInt();
        this.f121200j = parcel.readString();
        this.f121201k = parcel.readString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiUniversity mo118445b(JSONObject jSONObject) {
        this.f121191a = jSONObject.optInt("id");
        this.f121192b = jSONObject.optInt("country_id");
        this.f121193c = jSONObject.optInt("city_id");
        this.f121194d = jSONObject.optString("name");
        this.f121195e = jSONObject.optString("faculty");
        this.f121196f = jSONObject.optString("faculty_name");
        this.f121197g = jSONObject.optInt("chair");
        this.f121198h = jSONObject.optString("chair_name");
        this.f121199i = jSONObject.optInt("graduation");
        this.f121200j = jSONObject.optString("education_form");
        this.f121201k = jSONObject.optString("education_status");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121191a);
        parcel.writeInt(this.f121192b);
        parcel.writeInt(this.f121193c);
        parcel.writeString(this.f121194d);
        parcel.writeString(this.f121195e);
        parcel.writeString(this.f121196f);
        parcel.writeInt(this.f121197g);
        parcel.writeString(this.f121198h);
        parcel.writeInt(this.f121199i);
        parcel.writeString(this.f121200j);
        parcel.writeString(this.f121201k);
    }
}
