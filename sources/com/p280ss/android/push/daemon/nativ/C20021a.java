package com.p280ss.android.push.daemon.nativ;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.android.push.daemon.nativ.a */
final class C20021a {
    /* renamed from: a */
    static void m65950a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
