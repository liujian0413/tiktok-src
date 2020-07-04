package com.p280ss.android.ugc.aweme.mix;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailApi */
public interface MixDetailApi {

    /* renamed from: a */
    public static final C33479a f87436a = C33479a.f87437a;

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailApi$a */
    public static final class C33479a {

        /* renamed from: a */
        static final /* synthetic */ C33479a f87437a = new C33479a();

        private C33479a() {
        }

        /* renamed from: a */
        public static MixDetailApi m108258a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(MixDetailApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…MixDetailApi::class.java)");
            return (MixDetailApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/mix/detail/")
    C7492s<MixInfo> getMixInfo(@C7744t(mo20436a = "mix_id") String str);

    @C7730f(mo20420a = "/aweme/v1/mix/aweme/")
    C7492s<MixList> getMixListAweme(@C7744t(mo20436a = "mix_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "pull_type") int i2);
}
