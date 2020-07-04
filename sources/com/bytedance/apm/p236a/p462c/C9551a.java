package com.bytedance.apm.p236a.p462c;

import java.io.Closeable;

/* renamed from: com.bytedance.apm.a.c.a */
public final class C9551a {
    /* renamed from: a */
    public static void m28305a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
