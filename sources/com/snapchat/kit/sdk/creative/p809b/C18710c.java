package com.snapchat.kit.sdk.creative.p809b;

import com.C1642a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.dagger.scope.CreativeScope;

@CreativeScope
/* renamed from: com.snapchat.kit.sdk.creative.b.c */
public final class C18710c {

    /* renamed from: a */
    private static final String f50514a = BuildConfig.VERSION_NAME.replace('.', '_');

    /* renamed from: b */
    private final MetricQueue<OpMetric> f50515b;

    public C18710c(MetricQueue<OpMetric> metricQueue) {
        this.f50515b = metricQueue;
    }

    /* renamed from: a */
    private static String m61269a(String str) {
        return C1642a.m8034a("%s:creative:%s", new Object[]{f50514a, str});
    }

    /* renamed from: b */
    public final synchronized void mo49201b(String str, long j) {
        this.f50515b.push(OpMetricFactory.createTimer(m61269a(str), j));
    }

    /* renamed from: a */
    public final synchronized void mo49200a(String str, long j) {
        this.f50515b.push(OpMetricFactory.createCount(m61269a(str), 1));
    }
}
