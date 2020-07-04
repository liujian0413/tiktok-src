package com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAwemeApi */
public final class TiktokRelieveAwemeApi {

    /* renamed from: a */
    public static final TiktokRelieveAwemeApi f60321a = new TiktokRelieveAwemeApi();

    /* renamed from: b */
    private static final RealApi f60322b;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAwemeApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/addiction/aweme/")
        C7492s<TiktokRelieveAweme> getTiktokRelieveAweme(@C7744t(mo20436a = "type") int i);
    }

    private TiktokRelieveAwemeApi() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RealApi.class);
        C7573i.m23582a(create, "ServiceManager.get()\n   …eApi.RealApi::class.java)");
        f60322b = (RealApi) create;
    }

    /* renamed from: a */
    public static final C7492s<TiktokRelieveAweme> m74890a(int i) {
        return f60322b.getTiktokRelieveAweme(i);
    }
}
