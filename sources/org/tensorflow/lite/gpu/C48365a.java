package org.tensorflow.lite.gpu;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: org.tensorflow.lite.gpu.a */
final class C48365a {
    /* renamed from: a */
    static void m150043a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
