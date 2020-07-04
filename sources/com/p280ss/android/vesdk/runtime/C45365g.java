package com.p280ss.android.vesdk.runtime;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.android.vesdk.runtime.g */
final class C45365g {
    /* renamed from: a */
    static void m143387a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }

    /* renamed from: b */
    static void m143388b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
