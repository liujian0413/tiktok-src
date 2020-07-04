package com.bytedance.ies.web.jsbridge2;

/* renamed from: com.bytedance.ies.web.jsbridge2.i */
final class C11165i {

    /* renamed from: a */
    private static boolean f30299a;

    /* renamed from: a */
    static boolean m32685a() {
        return f30299a;
    }

    /* renamed from: a */
    static void m32684a(boolean z) {
        f30299a = z;
    }

    /* renamed from: a */
    static void m32683a(RuntimeException runtimeException) {
        if (f30299a) {
            throw runtimeException;
        }
    }
}
