package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import org.json.JSONObject;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.v */
final /* synthetic */ class C4210v implements C7327h {

    /* renamed from: a */
    private final String f12311a;

    /* renamed from: b */
    private final JSONObject f12312b;

    /* renamed from: c */
    private final JSONObject f12313c;

    /* renamed from: d */
    private final JSONObject f12314d;

    C4210v(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f12311a = str;
        this.f12312b = jSONObject;
        this.f12313c = jSONObject2;
        this.f12314d = jSONObject3;
    }

    public final Object apply(Object obj) {
        return C4208u.m14329a(this.f12311a, this.f12312b, this.f12313c, this.f12314d, (String) obj);
    }
}
