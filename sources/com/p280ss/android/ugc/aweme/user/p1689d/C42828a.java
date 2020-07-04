package com.p280ss.android.ugc.aweme.user.p1689d;

import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.user.d.a */
public final class C42828a {
    /* renamed from: b */
    public static boolean m135985b(User user) {
        if (user == null || user.getCreateTime() < 1506787200) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m135984a(User user) {
        if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null) {
            return true;
        }
        return false;
    }
}
