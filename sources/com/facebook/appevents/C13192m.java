package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C13499h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.m */
public class C13192m {

    /* renamed from: a */
    public static final String f34940a = "m";

    /* renamed from: b */
    public static ConcurrentHashMap<String, String> f34941b;

    /* renamed from: c */
    public static SharedPreferences f34942c;

    /* renamed from: d */
    public static AtomicBoolean f34943d = new AtomicBoolean(false);

    /* renamed from: a */
    static void m38565a() {
        if (!f34943d.get()) {
            m38567c();
        }
    }

    /* renamed from: b */
    static String m38566b() {
        if (!f34943d.get()) {
            m38567c();
        }
        return m38563a((Map<String, String>) f34941b);
    }

    /* renamed from: c */
    private static synchronized void m38567c() {
        synchronized (C13192m.class) {
            if (!f34943d.get()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g());
                f34942c = defaultSharedPreferences;
                f34941b = new ConcurrentHashMap<>(m38564a(defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "")));
                f34943d.set(true);
            }
        }
    }

    /* renamed from: a */
    private static String m38563a(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static Map<String, String> m38564a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
