package com.p280ss.android.ugc.aweme.login.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;

/* renamed from: com.ss.android.ugc.aweme.login.utils.a */
public final class C32698a {
    /* renamed from: a */
    public static boolean m105818a(Aweme aweme) {
        if (aweme == null || aweme.getTakeDownReason() != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m105819b(Aweme aweme) {
        if (!m105818a(aweme) || !C28482e.m93606a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m105817a(Aweme aweme, int i) {
        if (aweme == null || TextUtils.isEmpty(aweme.getTakeDownDesc()) || !m105818a(aweme)) {
            return C6399b.m19921a().getString(i);
        }
        return aweme.getTakeDownDesc();
    }
}
