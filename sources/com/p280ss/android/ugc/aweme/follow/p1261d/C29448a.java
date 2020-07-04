package com.p280ss.android.ugc.aweme.follow.p1261d;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.follow.d.a */
public final class C29448a {
    /* renamed from: a */
    public static boolean m96898a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return true;
        }
        return false;
    }
}
