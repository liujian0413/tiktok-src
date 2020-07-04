package com.p280ss.android.ugc.aweme.captcha.p1080c;

import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.e */
public final class C23648e implements NoticeCaptchaHelper {
    public final boolean shouldDoCaptcha(Exception exc) {
        C7573i.m23587b(exc, "e");
        return C23645b.m77551a(exc);
    }

    public final void showCaptchaDialog(C0608j jVar, ApiServerException apiServerException, C23637b bVar) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(apiServerException, "e");
        C7573i.m23587b(bVar, "onVerifyListener");
        C23645b.m77550a(jVar, apiServerException, bVar);
    }
}
