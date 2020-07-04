package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.cq */
public final class C26312cq implements C47373d<IWalletService> {

    /* renamed from: a */
    private static final C26312cq f69298a = new C26312cq();

    /* renamed from: a */
    public static C26312cq m86540a() {
        return f69298a;
    }

    /* renamed from: b */
    private static IWalletService m86541b() {
        return m86542c();
    }

    /* renamed from: c */
    private static IWalletService m86542c() {
        return m86543d();
    }

    public final /* synthetic */ Object get() {
        return m86541b();
    }

    /* renamed from: d */
    private static IWalletService m86543d() {
        return (IWalletService) C47375f.m147940a(C26309cn.m86531c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
