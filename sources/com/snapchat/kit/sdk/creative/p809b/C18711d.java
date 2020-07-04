package com.snapchat.kit.sdk.creative.p809b;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.creative.b.d */
public final class C18711d implements C47373d<C18710c> {

    /* renamed from: a */
    private final C47883a<MetricQueue<OpMetric>> f50516a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18710c get() {
        return new C18710c((MetricQueue) this.f50516a.get());
    }

    private C18711d(C47883a<MetricQueue<OpMetric>> aVar) {
        this.f50516a = aVar;
    }

    /* renamed from: a */
    public static C47373d<C18710c> m61273a(C47883a<MetricQueue<OpMetric>> aVar) {
        return new C18711d(aVar);
    }
}
