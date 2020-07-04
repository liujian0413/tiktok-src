package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class abn {

    /* renamed from: a */
    public final long f39913a;

    /* renamed from: b */
    public final Map<String, C15916ob> f39914b = new HashMap();

    /* renamed from: c */
    public String f39915c;

    /* renamed from: d */
    public String f39916d;

    /* renamed from: e */
    public boolean f39917e;

    /* renamed from: f */
    private final List<String> f39918f = new ArrayList();

    /* renamed from: g */
    private final List<String> f39919g = new ArrayList();

    /* renamed from: h */
    private JSONObject f39920h;

    public abn(String str, long j) {
        this.f39917e = false;
        this.f39916d = str;
        this.f39913a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f39920h = new JSONObject(str);
                if (this.f39920h.optInt("status", -1) != 1) {
                    this.f39917e = false;
                    acd.m45783e("App settings could not be fetched successfully.");
                    return;
                }
                this.f39917e = true;
                this.f39915c = this.f39920h.optString("app_id");
                JSONArray optJSONArray = this.f39920h.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f39919g.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                                    if (optJSONObject != null) {
                                        this.f39914b.put(optString2, new C15916ob(optJSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f39920h.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f39918f.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                acd.m45780c("Exception occurred while processing app setting json", e);
                C14793ay.m42898d().mo39089a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
