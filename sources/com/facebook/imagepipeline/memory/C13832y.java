package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.y */
public final class C13832y implements C13804ae {

    /* renamed from: a */
    private static C13832y f36683a;

    private C13832y() {
    }

    /* renamed from: a */
    public static synchronized C13832y m40855a() {
        C13832y yVar;
        synchronized (C13832y.class) {
            if (f36683a == null) {
                f36683a = new C13832y();
            }
            yVar = f36683a;
        }
        return yVar;
    }
}
