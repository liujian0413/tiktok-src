package com.bytedance.dataplatform;

import android.app.Application;
import com.bytedance.dataplatform.p508b.C10038a;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.dataplatform.d */
public final class C6324d {

    /* renamed from: a */
    public static C10047j f18558a;

    /* renamed from: b */
    public static volatile C10035b f18559b;

    /* renamed from: c */
    private static final Map<String, Object> f18560c = new ConcurrentHashMap();

    /* renamed from: d */
    private static volatile Future f18561d;

    /* renamed from: e */
    private static boolean f18562e = false;

    /* renamed from: f */
    private static final Map<String, String> f18563f = new ConcurrentHashMap();

    /* renamed from: b */
    public static void m19638b() {
        m19639c();
        f18559b.mo24681b();
    }

    /* renamed from: c */
    private static void m19639c() {
        if (f18561d != null) {
            try {
                f18561d.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("ExperimentManager has not been init (obtain)");
        }
    }

    /* renamed from: a */
    public static boolean m19636a() {
        m19639c();
        return f18559b.mo24682c();
    }

    /* renamed from: a */
    public static String m19634a(String str) {
        m19639c();
        return f18559b.mo24679a(str);
    }

    /* renamed from: b */
    public static String m19637b(String str) {
        m19639c();
        StringBuilder sb = new StringBuilder("local:");
        sb.append(m19636a());
        sb.append(" function:");
        sb.append((String) f18563f.get(str));
        sb.append(" ");
        sb.append(f18559b.mo24683d());
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> T m19632a(String str, Type type, T t, boolean z, boolean z2) {
        return m19633a(str, type, t, z, z2, null);
    }

    /* renamed from: a */
    public static <T> T m19633a(String str, Type type, T t, boolean z, boolean z2, C10038a<T> aVar) {
        m19639c();
        if (z && f18560c.containsKey(str) && f18560c.get(str).getClass() == type) {
            try {
                f18563f.put(str, "sticky");
                return f18560c.get(str);
            } catch (Exception unused) {
            }
        }
        T a = C10041e.m29840a(str, type);
        if (a != null) {
            if (z) {
                f18560c.put(str, a);
            }
            f18563f.put(str, "panel");
            return a;
        }
        if (f18562e) {
            T a2 = f18559b.mo24678a(str, type, null, z2);
            if (a2 != null) {
                if (z) {
                    f18560c.put(str, a2);
                }
                f18563f.put(str, "libra");
                return a2;
            }
        }
        if (f18558a != null) {
            T a3 = f18558a.mo24695a(str, type, null);
            if (a3 != null) {
                if (z) {
                    f18560c.put(str, a3);
                }
                f18563f.put(str, "setting");
                return a3;
            }
        }
        if (!f18562e) {
            T a4 = f18559b.mo24678a(str, type, null, z2);
            if (a4 != null) {
                if (z) {
                    f18560c.put(str, a4);
                }
                f18563f.put(str, "libra");
                return a4;
            }
        }
        T a5 = f18559b.mo24677a(str, aVar, z2);
        if (a5 != null) {
            if (z) {
                f18560c.put(str, a5);
            }
            f18563f.put(str, "client");
            return a5;
        }
        if (z && t != null) {
            f18560c.put(str, t);
        }
        f18563f.put(str, "default");
        return t;
    }

    /* renamed from: a */
    public static void m19635a(Application application, String str, boolean z, C10047j jVar, C10046i iVar, C10044g gVar, C10045h hVar) {
        final Application application2 = application;
        final String str2 = str;
        final C10046i iVar2 = iVar;
        final C10044g gVar2 = gVar;
        final C10045h hVar2 = hVar;
        final C10047j jVar2 = jVar;
        C63251 r0 = new Runnable(false) {
            public final void run() {
                C10035b bVar = new C10035b(application2, str2, false, iVar2, gVar2, hVar2);
                C6324d.f18559b = bVar;
                C6324d.f18558a = jVar2;
            }
        };
        f18561d = C10048k.m29852a(r0);
    }
}
