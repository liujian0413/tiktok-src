package com.p280ss.android.ugc.aweme.emoji.utils;

import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a */
public final class C27630a {
    /* renamed from: c */
    public static long m90585c() {
        return Long.parseLong(m90584b().toString());
    }

    /* renamed from: a */
    public static boolean m90583a() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || !iUserService.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static CharSequence m90584b() {
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        if (userService == null) {
            return "-1";
        }
        return userService.getCurUserId();
    }
}
