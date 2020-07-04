package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.bn */
public final class C26282bn implements C47373d<NoticeABService> {

    /* renamed from: a */
    private static final C26282bn f69275a = new C26282bn();

    /* renamed from: a */
    public static C26282bn m86406a() {
        return f69275a;
    }

    /* renamed from: b */
    private static NoticeABService m86407b() {
        return m86408c();
    }

    /* renamed from: c */
    private static NoticeABService m86408c() {
        return m86409d();
    }

    public final /* synthetic */ Object get() {
        return m86407b();
    }

    /* renamed from: d */
    private static NoticeABService m86409d() {
        return (NoticeABService) C47375f.m147940a(C26277bi.m86372a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
