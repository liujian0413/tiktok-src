package com.p280ss.android.ugc.aweme.policy;

import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi */
public final class PolicyApi {

    /* renamed from: a */
    private static final PolicyService f93137a = ((PolicyService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(PolicyService.class));

    /* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi$PolicyService */
    public interface PolicyService {
        @C6468s(mo15750a = "/aweme/v1/accept-private-policy/")
        C7492s<BaseResponse> acceptPrivacyPolicy();

        @C6457h(mo15740a = "/aweme/v1/policy/")
        C18253l<Policy> checkPolicyVersion();

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/policy/")
        C18253l<Policy> checkPolicyVersion(@C6455f Map<String, String> map);
    }

    /* renamed from: b */
    public static C7492s<BaseResponse> m114654b() {
        return f93137a.acceptPrivacyPolicy();
    }

    /* renamed from: a */
    public static Policy m114652a() throws Exception {
        return (Policy) f93137a.checkPolicyVersion().get();
    }

    /* renamed from: a */
    public static void m114653a(String str) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(C38347c.f99551f, str);
        NetUtil.putCommonParams(hashMap, true);
        f93137a.checkPolicyVersion(hashMap).get();
    }
}
