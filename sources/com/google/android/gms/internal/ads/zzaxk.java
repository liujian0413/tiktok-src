package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class zzaxk extends AbstractSafeParcelable {
    public static final Creator<zzaxk> CREATOR = new C16127vy();

    /* renamed from: a */
    public final boolean f45650a;

    /* renamed from: b */
    public final List<String> f45651b;

    public zzaxk() {
        this(false, Collections.emptyList());
    }

    public zzaxk(boolean z, List<String> list) {
        this.f45650a = z;
        this.f45651b = list;
    }

    /* renamed from: a */
    public static zzaxk m52666a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaxk();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    acd.m45780c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaxk(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 2, this.f45650a);
        C15269a.m44466b(parcel, 3, this.f45651b, false);
        C15269a.m44443a(parcel, a);
    }
}
