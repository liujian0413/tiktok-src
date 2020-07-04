package com.p280ss.android.ugc.aweme.global.config.settings.p1287a;

import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.a.a */
public final class C30193a {

    /* renamed from: a */
    public static volatile boolean f79447a;

    /* renamed from: a */
    public static boolean m98841a() {
        if (f79447a || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return false;
        }
        return true;
    }
}
