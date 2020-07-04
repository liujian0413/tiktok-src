package com.p280ss.android.ugc.aweme.favorites.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27700e;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27709l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi */
public interface ProfileCollectionJediApi {

    /* renamed from: a */
    public static final C27736a f73168a = C27736a.f73169a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi$a */
    public static final class C27736a {

        /* renamed from: a */
        static final /* synthetic */ C27736a f73169a = new C27736a();

        private C27736a() {
        }

        /* renamed from: a */
        public static ProfileCollectionJediApi m90938a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ProfileCollectionJediApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…ctionJediApi::class.java)");
            return (ProfileCollectionJediApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi$b */
    public static final class C27737b {
    }

    @C7730f(mo20420a = "/aweme/v1/mix/listcollection/")
    C7492s<C27700e> getMixCollection(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "mix_ids") String str);

    @C7730f(mo20420a = "/aweme/v1/user/collectionlist/")
    C7492s<C27709l> getProfileCollection();

    @C7730f(mo20420a = "/aweme/v1/mix/multi/details/")
    C7492s<C27700e> getSearchMixCollection(@C7744t(mo20436a = "mix_ids") String str);
}
