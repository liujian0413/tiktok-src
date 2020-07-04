package com.p280ss.android.ugc.aweme.interest;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.interest.c */
public final class C32183c {

    /* renamed from: a */
    public static final InterestApi f84044a = ((InterestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(InterestApi.class));

    /* renamed from: b */
    public static final C32184a f84045b = new C32184a(null);

    /* renamed from: com.ss.android.ugc.aweme.interest.c$a */
    public static final class C32184a {
        private C32184a() {
        }

        /* renamed from: a */
        public static InterestApi m104450a() {
            return C32183c.f84044a;
        }

        public /* synthetic */ C32184a(C7571f fVar) {
            this();
        }
    }
}
