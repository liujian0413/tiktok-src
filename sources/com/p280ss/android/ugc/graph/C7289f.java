package com.p280ss.android.ugc.graph;

/* renamed from: com.ss.android.ugc.graph.f */
public final class C7289f {

    /* renamed from: a */
    public static C7289f f20374a;

    /* renamed from: b */
    private final Object f20375b;

    /* renamed from: c */
    private final C7292c f20376c;

    /* renamed from: com.ss.android.ugc.graph.f$a */
    public static class C7291a implements C7292c {
        /* renamed from: a */
        public final <T> T mo19025a(Object obj, Class<T> cls) {
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.graph.f$c */
    public interface C7292c {
        /* renamed from: a */
        <T> T mo19025a(Object obj, Class<T> cls);
    }

    /* renamed from: com.ss.android.ugc.graph.f$b */
    public static class C7293b {

        /* renamed from: a */
        private Object f20377a;

        /* renamed from: b */
        private C7292c f20378b;

        /* renamed from: a */
        public final C7289f mo19028a() {
            C7289f.m22852a(new C7289f(this.f20377a, this.f20378b));
            return C7289f.f20374a;
        }

        /* renamed from: a */
        public final C7293b mo19026a(C7292c cVar) {
            this.f20378b = cVar;
            return this;
        }

        /* renamed from: a */
        public final C7293b mo19027a(Object obj) {
            this.f20377a = obj;
            return this;
        }
    }

    /* renamed from: a */
    public static void m22852a(C7289f fVar) {
        if (f20374a == null) {
            f20374a = fVar;
        }
    }

    /* renamed from: a */
    public static <T> T m22851a(Class<T> cls) {
        if (f20374a != null) {
            return f20374a.f20376c.mo19025a(f20374a.f20375b, cls);
        }
        throw new RuntimeException("Graph not init");
    }

    private C7289f(Object obj, C7292c cVar) {
        this.f20375b = obj;
        if (cVar == null) {
            cVar = new C7291a();
        }
        this.f20376c = cVar;
    }
}
