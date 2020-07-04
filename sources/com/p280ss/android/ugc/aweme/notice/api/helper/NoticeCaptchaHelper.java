package com.p280ss.android.ugc.aweme.notice.api.helper;

import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper */
public interface NoticeCaptchaHelper {
    boolean shouldDoCaptcha(Exception exc);

    void showCaptchaDialog(C0608j jVar, ApiServerException apiServerException, C23637b bVar);
}
