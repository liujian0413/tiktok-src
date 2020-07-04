package com.bytedance.apm.p241f.p243b;

import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.b */
public final class C6199b implements C6201d {

    /* renamed from: a */
    public String f18256a;

    /* renamed from: b */
    public JSONObject f18257b;

    /* renamed from: c */
    public boolean f18258c;

    /* renamed from: b */
    public final String mo14928b() {
        return "common_log";
    }

    /* renamed from: c */
    public final String mo14929c() {
        return "common_log";
    }

    /* renamed from: d */
    public final boolean mo14930d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo14931e() {
        return this.f18258c;
    }

    /* renamed from: a */
    public final JSONObject mo14926a() {
        if (this.f18257b == null) {
            return null;
        }
        try {
            this.f18257b.put("log_type", this.f18256a);
        } catch (JSONException unused) {
        }
        return this.f18257b;
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return cVar.mo14918a(this.f18256a);
    }

    public C6199b(String str, JSONObject jSONObject, boolean z) {
        this.f18256a = str;
        this.f18257b = jSONObject;
        this.f18258c = z;
    }
}
