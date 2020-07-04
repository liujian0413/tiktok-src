package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.ap */
public final class C26258ap implements C47373d<IAwemeService> {

    /* renamed from: a */
    private static final C26258ap f69258a = new C26258ap();

    /* renamed from: a */
    public static C26258ap m86308a() {
        return f69258a;
    }

    /* renamed from: b */
    private static IAwemeService m86309b() {
        return m86310c();
    }

    /* renamed from: c */
    private static IAwemeService m86310c() {
        return m86311d();
    }

    public final /* synthetic */ Object get() {
        return m86309b();
    }

    /* renamed from: d */
    private static IAwemeService m86311d() {
        return (IAwemeService) C47375f.m147940a(C26257ao.m86306a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
