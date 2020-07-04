package com.p280ss.android.ugc.aweme.tools.live;

import bolts.C1592h;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi */
public final class LiveSettingApi {

    /* renamed from: a */
    private static API f110148a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/live/podcast/")
        C1592h<C42348a> getLivePodCast();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$a */
    public class C42348a extends BaseResponse {
        @C6593c(mo15949a = "can_be_live_podcast")

        /* renamed from: a */
        public boolean f110149a;
    }

    /* renamed from: a */
    public static API m134640a() {
        return f110148a;
    }
}
