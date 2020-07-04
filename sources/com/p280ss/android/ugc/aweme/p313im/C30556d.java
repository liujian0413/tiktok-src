package com.p280ss.android.ugc.aweme.p313im;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.im.d */
public class C30556d {
    /* renamed from: g */
    public static IIMService m99810g() {
        return m99809a(false, true);
    }

    /* renamed from: a */
    public static IIMService m99808a(boolean z) {
        return m99809a(false, false);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static IIMService m99809a(boolean z, boolean z2) {
        C30565i.m99837a();
        try {
            IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class, z);
            if ((iIMService instanceof DefaultIMService) && !z2) {
                C30565i.m99838b();
                return null;
            } else if (iIMService != null || !z2) {
                C30565i.m99838b();
                return iIMService;
            } else {
                DefaultIMService inst = DefaultIMService.inst();
                C30565i.m99838b();
                return inst;
            }
        } catch (Throwable th) {
            C30565i.m99838b();
            throw th;
        }
    }
}
