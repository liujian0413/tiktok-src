package com.bytedance.frameworks.baselib.network.http;

import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p759ac.C15461d;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g */
final class C10154g {
    /* renamed from: a */
    static Map m30153a(String str, Map map) {
        Map b = C10142f.m30117b(str, map);
        C15461d.m45273a(str, b);
        return b;
    }

    /* renamed from: a */
    static void m30154a(boolean z) {
        C10142f.m30120c(z);
        if (z) {
            C6857a.m21312e().mo16827b("feed_network_init_cookie_duration", false);
        }
    }
}
