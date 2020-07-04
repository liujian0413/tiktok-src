package com.bytedance.apm.p241f.p243b;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.util.C6291h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.e */
public final class C9600e implements C6201d {

    /* renamed from: a */
    public String f26240a;

    /* renamed from: b */
    public String f26241b;

    /* renamed from: c */
    public boolean f26242c;

    /* renamed from: d */
    public JSONObject f26243d;

    /* renamed from: e */
    public JSONObject f26244e;

    /* renamed from: f */
    public JSONObject f26245f;

    public C9600e() {
    }

    /* renamed from: b */
    public final String mo14928b() {
        return "performance_monitor";
    }

    /* renamed from: d */
    public final boolean mo14930d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo14931e() {
        return false;
    }

    /* renamed from: c */
    public final String mo14929c() {
        return this.f26240a;
    }

    /* renamed from: a */
    public final JSONObject mo14926a() {
        try {
            if (this.f26245f == null) {
                this.f26245f = new JSONObject();
            }
            this.f26245f.put("log_type", "performance_monitor");
            this.f26245f.put("service", this.f26240a);
            if (!C6291h.m19522b(this.f26243d)) {
                this.f26245f.put("extra_values", this.f26243d);
            }
            if (TextUtils.equals("start", this.f26240a) && TextUtils.equals("from", this.f26245f.optString("monitor-plugin"))) {
                if (this.f26244e == null) {
                    this.f26244e = new JSONObject();
                }
                this.f26244e.put("start_mode", C6174c.m19148f());
            }
            if (!C6291h.m19522b(this.f26243d)) {
                this.f26245f.put("extra_status", this.f26244e);
            }
            return this.f26245f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C9600e mo23944a(String str) {
        this.f26240a = str;
        return this;
    }

    /* renamed from: b */
    public final C9600e mo23947b(String str) {
        this.f26241b = str;
        return this;
    }

    /* renamed from: c */
    public final C9600e mo23949c(JSONObject jSONObject) {
        this.f26245f = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final C9600e mo23945a(JSONObject jSONObject) {
        this.f26243d = jSONObject;
        return this;
    }

    /* renamed from: b */
    public final C9600e mo23948b(JSONObject jSONObject) {
        this.f26244e = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final C9600e mo23946a(boolean z) {
        this.f26242c = z;
        return this;
    }

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        if (this.f26242c || cVar.mo14921b(this.f26240a) || cVar.mo14923c(this.f26241b)) {
            return true;
        }
        return false;
    }

    public C9600e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, false, jSONObject, jSONObject2, jSONObject3);
    }

    public C9600e(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f26240a = str;
        this.f26241b = str2;
        this.f26242c = false;
        this.f26243d = jSONObject;
        this.f26244e = jSONObject2;
        this.f26245f = jSONObject3;
    }
}
