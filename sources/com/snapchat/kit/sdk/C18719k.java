package com.snapchat.kit.sdk;

import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import okhttp3.OkHttpClient;

/* renamed from: com.snapchat.kit.sdk.k */
public final class C18719k implements C47373d<OkHttpClient> {

    /* renamed from: a */
    private final C18713e f50549a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public OkHttpClient get() {
        return (OkHttpClient) C47375f.m147940a(C18713e.m61278d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18719k(C18713e eVar) {
        this.f50549a = eVar;
    }

    /* renamed from: a */
    public static C47373d<OkHttpClient> m61294a(C18713e eVar) {
        return new C18719k(eVar);
    }
}
