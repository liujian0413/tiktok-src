package com.p280ss.android.ugc.aweme.captcha.p1078a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23644a;
import com.p280ss.android.ugc.aweme.common.C25640a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.captcha.a.f */
public final class C23634f extends C25640a<C23633e> {
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
                return VerifyCaptchaApi.m77529a(C23644a.m77547b((String) objArr[0]));
            }
        }, 0);
        return true;
    }
}
