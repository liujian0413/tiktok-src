package com.p280ss.android.ugc.effectmanager;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.android.ugc.effectmanager.e */
final class C43748e {
    /* renamed from: a */
    static void m138623a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
