package com.p280ss.android.ugc.aweme.policy.notice.api;

import bolts.C1592h;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi */
public final class PolicyNoticeApi {

    /* renamed from: a */
    public static final API f93153a;

    /* renamed from: b */
    public static final C35503a f93154b = new C35503a(null);

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi$API */
    public interface API {
        @C6457h(mo15740a = "/aweme/v1/policy/notice/")
        C1592h<C35506c> getPolicyNotice();

        @C6468s(mo15750a = "/aweme/v1/policy/notice/approve/")
        C1592h<BaseResponse> policyNoticeApprove(@C6474y(mo15757a = "business") String str, @C6474y(mo15757a = "policy_version") String str2, @C6474y(mo15757a = "style") String str3, @C6474y(mo15757a = "extra") String str4);
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi$a */
    public static final class C35503a {
        private C35503a() {
        }

        /* renamed from: a */
        public static API m114664a() {
            return PolicyNoticeApi.f93153a;
        }

        public /* synthetic */ C35503a(C7571f fVar) {
            this();
        }
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class);
        C7573i.m23582a(create, "ServiceManager.get().get…ate<API>(API::class.java)");
        f93153a = (API) create;
    }
}
