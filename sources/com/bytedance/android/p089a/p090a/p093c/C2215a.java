package com.bytedance.android.p089a.p090a.p093c;

import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.c.a */
public final class C2215a {

    /* renamed from: a */
    private static ExecutorService f7453a;

    /* renamed from: a */
    private static ExecutorService m9552a() {
        if (f7453a == null) {
            synchronized (C2215a.class) {
                if (f7453a == null) {
                    f7453a = C2216b.m9554a();
                }
            }
        }
        return f7453a;
    }

    /* renamed from: a */
    public static void m9553a(C2218d dVar) {
        m9552a().execute(dVar);
    }
}
