package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.j */
public final class C26319j implements C47373d<IBridgeService> {

    /* renamed from: a */
    private static final C26319j f69305a = new C26319j();

    /* renamed from: a */
    public static C26319j m86568a() {
        return f69305a;
    }

    /* renamed from: b */
    private static IBridgeService m86569b() {
        return m86570c();
    }

    /* renamed from: c */
    private static IBridgeService m86570c() {
        return m86571d();
    }

    public final /* synthetic */ Object get() {
        return m86569b();
    }

    /* renamed from: d */
    private static IBridgeService m86571d() {
        return (IBridgeService) C47375f.m147940a(C26295c.m86464a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
