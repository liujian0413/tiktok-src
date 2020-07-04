package com.p280ss.android.ugc.aweme.freeflowcard.data;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi */
public final class FreeflowNoticeApi {

    /* renamed from: a */
    public static IRetrofitService f78793a;

    /* renamed from: b */
    public static NoticeApi f78794b;

    /* renamed from: c */
    public static final C29982a f78795c = new C29982a(null);

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi$NoticeApi */
    interface NoticeApi {
        @C7730f(mo20420a = "/aweme/v1/notice/send/")
        C18253l<BaseResponse> sendNotice(@C7744t(mo20436a = "oid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi$a */
    public static final class C29982a {
        private C29982a() {
        }

        public /* synthetic */ C29982a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C18253l<BaseResponse> m98300a(String str) {
            C7573i.m23587b(str, "oid");
            try {
                return FreeflowNoticeApi.f78794b.sendNotice(str);
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = FreeflowNoticeApi.f78793a.propagateCompatibleException(e);
                C7573i.m23582a((Object) propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f78793a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(Api.f60502b).create(NoticeApi.class);
        C7573i.m23582a(create, "retrofitService.createNe…te(NoticeApi::class.java)");
        f78794b = (NoticeApi) create;
    }
}
