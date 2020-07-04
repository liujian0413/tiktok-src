package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.bo */
public final class C26283bo implements C47373d<NoticeCaptchaHelper> {

    /* renamed from: a */
    private static final C26283bo f69276a = new C26283bo();

    /* renamed from: a */
    public static C26283bo m86410a() {
        return f69276a;
    }

    /* renamed from: b */
    private static NoticeCaptchaHelper m86411b() {
        return m86412c();
    }

    /* renamed from: c */
    private static NoticeCaptchaHelper m86412c() {
        return m86413d();
    }

    public final /* synthetic */ Object get() {
        return m86411b();
    }

    /* renamed from: d */
    private static NoticeCaptchaHelper m86413d() {
        return (NoticeCaptchaHelper) C47375f.m147940a(C26277bi.m86373b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
