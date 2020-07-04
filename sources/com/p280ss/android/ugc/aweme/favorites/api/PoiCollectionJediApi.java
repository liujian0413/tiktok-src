package com.p280ss.android.ugc.aweme.favorites.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27701f;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.PoiCollectionJediApi */
public interface PoiCollectionJediApi {

    /* renamed from: a */
    public static final C27735a f73166a = C27735a.f73167a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.PoiCollectionJediApi$a */
    public static final class C27735a {

        /* renamed from: a */
        static final /* synthetic */ C27735a f73167a = new C27735a();

        private C27735a() {
        }

        /* renamed from: a */
        public static PoiCollectionJediApi m90937a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(PoiCollectionJediApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…ctionJediApi::class.java)");
            return (PoiCollectionJediApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/poi/listcollection/")
    C7492s<C27701f> getPoiCollection(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2);
}
