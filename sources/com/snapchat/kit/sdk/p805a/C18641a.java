package com.snapchat.kit.sdk.p805a;

import com.C1642a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.C47369a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.snapchat.kit.sdk.a.a */
public final class C18641a {

    /* renamed from: a */
    private final C47369a<MetricQueue<OpMetric>> f50367a;

    /* renamed from: b */
    private final Map<C18642a, Long> f50368b = new ConcurrentHashMap();

    /* renamed from: com.snapchat.kit.sdk.a.a$a */
    public enum C18642a {
        REVOKE,
        REFRESH,
        GRANT
    }

    public C18641a(C47369a<MetricQueue<OpMetric>> aVar) {
        this.f50367a = aVar;
    }

    /* renamed from: b */
    private static String m61140b(C18642a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenLatency");
        return m61141b(sb.toString());
    }

    /* renamed from: c */
    private static String m61142c(C18642a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenFailure");
        return m61141b(sb.toString());
    }

    /* renamed from: d */
    private static String m61143d(C18642a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenRequest");
        return m61141b(sb.toString());
    }

    /* renamed from: a */
    public final synchronized void mo48878a(String str) {
        ((MetricQueue) this.f50367a.get()).push(OpMetricFactory.createCount(m61141b(str), 1));
    }

    /* renamed from: b */
    private static String m61141b(String str) {
        return C1642a.m8034a("%s:login:%s", new Object[]{BuildConfig.VERSION_NAME.replace('.', '_'), str});
    }

    /* renamed from: a */
    public final synchronized void mo48876a(C18642a aVar) {
        ((MetricQueue) this.f50367a.get()).push(OpMetricFactory.createCount(m61143d(aVar), 1));
        this.f50368b.put(aVar, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo48877a(com.snapchat.kit.sdk.p805a.C18641a.C18642a r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.OpMetric>> r0 = r5.f50367a     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003b }
            com.snapchat.kit.sdk.core.metrics.MetricQueue r0 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r0     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x002c
            java.util.Map<com.snapchat.kit.sdk.a.a$a, java.lang.Long> r7 = r5.f50368b     // Catch:{ all -> 0x003b }
            java.lang.Object r7 = r7.remove(r6)     // Catch:{ all -> 0x003b }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x002a
            java.lang.String r6 = m61140b(r6)     // Catch:{ all -> 0x003b }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003b }
            long r3 = r7.longValue()     // Catch:{ all -> 0x003b }
            r7 = 0
            long r1 = r1 - r3
            com.snapchat.kit.sdk.core.metrics.model.OpMetric r6 = com.snapchat.kit.sdk.core.metrics.OpMetricFactory.createTimer(r6, r1)     // Catch:{ all -> 0x003b }
            r0.push(r6)     // Catch:{ all -> 0x003b }
        L_0x002a:
            monitor-exit(r5)
            return
        L_0x002c:
            java.lang.String r6 = m61142c(r6)     // Catch:{ all -> 0x003b }
            r1 = 1
            com.snapchat.kit.sdk.core.metrics.model.OpMetric r6 = com.snapchat.kit.sdk.core.metrics.OpMetricFactory.createCount(r6, r1)     // Catch:{ all -> 0x003b }
            r0.push(r6)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.p805a.C18641a.mo48877a(com.snapchat.kit.sdk.a.a$a, boolean):void");
    }
}
