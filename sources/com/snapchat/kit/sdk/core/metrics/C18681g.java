package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p806a.C18661a;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.g */
public final class C18681g implements C47373d<MetricQueue<OpMetric>> {

    /* renamed from: a */
    private final C47883a<C18661a> f50466a;

    /* renamed from: b */
    private final C47883a<ScheduledExecutorService> f50467b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MetricQueue<OpMetric> get() {
        return (MetricQueue) C47375f.m147940a(C18677c.m61210a((C18661a) this.f50466a.get(), (ScheduledExecutorService) this.f50467b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18681g(C47883a<C18661a> aVar, C47883a<ScheduledExecutorService> aVar2) {
        this.f50466a = aVar;
        this.f50467b = aVar2;
    }

    /* renamed from: a */
    public static C47373d<MetricQueue<OpMetric>> m61221a(C47883a<C18661a> aVar, C47883a<ScheduledExecutorService> aVar2) {
        return new C18681g(aVar, aVar2);
    }
}
