package com.bytedance.framwork.core.sdkmonitor;

import java.io.Closeable;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.c */
public final class C10244c {
    /* renamed from: a */
    public static void m30369a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
