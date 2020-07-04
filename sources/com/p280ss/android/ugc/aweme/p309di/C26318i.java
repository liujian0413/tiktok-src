package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.i */
public final class C26318i implements C47373d<IUserService> {

    /* renamed from: a */
    private static final C26318i f69304a = new C26318i();

    /* renamed from: a */
    public static C26318i m86564a() {
        return f69304a;
    }

    /* renamed from: b */
    private static IUserService m86565b() {
        return m86566c();
    }

    /* renamed from: c */
    private static IUserService m86566c() {
        return m86567d();
    }

    public final /* synthetic */ Object get() {
        return m86565b();
    }

    /* renamed from: d */
    private static IUserService m86567d() {
        return (IUserService) C47375f.m147940a(C26295c.m86459B(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
