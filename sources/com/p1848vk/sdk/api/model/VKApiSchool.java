package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C1642a;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiSchool */
public class VKApiSchool extends VKApiModel implements Parcelable, C47207a {
    public static Creator<VKApiSchool> CREATOR = new Creator<VKApiSchool>() {
        /* renamed from: a */
        private static VKApiSchool[] m147559a(int i) {
            return new VKApiSchool[i];
        }

        /* renamed from: a */
        private static VKApiSchool m147558a(Parcel parcel) {
            return new VKApiSchool(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147558a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147559a(i);
        }
    };

    /* renamed from: a */
    public int f121181a;

    /* renamed from: b */
    public int f121182b;

    /* renamed from: c */
    public int f121183c;

    /* renamed from: d */
    public String f121184d;

    /* renamed from: e */
    public int f121185e;

    /* renamed from: f */
    public int f121186f;

    /* renamed from: g */
    public int f121187g;

    /* renamed from: h */
    public String f121188h;

    /* renamed from: i */
    public String f121189i;

    /* renamed from: j */
    private String f121190j;

    public VKApiSchool() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (this.f121190j == null) {
            StringBuilder sb = new StringBuilder(this.f121184d);
            if (this.f121187g != 0) {
                sb.append(" '");
                sb.append(C1642a.m8034a("%02d", new Object[]{Integer.valueOf(this.f121187g % 100)}));
            }
            if (!(this.f121185e == 0 || this.f121186f == 0)) {
                sb.append(", ");
                sb.append(this.f121185e);
                sb.append('-');
                sb.append(this.f121186f);
            }
            if (!TextUtils.isEmpty(this.f121188h)) {
                sb.append('(');
                sb.append(this.f121188h);
                sb.append(')');
            }
            if (!TextUtils.isEmpty(this.f121189i)) {
                sb.append(", ");
                sb.append(this.f121189i);
            }
            this.f121190j = sb.toString();
        }
        return this.f121190j;
    }

    public VKApiSchool(Parcel parcel) {
        this.f121181a = parcel.readInt();
        this.f121182b = parcel.readInt();
        this.f121183c = parcel.readInt();
        this.f121184d = parcel.readString();
        this.f121185e = parcel.readInt();
        this.f121186f = parcel.readInt();
        this.f121187g = parcel.readInt();
        this.f121188h = parcel.readString();
        this.f121189i = parcel.readString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiSchool mo118445b(JSONObject jSONObject) {
        this.f121181a = jSONObject.optInt("id");
        this.f121182b = jSONObject.optInt("country_id");
        this.f121183c = jSONObject.optInt("city_id");
        this.f121184d = jSONObject.optString("name");
        this.f121185e = jSONObject.optInt("year_from");
        this.f121186f = jSONObject.optInt("year_to");
        this.f121187g = jSONObject.optInt("year_graduated");
        this.f121188h = jSONObject.optString("class");
        this.f121189i = jSONObject.optString("speciality");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121181a);
        parcel.writeInt(this.f121182b);
        parcel.writeInt(this.f121183c);
        parcel.writeString(this.f121184d);
        parcel.writeInt(this.f121185e);
        parcel.writeInt(this.f121186f);
        parcel.writeInt(this.f121187g);
        parcel.writeString(this.f121188h);
        parcel.writeString(this.f121189i);
    }
}
