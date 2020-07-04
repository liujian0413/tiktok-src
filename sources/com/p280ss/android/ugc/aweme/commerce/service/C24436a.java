package com.p280ss.android.ugc.aweme.commerce.service;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.a */
public final class C24436a {

    /* renamed from: a */
    public static final C24436a f64500a = new C24436a();

    private C24436a() {
    }

    /* renamed from: a */
    public static final ICommerceService m80356a() {
        ICommerceService iCommerceService = (ICommerceService) ServiceManager.get().getService(ICommerceService.class);
        if (iCommerceService == null) {
            return new EmptyCommerceService();
        }
        return iCommerceService;
    }
}
