package com.p280ss.android.sdk.webview.p900a;

/* renamed from: com.ss.android.sdk.webview.a.b */
public final class C20126b {

    /* renamed from: b */
    private static C20126b f54503b;

    /* renamed from: a */
    private C20125a f54504a;

    /* renamed from: a */
    public static C20125a m66361a() {
        return m66363b().f54504a;
    }

    /* renamed from: b */
    private static C20126b m66363b() {
        if (f54503b != null) {
            return f54503b;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private C20126b(C20125a aVar) {
        this.f54504a = aVar;
    }

    /* renamed from: a */
    public static synchronized void m66362a(C20125a aVar) {
        synchronized (C20126b.class) {
            if (f54503b == null) {
                f54503b = new C20126b(aVar);
            } else {
                f54503b.f54504a = aVar;
            }
        }
    }
}
