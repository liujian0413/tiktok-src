package com.bytedance.apm.p252m;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.apm.m.a */
public final class C9622a {

    /* renamed from: a */
    private static volatile Handler f26321a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static Handler m28480a() {
        return f26321a;
    }
}
