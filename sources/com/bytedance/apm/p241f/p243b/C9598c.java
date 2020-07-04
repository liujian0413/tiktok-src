package com.bytedance.apm.p241f.p243b;

import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.c */
public final class C9598c implements C6201d {

    /* renamed from: a */
    private String f26235a;

    /* renamed from: b */
    private JSONObject f26236b;

    /* renamed from: b */
    public final String mo14928b() {
        return this.f26235a;
    }

    /* renamed from: c */
    public final String mo14929c() {
        return this.f26235a;
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
        if (this.f26236b == null) {
            return null;
        }
        try {
            this.f26236b.put("log_type", this.f26235a);
        } catch (JSONException unused) {
        }
        return this.f26236b;
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return cVar.mo14918a(this.f26235a);
    }

    public C9598c(String str, JSONObject jSONObject) {
        this.f26235a = str;
        this.f26236b = jSONObject;
    }
}
