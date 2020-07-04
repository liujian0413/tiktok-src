package com.facebook.appevents.internal;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.g */
public final class C13182g {

    /* renamed from: a */
    private static boolean f34915a;

    /* renamed from: b */
    private static final String f34916b = C13182g.class.getCanonicalName();

    /* renamed from: c */
    private static List<C13183a> f34917c = new ArrayList();

    /* renamed from: d */
    private static Set<String> f34918d = new HashSet();

    /* renamed from: com.facebook.appevents.internal.g$a */
    static class C13183a {

        /* renamed from: a */
        String f34919a;

        /* renamed from: b */
        Map<String, String> f34920b;

        C13183a(String str, Map<String, String> map) {
            this.f34919a = str;
            this.f34920b = map;
        }
    }

    /* renamed from: a */
    public static void m38524a() {
        f34915a = true;
    }

    /* renamed from: b */
    private static boolean m38528b(String str) {
        return f34918d.contains(str);
    }

    /* renamed from: a */
    public static void m38526a(List<AppEvent> list) {
        if (f34915a) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m38528b(((AppEvent) it.next()).getName())) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m38525a(java.lang.String r6) {
        /*
            java.lang.Class<com.facebook.appevents.internal.g> r0 = com.facebook.appevents.internal.C13182g.class
            monitor-enter(r0)
            boolean r1 = f34915a     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            boolean r1 = r6.isEmpty()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r1 != 0) goto L_0x005d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.List<com.facebook.appevents.internal.g$a> r6 = f34917c     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r6.clear()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Set<java.lang.String> r6 = f34918d     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r6.clear()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Iterator r6 = r1.keys()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
        L_0x0022:
            boolean r2 = r6.hasNext()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = "is_deprecated_event"
            boolean r3 = r3.optBoolean(r4)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0042
            java.util.Set<java.lang.String> r3 = f34918d     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r3.add(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            goto L_0x0022
        L_0x0042:
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.lang.String r4 = "restrictive_param"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0022
            java.util.List<com.facebook.appevents.internal.g$a> r4 = f34917c     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            com.facebook.appevents.internal.g$a r5 = new com.facebook.appevents.internal.g$a     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Map r3 = com.facebook.internal.C13967z.m41234a(r3)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r5.<init>(r2, r3)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r4.add(r5)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            goto L_0x0022
        L_0x005d:
            monitor-exit(r0)
            return
        L_0x005f:
            monitor-exit(r0)
            return
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.C13182g.m38525a(java.lang.String):void");
    }

    /* renamed from: a */
    private static String m38523a(String str, String str2) {
        try {
            Iterator it = new ArrayList(f34917c).iterator();
            while (it.hasNext()) {
                C13183a aVar = (C13183a) it.next();
                if (aVar != null && str.equals(aVar.f34919a)) {
                    for (String str3 : aVar.f34920b.keySet()) {
                        if (str2.equals(str3)) {
                            return (String) aVar.f34920b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m38527a(Map<String, String> map, String str) {
        if (f34915a) {
            HashMap hashMap = new HashMap();
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String a = m38523a(str, str2);
                if (a != null) {
                    hashMap.put(str2, a);
                    map.remove(str2);
                }
            }
            if (hashMap.size() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
