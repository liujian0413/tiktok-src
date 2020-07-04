package com.facebook.internal.p729a.p731b;

import com.facebook.internal.p729a.C13869b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.b.a */
public final class C13871a {

    /* renamed from: a */
    private String f36744a;

    /* renamed from: b */
    private String f36745b;

    /* renamed from: c */
    private Long f36746c;

    /* renamed from: c */
    public final void mo33510c() {
        C13869b.m40959a(this.f36744a);
    }

    /* renamed from: a */
    public final boolean mo33508a() {
        if (this.f36745b == null || this.f36746c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo33509b() {
        if (mo33508a()) {
            C13869b.m40957a(this.f36744a, toString());
        }
    }

    public final String toString() {
        JSONObject d = m40964d();
        if (d == null) {
            return null;
        }
        return d.toString();
    }

    /* renamed from: d */
    private JSONObject m40964d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f36746c != null) {
                jSONObject.put("timestamp", this.f36746c);
            }
            jSONObject.put("error_message", this.f36745b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo33507a(C13871a aVar) {
        if (this.f36746c == null) {
            return -1;
        }
        if (aVar.f36746c == null) {
            return 1;
        }
        return aVar.f36746c.compareTo(this.f36746c);
    }

    public C13871a(File file) {
        this.f36744a = file.getName();
        JSONObject a = C13869b.m40956a(this.f36744a, true);
        if (a != null) {
            this.f36746c = Long.valueOf(a.optLong("timestamp", 0));
            this.f36745b = a.optString("error_message", null);
        }
    }

    public C13871a(String str) {
        this.f36746c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f36745b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(this.f36746c);
        stringBuffer.append(".json");
        this.f36744a = stringBuffer.toString();
    }
}
