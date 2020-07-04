package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.UploadTimeLockPasswordApi */
public final class UploadTimeLockPasswordApi {

    /* renamed from: a */
    public static final String f60303a = Api.f60502b;

    /* renamed from: b */
    public static UploadApi f60304b = ((UploadApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f60303a).create(UploadApi.class));

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.UploadTimeLockPasswordApi$UploadApi */
    interface UploadApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v2/user/teenmode/")
        C18253l<BaseResponse> upload(@C7727c(mo20417a = "password") String str, @C7727c(mo20417a = "user_id") String str2);
    }

    /* renamed from: a */
    public static C18253l<BaseResponse> m74885a(String str, String str2) {
        return f60304b.upload(str, str2);
    }
}
