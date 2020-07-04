package com.p280ss.android.ugc.aweme.services.interceptor;

import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22054e.C22056b;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor$$Lambda$0 */
final /* synthetic */ class PicCaptchaInterceptor$$Lambda$0 implements C22056b {
    private final PicCaptchaInterceptor arg$1;

    PicCaptchaInterceptor$$Lambda$0(PicCaptchaInterceptor picCaptchaInterceptor) {
        this.arg$1 = picCaptchaInterceptor;
    }

    public final void onCancel() {
        this.arg$1.lambda$showCaptchaAndReleaseLockIfNeeded$0$PicCaptchaInterceptor();
    }
}
