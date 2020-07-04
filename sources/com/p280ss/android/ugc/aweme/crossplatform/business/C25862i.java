package com.p280ss.android.ugc.aweme.crossplatform.business;

import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.i */
public interface C25862i extends C25865k {

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.i$a */
    public static class C25863a {
        /* renamed from: a */
        public static C25862i m85098a(C25834c cVar) {
            return new C25856c(cVar);
        }
    }

    /* renamed from: a */
    <T extends Business> T mo67230a(Class<T> cls);

    /* renamed from: a */
    void mo67231a();

    /* renamed from: a */
    void mo67232a(C25886b bVar);
}
