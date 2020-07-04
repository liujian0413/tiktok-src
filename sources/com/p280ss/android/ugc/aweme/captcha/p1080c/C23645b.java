package com.p280ss.android.ugc.aweme.captcha.p1080c;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1081ui.CaptchaDialogFragment;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.b */
public final class C23645b {
    /* renamed from: a */
    public static boolean m77551a(Exception exc) {
        if (!(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 2155) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m77550a(C0608j jVar, ApiServerException apiServerException, C23637b bVar) {
        if (jVar != null) {
            String str = "";
            if (apiServerException != null) {
                str = apiServerException.getErrorMsg();
            }
            CaptchaDialogFragment captchaDialogFragment = (CaptchaDialogFragment) jVar.mo2644a("captcha");
            if (captchaDialogFragment == null) {
                captchaDialogFragment = new CaptchaDialogFragment();
            }
            if (!captchaDialogFragment.f62347j) {
                Bundle bundle = new Bundle();
                bundle.putString("title", str);
                captchaDialogFragment.setArguments(bundle);
                captchaDialogFragment.f62342e = bVar;
                captchaDialogFragment.show(jVar, "captcha");
            }
        }
    }
}
