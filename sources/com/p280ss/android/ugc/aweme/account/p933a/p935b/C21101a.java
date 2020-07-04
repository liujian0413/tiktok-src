package com.p280ss.android.ugc.aweme.account.p933a.p935b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.a.b.a */
public final class C21101a {

    /* renamed from: a */
    public HashMap<String, Object> f56671a = new HashMap<>();

    /* renamed from: a */
    public static C21101a m71159a() {
        return new C21101a();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo56943b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f56671a);
    }

    /* renamed from: a */
    public final C21101a mo56939a(String str, Boolean bool) {
        this.f56671a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C21101a mo56940a(String str, Integer num) {
        this.f56671a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C21101a mo56941a(String str, Long l) {
        this.f56671a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C21101a mo56942a(String str, String str2) {
        this.f56671a.put(str, str2);
        return this;
    }
}
