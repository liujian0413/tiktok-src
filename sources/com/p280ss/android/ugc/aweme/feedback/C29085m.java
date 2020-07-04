package com.p280ss.android.ugc.aweme.feedback;

import android.text.TextUtils;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet;

/* renamed from: com.ss.android.ugc.aweme.feedback.m */
final class C29085m {
    /* renamed from: a */
    static String m95428a() {
        if (!TextUtils.isEmpty(I18nLancet.f84337a)) {
            return I18nLancet.f84337a;
        }
        String b = C19826j.m65470b();
        I18nLancet.f84337a = b;
        return b;
    }
}
