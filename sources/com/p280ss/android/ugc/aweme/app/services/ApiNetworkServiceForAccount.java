package com.p280ss.android.ugc.aweme.app.services;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33017d;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount */
public final class ApiNetworkServiceForAccount implements C33017d {

    /* renamed from: a */
    private AccountApi f60798a = ((AccountApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(AccountApi.class));

    /* renamed from: com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount$AccountApi */
    public interface AccountApi {
        @C6457h
        C12466b<String> doGet(@C6450ac String str);

        @C6456g
        @C6468s
        C12466b<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);

        @C6456g
        @C6468s
        C18253l<UserResponse> postUserResponse(@C6450ac String str, @C6455f Map<String, String> map);
    }
}
