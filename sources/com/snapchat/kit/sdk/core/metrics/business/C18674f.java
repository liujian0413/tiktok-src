package com.snapchat.kit.sdk.core.metrics.business;

import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.f */
public final class C18674f implements C47373d<C18673e> {

    /* renamed from: a */
    private final C47883a<KitEventBaseFactory> f50459a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18673e get() {
        return new C18673e((KitEventBaseFactory) this.f50459a.get());
    }

    private C18674f(C47883a<KitEventBaseFactory> aVar) {
        this.f50459a = aVar;
    }

    /* renamed from: a */
    public static C47373d<C18673e> m61204a(C47883a<KitEventBaseFactory> aVar) {
        return new C18674f(aVar);
    }
}
