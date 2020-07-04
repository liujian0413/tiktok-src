package com.p280ss.android.ugc.aweme.crossplatform.business;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness */
public class OpenUrlHintBusiness extends Business {
    public OpenUrlHintBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public static void m85018a(OpenURLHintLayout openURLHintLayout, String str) {
        openURLHintLayout.mo66183a(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str));
    }
}
