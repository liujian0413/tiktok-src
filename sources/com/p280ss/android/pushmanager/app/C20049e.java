package com.p280ss.android.pushmanager.app;

import android.text.TextUtils;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet;

/* renamed from: com.ss.android.pushmanager.app.e */
final class C20049e {
    /* renamed from: a */
    static String m66033a() {
        if (!TextUtils.isEmpty(I18nLancet.f84337a)) {
            return I18nLancet.f84337a;
        }
        String b = C19826j.m65470b();
        I18nLancet.f84337a = b;
        return b;
    }
}
