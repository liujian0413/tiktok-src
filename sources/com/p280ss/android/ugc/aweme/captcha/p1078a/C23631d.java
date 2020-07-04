package com.p280ss.android.ugc.aweme.captcha.p1078a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi;
import com.p280ss.android.ugc.aweme.common.C25640a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.captcha.a.d */
public final class C23631d extends C25640a<C23630c> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return VerifyCaptchaApi.m77528a((Boolean) objArr[0]);
            }
        }, 0);
        return true;
    }
}
