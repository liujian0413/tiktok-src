package com.bytedance.ttnet;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.bytedance.ttnet.e */
final class C12974e {
    /* renamed from: a */
    static void m37816a(Activity activity) {
        boolean z = C6857a.m21312e().f19501a;
        long currentTimeMillis = z ? System.currentTimeMillis() : 0;
        C12961d.m37785b(activity);
        if (z) {
            C6857a.m21312e().mo16820a("cold_boot_ttnet_resume_monitor", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* renamed from: a */
    static void m37817a(Context context, boolean z) {
        C6857a.m21312e().mo16822a("feed_network_init_cookie_duration", false);
        C12961d.m37786b(context, z);
    }
}
