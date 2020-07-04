package com.bytedance.android.livesdk.action.p182a;

import org.json.JSONObject;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.action.a.b */
final /* synthetic */ class C3857b implements C7327h {

    /* renamed from: a */
    private final C3855a f11555a;

    /* renamed from: b */
    private final JSONObject f11556b;

    /* renamed from: c */
    private final String f11557c;

    /* renamed from: d */
    private final JSONObject f11558d;

    /* renamed from: e */
    private final JSONObject f11559e;

    C3857b(C3855a aVar, JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f11555a = aVar;
        this.f11556b = jSONObject;
        this.f11557c = str;
        this.f11558d = jSONObject2;
        this.f11559e = jSONObject3;
    }

    public final Object apply(Object obj) {
        return this.f11555a.mo11404a(this.f11556b, this.f11557c, this.f11558d, this.f11559e, (String) obj);
    }
}
