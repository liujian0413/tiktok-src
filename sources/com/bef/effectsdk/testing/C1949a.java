package com.bef.effectsdk.testing;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.bef.effectsdk.testing.a */
final class C1949a {
    /* renamed from: a */
    static void m8929a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
