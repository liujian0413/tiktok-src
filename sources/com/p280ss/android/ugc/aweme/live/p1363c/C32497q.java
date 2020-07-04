package com.p280ss.android.ugc.aweme.live.p1363c;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.p455c.C9460a;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.live.c.q */
final /* synthetic */ class C32497q implements C23305g {

    /* renamed from: a */
    private final C9460a f84761a;

    C32497q(C9460a aVar) {
        this.f84761a = aVar;
    }

    /* renamed from: a */
    public final void mo58663a() {
        this.f84761a.mo22216a(C32478e.m105218a(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser()));
    }

    /* renamed from: a */
    public final void mo58664a(Bundle bundle) {
    }
}
