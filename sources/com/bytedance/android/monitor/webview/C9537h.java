package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.safe.SafeConcurrentHashMap;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.h */
class C9537h {

    /* renamed from: r */
    private static volatile C9537h f26082r;

    /* renamed from: a */
    private Map<String, C9539a> f26083a = new SafeConcurrentHashMap();

    /* renamed from: b */
    private Map<String, C9539a> f26084b = new SafeConcurrentHashMap();

    /* renamed from: c */
    private Map<String, Map<String, JSONObject>> f26085c = new SafeConcurrentHashMap();

    /* renamed from: d */
    private Map<String, Map<String, Map<String, JSONArray>>> f26086d = new SafeConcurrentHashMap();

    /* renamed from: e */
    private Map<String, Map<String, JSONObject>> f26087e = new SafeConcurrentHashMap();

    /* renamed from: f */
    private Map<String, Map<String, JSONArray>> f26088f = new SafeConcurrentHashMap();

    /* renamed from: g */
    private Map<String, JSONObject> f26089g = new SafeConcurrentHashMap();

    /* renamed from: h */
    private Map<String, JSONArray> f26090h = new SafeConcurrentHashMap();

    /* renamed from: i */
    private Map<String, String> f26091i = new SafeConcurrentHashMap();

    /* renamed from: j */
    private Map<String, String> f26092j = new SafeConcurrentHashMap();

    /* renamed from: k */
    private Map<String, String> f26093k = new SafeConcurrentHashMap();

    /* renamed from: l */
    private Map<String, String> f26094l = new SafeConcurrentHashMap();

    /* renamed from: m */
    private Map<String, Map<String, Boolean>> f26095m = new SafeConcurrentHashMap();

    /* renamed from: n */
    private Map<String, Map<String, Boolean>> f26096n = new SafeConcurrentHashMap();

    /* renamed from: o */
    private Map<String, Set<String>> f26097o = new SafeConcurrentHashMap();

    /* renamed from: p */
    private Map<String, String> f26098p = new SafeConcurrentHashMap();

    /* renamed from: q */
    private Map<String, JSONObject> f26099q = new SafeConcurrentHashMap();

    /* renamed from: com.bytedance.android.monitor.webview.h$a */
    class C9539a {

        /* renamed from: a */
        public long f26100a;

        /* renamed from: b */
        public long f26101b;

        /* renamed from: c */
        public boolean f26102c;

        private C9539a() {
            this.f26100a = -1;
            this.f26101b = -1;
        }
    }

    /* renamed from: a */
    public final void mo23635a(WebView webView) {
        long currentTimeMillis = System.currentTimeMillis();
        String c = m28190c(webView);
        C9539a aVar = new C9539a();
        aVar.f26101b = -1;
        aVar.f26100a = currentTimeMillis;
        aVar.f26102c = false;
        this.f26083a.put(c, aVar);
    }

    /* renamed from: a */
    public final void mo23636a(WebView webView, String str) {
        long a = C9544k.m28282a(str);
        String c = m28190c(webView);
        C9539a aVar = (C9539a) this.f26083a.get(c);
        if (aVar != null && aVar.f26100a != -1 && !aVar.f26102c && aVar.f26101b == -1) {
            aVar.f26101b = (System.currentTimeMillis() - aVar.f26100a) - a;
            long j = 0;
            if (aVar.f26101b > 0) {
                j = aVar.f26101b;
            }
            aVar.f26101b = j;
            this.f26083a.put(c, aVar);
            mo23637a(webView, webView.getUrl(), "domContentLoaded");
        }
    }

    /* renamed from: a */
    public final void mo23637a(WebView webView, String str, String str2) {
        if (!TextUtils.equals(str2, "loadUrl") || !m28197d(m28190c(webView), m28195d(str))) {
            m28176a(webView, "pv", m28175a(m28195d(str), str2));
            m28186b(webView, m28195d(str));
        }
    }

    /* renamed from: a */
    public final void mo23639a(WebView webView, String str, boolean z) {
        String c = m28190c(webView);
        Map map = (Map) this.f26095m.get(c);
        if (map == null) {
            map = new SafeConcurrentHashMap();
        }
        if (z) {
            map.put(m28195d(str), Boolean.valueOf(z));
        } else {
            map.remove(m28195d(str));
        }
        this.f26095m.put(c, map);
    }

