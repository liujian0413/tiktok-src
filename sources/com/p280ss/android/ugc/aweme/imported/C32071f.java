package com.p280ss.android.ugc.aweme.imported;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.imported.f */
public final class C32071f {
    /* renamed from: a */
    public static String m104104a(User user) {
        if (user == null) {
            return "";
        }
        if (C6399b.m19946v()) {
            return m104105b(user);
        }
        return user.getNickname();
    }

    /* renamed from: b */
    private static String m104105b(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }
}
