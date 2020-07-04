package com.p280ss.android.ugc.aweme.lancet.p328b;

import android.os.Looper;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.b */
public final class C7110b {
    /* renamed from: b */
    private static boolean m22206b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m22205a() {
        if (!m22206b() || !C6857a.m21312e().f19501a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m22203a(String str) {
        StringBuilder sb = new StringBuilder("load_so_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m22204a(long j, String str) {
        if (m22205a()) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            C6857a.m21312e().mo16830c(m22203a(str), uptimeMillis, false);
            C6857a.m21312e().mo16820a("load_so_total", uptimeMillis);
        }
    }
}
