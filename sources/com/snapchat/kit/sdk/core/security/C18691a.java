package com.snapchat.kit.sdk.core.security;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.snapchat.kit.sdk.core.security.a */
final class C18691a {
    /* renamed from: a */
    static void m61241a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
