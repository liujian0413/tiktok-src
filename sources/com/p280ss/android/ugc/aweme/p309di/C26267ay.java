package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.conan.IConanService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.ay */
public final class C26267ay implements C47373d<IConanService> {

    /* renamed from: a */
    private static final C26267ay f69264a = new C26267ay();

    /* renamed from: a */
    public static C26267ay m86338a() {
        return f69264a;
    }

    /* renamed from: b */
    private static IConanService m86339b() {
        return m86340c();
    }

    /* renamed from: c */
    private static IConanService m86340c() {
        return m86341d();
    }

    public final /* synthetic */ Object get() {
        return m86339b();
    }

    /* renamed from: d */
    private static IConanService m86341d() {
        return (IConanService) C47375f.m147940a(C26266ax.m86337b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
