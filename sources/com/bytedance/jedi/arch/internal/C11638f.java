package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.jedi.arch.internal.f */
public final class C11638f {

    /* renamed from: a */
    private static final C11635e f31297a = new C11635e(new Handler(Looper.getMainLooper()), false);

    /* renamed from: a */
    public static final C11635e m34104a() {
        return f31297a;
    }

    /* renamed from: b */
    public static final boolean m34105b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
