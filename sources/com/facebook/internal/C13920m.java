package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
public final class C13920m {

    /* renamed from: a */
    public static final AtomicBoolean f36828a = new AtomicBoolean(false);

    /* renamed from: b */
    public static Long f36829b;

    /* renamed from: c */
    private static final String f36830c = C13920m.class.getCanonicalName();

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<C13923a> f36831d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f36832e = new ConcurrentHashMap();

    /* renamed from: com.facebook.internal.m$a */
    public interface C13923a {
        /* renamed from: a */
        void mo33494a();
    }

    /* renamed from: b */
    private static void m41092b() {
        m41089a((C13923a) null);
    }

    /* renamed from: a */
    public static void m41088a() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (!f36831d.isEmpty()) {
            final C13923a aVar = (C13923a) f36831d.poll();
            if (aVar != null) {
                handler.post(new Runnable() {
                    public final void run() {
                        aVar.mo33494a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static boolean m41090a(Long l) {
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m41085a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C13499h.m39723i());
        bundle.putString("fields", "gatekeepers");
        GraphRequest a = GraphRequest.m38252a((AccessToken) null, C1642a.m8034a("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (C13090b) null);
        a.f34684n = true;
        a.f34680j = bundle;
        return a.mo31788a().f34702b;
    }

    /* renamed from: a */
    static synchronized void m41089a(C13923a aVar) {
        synchronized (C13920m.class) {
            if (aVar != null) {
                try {
                    f36831d.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (m41090a(f36829b)) {
                m41088a();
                return;
            }
            final Context g = C13499h.m39721g();
            final String k = C13499h.m39725k();
            final String a = C1642a.m8034a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{k});
            if (g != null) {
                JSONObject jSONObject = null;
                String string = C7285c.m22838a(g, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(a, null);
                if (!C13967z.m41249a(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    if (jSONObject != null) {
                        m41086a(k, jSONObject);
                    }
                }
                Executor e = C13499h.m39719e();
                if (e != null) {
                    if (f36828a.compareAndSet(false, true)) {
                        e.execute(new Runnable() {
                            public final void run() {
                                JSONObject a = C13920m.m41085a(k);
                                if (a != null) {
                                    C13920m.m41086a(k, a);
                                    C7285c.m22838a(g, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(a, a.toString()).apply();
                                    C13920m.f36829b = Long.valueOf(System.currentTimeMillis());
                                }
                                C13920m.m41088a();
                                C13920m.f36828a.set(false);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized JSONObject m41086a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C13920m.class) {
            if (f36832e.containsKey(str)) {
                jSONObject2 = (JSONObject) f36832e.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException unused) {
                    }
                }
            }
            f36832e.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static JSONObject m41087a(String str, boolean z) {
        JSONObject a = m41085a(str);
        if (a == null) {
            return null;
        }
        Context g = C13499h.m39721g();
        C7285c.m22838a(g, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(C1642a.m8034a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), a.toString()).apply();
        return m41086a(str, a);
    }

    /* renamed from: a */
    public static boolean m41091a(String str, String str2, boolean z) {
        m41092b();
        if (str2 == null || !f36832e.containsKey(str2)) {
            return z;
        }
        return ((JSONObject) f36832e.get(str2)).optBoolean(str, z);
    }
}
