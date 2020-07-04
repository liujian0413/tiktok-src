package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.aq */
public final class C26259aq implements C47373d<IRequestIdService> {

    /* renamed from: a */
    private static final C26259aq f69259a = new C26259aq();

    /* renamed from: a */
    public static C26259aq m86312a() {
        return f69259a;
    }

    /* renamed from: b */
    private static IRequestIdService m86313b() {
        return m86314c();
    }

    /* renamed from: c */
    private static IRequestIdService m86314c() {
        return m86315d();
    }

    public final /* synthetic */ Object get() {
        return m86313b();
    }

    /* renamed from: d */
    private static IRequestIdService m86315d() {
        return (IRequestIdService) C47375f.m147940a(C26257ao.m86307b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
