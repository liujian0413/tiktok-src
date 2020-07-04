package com.p280ss.android.ugc.aweme.setting.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfoResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi */
public final class RestrictApi {

    /* renamed from: a */
    private static final RealApi f97988a = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RealApi.class));

    /* renamed from: b */
    private static IRetrofitService f97989b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/item/restrict/info/")
        C18253l<RestrictInfoResponse> getRestrictInfo(@C7744t(mo20436a = "target_iid") String str);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/item/restrict/")
        C18253l<CommonResponse> restrictAweme(@C7727c(mo20417a = "target_iid") String str);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/user/restrict/")
        C18253l<CommonResponse> restrictUser(@C7727c(mo20417a = "target_uid") String str);
    }

    /* renamed from: b */
    public static CommonResponse m120342b(String str) throws Exception {
        try {
            return (CommonResponse) f97988a.restrictAweme(str).get();
        } catch (ExecutionException e) {
            throw f97989b.propagateCompatibleException(e);
        }
    }

    /* renamed from: c */
    public static CommonResponse m120343c(String str) throws Exception {
        try {
            return (CommonResponse) f97988a.restrictUser(str).get();
        } catch (ExecutionException e) {
            throw f97989b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static RestrictInfo m120341a(String str) throws Exception {
        try {
            RestrictInfoResponse restrictInfoResponse = (RestrictInfoResponse) f97988a.getRestrictInfo(str).get();
            if (restrictInfoResponse != null) {
                restrictInfoResponse.mRestrictInfo.awemeId = str;
            }
            if (restrictInfoResponse == null) {
                return null;
            }
            return restrictInfoResponse.mRestrictInfo;
        } catch (ExecutionException e) {
            throw f97989b.propagateCompatibleException(e);
        }
    }
}
