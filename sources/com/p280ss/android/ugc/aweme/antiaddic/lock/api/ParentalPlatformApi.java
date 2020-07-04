package com.p280ss.android.ugc.aweme.antiaddic.lock.api;

import android.text.TextUtils;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22599a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi */
public final class ParentalPlatformApi {

    /* renamed from: a */
    public static final String f60162a = Api.f60502b;

    /* renamed from: b */
    public static ParentalApi f60163b = ((ParentalApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f60162a).create(ParentalApi.class));

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi$ParentalApi */
    interface ParentalApi {
        @C7730f(mo20420a = " /aweme/v1/guardian/platform/dynamic/password/")
        C18253l<C22599a> getDynamicPassword(@C7744t(mo20436a = "user_id") String str);

        @C7729e
        @C7739o(mo20429a = " /aweme/v1/guardian/platform/child/manage/")
        C18253l<BaseResponse> modifyChildSetting(@C7728d Map<String, String> map);

        @C7730f(mo20420a = "/aweme/v1/guardian/platform/verify/password/")
        C18253l<BaseResponse> verifyPassword(@C7744t(mo20436a = "password") String str);
    }

    /* renamed from: a */
    public static C18253l<BaseResponse> m74658a(String str) {
        return f60163b.verifyPassword(str);
    }

    /* renamed from: b */
    public static C18253l<C22599a> m74660b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f60163b.getDynamicPassword(str);
    }

    /* renamed from: a */
    public static C18253l<BaseResponse> m74659a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return null;
        }
        map.put("user_id", str);
        return f60163b.modifyChildSetting(map);
    }
}
