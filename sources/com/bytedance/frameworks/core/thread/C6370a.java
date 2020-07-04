package com.bytedance.frameworks.core.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.core.thread.a */
public class C6370a {

    /* renamed from: a */
    private static volatile C6370a f18654a;

    /* renamed from: b */
    private static volatile ThreadPoolExecutor f18655b;

    /* renamed from: c */
    private static volatile ThreadPoolExecutor f18656c;

    /* renamed from: d */
    private static volatile ScheduledExecutorService f18657d;

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C6371c> f18658e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, C6371c> f18659f = new ConcurrentHashMap<>();

    private C6370a() {
        f18655b = C6373e.m19806a();
        f18656c = C6373e.m19807b();
        f18657d = C6373e.m19808c();
    }

    /* renamed from: a */
    public static C6370a m19801a() {
        if (f18654a == null) {
            synchronized (C6370a.class) {
                if (f18654a == null) {
                    f18654a = new C6370a();
                }
            }
        }
        return f18654a;
    }

    /* renamed from: b */
    public static void m19803b(C6371c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param is not be null");
        } else if (f18656c != null) {
            f18656c.execute(cVar);
        }
    }

    /* renamed from: a */
    public static void m19802a(C6371c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param is not be null");
        } else if (f18655b != null) {
            f18655b.execute(cVar);
        }
    }
}
