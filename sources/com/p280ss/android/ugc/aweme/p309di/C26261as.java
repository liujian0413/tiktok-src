package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.as */
public final class C26261as implements C47373d<IBulletService> {

    /* renamed from: a */
    private static final C26261as f69260a = new C26261as();

    /* renamed from: a */
    public static C26261as m86317a() {
        return f69260a;
    }

    /* renamed from: b */
    private static IBulletService m86318b() {
        return m86319c();
    }

    /* renamed from: c */
    private static IBulletService m86319c() {
        return m86320d();
    }

    public final /* synthetic */ Object get() {
        return m86318b();
    }

    /* renamed from: d */
    private static IBulletService m86320d() {
        return (IBulletService) C47375f.m147940a(C26260ar.m86316a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
