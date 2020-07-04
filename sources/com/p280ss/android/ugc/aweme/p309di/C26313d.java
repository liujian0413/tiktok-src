package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.services.IAVService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.d */
public final class C26313d implements C47373d<IAVService> {

    /* renamed from: a */
    private static final C26313d f69299a = new C26313d();

    /* renamed from: a */
    public static C26313d m86544a() {
        return f69299a;
    }

    /* renamed from: b */
    private static IAVService m86545b() {
        return m86546c();
    }

    /* renamed from: c */
    private static IAVService m86546c() {
        return m86547d();
    }

    public final /* synthetic */ Object get() {
        return m86545b();
    }

    /* renamed from: d */
    private static IAVService m86547d() {
        return (IAVService) C47375f.m147940a(C26295c.m86465b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
