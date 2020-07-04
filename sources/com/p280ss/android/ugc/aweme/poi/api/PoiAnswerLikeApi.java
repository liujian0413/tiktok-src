package com.p280ss.android.ugc.aweme.poi.api;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi */
public interface PoiAnswerLikeApi {

    /* renamed from: a */
    public static final C35057a f91681a = C35057a.f91682a;

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi$a */
    public static final class C35057a {

        /* renamed from: a */
        static final /* synthetic */ C35057a f91682a = new C35057a();

        private C35057a() {
        }

        /* renamed from: a */
        public static PoiAnswerLikeApi m113162a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiAnswerLikeApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…nswerLikeApi::class.java)");
            return (PoiAnswerLikeApi) create;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/poi/answer/digg/")
    C7492s<BaseResponse> uploadAnswerLike(@C7727c(mo20417a = "answer_id") String str, @C7727c(mo20417a = "digg_action") int i);
}
