package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ak */
public final class C28207ak {

    /* renamed from: a */
    public static boolean f74308a;

    /* renamed from: a */
    public static boolean m92713a(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return true;
        }
        if ((!C25329c.m83221d(aweme) || (C25329c.m83224g(aweme) && !C25329c.m83206H(aweme))) && !C25072c.m82575a(aweme)) {
            z = false;
        } else {
            z = true;
        }
        if (aweme.getCommerceVideoAuthInfo() == null) {
            return z;
        }
        if (z || aweme.getCommerceVideoAuthInfo().isAvoidGlobalPendant()) {
            return true;
        }
        return false;
    }
}
