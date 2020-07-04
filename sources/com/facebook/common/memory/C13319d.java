package com.facebook.common.memory;

/* renamed from: com.facebook.common.memory.d */
public final class C13319d implements C13318c {

    /* renamed from: a */
    private static C13319d f35216a;

    /* renamed from: a */
    public final void mo29905a(C13317b bVar) {
    }

    /* renamed from: a */
    public static synchronized C13319d m38972a() {
        C13319d dVar;
        synchronized (C13319d.class) {
            if (f35216a == null) {
                f35216a = new C13319d();
            }
            dVar = f35216a;
        }
        return dVar;
    }
}
