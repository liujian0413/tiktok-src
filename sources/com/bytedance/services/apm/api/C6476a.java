package com.bytedance.services.apm.api;

import java.util.Map;

/* renamed from: com.bytedance.services.apm.api.a */
public final class C6476a {

    /* renamed from: a */
    private static IEnsure f18796a;

    /* renamed from: a */
    public static IEnsure m20157a() {
        return f18796a;
    }

    /* renamed from: b */
    public static void m20163b() {
        if (f18796a != null) {
            f18796a.ensureNotReachHere();
        }
    }

    /* renamed from: a */
    public static void m20158a(IEnsure iEnsure) {
        f18796a = iEnsure;
    }

    /* renamed from: a */
    public static void m20159a(String str) {
        if (f18796a != null) {
            f18796a.ensureNotReachHere(str);
        }
    }

    /* renamed from: a */
    public static void m20160a(Throwable th) {
        if (f18796a != null) {
            f18796a.ensureNotReachHere(th);
        }
    }

    /* renamed from: a */
    public static void m20161a(Throwable th, String str) {
        if (f18796a != null) {
            f18796a.ensureNotReachHere(th, str);
        }
    }

    /* renamed from: a */
    public static void m20162a(Throwable th, String str, Map<String, String> map) {
        if (f18796a != null) {
            f18796a.ensureNotReachHere(th, str, map);
        }
    }
}
