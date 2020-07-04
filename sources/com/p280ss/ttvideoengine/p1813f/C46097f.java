package com.p280ss.ttvideoengine.p1813f;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.f */
public class C46097f {

    /* renamed from: a */
    private static int f117964a = -1;

    /* renamed from: b */
    private static String f117965b;

    /* renamed from: c */
    private static C46097f f117966c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C46098a> f117967d = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.f.f$a */
    static class C46098a {

        /* renamed from: a */
        public JSONObject f117968a;

        /* renamed from: b */
        public long f117969b;

        C46098a() {
        }
    }

    /* renamed from: c */
    public static int m144472c() {
        return f117964a;
    }

    /* renamed from: d */
    public static String m144473d() {
        return f117965b;
    }

    private C46097f() {
    }

    /* renamed from: b */
    public final void mo112274b() {
        if (this.f117967d != null) {
            this.f117967d.clear();
        }
    }

    /* renamed from: a */
    public static C46097f m144469a() {
        if (f117966c == null) {
            synchronized (C46097f.class) {
                if (f117966c == null) {
                    f117966c = new C46097f();
                }
            }
        }
        return f117966c;
    }

    /* renamed from: a */
    public static void m144470a(int i) {
        f117964a = i;
    }

    /* renamed from: b */
    public static void m144471b(String str) {
        f117965b = str;
    }

    /* renamed from: a */
    public final C46098a mo112272a(String str) {
        if (this.f117967d != null) {
            return (C46098a) this.f117967d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo112273a(String str, C46098a aVar) {
        if (this.f117967d != null) {
            this.f117967d.put(str, aVar);
        }
    }
}
