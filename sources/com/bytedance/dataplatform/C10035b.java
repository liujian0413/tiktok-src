package com.bytedance.dataplatform;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.dataplatform.p508b.C10038a;
import com.bytedance.dataplatform.p508b.C10039b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.dataplatform.b */
final class C10035b {

    /* renamed from: a */
    private final String f27313a;

    /* renamed from: b */
    private JSONObject f27314b;

    /* renamed from: c */
    private final Map<String, Object> f27315c = new ConcurrentHashMap();

    /* renamed from: d */
    private C10046i f27316d;

    /* renamed from: e */
    private C10045h f27317e;

    /* renamed from: f */
    private SharedPreferences f27318f;

    /* renamed from: g */
    private SharedPreferences f27319g;

    /* renamed from: h */
    private C10043f f27320h;

    /* renamed from: i */
    private Application f27321i;

    /* renamed from: j */
    private Future f27322j;

    /* renamed from: a */
    public final void mo24680a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f27317e.mo24693a(this.f27313a));
            if (jSONObject.has("code")) {
                if (jSONObject.has("data")) {
                    if (jSONObject.optInt("code", -1) == 0) {
                        m29832a(jSONObject.getJSONObject("data"));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T mo24678a(java.lang.String r2, java.lang.reflect.Type r3, T r4, boolean r5) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r0 = 0
            if (r3 == r4) goto L_0x0059
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 != r4) goto L_0x000b
            goto L_0x0059
        L_0x000b:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r3 == r4) goto L_0x0054
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            if (r3 == r4) goto L_0x0054
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 == r4) goto L_0x0054
            java.lang.Class r4 = java.lang.Short.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 != r4) goto L_0x001c
            goto L_0x0054
        L_0x001c:
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            if (r3 == r4) goto L_0x004f
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 != r4) goto L_0x0025
            goto L_0x004f
        L_0x0025:
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            if (r3 == r4) goto L_0x004a
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 != r4) goto L_0x002e
            goto L_0x004a
        L_0x002e:
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            if (r3 == r4) goto L_0x0045
            java.lang.Class r4 = java.lang.Double.TYPE     // Catch:{ all -> 0x0066 }
            if (r3 != r4) goto L_0x0037
            goto L_0x0045
        L_0x0037:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L_0x0040
            java.lang.String r3 = r1.m29831a(r2, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x0040:
            java.lang.Object r3 = r1.m29830a(r2, r3, (T) r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x0045:
            java.lang.Double r3 = r1.m29826a(r2, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x004a:
            java.lang.Long r3 = r1.m29829a(r2, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x004f:
            java.lang.Float r3 = r1.m29827a(r2, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x0054:
            java.lang.Integer r3 = r1.m29828a(r2, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x0059:
            java.lang.Boolean r3 = r1.m29825a(r2, r0)     // Catch:{ all -> 0x0066 }
        L_0x005d:
            if (r5 == 0) goto L_0x0064
            com.bytedance.dataplatform.f r4 = r1.f27320h     // Catch:{ all -> 0x0066 }
            r4.mo24688a(r2)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r1)
            return r3
        L_0x0066:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.dataplatform.C10035b.mo24678a(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo24677a(String str, C10038a<T> aVar, boolean z) {
        int i;
        C10039b<T>[] bVarArr;
        C10038a<T> aVar2 = aVar;
        if (aVar2 == null || TextUtils.isEmpty(aVar2.f27325a) || aVar2.f27327c == null || aVar2.f27327c.length == 0) {
            return null;
        }
        String str2 = aVar2.f27325a;
        if (this.f27318f.contains(str2)) {
            i = this.f27318f.getInt(str2, 0);
        } else {
            int nextInt = new Random().nextInt(1000);
            this.f27318f.edit().putInt(str2, nextInt).apply();
            i = nextInt;
        }
        int i2 = (int) (aVar2.f27326b * 1000.0d);
        if (i < i2) {
            return null;
        }
        for (C10039b<T> bVar : aVar2.f27327c) {
            if (bVar != null) {
                double d = (double) i2;
                double d2 = bVar.f27331b * 1000.0d;
                Double.isNaN(d);
                i2 = (int) (d + d2);
                if (i < i2) {
                    if (z) {
                        this.f27320h.mo24689a(str, aVar2, bVar.f27330a);
                    }
                    return bVar.f27332c;
                }
            }
            String str3 = str;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo24683d() {
        return this.f27320h.mo24687a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo24681b() {
        if (this.f27322j != null) {
            this.f27322j.cancel(true);
        }
        this.f27322j = C10048k.m29853a(new Runnable() {
            public final void run() {
                C10035b.this.mo24680a();
            }
        }, 0, 3600000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized boolean mo24682c() {
        boolean z;
        if (!this.f27319g.getAll().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo24679a(String str) {
        return this.f27320h.mo24691b(str);
    }

    /* renamed from: a */
    private void m29832a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                jSONObject2.put(str, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                    long j = jSONObject3.getLong("et");
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        synchronized (this) {
            this.f27315c.clear();
            this.f27314b = jSONObject2;
            this.f27319g.edit().putString("SP_EXPERIMENT_CACHE", jSONObject2.toString()).apply();
        }
        this.f27320h.mo24690a(hashMap, hashMap2);
    }

    /* renamed from: a */
    private String m29831a(String str, String str2) {
        return this.f27314b.optString(str, str2);
    }

    /* renamed from: a */
    private Boolean m29825a(String str, Boolean bool) {
        if (this.f27314b.has(str)) {
            return Boolean.valueOf(this.f27314b.optBoolean(str));
        }
        return bool;
    }

    /* renamed from: a */
    private Double m29826a(String str, Double d) {
        if (this.f27314b.has(str)) {
            return Double.valueOf(this.f27314b.optDouble(str));
        }
        return d;
    }

    /* renamed from: a */
    private Float m29827a(String str, Float f) {
        if (this.f27314b.has(str)) {
            return Float.valueOf((float) this.f27314b.optDouble(str));
        }
        return f;
    }

    /* renamed from: a */
    private Integer m29828a(String str, Integer num) {
        if (this.f27314b.has(str)) {
            return Integer.valueOf(this.f27314b.optInt(str));
        }
        return num;
    }

    /* renamed from: a */
    private Long m29829a(String str, Long l) {
        if (this.f27314b.has(str)) {
            return Long.valueOf(this.f27314b.optLong(str));
        }
        return l;
    }

    /* renamed from: a */
    private <T> T m29830a(String str, Type type, T t) {
        try {
            if (this.f27315c.containsKey(str) && this.f27315c.get(str).getClass() == type) {
                return this.f27315c.get(str);
            }
            T a = this.f27316d.mo24694a(this.f27314b.optString(str, ""), type);
            if (a == null) {
                this.f27315c.remove(str);
                return t;
            }
            this.f27315c.put(str, a);
            return a;
        } catch (Exception unused) {
            this.f27315c.remove(str);
            return t;
        }
    }

    C10035b(Application application, String str, boolean z, C10046i iVar, C10044g gVar, C10045h hVar) {
        this.f27313a = str;
        this.f27320h = new C10043f(application, gVar);
        this.f27318f = C7285c.m22838a(application, "CLIENT_EXPERIMENT_CACHE_TAG", 0);
        this.f27319g = C7285c.m22838a(application, "SP_EXPERIMENT_CACHE", 0);
        this.f27316d = iVar;
        this.f27317e = hVar;
        this.f27321i = application;
        try {
            this.f27314b = new JSONObject(this.f27319g.getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException unused) {
            this.f27314b = new JSONObject();
        }
        if (z) {
            this.f27322j = C10048k.m29853a(new Runnable() {
                public final void run() {
                    C10035b.this.mo24680a();
                }
            }, 2000, 3600000);
        }
    }
}
