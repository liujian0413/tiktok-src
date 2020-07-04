package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.ck */
public final class C26306ck implements C47373d<ICommerceService> {

    /* renamed from: a */
    private static final C26306ck f69294a = new C26306ck();

    /* renamed from: a */
    public static C26306ck m86520a() {
        return f69294a;
    }

    /* renamed from: b */
    private static ICommerceService m86521b() {
        return m86522c();
    }

    /* renamed from: c */
    private static ICommerceService m86522c() {
        return m86523d();
    }

    public final /* synthetic */ Object get() {
        return m86521b();
    }

    /* renamed from: d */
    private static ICommerceService m86523d() {
        return (ICommerceService) C47375f.m147940a(C26305cj.m86519a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
