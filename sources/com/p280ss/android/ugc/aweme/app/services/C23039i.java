package com.p280ss.android.ugc.aweme.app.services;

import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.main.p1385g.C33019f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.i */
public final class C23039i implements C33019f {
    /* renamed from: a */
    public final boolean mo60012a(Exception exc) {
        C7573i.m23587b(exc, "e");
        return C23645b.m77551a(exc);
    }

    /* renamed from: a */
    public final void mo60011a(C0608j jVar, ApiServerException apiServerException, C23637b bVar) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(apiServerException, "e");
        C7573i.m23587b(bVar, "onVerifyListener");
        C23645b.m77550a(jVar, apiServerException, bVar);
    }
}
