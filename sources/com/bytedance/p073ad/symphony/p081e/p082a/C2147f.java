package com.bytedance.p073ad.symphony.p081e.p082a;

import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.f */
public final class C2147f {

    /* renamed from: f */
    private static C2147f f7293f;

    /* renamed from: a */
    public boolean f7294a;

    /* renamed from: b */
    public long f7295b = 300000;

    /* renamed from: c */
    public boolean f7296c;

    /* renamed from: d */
    public boolean f7297d;

    /* renamed from: e */
    public boolean f7298e;

    private C2147f() {
    }

    /* renamed from: a */
    public static C2147f m9372a() {
        if (f7293f == null) {
            f7293f = new C2147f();
        }
        return f7293f;
    }

    /* renamed from: a */
    public static C2147f m9373a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return m9372a();
        }
        C2147f fVar = new C2147f();
        fVar.f7294a = jSONObject.optBoolean("bid_log_switch", false);
        fVar.f7295b = jSONObject.optLong("bid_ad_request_expire_time", 300000);
        fVar.f7296c = jSONObject.optBoolean("enable_upload_material", false);
        fVar.f7297d = jSONObject.optBoolean("send_bid_loss_ahead", false);
        fVar.f7298e = jSONObject.optBoolean("enable_send_content_url", false);
        return fVar;
    }
}
