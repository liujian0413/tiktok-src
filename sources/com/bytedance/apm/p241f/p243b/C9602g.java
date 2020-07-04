package com.bytedance.apm.p241f.p243b;

import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.g */
public final class C9602g implements C6201d {

    /* renamed from: a */
    public String f26252a;

    /* renamed from: b */
    public String f26253b;

    /* renamed from: c */
    public JSONObject f26254c;

    /* renamed from: d */
    public JSONObject f26255d;

    /* renamed from: b */
    public final String mo14928b() {
        return "ui_action";
    }

    /* renamed from: c */
    public final String mo14929c() {
        return "ui_action";
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
        try {
            if (this.f26255d == null) {
                this.f26255d = new JSONObject();
            }
            this.f26255d.put("log_type", "ui_action");
            this.f26255d.put("action", this.f26252a);
            this.f26255d.put("page", this.f26253b);
            this.f26255d.put("context", this.f26254c);
            return this.f26255d;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return cVar.mo14918a("ui_action");
    }

    public C9602g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f26252a = str;
        this.f26253b = str2;
        this.f26254c = jSONObject;
        this.f26255d = jSONObject2;
    }
}
