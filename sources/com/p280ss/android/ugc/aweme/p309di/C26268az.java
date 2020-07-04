package com.p280ss.android.ugc.aweme.p309di;

import com.bytedance.debugbox.base.IDebugBoxService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.az */
public final class C26268az implements C47373d<IDebugBoxService> {

    /* renamed from: a */
    private static final C26268az f69265a = new C26268az();

    /* renamed from: a */
    public static C26268az m86342a() {
        return f69265a;
    }

    /* renamed from: b */
    private static IDebugBoxService m86343b() {
        return m86344c();
    }

    /* renamed from: c */
    private static IDebugBoxService m86344c() {
        return m86345d();
    }

    public final /* synthetic */ Object get() {
        return m86343b();
    }

    /* renamed from: d */
    private static IDebugBoxService m86345d() {
        return (IDebugBoxService) C47375f.m147940a(C26266ax.m86336a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
