package com.p280ss.android.ugc.effectmanager.common.p1730e;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.a */
public final class C43729a {
    /* renamed from: a */
    public static void m138574a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
