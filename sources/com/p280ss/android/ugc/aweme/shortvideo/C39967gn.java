package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.vesdk.C45321i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gn */
public final class C39967gn {
    /* renamed from: a */
    public static C45321i m127849a() {
        C45321i iVar = new C45321i();
        iVar.f116727a = C35574k.m114859a().mo70102q().mo83142i();
        iVar.f116729c = C35574k.m114859a().mo70102q().mo83125a();
        iVar.f116728b = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        return iVar;
    }
}
