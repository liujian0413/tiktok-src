package com.google.api.client.repackaged.com.google.common.base;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.l */
public final class C17330l {
    /* renamed from: a */
    public static RuntimeException m57710a(Throwable th) {
        m57712b((Throwable) C17321g.m57682a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: b */
    private static void m57712b(Throwable th) {
        m57711a(th, Error.class);
        m57711a(th, RuntimeException.class);
    }

    /* renamed from: a */
    private static <X extends Throwable> void m57711a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
