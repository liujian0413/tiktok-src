package com.p280ss.android.ugc.trill.app;

import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;

/* renamed from: com.ss.android.ugc.trill.app.a */
public final class C44981a extends VERSION_CODES {
    /* renamed from: a */
    public static void m141935a(int i, Runnable runnable) {
        if (VERSION.SDK_INT >= 23) {
            runnable.run();
        }
    }
}
