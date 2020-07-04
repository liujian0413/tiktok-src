package com.snapchat.kit.sdk;

import android.os.Handler;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.snapchat.kit.sdk.n */
public final class C18722n implements C47373d<Handler> {

    /* renamed from: a */
    private final C18713e f50554a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Handler get() {
        return (Handler) C47375f.m147940a(C18713e.m61279e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18722n(C18713e eVar) {
        this.f50554a = eVar;
    }

    /* renamed from: a */
    public static C47373d<Handler> m61301a(C18713e eVar) {
        return new C18722n(eVar);
    }
}
