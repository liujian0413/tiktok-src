package com.snapchat.kit.sdk.core.metrics.business;

import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.g */
public final class C18675g implements C47373d<KitEventBaseFactory> {

    /* renamed from: a */
    private final C47883a<String> f50460a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public KitEventBaseFactory get() {
        return new KitEventBaseFactory((String) this.f50460a.get());
    }

    private C18675g(C47883a<String> aVar) {
        this.f50460a = aVar;
    }

    /* renamed from: a */
    public static KitEventBaseFactory m61206a(String str) {
        return new KitEventBaseFactory(str);
    }

    /* renamed from: a */
    public static C47373d<KitEventBaseFactory> m61207a(C47883a<String> aVar) {
        return new C18675g(aVar);
    }
}
