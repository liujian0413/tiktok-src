package com.bytedance.apm.p241f.p243b;

import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.f */
public final class C9601f implements C6201d {

    /* renamed from: a */
    public String f26246a;

    /* renamed from: b */
    public int f26247b;

    /* renamed from: c */
    public JSONObject f26248c;

    /* renamed from: d */
    public JSONObject f26249d;

    /* renamed from: e */
    public JSONObject f26250e;

    /* renamed from: f */
    public JSONObject f26251f;

    /* renamed from: b */
    public final String mo14928b() {
        return "service_monitor";
    }

    /* renamed from: c */
    public final String mo14929c() {
        return "service_monitor";
    }

    /* renamed from: d */
    public final boolean mo14930d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo14931e() {
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo14926a() {
        if (this.f26251f == null) {
            this.f26251f = new JSONObject();
        }
        try {
            this.f26251f.put("log_type", "service_monitor");
            this.f26251f.put("service", this.f26246a);
            this.f26251f.put("status", this.f26247b);
            if (this.f26248c != null) {
                this.f26251f.put("value", this.f26248c);
            }
            if (this.f26249d != null) {
                this.f26251f.put("category", this.f26249d);
            }
            if (this.f26250e != null) {
                this.f26251f.put("metric", this.f26250e);
            }
            return this.f26251f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return cVar.mo14921b(this.f26246a);
    }

    public C9601f(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f26246a = str;
        this.f26247b = i;
        this.f26248c = jSONObject;
        this.f26249d = jSONObject2;
        this.f26250e = jSONObject3;
        this.f26251f = jSONObject4;
    }
}
