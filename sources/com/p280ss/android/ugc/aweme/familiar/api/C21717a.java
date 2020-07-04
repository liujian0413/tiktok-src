package com.p280ss.android.ugc.aweme.familiar.api;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21711b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.familiar.api.a */
public final class C21717a {

    /* renamed from: a */
    public static final C21717a f58160a = new C21717a();

    /* renamed from: b */
    private static IFamiliarFeedApiV1 f58161b;

    private C21717a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(IFamiliarFeedApiV1.class);
        C7573i.m23582a(create, "ServiceManager.get().get…iarFeedApiV1::class.java)");
        f58161b = (IFamiliarFeedApiV1) create;
    }

    /* renamed from: a */
    public static C21711b m72636a(long j, int i, int i2, int i3, int i4, String str, String str2, long j2, int i5) {
        try {
            IFamiliarFeedApiV1 iFamiliarFeedApiV1 = f58161b;
            C34202f a = C34202f.m110435a();
            C7573i.m23582a((Object) a, "RecUserImpressionReporter.getInstance()");
            Object obj = iFamiliarFeedApiV1.getFamiliarFeedList(j, i, i2, i3, i4, str, str2, j2, a.mo86949b(), i5).get();
            C7573i.m23582a(obj, "api.getFamiliarFeedList(…ecommendUserCursor).get()");
            return (C21711b) obj;
        } catch (ExecutionException e) {
            RuntimeException propagateCompatibleException = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
            C7573i.m23582a((Object) propagateCompatibleException, "ServiceManager.get().get…ateCompatibleException(e)");
            throw propagateCompatibleException;
        }
    }
}
