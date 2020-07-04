package com.bytedance.android.live.base;

import com.bytedance.android.live.base.p118b.C2327b;

/* renamed from: com.bytedance.android.live.base.a */
public final class C2322a {

    /* renamed from: a */
    private static C2327b f7639a;

    /* renamed from: a */
    public static <T> T m9938a(Class<T> cls) {
        return f7639a.mo8146a(cls);
    }

    /* renamed from: a */
    public static synchronized void m9939a(C2327b bVar) {
        synchronized (C2322a.class) {
            f7639a = bVar;
        }
    }
}
