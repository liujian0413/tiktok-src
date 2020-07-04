package com.p280ss.android.ugc.aweme.login.utils;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.model.C32672a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.login.utils.BannedApi */
public final class BannedApi {

    /* renamed from: a */
    static final IRetrofit f85198a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://rc.musical.ly");

    /* renamed from: com.ss.android.ugc.aweme.login.utils.BannedApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "https://rc.musical.ly/punish/toast_info")
        C18253l<C32672a> getBannedToastInfo(@C7744t(mo20436a = "uid") String str);

        @C7730f(mo20420a = "https://rc.musical.ly/punish/toast_info")
        C18253l<C32672a> getBannedToastInfoBySecUid(@C7744t(mo20436a = "sec_uid") String str);
    }

    /* renamed from: a */
    public static C18253l<C32672a> m105812a(String str) {
        return ((RealApi) f85198a.create(RealApi.class)).getBannedToastInfo(str);
    }

    /* renamed from: b */
    public static C18253l<C32672a> m105813b(String str) {
        return ((RealApi) f85198a.create(RealApi.class)).getBannedToastInfoBySecUid(str);
    }
}
