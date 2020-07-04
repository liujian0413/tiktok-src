package com.bytedance.ies.geckoclient.p570d;

/* renamed from: com.bytedance.ies.geckoclient.d.c */
public final class C10854c {

    /* renamed from: b */
    private static C10854c f29372b;

    /* renamed from: a */
    public C10853b f29373a;

    /* renamed from: a */
    public static void m31838a() {
        f29372b = new C10854c(new C10855d());
    }

    /* renamed from: b */
    public static C10854c m31840b() {
        if (f29372b != null) {
            return f29372b;
        }
        throw new IllegalStateException("must call init first.");
    }

    private C10854c(C10853b bVar) {
        this.f29373a = bVar;
    }

    /* renamed from: a */
    public static void m31839a(C10853b bVar) {
        f29372b = new C10854c(bVar);
    }
}
