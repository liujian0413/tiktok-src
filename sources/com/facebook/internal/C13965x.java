package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.x */
final class C13965x {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f36940a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m41206a(String str) {
        return (JSONObject) f36940a.get(str);
    }

    /* renamed from: a */
    public static void m41207a(String str, JSONObject jSONObject) {
        f36940a.put(str, jSONObject);
    }
}
