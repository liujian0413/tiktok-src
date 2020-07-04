package com.p280ss.android.ugc.aweme.util;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;

/* renamed from: com.ss.android.ugc.aweme.util.r */
public final class C42894r {
    /* renamed from: a */
    public static void m136193a(String str, boolean z, String str2) {
        C6869c a = C6869c.m21381a().mo16887a("url", str).mo16887a("errorDesc", str2);
        if (z) {
            C6893q.m21444a("aweme_open_schema_rate", 0, a.mo16888b());
        } else {
            C6893q.m21444a("aweme_open_schema_rate", 1, a.mo16888b());
        }
    }
}
