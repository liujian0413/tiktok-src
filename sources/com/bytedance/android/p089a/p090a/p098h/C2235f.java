package com.bytedance.android.p089a.p090a.p098h;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.android.a.a.h.f */
public final class C2235f {
    /* renamed from: a */
    public static void m9615a(Closeable... closeableArr) {
        for (int i = 0; i <= 0; i++) {
            Closeable closeable = closeableArr[0];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
