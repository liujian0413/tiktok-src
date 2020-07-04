package com.p280ss.android.ugc.awemepushlib.manager;

import android.text.TextUtils;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.d */
final class C43636d {
    /* renamed from: a */
    static String m138282a() {
        if (!TextUtils.isEmpty(I18nLancet.f84337a)) {
            return I18nLancet.f84337a;
        }
        String b = C19826j.m65470b();
        I18nLancet.f84337a = b;
        return b;
    }
}
