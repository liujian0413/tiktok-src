package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.b */
public class C13805b {

    /* renamed from: a */
    public static final int f36646a = m40746b();

    /* renamed from: b */
    private static final Class<?> f36647b = C13805b.class;

    /* renamed from: c */
    private static int f36648c = 384;

    /* renamed from: d */
    private static volatile C13796a f36649d;

    /* renamed from: a */
    public static C13796a m40745a() {
        if (f36649d == null) {
            synchronized (C13805b.class) {
                if (f36649d == null) {
                    f36649d = new C13796a(f36648c, f36646a);
                }
            }
        }
        return f36649d;
    }

    /* renamed from: b */
    private static int m40746b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
