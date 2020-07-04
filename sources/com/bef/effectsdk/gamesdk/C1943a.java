package com.bef.effectsdk.gamesdk;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.bef.effectsdk.gamesdk.a */
final class C1943a {
    /* renamed from: a */
    static void m8927a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
