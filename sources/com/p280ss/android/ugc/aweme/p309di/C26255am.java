package com.p280ss.android.ugc.aweme.p309di;

import android.content.Context;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.am */
public final class C26255am implements C47373d<Context> {

    /* renamed from: a */
    private final C26252aj f69256a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Context get() {
        return m86301b(this.f69256a);
    }

    /* renamed from: b */
    private static Context m86301b(C26252aj ajVar) {
        return m86300a(ajVar);
    }

    /* renamed from: a */
    public static Context m86300a(C26252aj ajVar) {
        return (Context) C47375f.m147940a(ajVar.f69253a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
