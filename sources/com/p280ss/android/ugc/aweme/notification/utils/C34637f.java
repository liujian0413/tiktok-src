package com.p280ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.f */
public final class C34637f {
    /* renamed from: a */
    public static boolean m111898a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    /* renamed from: a */
    public static boolean m111897a() {
        if (!C6399b.m19946v()) {
            return false;
        }
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser == null || currentUser.getUserMode() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m111896a(User user) {
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

    /* renamed from: a */
    public static boolean m111899a(User user, boolean z) {
        if (user == null || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }
}
