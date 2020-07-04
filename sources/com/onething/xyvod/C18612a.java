package com.onething.xyvod;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.onething.xyvod.a */
final class C18612a {
    /* renamed from: a */
    static void m61054a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
