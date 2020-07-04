package com.p280ss.android.ugc.aweme.poi.rate.api;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi */
public interface PoiSpuRateAwemeApi {

    /* renamed from: a */
    public static final C35207a f92186a = C35207a.f92187a;

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi$a */
    public static final class C35207a {

        /* renamed from: a */
        static final /* synthetic */ C35207a f92187a = new C35207a();

        private C35207a() {
        }

        /* renamed from: a */
        public static PoiSpuRateAwemeApi m113592a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiSpuRateAwemeApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…RateAwemeApi::class.java)");
            return (PoiSpuRateAwemeApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/poi/rate/spu/aweme/")
    C7492s<C35208a> requestPoiSpuRateAweme(@C7744t(mo20436a = "spu_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "poi_id") String str2, @C7744t(mo20436a = "item_has_more") int i2);
}
