package com.p280ss.android.ugc.aweme.sdk.iap.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.d */
public final class C37372d {

    /* renamed from: a */
    public final String f97596a;

    /* renamed from: b */
    public final String f97597b;

    /* renamed from: c */
    public final String f97598c;

    /* renamed from: d */
    public final long f97599d;

    /* renamed from: e */
    public final String f97600e;

    /* renamed from: f */
    public final String f97601f;

    /* renamed from: g */
    public final String f97602g;

    /* renamed from: h */
    private final String f97603h;

    /* renamed from: i */
    private final String f97604i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuDetails:");
        sb.append(this.f97604i);
        return sb.toString();
    }

    public C37372d(String str, String str2) throws JSONException {
        this.f97603h = str;
        this.f97604i = str2;
        JSONObject jSONObject = new JSONObject(this.f97604i);
        this.f97596a = jSONObject.optString("productId");
        this.f97597b = jSONObject.optString("type");
        this.f97598c = jSONObject.optString("price");
        this.f97599d = jSONObject.optLong("price_amount_micros");
        this.f97600e = jSONObject.optString("price_currency_code");
        this.f97601f = jSONObject.optString("title");
        this.f97602g = jSONObject.optString("description");
    }
}
