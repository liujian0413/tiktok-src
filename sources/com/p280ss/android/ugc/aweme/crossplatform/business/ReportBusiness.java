package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.report.C37196b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.ReportBusiness */
public class ReportBusiness extends Business {
    ReportBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo67215a(Activity activity) {
        Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f68330i.f68473a.f68437j);
        C37196b.m119566a((Map<String, String>) C25244aq.m82988a(rawAdAwemeById, "homepage_hot"));
        C37196b.m119559a(activity, C25244aq.m82987a(rawAdAwemeById, "landing_page", "ad"));
    }
}
