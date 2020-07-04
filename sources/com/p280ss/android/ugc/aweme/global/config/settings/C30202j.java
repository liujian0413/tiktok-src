package com.p280ss.android.ugc.aweme.global.config.settings;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.j */
public final class C30202j {

    /* renamed from: a */
    private static volatile C30202j f79470a;

    /* renamed from: b */
    private boolean f79471b;

    private C30202j() {
    }

    /* renamed from: b */
    public final boolean mo76690b() {
        boolean z;
        synchronized (C30202j.class) {
            z = this.f79471b;
        }
        return z;
    }

    /* renamed from: a */
    public static C30202j m98867a() {
        if (f79470a == null) {
            synchronized (C30202j.class) {
                if (f79470a == null) {
                    f79470a = new C30202j();
                }
            }
        }
        return f79470a;
    }

    /* renamed from: a */
    public final void mo76689a(boolean z) {
        synchronized (C30202j.class) {
            this.f79471b = z;
        }
    }
}
