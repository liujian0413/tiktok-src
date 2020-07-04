package com.p280ss.android.ugc.aweme.lancet;

import android.content.Context;
import android.os.Looper;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lego.p330b.C7150a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.ss.android.ugc.aweme.lancet.k */
public final class C7113k {

    /* renamed from: a */
    public static long f19978a;

    /* renamed from: b */
    public static volatile boolean f19979b;

    /* renamed from: a */
    public static void m22208a() {
        if (!f19979b && C6857a.m21312e().f19501a) {
            f19979b = true;
            C6857a.m21312e().mo16830c("wait_sp_load", f19978a, false);
        }
    }

    /* renamed from: a */
    public static boolean m22209a(Object obj) {
        Context a = C6399b.m19921a();
        if (Looper.myLooper() != Looper.getMainLooper() || f19979b || !C6857a.m21312e().f19501a || obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue() || a == null || !C7150a.m22314a(a)) {
            return false;
        }
        return true;
    }
}
