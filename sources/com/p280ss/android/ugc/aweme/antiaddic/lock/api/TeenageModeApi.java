package com.p280ss.android.ugc.aweme.antiaddic.lock.api;

import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22600b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi */
public interface TeenageModeApi {

    /* renamed from: a */
    public static final C22591a f60164a = C22591a.f60165a;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi$a */
    public static final class C22591a {

        /* renamed from: a */
        static final /* synthetic */ C22591a f60165a = new C22591a();

        private C22591a() {
        }

        /* renamed from: a */
        public static TeenageModeApi m74661a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(TeenageModeApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…enageModeApi::class.java)");
            return (TeenageModeApi) create;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/minor/user/check/password/")
    C7492s<BaseResponse> checkTeenagePassword(@C7727c(mo20417a = "password") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/minor/user/set/settings/")
    C7492s<BaseResponse> setMinorSettings(@C7727c(mo20417a = "settings") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/minor/user/sync/settings/")
    C7492s<C22600b> syncMinorSettings(@C7727c(mo20417a = "teen_mode") int i, @C7727c(mo20417a = "screen_time_management") int i2, @C7727c(mo20417a = "password") String str, @C7727c(mo20417a = "password_create_time") long j);
}
