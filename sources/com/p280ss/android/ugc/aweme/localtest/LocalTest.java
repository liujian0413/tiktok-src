package com.p280ss.android.ugc.aweme.localtest;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p280ss.android.ugc.aweme.p313im.C30565i;
import com.p280ss.android.ugc.aweme.p313im.DefaultIMService;

/* renamed from: com.ss.android.ugc.aweme.localtest.LocalTest */
public final class LocalTest {

    /* renamed from: com.ss.android.ugc.aweme.localtest.LocalTest$DefaultLocalTestService */
    public static final class DefaultLocalTestService implements LocalTestApi {
        private static DefaultLocalTestService sInstance;

        public final void openRobustActivity(Context context) {
        }

        public static DefaultLocalTestService inst() {
            if (sInstance == null) {
                synchronized (DefaultIMService.class) {
                    if (sInstance == null) {
                        sInstance = new DefaultLocalTestService();
                    }
                }
            }
            return sInstance;
        }
    }

    /* renamed from: a */
    public static LocalTestApi m105652a() {
        C30565i.m99837a();
        try {
            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
            if (localTestApi == null) {
                return DefaultLocalTestService.inst();
            }
            C30565i.m99838b();
            return localTestApi;
        } finally {
            C30565i.m99838b();
        }
    }
}
