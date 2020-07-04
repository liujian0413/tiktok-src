package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xg */
public final class C16163xg {

    /* renamed from: a */
    public final String f45326a;

    /* renamed from: b */
    public final String f45327b;

    /* renamed from: c */
    public final boolean f45328c;

    /* renamed from: d */
    public final String f45329d;

    /* renamed from: e */
    public String f45330e;

    /* renamed from: f */
    public final int f45331f;

    /* renamed from: g */
    public final boolean f45332g;

    /* renamed from: h */
    public final String f45333h;

    /* renamed from: i */
    public final boolean f45334i;

    /* renamed from: j */
    private final List<String> f45335j;

    /* renamed from: k */
    private final String f45336k;

    /* renamed from: l */
    private final String f45337l;

    /* renamed from: m */
    private final JSONObject f45338m;

    public C16163xg(JSONObject jSONObject) {
        List<String> list;
        this.f45330e = jSONObject.optString("url");
        this.f45326a = jSONObject.optString("base_uri");
        this.f45327b = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.f45328c = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f45337l = jSONObject.optString("request_id");
        this.f45336k = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.f45335j = list;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f45331f = i;
        this.f45329d = jSONObject.optString("fetched_ad");
        this.f45332g = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f45338m = optJSONObject;
        this.f45333h = jSONObject.optString("analytics_query_ad_event_id");
        this.f45334i = jSONObject.optBoolean("is_analytics_logging_enabled");
    }
}
