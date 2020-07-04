package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.pay.service.IPayService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.cc */
public final class C26298cc implements C47373d<IPayService> {

    /* renamed from: a */
    private static final C26298cc f69289a = new C26298cc();

    /* renamed from: a */
    public static C26298cc m86495a() {
        return f69289a;
    }

    /* renamed from: b */
    private static IPayService m86496b() {
        return m86497c();
    }

    /* renamed from: c */
    private static IPayService m86497c() {
        return m86498d();
    }

    public final /* synthetic */ Object get() {
        return m86496b();
    }

    /* renamed from: d */
    private static IPayService m86498d() {
        return (IPayService) C47375f.m147940a(C26297cb.m86494a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
