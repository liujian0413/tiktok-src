package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.ImageUserService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.ImageUserServiceImpl */
public final class ImageUserServiceImpl implements ImageUserService {
    public final String getCurrentUserId() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        String curUserId = f.getCurUserId();
        C7573i.m23582a((Object) curUserId, "AccountProxyService.userService().curUserId");
        return curUserId;
    }
}
