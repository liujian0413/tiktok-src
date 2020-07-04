package com.p280ss.android.ugc.aweme.net;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p307au.C6887b;

/* renamed from: com.ss.android.ugc.aweme.net.x */
public final class C34106x {

    /* renamed from: a */
    private static Boolean f88874a;

    /* renamed from: a */
    public static Boolean m109782a() {
        if (f88874a == null) {
            boolean z = false;
            if (C6887b.m21436b().mo16903b(C6399b.m19921a(), "awe_network_x_token_disabled", 0) == 0) {
                z = true;
            }
            f88874a = Boolean.valueOf(z);
        }
        return f88874a;
    }
}
