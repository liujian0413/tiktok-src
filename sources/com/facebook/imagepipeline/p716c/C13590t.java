package com.facebook.imagepipeline.p716c;

/* renamed from: com.facebook.imagepipeline.c.t */
public final class C13590t implements C13583n {

    /* renamed from: a */
    private static C13590t f35995a;

    private C13590t() {
    }

    /* renamed from: a */
    public static synchronized C13590t m39987a() {
        C13590t tVar;
        synchronized (C13590t.class) {
            if (f35995a == null) {
                f35995a = new C13590t();
            }
            tVar = f35995a;
        }
        return tVar;
    }
}
