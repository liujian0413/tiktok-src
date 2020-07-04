package com.bytedance.ies.p555c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.c.d */
public final class C10720d {

    /* renamed from: a */
    private static C10720d f28662a;

    /* renamed from: b */
    private Map<String, String> f28663b = new ConcurrentHashMap();

    private C10720d() {
    }

    /* renamed from: a */
    public static synchronized C10720d m31296a() {
        C10720d dVar;
        synchronized (C10720d.class) {
            if (f28662a == null) {
                f28662a = new C10720d();
            }
            dVar = f28662a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final String mo25613a(String str) {
        return (String) this.f28663b.get(str);
    }
}
