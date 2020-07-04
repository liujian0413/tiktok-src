package com.p280ss.android.ugc.aweme.app.p305g;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.g.c */
public final class C6869c {

    /* renamed from: a */
    public HashMap<String, Object> f19517a = new HashMap<>();

    /* renamed from: a */
    public static C6869c m21381a() {
        return new C6869c();
    }

    /* renamed from: b */
    public final JSONObject mo16888b() {
        try {
            return new JSONObject(this.f19517a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C6869c m21382a(JSONObject jSONObject) {
        C6869c a = m21381a();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    a.mo16887a(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C6869c mo16882a(String str, Boolean bool) {
        this.f19517a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C6869c mo16883a(String str, Double d) {
        this.f19517a.put(str, d);
        return this;
    }

    /* renamed from: a */
    public final C6869c mo16884a(String str, Float f) {
        this.f19517a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C6869c mo16885a(String str, Integer num) {
        this.f19517a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C6869c mo16886a(String str, Long l) {
        this.f19517a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C6869c mo16887a(String str, String str2) {
        this.f19517a.put(str, str2);
        return this;
    }
}
