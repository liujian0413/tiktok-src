package com.p280ss.android.ugc.aweme.crossplatform.business;

import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25885a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.c */
class C25856c implements C25862i {

    /* renamed from: a */
    final C25834c f68385a;

    /* renamed from: b */
    private final BusinessService f68386b = new BusinessService(this);

    /* renamed from: a */
    public final void mo67231a() {
        ((WalletBusiness) this.f68386b.mo67175a(WalletBusiness.class)).mo67220a();
    }

    /* renamed from: a */
    public final <T extends Business> T mo67230a(Class<T> cls) {
        return this.f68386b.mo67175a(cls);
    }

    C25856c(C25834c cVar) {
        this.f68385a = cVar;
    }

    /* renamed from: a */
    public final void mo67233a(boolean z) {
        ((WalletBusiness) this.f68386b.mo67175a(WalletBusiness.class)).f68374a = true;
    }

    /* renamed from: a */
    public final void mo67232a(C25886b bVar) {
        if (bVar != null && bVar.f68473a.f68430c != null && C25885a.m85151a(bVar.f68473a.f68428a.intValue()) && bVar.f68473a.f68430c.endsWith("pay")) {
            this.f68386b.mo67175a(WalletBusiness.class);
            WalletBusiness.m85079b();
        }
    }
}
