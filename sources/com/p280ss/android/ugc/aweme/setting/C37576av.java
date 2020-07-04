package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.av */
final /* synthetic */ class C37576av implements Callable {

    /* renamed from: a */
    private final String f97997a;

    /* renamed from: b */
    private final int f97998b;

    C37576av(String str, int i) {
        this.f97997a = str;
        this.f97998b = i;
    }

    public final Object call() {
        return ((UserSettingsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(UserSettingsApi.class)).setItem(this.f97997a, this.f97998b);
    }
}
