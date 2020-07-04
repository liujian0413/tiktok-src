package com.google.android.play.core.splitinstall;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.google.android.play.core.splitinstall.b */
final class C17132b {
    /* renamed from: a */
    static void m56780a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }

    /* renamed from: b */
    static void m56781b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
