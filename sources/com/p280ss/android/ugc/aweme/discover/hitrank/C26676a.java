package com.p280ss.android.ugc.aweme.discover.hitrank;

import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.a */
public final class C26676a {

    /* renamed from: a */
    public static final C26676a f70348a = new C26676a();

    private C26676a() {
    }

    /* renamed from: a */
    public static final boolean m87639a(User user) {
        if (user == null || (user.getStarBillboardRank() <= 0 && !user.isStar())) {
            return false;
        }
        return true;
    }
}
