package com.p280ss.android.ugc.awemepushlib.p1713b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.b.c */
public final class C43592c {

    /* renamed from: a */
    public HashMap<String, Object> f112834a = new HashMap<>();

    /* renamed from: a */
    public static C43592c m138136a() {
        return new C43592c();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo105525b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f112834a);
    }

    /* renamed from: a */
    public final C43592c mo105522a(String str, Boolean bool) {
        this.f112834a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C43592c mo105523a(String str, Long l) {
        this.f112834a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C43592c mo105524a(String str, String str2) {
        this.f112834a.put(str, str2);
        return this;
    }
}
