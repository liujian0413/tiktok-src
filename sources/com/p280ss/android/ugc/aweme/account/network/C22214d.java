package com.p280ss.android.ugc.aweme.account.network;

import android.support.p022v4.util.C0888a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import com.p280ss.android.ugc.aweme.services.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor;
import com.p280ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor;

/* renamed from: com.ss.android.ugc.aweme.account.network.d */
public final class C22214d {

    /* renamed from: a */
    private static final C0888a<Integer> f59315a;

    static {
        C0888a<Integer> aVar = new C0888a<>();
        f59315a = aVar;
        aVar.add(Integer.valueOf(1101));
        f59315a.add(Integer.valueOf(1102));
        f59315a.add(Integer.valueOf(1103));
    }

    /* renamed from: a */
    static IInterceptor m73690a(int i) {
        if (C21578r.f57916d.contains(Integer.valueOf(i))) {
            return new TwoStepAuthenticationInterceptor();
        }
        if (!f59315a.contains(Integer.valueOf(i)) || !(((C33023i) C21671bd.m72521a(C33023i.class)).mo60020b() instanceof SignUpOrLoginActivity)) {
            return null;
        }
        return new PicCaptchaInterceptor();
    }
}
