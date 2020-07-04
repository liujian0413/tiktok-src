package com.p280ss.android.ugc.aweme.setting.api;

import com.bytedance.common.utility.collection.C6309f;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.model.BlackList;
import com.p280ss.android.ugc.aweme.setting.model.ChatAuthority;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager */
public final class BlackApiManager {

    /* renamed from: a */
    static BlackApi f97983a = ((BlackApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(BlackApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager$BlackApi */
    interface BlackApi {
        @C7730f(mo20420a = "/aweme/v1/user/block/list/")
        C18253l<BlackList> fetchBlackList(@C7744t(mo20436a = "index") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/user/settings/")
        C18253l<ChatAuthority> getChatAuthority();

        @C7730f(mo20420a = "/aweme/v1/im/set/chatpriv/")
        C18253l<BaseResponse> setChatAuthority(@C7744t(mo20436a = "val") int i);
    }

    /* renamed from: a */
    public static void m120339a(C6309f fVar, final int i) {
        C23397p.m76735a().mo60807a(fVar, new Callable() {
            public final Object call() throws Exception {
                try {
                    return BlackApiManager.f97983a.setChatAuthority(i).get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: a */
    private static BlackList m120337a(int i, int i2) throws Exception {
        try {
            return (BlackList) f97983a.fetchBlackList(i, i2).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BlackList m120338a(int i, int i2, int i3) throws Exception {
        return m120337a(i, 10);
    }
}
