package com.bytedance.frameworks.baselib.network.dispatcher;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.e */
public class C10100e implements C10096c {

    /* renamed from: a */
    private static volatile boolean f27474a = true;

    /* renamed from: b */
    private static volatile C10101f f27475b;

    /* renamed from: c */
    private static volatile C10100e f27476c;

    public C10100e() {
        this(8, 8);
    }

    /* renamed from: b */
    public static C10100e m29991b() {
        if (f27476c == null) {
            synchronized (C10100e.class) {
                if (f27476c == null) {
                    f27476c = new C10100e();
                }
            }
        }
        return f27476c;
    }

    /* renamed from: a */
    public static synchronized C10101f m29989a() {
        C10101f fVar;
        synchronized (C10100e.class) {
            if (f27475b == null) {
                f27475b = C10101f.m29994a().mo24758a(8, 8).mo24762b(8, 8).mo24759a(30).mo24764c(10).mo24763b(10).mo24760a(true).mo24761a();
            }
            fVar = f27475b;
        }
        return fVar;
    }

    /* renamed from: a */
    public final synchronized void mo24750a(C10095b bVar) {
        C10097d.f27465a.mo24753a(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo24751b(C10095b bVar) {
        C10097d.f27465a.mo24755b(bVar);
    }

    /* renamed from: a */
    public static synchronized void m29990a(boolean z) {
        synchronized (C10100e.class) {
            f27474a = z;
            if (f27475b != null) {
                f27475b.f27486j = f27474a;
            }
        }
    }

    private C10100e(int i, int i2) {
        if (f27475b == null) {
            f27475b = C10101f.m29994a().mo24758a(8, 8).mo24762b(8, 8).mo24759a(30).mo24764c(10).mo24763b(10).mo24760a(true).mo24761a();
        }
    }
}
