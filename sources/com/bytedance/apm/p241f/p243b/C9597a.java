package com.bytedance.apm.p241f.p243b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6200c;
import com.bytedance.apm.p241f.C6201d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.a */
public final class C9597a implements C6201d {

    /* renamed from: a */
    public String f26227a;

    /* renamed from: b */
    public long f26228b;

    /* renamed from: c */
    public long f26229c;

    /* renamed from: d */
    public String f26230d;

    /* renamed from: e */
    public String f26231e;

    /* renamed from: f */
    public String f26232f;

    /* renamed from: g */
    public int f26233g;

    /* renamed from: h */
    public JSONObject f26234h;

    /* renamed from: a */
    public final boolean mo14927a(C6200c cVar) {
        return false;
    }

    /* renamed from: b */
    public final String mo14928b() {
        return null;
    }

    /* renamed from: c */
    public final String mo14929c() {
        return null;
    }

    /* renamed from: d */
    public final boolean mo14930d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo14931e() {
        return false;
    }

    /* renamed from: f */
    public final void mo23943f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trace_base", C6174c.m19155m());
            this.f26234h.put("relate_start_trace", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final JSONObject mo14926a() {
        if (TextUtils.isEmpty(this.f26227a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f26227a);
            jSONObject.put("duration", this.f26228b);
            jSONObject.put("uri", Uri.parse(this.f26230d));
            if (this.f26229c > 0) {
                jSONObject.put("timestamp", this.f26229c);
            }
            jSONObject.put("status", this.f26233g);
            if (!TextUtils.isEmpty(this.f26231e)) {
                jSONObject.put("ip", this.f26231e);
            }
            if (!TextUtils.isEmpty(this.f26232f)) {
                jSONObject.put("trace_code", this.f26232f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo23941a(String str) throws JSONException {
        if (this.f26234h.isNull("net_consume_type")) {
            this.f26234h.put("net_consume_type", str);
        }
    }

    /* renamed from: a */
    public final void mo23942a(boolean z) throws JSONException {
        if (this.f26234h.isNull("front")) {
            this.f26234h.put("front", z ? 1 : 0);
        }
    }

    public C9597a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.f26227a = str;
        this.f26228b = j;
        this.f26229c = j2;
        this.f26230d = str2;
        this.f26231e = str3;
        this.f26232f = str4;
        this.f26233g = i;
        if (jSONObject == null) {
            this.f26234h = new JSONObject();
        } else {
            this.f26234h = jSONObject;
        }
    }
}
