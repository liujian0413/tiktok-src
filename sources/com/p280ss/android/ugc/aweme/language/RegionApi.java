package com.p280ss.android.ugc.aweme.language;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7743s;

/* renamed from: com.ss.android.ugc.aweme.language.RegionApi */
public interface RegionApi {

    /* renamed from: a */
    public static final C32310a f84386a = C32310a.f84387a;

    /* renamed from: com.ss.android.ugc.aweme.language.RegionApi$a */
    public static final class C32310a {

        /* renamed from: a */
        static final /* synthetic */ C32310a f84387a = new C32310a();

        /* renamed from: b */
        private static final RegionApi f84388b = ((RegionApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("http://sf16-muse-va.ibytedtos.com").create(RegionApi.class));

        private C32310a() {
        }

        /* renamed from: a */
        public static C7492s<C32322c> m104852a(String str) {
            C7573i.m23587b(str, "countryCode");
            RegionApi regionApi = f84388b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_en_L3.json");
            C7492s<C32322c> a = regionApi.getCountryDetail(sb.toString()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "sApi.getCountryDetail(\"$…dSchedulers.mainThread())");
            return a;
        }
    }

    @C7730f(mo20420a = "/obj/ttfe-maliva/ttarch/{country_json_file}")
    C7492s<C32322c> getCountryDetail(@C7743s(mo20434a = "country_json_file") String str);
}
