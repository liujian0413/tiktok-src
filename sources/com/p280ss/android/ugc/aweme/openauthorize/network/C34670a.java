package com.p280ss.android.ugc.aweme.openauthorize.network;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.openauthorize.p1447a.C34659a;
import p346io.reactivex.C7319aa;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.network.a */
public final class C34670a {

    /* renamed from: a */
    public static final C34670a f90447a = new C34670a();

    /* renamed from: b */
    private static final AuthorizeApi f90448b = ((AuthorizeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(AuthorizeApi.class));

    private C34670a() {
    }

    /* renamed from: a */
    public static C7319aa<C34659a> m111965a(String str) {
        return f90448b.getLoginStatus(str);
    }
}
