package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.j.l */
public final class C28493l {
    /* renamed from: a */
    public static boolean m93637a() {
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser == null || ((Boolean) SharePrefCache.inst().getIsShowFavouriteIcon().mo59877d()).booleanValue() || (System.currentTimeMillis() / 1000) - curUser.getRegisterTime() <= 604800) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m93638a(Aweme aweme, int i) {
        if (!aweme.isCollected() || i != 2004) {
            return false;
        }
        return true;
    }
}
