package com.p280ss.android.ugc.aweme.commercialize.api.selfhelpad;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.selfhelpad.a */
public final class C24549a {

    /* renamed from: a */
    public static final C24549a f64796a = new C24549a();

    /* renamed from: b */
    private static SelfHelpAdApi f64797b;

    private C24549a() {
    }

    /* renamed from: a */
    public static C24550b m80572a(String str, String str2) {
        SelfHelpAdApi selfHelpAdApi;
        C7573i.m23587b(str, "enterFrom");
        if (f64797b == null) {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            if (iRetrofitService != null) {
                IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(TutorialVideoApiManager.f89507a);
                if (createNewRetrofit != null) {
                    selfHelpAdApi = (SelfHelpAdApi) createNewRetrofit.create(SelfHelpAdApi.class);
                    f64797b = selfHelpAdApi;
                }
            }
            selfHelpAdApi = null;
            f64797b = selfHelpAdApi;
        }
        try {
            SelfHelpAdApi selfHelpAdApi2 = f64797b;
            if (selfHelpAdApi2 != null) {
                C18253l checkSelfHelpAdEntrance = selfHelpAdApi2.checkSelfHelpAdEntrance(str, str2);
                if (checkSelfHelpAdEntrance != null) {
                    return (C24550b) checkSelfHelpAdEntrance.get();
                }
            }
            return null;
        } catch (ExecutionException e) {
            RuntimeException propagateCompatibleException = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
            C7573i.m23582a((Object) propagateCompatibleException, "ServiceManager.get().get…ateCompatibleException(e)");
            throw propagateCompatibleException;
        }
    }
}
