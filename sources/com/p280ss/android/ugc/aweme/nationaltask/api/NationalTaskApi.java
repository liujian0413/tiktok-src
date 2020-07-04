package com.p280ss.android.ugc.aweme.nationaltask.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.discover.model.NationalTask;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.nationaltask.api.NationalTaskApi */
public class NationalTaskApi {

    /* renamed from: a */
    private static INationalTaskApi f88777a;

    /* renamed from: com.ss.android.ugc.aweme.nationaltask.api.NationalTaskApi$INationalTaskApi */
    public interface INationalTaskApi {
        @C7730f(mo20420a = "/aweme/v1/commerce/national_task/detail/")
        C18253l<NationalTask> getNationalTask(@C7744t(mo20436a = "id") String str);
    }

    /* renamed from: a */
    public static INationalTaskApi m109601a() {
        if (f88777a == null) {
            synchronized (NationalTaskApi.class) {
                if (f88777a == null) {
                    f88777a = (INationalTaskApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(INationalTaskApi.class);
                }
            }
        }
        return f88777a;
    }
}
