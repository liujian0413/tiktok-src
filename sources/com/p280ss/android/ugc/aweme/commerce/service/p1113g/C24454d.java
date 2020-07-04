package com.p280ss.android.ugc.aweme.commerce.service.p1113g;

import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.g.d */
public final class C24454d {

    /* renamed from: a */
    public static final C24454d f64504a = new C24454d();

    private C24454d() {
    }

    /* renamed from: a */
    public static boolean m80379a(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            str2 = iUserService.getCurrentUserID();
        } else {
            str2 = null;
        }
        return C7573i.m23585a((Object) str2, (Object) str);
    }
}
