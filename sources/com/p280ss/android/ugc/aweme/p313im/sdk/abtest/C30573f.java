package com.p280ss.android.ugc.aweme.p313im.sdk.abtest;

import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.f */
public final class C30573f {
    /* renamed from: a */
    public static int m99861a() {
        int i = 10;
        if (ServiceManager.get().getService(IUserService.class) != null && ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser() != null && ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().isPhoneBinded()) {
            return 10;
        }
        C7093b abInterface = ((IIMService) C6993a.m21773a(IIMService.class)).getAbInterface();
        if (abInterface != null) {
            i = abInterface.mo18353a();
        }
        return i;
    }
}
