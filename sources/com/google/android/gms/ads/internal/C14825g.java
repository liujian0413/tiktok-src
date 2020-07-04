package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.aft;
import com.google.android.gms.internal.ads.afy;
import com.google.android.gms.internal.ads.agj;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.g */
final /* synthetic */ class C14825g implements aft {

    /* renamed from: a */
    static final aft f38347a = new C14825g();

    private C14825g() {
    }

    /* renamed from: a */
    public final agj mo37772a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C14793ay.m42898d().mo39100j().mo39153f(jSONObject.getString("appSettingsJson"));
        }
        return afy.m45817a(null);
    }
}