    /* renamed from: b */
    public final void mo23643b(WebView webView, String str, boolean z) {
        String c = m28190c(webView);
        Map map = (Map) this.f26096n.get(c);
        if (map == null) {
            map = new SafeConcurrentHashMap();
        }
        if (z) {
            map.put(m28195d(str), Boolean.valueOf(z));
        } else {
            map.remove(m28195d(str));
        }
        this.f26096n.put(c, map);
    }

    /* renamed from: a */
    public final void mo23638a(WebView webView, String str, String str2, String str3, String str4) {
        String c = m28190c(webView);
        if (TextUtils.isEmpty(str)) {
            str = (String) this.f26094l.get(c);
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            C9544k.m28285a(jSONObject, "client_category", (Object) C9544k.m28290b(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            C9544k.m28285a(jSONObject, "client_metric", (Object) C9544k.m28290b(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            C9544k.m28285a(jSONObject, "client_extra", (Object) C9544k.m28290b(str4));
        }
        JSONObject jSONObject2 = (JSONObject) this.f26089g.get(c);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        C9544k.m28286a(jSONObject2, "ev_type", "custom");
        if (TextUtils.isEmpty(str)) {
            m28183a(jSONObject2, jSONObject, "client_category");
            m28183a(jSONObject2, jSONObject, "client_metric");
            m28183a(jSONObject2, jSONObject, "client_extra");
            this.f26089g.put(c, jSONObject2);
            return;
        }
        Map map = (Map) this.f26087e.get(c);
        if (map == null) {
            map = new SafeConcurrentHashMap();
        }
        C9544k.m28286a(jSONObject2, "url", str);
        m28183a(jSONObject2, jSONObject, "client_category");
        m28183a(jSONObject2, jSONObject, "client_metric");
        m28183a(jSONObject2, jSONObject, "client_extra");
        map.put(m28195d(str), jSONObject2);
        this.f26087e.put(c, map);
    }

    /* renamed from: a */
    private void m28183a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject != null && jSONObject2 != null) {
            JSONObject d = C9544k.m28292d(jSONObject, str);
            JSONObject d2 = C9544k.m28292d(jSONObject2, str);
            if (d == null) {
                d = new JSONObject();
            }
            m28182a(d, d2);
            C9544k.m28285a(jSONObject, str, (Object) d);
        }
    }

    /* renamed from: a */
    private static void m28182a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                C9544k.m28285a(jSONObject, str, C9544k.m28294f(jSONObject2, str));
            }
        }
    }

    /* renamed from: a */
    private void m28181a(JSONObject jSONObject, Map<String, JSONArray> map) {
        if (jSONObject != null && map != null && !map.isEmpty()) {
            JSONObject d = C9544k.m28292d(jSONObject, "client_params");
            if (d == null) {
                d = new JSONObject();
            }
            for (String str : map.keySet()) {
                JSONArray jSONArray = (JSONArray) map.get(str);
                if (!(jSONArray == null || jSONArray.length() == 0)) {
                    int i = 0;
                    Object a = C9544k.m28283a(jSONArray, 0);
                    int i2 = 1;
                    if ((a instanceof Double) || (a instanceof Float)) {
                        double d2 = 0.0d;
                        int i3 = 0;
                        while (i < jSONArray.length()) {
                            Object a2 = C9544k.m28283a(jSONArray, i);
                            if (a2 instanceof Float) {
                                double floatValue = (double) ((Float) a2).floatValue();
                                Double.isNaN(floatValue);
                                d2 += floatValue;
                                i3++;
                            } else if (a2 instanceof Double) {
                                d2 += ((Double) a2).doubleValue();
                                i3++;
                            }
                            i++;
                        }
                        if (i3 != 0) {
                            i2 = i3;
                        }
                        double d3 = (double) i2;
                        Double.isNaN(d3);
                        C9544k.m28285a(d, str, (Object) Double.valueOf(d2 / d3));
                        C9544k.m28284a(d, m28191c(str), (long) i3);
                    } else if ((a instanceof Integer) || (a instanceof Long)) {
                        long j = 0;
                        int i4 = 0;
                        while (i < jSONArray.length()) {
                            Object a3 = C9544k.m28283a(jSONArray, i);
                            if (a3 instanceof Integer) {
                                j += (long) ((Integer) a3).intValue();
                                i4++;
                            } else if (a3 instanceof Long) {
                                j += ((Long) a3).longValue();
                                i4++;
                            }
                            i++;
                        }
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        C9544k.m28284a(d, str, j / ((long) i2));
                        C9544k.m28284a(d, m28191c(str), (long) i4);
                    }
                }
            }
            C9544k.m28285a(jSONObject, "client_params", (Object) d);
        }
    }

    /* renamed from: a */
    public static C9537h m28173a() {
        if (f26082r == null) {
            synchronized (C9537h.class) {
                if (f26082r == null) {
                    f26082r = new C9537h();
                }
            }
        }
        return f26082r;
    }

    private C9537h() {
    }

    /* renamed from: b */
    public final void mo23640b(WebView webView) {
        m28178a(webView, false);
    }

    /* renamed from: a */
    private static String m28174a(String str) {
        try {
            return new URL(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m28185b(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    private static String m28190c(WebView webView) {
        if (webView == null) {
            return "1234";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(webView.hashCode());
        return sb.toString();
    }

    /* renamed from: d */
    private static String m28195d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int indexOf = str.indexOf("?");
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: c */
    private static String m28191c(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("PointCount");
        return sb.toString();
    }

    /* renamed from: a */
    private void m28179a(JSONObject jSONObject) {
        String c = C9544k.m28291c(jSONObject, "url");
        C9544k.m28286a(jSONObject, "host", m28185b(c));
        C9544k.m28286a(jSONObject, "path", m28174a(c));
    }

    /* renamed from: c */
    private void m28193c(WebView webView, JSONObject jSONObject) {
        C9544k.m28286a(jSONObject, "web_view_key", m28190c(webView));
    }

    /* renamed from: a */
    private JSONObject m28175a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C9544k.m28286a(jSONObject, "service", "pv");
        C9544k.m28286a(jSONObject, "stage", str2);
        C9544k.m28286a(jSONObject, "url", m28195d(str));
        C9544k.m28286a(jSONObject, "host", m28185b(str));
        C9544k.m28286a(jSONObject, "path", m28174a(str));
        C9544k.m28286a(jSONObject, "ev_type", "pv");
        return jSONObject;
    }

    /* renamed from: b */
    private void m28186b(WebView webView, String str) {
        m28194c(m28190c(webView), m28195d(str));
        m28196d(webView, m28195d(str));
        m28192c(webView, m28195d(str));
    }

    /* renamed from: d */
    private boolean m28197d(String str, String str2) {
        String str3 = (String) this.f26094l.get(str);
        String d = m28195d(str3);
        String d2 = m28195d(str2);
        if (TextUtils.equals(str3, str2) || TextUtils.equals(d, d2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m28188b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f26091i.put(str, str2);
        }
    }

    /* renamed from: c */
    private void m28192c(WebView webView, String str) {
        String c = m28190c(webView);
        JSONObject jSONObject = (JSONObject) this.f26089g.get(c);
        this.f26089g.remove(c);
        if (jSONObject != null) {
            Map map = (Map) this.f26087e.get(c);
            if (map == null) {
                map = new SafeConcurrentHashMap();
            }
            JSONObject jSONObject2 = (JSONObject) map.get(m28195d(str));
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            m28183a(jSONObject2, jSONObject, "client_category");
            m28183a(jSONObject2, jSONObject, "client_metric");
            m28183a(jSONObject2, jSONObject, "client_extra");
            C9544k.m28286a(jSONObject2, "url", str);
            map.put(m28195d(str), jSONObject2);
            this.f26087e.put(c, map);
        }
    }

    /* renamed from: d */
    private void m28196d(WebView webView, String str) {
        String c = m28190c(webView);
        JSONArray jSONArray = (JSONArray) this.f26090h.get(c);
        if (jSONArray != null) {
            this.f26090h.remove(c);
            Map map = (Map) this.f26088f.get(c);
            if (map == null) {
                map = new SafeConcurrentHashMap();
            }
            JSONArray jSONArray2 = (JSONArray) map.get(m28195d(str));
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object a = C9544k.m28283a(jSONArray, i);
                if (a instanceof JSONObject) {
                    C9544k.m28286a((JSONObject) a, "url", str);
                    jSONArray2.put(a);
                }
            }
            map.put(m28195d(str), jSONArray2);
            this.f26088f.put(c, map);
        }
    }

    /* renamed from: a */
    private static void m28177a(WebView webView, JSONObject jSONObject) {
        String c = C9544k.m28291c(jSONObject, "url");
        if (!TextUtils.isEmpty(c) && !c.contains("about:blank")) {
            C9541j.m28231c().mo23632h(webView);
        }
    }

    /* renamed from: b */
    private void m28187b(WebView webView, JSONObject jSONObject) {
        String c = C9544k.m28291c(jSONObject, "ev_type");
        String c2 = m28190c(webView);
        Map map = (Map) this.f26095m.get(c2);
        if (map == null) {
            map = new SafeConcurrentHashMap();
        }
        Map map2 = (Map) this.f26096n.get(c2);
        if (map2 == null) {
            map2 = new SafeConcurrentHashMap();
        }
        if ("performance".equals(c)) {
            JSONObject d = C9544k.m28292d(jSONObject, "client_params");
            if (d == null) {
                d = new JSONObject();
            }
            String c3 = C9544k.m28291c(jSONObject, "url");
            boolean containsKey = map.containsKey(m28195d(c3));
            boolean containsKey2 = map2.containsKey(m28195d(c3));
            C9544k.m28284a(d, "offline", containsKey ? 1 : 0);
            C9544k.m28284a(d, "clientOffline", containsKey2 ? 1 : 0);
            return;
        }
        if ("static_performance".equals(c)) {
            JSONObject d2 = C9544k.m28292d(jSONObject, "event");
            if (d2 != null) {
                Object f = C9544k.m28294f(d2, "resources");
                if (f instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) f;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object a = C9544k.m28283a(jSONArray, i);
                        if (a instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) a;
                            String c4 = C9544k.m28291c(jSONObject2, "name");
                            boolean containsKey3 = map.containsKey(m28195d(c4));
                            boolean containsKey4 = map2.containsKey(m28195d(c4));
                            C9544k.m28284a(jSONObject2, "offline", containsKey3 ? 1 : 0);
                            C9544k.m28284a(jSONObject2, "clientOffline", containsKey4 ? 1 : 0);
                        }
                    }
                    C9544k.m28285a(d2, "resources", (Object) jSONArray);
                    C9544k.m28285a(jSONObject, "event", (Object) d2);
                }
            }
        }
    }

    /* renamed from: c */
    private void m28194c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f26094l.put(str, m28195d(str2));
        }
    }

    /* renamed from: b */
    private static void m28189b(JSONObject jSONObject, C9539a aVar) {
        JSONObject d = C9544k.m28292d(jSONObject, "client_params");
        if (d == null) {
            d = new JSONObject();
        }
        if (aVar != null && aVar.f26100a > 0 && !aVar.f26102c && aVar.f26101b > 0) {
            C9544k.m28284a(d, "initTime", aVar.f26101b);
            C9544k.m28284a(d, "firstLoadUrl", 1);
            aVar.f26102c = true;
        }
        C9544k.m28285a(jSONObject, "client_params", (Object) d);
    }

    /* renamed from: a */
    private void m28178a(WebView webView, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String c = m28190c(webView);
        Map map = (Map) this.f26085c.get(c);
        Map map2 = (Map) this.f26087e.get(c);
        Map map3 = (Map) this.f26088f.get(c);
        Map map4 = (Map) this.f26086d.get(c);
        Set<String> set = (Set) this.f26097o.get(c);
        String str = (String) this.f26098p.get(c);
        C9539a aVar = (C9539a) this.f26083a.get(c);
        C9539a aVar2 = (C9539a) this.f26084b.get(c);
        this.f26083a.remove(c);
        this.f26084b.remove(c);
        this.f26088f.remove(c);
        this.f26087e.remove(c);
        this.f26085c.remove(c);
        this.f26086d.remove(c);
        this.f26091i.remove(c);
        this.f26094l.remove(c);
        this.f26097o.remove(c);
        this.f26098p.remove(c);
        if (map != null && !map.isEmpty()) {
            for (String str2 : map.keySet()) {
                JSONObject jSONObject3 = (JSONObject) map.get(str2);
                String c2 = C9544k.m28291c(jSONObject3, "service");
                if (map4 != null && !map4.isEmpty()) {
                    m28181a(jSONObject3, (Map) map4.get(str2));
                }
                m28180a(jSONObject3, aVar2);
                m28189b(jSONObject3, aVar);
                m28176a(webView, c2, jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                C9544k.m28285a(jSONObject4, "performanceTiming", (Object) C9544k.m28292d(C9544k.m28292d(jSONObject3, "event"), "navigation"));
                C9544k.m28285a(jSONObject4, "url", C9544k.m28294f(jSONObject3, "url"));
                C9544k.m28285a(jSONObject4, "bid", C9544k.m28294f(jSONObject3, "bid"));
                C9544k.m28285a(jSONObject4, "pid", C9544k.m28294f(jSONObject3, "pid"));
                C9544k.m28285a(jSONObject4, "ev_type", (Object) "custom");
                m28182a(jSONObject4, C9544k.m28290b(str));
                if (map2 != null && !map2.isEmpty()) {
                    JSONObject d = C9544k.m28292d((JSONObject) map2.get(m28195d(C9544k.m28291c(jSONObject3, "url"))), "client_metric");
                    if (!(d == null || set == null)) {
                        for (String str3 : set) {
                            C9544k.m28285a(jSONObject4, str3, C9544k.m28294f(d, str3));
                        }
                    }
                }
                m28177a(webView, jSONObject4);
            }
        }
        if (map2 != null && !map2.isEmpty()) {
            for (String str4 : map2.keySet()) {
                JSONObject jSONObject5 = (JSONObject) map2.get(m28195d(str4));
                String str5 = (String) this.f26092j.get(m28195d(str4));
                if (map == null || map.isEmpty()) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = (JSONObject) map.get(str5);
                }
                String c3 = C9544k.m28291c(jSONObject2, "bid");
                String c4 = C9544k.m28291c(jSONObject2, "pid");
                C9544k.m28286a(jSONObject5, "bid", c3);
                C9544k.m28286a(jSONObject5, "pid", c4);
                m28176a(webView, "custom", jSONObject5);
            }
        }
        if (map3 != null && !map3.isEmpty()) {
            for (String str6 : map3.keySet()) {
                JSONArray jSONArray = (JSONArray) map3.get(m28195d(str6));
                String str7 = (String) this.f26092j.get(m28195d(str6));
                if (map == null || map.isEmpty()) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = (JSONObject) map.get(str7);
                }
                String c5 = C9544k.m28291c(jSONObject, "bid");
                String c6 = C9544k.m28291c(jSONObject, "pid");
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object a = C9544k.m28283a(jSONArray, i);
                        if (a instanceof JSONObject) {
                            JSONObject jSONObject6 = (JSONObject) a;
                            C9544k.m28286a(jSONObject6, "bid", c5);
                            C9544k.m28286a(jSONObject6, "pid", c6);
                            m28176a(webView, "custom", jSONObject6);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m28180a(JSONObject jSONObject, C9539a aVar) {
        JSONObject d = C9544k.m28292d(jSONObject, "client_params");
        if (d == null) {
            d = new JSONObject();
        }
        if (aVar != null && aVar.f26100a > 0 && !aVar.f26102c && aVar.f26101b > 0) {
            C9544k.m28284a(d, "createTime", aVar.f26101b);
            aVar.f26102c = true;
        }
        C9544k.m28285a(jSONObject, "client_params", (Object) d);
    }

    /* renamed from: d */
    public final void mo23645d(WebView webView, String str, String str2) {
        m28176a(webView, str, C9544k.m28290b(str2));
    }

    /* renamed from: e */
    public final void mo23646e(WebView webView, String str, String str2) {
        m28176a(webView, str, C9544k.m28290b(str2));
    }

    /* renamed from: b */
    private static String m28184b(WebView webView, String str, JSONObject jSONObject) {
        String c = C9541j.m28231c().mo23625c(webView, str);
        if (TextUtils.equals(str, c) || TextUtils.isEmpty(c)) {
            return str;
        }
        C9544k.m28286a(jSONObject, "service", c);
        return c;
    }

    /* renamed from: a */
    private void m28176a(WebView webView, String str, JSONObject jSONObject) {
        String c = C9544k.m28291c(jSONObject, "url");
        if (!TextUtils.isEmpty(c) && !c.contains("about:blank")) {
            String b = m28184b(webView, str, jSONObject);
            m28193c(webView, jSONObject);
            m28179a(jSONObject);
            m28187b(webView, jSONObject);
            C9529a g = C9541j.m28231c().mo23631g(webView);
            if (g != null) {
                g.mo11574a(b, 0, null, jSONObject);
            }
        }
    }

    /* renamed from: f */
    public final void mo23647f(WebView webView, String str, String str2) {
        String c = m28190c(webView);
        JSONObject b = C9544k.m28290b(str2);
        String c2 = C9544k.m28291c(b, "navigation_id");
        if (TextUtils.isEmpty(c2)) {
            c2 = (String) this.f26091i.get(c);
        } else {
            m28188b(c, c2);
        }
        if (!TextUtils.isEmpty(c2)) {
            this.f26092j.put(m28195d((String) this.f26094l.get(c)), this.f26091i.get(c));
            this.f26093k.put(this.f26091i.get(c), m28195d((String) this.f26094l.get(c)));
            JSONObject d = C9544k.m28292d(b, "event");
            if (d != null) {
                Map map = (Map) this.f26086d.get(c);
                if (map == null) {
                    map = new SafeConcurrentHashMap();
                }
                Map map2 = (Map) map.get(c2);
                if (map2 == null) {
                    map2 = new SafeConcurrentHashMap();
                }
                Iterator keys = d.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    Object f = C9544k.m28294f(d, str3);
                    if (C9544k.m28287a(f)) {
                        JSONArray jSONArray = (JSONArray) map2.get(str3);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(f);
                        map2.put(str3, jSONArray);
                    }
                }
                map.put(c2, map2);
                this.f26086d.put(c, map);
                if (C9541j.m28231c().mo23633i(webView)) {
                    m28176a(webView, str, b);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo23644c(WebView webView, String str, String str2) {
        String c = m28190c(webView);
        JSONObject b = C9544k.m28290b(str2);
        String c2 = C9544k.m28291c(b, "navigation_id");
        if (TextUtils.isEmpty(c2)) {
            c2 = (String) this.f26091i.get(c);
        } else {
            m28188b(c, c2);
        }
        if (!TextUtils.isEmpty(c2)) {
            this.f26092j.put(m28195d((String) this.f26094l.get(c)), this.f26091i.get(c));
            this.f26093k.put(this.f26091i.get(c), m28195d((String) this.f26094l.get(c)));
            JSONObject d = C9544k.m28292d(b, "event");
            if (d != null) {
                Map map = (Map) this.f26085c.get(c);
                if (map == null) {
                    map = new SafeConcurrentHashMap();
                }
                JSONObject jSONObject = (JSONObject) map.get(c2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject d2 = C9544k.m28292d(jSONObject, "client_params");
                if (d2 == null) {
                    d2 = new JSONObject();
                }
                Iterator keys = d.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    C9544k.m28284a(d2, str3, C9544k.m28289b(d2, str3) + C9544k.m28289b(d, str3));
                }
                C9544k.m28285a(jSONObject, "client_params", (Object) d2);
                map.put(c2, jSONObject);
                this.f26085c.put(c, map);
            }
        }
    }

    /* renamed from: b */
    public final void mo23641b(WebView webView, String str, String str2) {
        String c = m28190c(webView);
        JSONObject b = C9544k.m28290b(str2);
        String c2 = C9544k.m28291c(b, "navigation_id");
        if (TextUtils.isEmpty(c2)) {
            c2 = (String) this.f26091i.get(c);
        } else {
            m28188b(c, c2);
        }
        if (!TextUtils.isEmpty(c2)) {
            this.f26092j.put(m28195d((String) this.f26094l.get(c)), this.f26091i.get(c));
            this.f26093k.put(this.f26091i.get(c), m28195d((String) this.f26094l.get(c)));
            Map map = (Map) this.f26085c.get(c);
            if (map == null) {
                map = new SafeConcurrentHashMap();
            }
            JSONObject jSONObject = (JSONObject) map.get(c2);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator keys = b.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                C9544k.m28285a(jSONObject, str3, C9544k.m28294f(b, str3));
            }
            map.put(c2, jSONObject);
            this.f26085c.put(c, map);
        }
    }

    /* renamed from: b */
    public final void mo23642b(WebView webView, String str, String str2, String str3, String str4) {
        String c = m28190c(webView);
        if (TextUtils.isEmpty(str)) {
            str = (String) this.f26094l.get(c);
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            C9544k.m28285a(jSONObject, "client_category", (Object) C9544k.m28290b(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            C9544k.m28285a(jSONObject, "client_metric", (Object) C9544k.m28290b(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            C9544k.m28285a(jSONObject, "client_extra", (Object) C9544k.m28290b(str4));
        }
        C9544k.m28286a(jSONObject, "ev_type", "custom");
        if (TextUtils.isEmpty(str)) {
            JSONArray jSONArray = (JSONArray) this.f26090h.get(c);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObject);
            this.f26090h.put(c, jSONArray);
            return;
        }
        C9544k.m28286a(jSONObject, "url", str);
        Map map = (Map) this.f26088f.get(c);
        if (map == null) {
            map = new SafeConcurrentHashMap();
        }
        JSONArray jSONArray2 = (JSONArray) map.get(m28195d(str));
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
        }
        jSONArray2.put(jSONObject);
        map.put(m28195d(str), jSONArray2);
        this.f26088f.put(c, map);
    }
}
