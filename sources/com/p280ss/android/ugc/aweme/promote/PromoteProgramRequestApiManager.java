package com.p280ss.android.ugc.aweme.promote;

import com.bytedance.common.utility.collection.C6309f;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager */
public final class PromoteProgramRequestApiManager {

    /* renamed from: a */
    static final String f96756a = Api.f60502b;

    /* renamed from: b */
    static PromoteProgramRequestApi f96757b = ((PromoteProgramRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f96756a).create(PromoteProgramRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$PromoteProgramRequestApi */
    interface PromoteProgramRequestApi {
        @C7730f(mo20420a = "/aweme/v1/creatorlicense/cancel/")
        C18253l<BaseResponse> cancelPromoteProgram();

        @C7730f(mo20420a = "/aweme/v1/creatorlicense/confirm/")
        C18253l<PromoteProgramResponse> confirmPromoteProgram(@C7744t(mo20436a = "license_version") String str);
    }

    /* renamed from: a */
    public static void m118801a(C6309f fVar) {
        C23397p.m76735a().mo60807a(fVar, new Callable() {
            public final Object call() throws Exception {
                try {
                    return PromoteProgramRequestApiManager.f96757b.confirmPromoteProgram("1").get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: b */
    public static void m118802b(C6309f fVar) {
        C23397p.m76735a().mo60807a(null, new Callable() {
            public final Object call() throws Exception {
                try {
                    return PromoteProgramRequestApiManager.f96757b.cancelPromoteProgram().get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }
}
