package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.networking.ClientFactory;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.f */
public final class C18680f implements C47373d<MetricsClient> {

    /* renamed from: a */
    private final C47883a<ClientFactory> f50465a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MetricsClient get() {
        return (MetricsClient) C47375f.m147940a(C18677c.m61211a((ClientFactory) this.f50465a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18680f(C47883a<ClientFactory> aVar) {
        this.f50465a = aVar;
    }

    /* renamed from: a */
    public static C47373d<MetricsClient> m61219a(C47883a<ClientFactory> aVar) {
        return new C18680f(aVar);
    }
}
