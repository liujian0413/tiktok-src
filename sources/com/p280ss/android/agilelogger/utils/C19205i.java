package com.p280ss.android.agilelogger.utils;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.android.agilelogger.utils.i */
final class C19205i {
    /* renamed from: a */
    static void m62941a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }

    /* renamed from: b */
    static void m62942b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
