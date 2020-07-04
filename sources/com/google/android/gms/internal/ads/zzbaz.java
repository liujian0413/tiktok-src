package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.C14916b;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import org.json.JSONArray;
import org.json.JSONException;

@C6505uv
public final class zzbaz extends AbstractSafeParcelable {
    public static final Creator<zzbaz> CREATOR = new C16224zn();

    /* renamed from: a */
    public final String f45667a;

    /* renamed from: b */
    public final int f45668b;

    public zzbaz(C14916b bVar) {
        this(bVar.mo37946a(), bVar.mo37947b());
    }

    public zzbaz(String str, int i) {
        this.f45667a = str;
        this.f45668b = i;
    }

    /* renamed from: a */
    public static zzbaz m52671a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbaz(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    /* renamed from: a */
    public static zzbaz m52670a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m52671a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45667a, false);
        C15269a.m44447a(parcel, 3, this.f45668b);
        C15269a.m44443a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzbaz)) {
            return false;
        }
        zzbaz zzbaz = (zzbaz) obj;
        if (!C15265q.m44381a(this.f45667a, zzbaz.f45667a) || !C15265q.m44381a(Integer.valueOf(this.f45668b), Integer.valueOf(zzbaz.f45668b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f45667a, Integer.valueOf(this.f45668b));
    }
}
