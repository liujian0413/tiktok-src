package com.p280ss.android.ugc.aweme.app.application.p1025a;

import android.os.Bundle;
import android.os.Handler;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.IAccountService.C21078b;
import com.p280ss.android.ugc.aweme.account.model.C6862d;
import com.p280ss.android.ugc.aweme.login.C32657g;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.app.application.a.b */
public final class C22859b implements C21078b {
    /* renamed from: a */
    public final C6862d mo56856a() {
        return C7213d.m22500a().mo18803bo();
    }

    /* renamed from: c */
    public final C1592h<Bundle> mo56858c(Bundle bundle) {
        return C32657g.m105752a(bundle);
    }

    /* renamed from: a */
    static final /* synthetic */ Bundle m75317a(C1592h hVar) throws Exception {
        if (((Bundle) hVar.mo6890e()).getBoolean("need_restart", false)) {
            new Handler().postDelayed(new C22862e(hVar), 500);
        }
        return null;
    }

    /* renamed from: b */
    public final C1592h<Bundle> mo56857b(Bundle bundle) {
        return C32657g.m105752a(bundle).mo6876a(C22861d.f60587a, C1592h.f5958b);
    }

    /* renamed from: a */
    public final C1592h<Bundle> mo56855a(Bundle bundle) {
        return C32657g.m105752a(bundle).mo6875a((C1591g<TResult, TContinuationResult>) new C22860c<TResult,TContinuationResult>(bundle));
    }
}
