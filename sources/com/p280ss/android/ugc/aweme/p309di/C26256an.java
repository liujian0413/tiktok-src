package com.p280ss.android.ugc.aweme.p309di;

import android.app.Activity;
import dagger.android.C7313b.C7315b;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.an */
public final class C26256an implements C47373d<C7315b<? extends Activity>> {

    /* renamed from: a */
    private final C26252aj f69257a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7315b<? extends Activity> get() {
        return m86304b(this.f69257a);
    }

    private C26256an(C26252aj ajVar) {
        this.f69257a = ajVar;
    }

    /* renamed from: a */
    public static C26256an m86302a(C26252aj ajVar) {
        return new C26256an(ajVar);
    }

    /* renamed from: b */
    private static C7315b<? extends Activity> m86304b(C26252aj ajVar) {
        return m86305c(ajVar);
    }

    /* renamed from: c */
    private static C7315b<? extends Activity> m86305c(C26252aj ajVar) {
        return (C7315b) C47375f.m147940a(C26252aj.m86293a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
