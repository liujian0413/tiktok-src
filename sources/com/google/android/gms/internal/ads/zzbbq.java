package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class zzbbq extends AbstractSafeParcelable {
    public static final Creator<zzbbq> CREATOR = new aae();

    /* renamed from: a */
    public final String f45669a;

    /* renamed from: b */
    public final String f45670b;

    /* renamed from: c */
    public final boolean f45671c;

    /* renamed from: d */
    public final boolean f45672d;

    /* renamed from: e */
    public final List<String> f45673e;

    /* renamed from: f */
    public final boolean f45674f;

    /* renamed from: g */
    public final boolean f45675g;

    /* renamed from: h */
    public final List<String> f45676h;

    public zzbbq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f45669a = str;
        this.f45670b = str2;
        this.f45671c = z;
        this.f45672d = z2;
        this.f45673e = list;
        this.f45674f = z3;
        this.f45675g = z4;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.f45676h = list2;
    }

    /* renamed from: a */
    public static zzbbq m52672a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        zzbbq zzbbq = new zzbbq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), aek.m45691a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), aek.m45691a(jSONObject.optJSONArray("webview_permissions"), null));
        return zzbbq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45669a, false);
        C15269a.m44457a(parcel, 3, this.f45670b, false);
        C15269a.m44459a(parcel, 4, this.f45671c);
        C15269a.m44459a(parcel, 5, this.f45672d);
        C15269a.m44466b(parcel, 6, this.f45673e, false);
        C15269a.m44459a(parcel, 7, this.f45674f);
        C15269a.m44459a(parcel, 8, this.f45675g);
        C15269a.m44466b(parcel, 9, this.f45676h, false);
        C15269a.m44443a(parcel, a);
    }
}
