package com.snapchat.kit.sdk;

import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.snapchat.kit.sdk.g */
public final class C18715g implements C47373d<String> {

    /* renamed from: a */
    private final C18713e f50538a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String get() {
        return (String) C47375f.m147940a(this.f50538a.f50534b, "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18715g(C18713e eVar) {
        this.f50538a = eVar;
    }

    /* renamed from: a */
    public static C47373d<String> m61286a(C18713e eVar) {
        return new C18715g(eVar);
    }
}
