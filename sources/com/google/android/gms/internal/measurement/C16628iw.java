package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.iw */
final class C16628iw {

    /* renamed from: a */
    private static final C16628iw f46481a = new C16628iw();

    /* renamed from: b */
    private final C16634jb f46482b = new C16604hz();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C16633ja<?>> f46483c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C16628iw m54340a() {
        return f46481a;
    }

    /* renamed from: a */
    public final <T> C16633ja<T> mo43001a(Class<T> cls) {
        C16586hh.m54188a(cls, "messageType");
        C16633ja<T> jaVar = (C16633ja) this.f46483c.get(cls);
        if (jaVar != null) {
            return jaVar;
        }
        C16633ja<T> a = this.f46482b.mo42977a(cls);
        C16586hh.m54188a(cls, "messageType");
        C16586hh.m54188a(a, "schema");
        C16633ja jaVar2 = (C16633ja) this.f46483c.putIfAbsent(cls, a);
        return jaVar2 != null ? jaVar2 : a;
    }

    /* renamed from: a */
    public final <T> C16633ja<T> mo43002a(T t) {
        return mo43001a(t.getClass());
    }

    private C16628iw() {
    }
}
