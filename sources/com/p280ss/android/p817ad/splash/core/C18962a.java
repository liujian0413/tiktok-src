package com.p280ss.android.p817ad.splash.core;

/* renamed from: com.ss.android.ad.splash.core.a */
public class C18962a {

    /* renamed from: a */
    private static volatile C18962a f51129a;

    /* renamed from: a */
    public static C18962a m61921a() {
        if (f51129a == null) {
            synchronized (C18962a.class) {
                if (f51129a == null) {
                    f51129a = new C18962a();
                }
            }
        }
        return f51129a;
    }

    /* renamed from: b */
    public static void m61922b() {
        if (C19025f.m62110X()) {
            C19055s.m62339a().mo50595c();
        } else {
            C19055s.m62339a().mo50597d();
        }
    }

    /* renamed from: c */
    static void m61923c() {
        if (C19025f.m62110X()) {
            C19051p.m62290a().mo50553b();
        } else {
            C19051p.m62290a().mo50555e();
        }
    }
}
