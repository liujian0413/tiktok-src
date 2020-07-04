package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.ce */
public final class C26300ce implements C47373d<IPoiService> {

    /* renamed from: a */
    private static final C26300ce f69290a = new C26300ce();

    /* renamed from: a */
    public static C26300ce m86500a() {
        return f69290a;
    }

    /* renamed from: b */
    private static IPoiService m86501b() {
        return m86502c();
    }

    /* renamed from: c */
    private static IPoiService m86502c() {
        return m86503d();
    }

    public final /* synthetic */ Object get() {
        return m86501b();
    }

    /* renamed from: d */
    private static IPoiService m86503d() {
        return (IPoiService) C47375f.m147940a(C26299cd.m86499a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
