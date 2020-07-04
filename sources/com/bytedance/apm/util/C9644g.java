package com.bytedance.apm.util;

import java.io.Closeable;

/* renamed from: com.bytedance.apm.util.g */
public final class C9644g {
    /* renamed from: a */
    public static void m28534a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
