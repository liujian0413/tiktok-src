package com.snapchat.kit.sdk;

import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import okhttp3.Cache;

/* renamed from: com.snapchat.kit.sdk.f */
public final class C18714f implements C47373d<Cache> {

    /* renamed from: a */
    private final C18713e f50537a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Cache get() {
        return (Cache) C47375f.m147940a(this.f50537a.mo49226c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18714f(C18713e eVar) {
        this.f50537a = eVar;
    }

    /* renamed from: a */
    public static C47373d<Cache> m61284a(C18713e eVar) {
        return new C18714f(eVar);
    }
}
