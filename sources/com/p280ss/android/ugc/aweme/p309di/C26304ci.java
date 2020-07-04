package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.share.ShareService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.ci */
public final class C26304ci implements C47373d<ShareService> {

    /* renamed from: a */
    private static final C26304ci f69293a = new C26304ci();

    /* renamed from: a */
    public static C26304ci m86515a() {
        return f69293a;
    }

    /* renamed from: b */
    private static ShareService m86516b() {
        return m86517c();
    }

    /* renamed from: c */
    private static ShareService m86517c() {
        return m86518d();
    }

    public final /* synthetic */ Object get() {
        return m86516b();
    }

    /* renamed from: d */
    private static ShareService m86518d() {
        return (ShareService) C47375f.m147940a(C26301cf.m86504a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
