package com.bytedance.apm.p241f.p243b;

import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.d */
public final class C9599d implements C6201d {

    /* renamed from: a */
    public String f26237a;

    /* renamed from: b */
    public String f26238b;

    /* renamed from: c */
    public float f26239c;

    /* renamed from: b */
    public final String mo14928b() {
        return "timer";
    }

    /* renamed from: c */
    public final String mo14929c() {
        return "timer";
    }

    /* renamed from: d */
    public final boolean mo14930d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo14931e() {
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo14926a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f26237a);
            jSONObject.put("key", this.f26238b);
            jSONObject.put("value", (double) this.f26239c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return cVar.mo14923c(this.f26237a);
    }

    public C9599d(String str, String str2, float f) {
        this.f26237a = str;
        this.f26238b = str2;
        this.f26239c = f;
    }
}
