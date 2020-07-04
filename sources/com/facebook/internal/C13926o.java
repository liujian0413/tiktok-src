package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.appevents.codeless.internal.C13147c;
import com.facebook.appevents.internal.C13174d;
import com.facebook.appevents.internal.C13176e;
import com.facebook.appevents.internal.C13182g;
import com.facebook.internal.C13924n.C13925a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.o */
public final class C13926o {

    /* renamed from: a */
    public static final String f36856a = "o";

    /* renamed from: b */
    public static final Map<String, C13924n> f36857b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final AtomicReference<C13931a> f36858c = new AtomicReference<>(C13931a.NOT_LOADED);

    /* renamed from: d */
    public static boolean f36859d = false;

    /* renamed from: e */
    private static final String[] f36860e = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params"};

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<C13932b> f36861f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private static boolean f36862g = false;

    /* renamed from: h */
    private static JSONArray f36863h = null;

    /* renamed from: com.facebook.internal.o$a */
    enum C13931a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.o$b */
    public interface C13932b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m41103b() {
        /*
            java.lang.Class<com.facebook.internal.o> r0 = com.facebook.internal.C13926o.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.o$a> r1 = f36858c     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$a r1 = (com.facebook.internal.C13926o.C13931a) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$a r2 = com.facebook.internal.C13926o.C13931a.NOT_LOADED     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            com.facebook.internal.o$a r2 = com.facebook.internal.C13926o.C13931a.LOADING     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.String r2 = com.facebook.C13499h.m39725k()     // Catch:{ all -> 0x0071 }
            java.util.Map<java.lang.String, com.facebook.internal.n> r3 = f36857b     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.n r2 = (com.facebook.internal.C13924n) r2     // Catch:{ all -> 0x0071 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0071 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$a r4 = com.facebook.internal.C13926o.C13931a.ERROR     // Catch:{ all -> 0x0071 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.o$b> r1 = f36861f     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.o$b> r1 = f36861f     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$b r1 = (com.facebook.internal.C13926o.C13932b) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$2 r2 = new com.facebook.internal.o$2     // Catch:{ all -> 0x0071 }
            r2.<init>(r1)     // Catch:{ all -> 0x0071 }
            r3.post(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0039
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.o$b> r1 = f36861f     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x006d
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.o$b> r1 = f36861f     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$b r1 = (com.facebook.internal.C13926o.C13932b) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o$3 r4 = new com.facebook.internal.o$3     // Catch:{ all -> 0x0071 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0071 }
            r3.post(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            return
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13926o.m41103b():void");
    }

    /* renamed from: a */
    public static void m41101a() {
        boolean z;
        final Context g = C13499h.m39721g();
        final String k = C13499h.m39725k();
        if (C13967z.m41249a(k)) {
            f36858c.set(C13931a.ERROR);
            m41103b();
        } else if (f36857b.containsKey(k)) {
            f36858c.set(C13931a.SUCCESS);
            m41103b();
        } else {
            if (f36858c.compareAndSet(C13931a.NOT_LOADED, C13931a.LOADING) || f36858c.compareAndSet(C13931a.ERROR, C13931a.LOADING)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m41103b();
                return;
            }
            final String a = C1642a.m8034a("com.facebook.internal.APP_SETTINGS.%s", new Object[]{k});
            C13499h.m39719e().execute(new Runnable() {
                public final void run() {
                    C13931a aVar;
                    JSONObject jSONObject;
                    SharedPreferences a = C7285c.m22838a(g, "com.facebook.internal.preferences.APP_SETTINGS", 0);
                    C13924n nVar = null;
                    String string = a.getString(a, null);
                    if (!C13967z.m41249a(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            nVar = C13926o.m41098a(k, jSONObject);
                        }
                    }
                    JSONObject b = C13926o.m41102b(k);
                    if (b != null) {
                        C13926o.m41098a(k, b);
                        a.edit().putString(a, b.toString()).apply();
                    }
                    if (nVar != null) {
                        String str = nVar.f36849m;
                        if (!C13926o.f36859d && str != null && str.length() > 0) {
                            C13926o.f36859d = true;
                        }
                    }
                    C13920m.m41087a(k, true);
                    C13174d.m38498a();
                    C13176e.m38502a();
                    AtomicReference<C13931a> atomicReference = C13926o.f36858c;
                    if (C13926o.f36857b.containsKey(k)) {
                        aVar = C13931a.SUCCESS;
                    } else {
                        aVar = C13931a.ERROR;
                    }
                    atomicReference.set(aVar);
                    C13926o.m41103b();
                }
            });
        }
    }

    /* renamed from: a */
    public static C13924n m41097a(String str) {
        if (str != null) {
            return (C13924n) f36857b.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONObject m41102b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f36860e))));
        GraphRequest a = GraphRequest.m38252a((AccessToken) null, str, (C13090b) null);
        a.f34684n = true;
        a.f34680j = bundle;
        return a.mo31788a().f34702b;
    }

    /* renamed from: a */
    private static Map<String, Map<String, C13925a>> m41100a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C13925a a = C13925a.m41095a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        String str = a.f36852a;
                        Map map = (Map) hashMap.get(str);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(str, map);
                        }
                        map.put(a.f36853b, a);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C13924n m41099a(String str, boolean z) {
        if (!z && f36857b.containsKey(str)) {
            return (C13924n) f36857b.get(str);
        }
        JSONObject b = m41102b(str);
        if (b == null) {
            return null;
        }
        C13924n a = m41098a(str, b);
        if (str.equals(C13499h.m39725k())) {
            f36858c.set(C13931a.SUCCESS);
            m41103b();
        }
        return a;
    }

    /* renamed from: a */
    public static C13924n m41098a(String str, JSONObject jSONObject) {
        C13912i a;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        final JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            a = C13912i.m41073a();
        } else {
            a = C13912i.m41074a(optJSONArray);
        }
        C13912i iVar = a;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((optInt & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f36863h = optJSONArray2;
        if (optJSONArray2 != null && C13946r.m41124b()) {
            C13147c.m38426a(optJSONArray2.toString());
        }
        C13924n nVar = new C13924n(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", 60), SmartLoginOption.parseOptions(jSONObject2.optLong("seamless_login")), m41100a(jSONObject2.optJSONObject("android_dialog_configs")), z, iVar, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4);
        f36857b.put(str, nVar);
        C13499h.m39719e().execute(new Runnable() {
            public final void run() {
                C13182g.m38525a(jSONObject2.optString("restrictive_data_filter_params"));
            }
        });
        return nVar;
    }
}
