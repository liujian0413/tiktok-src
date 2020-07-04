package com.bytedance.android.livesdk.log;

import com.bytedance.android.live.core.p148d.C3172e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.log.h */
public final class C8449h {

    /* renamed from: a */
    private JSONObject f23110a = new JSONObject();

    /* renamed from: b */
    private JSONObject f23111b = new JSONObject();

    /* renamed from: a */
    public final C8449h mo21614a(JSONObject jSONObject) {
        this.f23111b = jSONObject;
        return this;
    }

    /* renamed from: b */
    public final C8449h mo21617b(JSONObject jSONObject) {
        this.f23110a = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final void mo21615a(String str) {
        mo21616a(str, 0);
    }

    /* renamed from: a */
    public final C8449h mo21612a(String str, float f) {
        try {
            this.f23110a.put(str, (double) f);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C8449h mo21613a(String str, Object obj) {
        try {
            this.f23111b.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final void mo21616a(String str, int i) {
        C3172e.m12003a(str, i, this.f23110a, this.f23111b);
    }
}
