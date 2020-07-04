package com.facebook.soloader;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.facebook.soloader.k */
final class C14621k {
    /* renamed from: a */
    static void m42293a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
