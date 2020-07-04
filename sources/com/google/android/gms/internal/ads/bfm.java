package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class bfm implements bsj {

    /* renamed from: a */
    private final Map<String, List<bqk<?>>> f41840a = new HashMap();

    /* renamed from: b */
    private final bdn f41841b;

    bfm(bdn bdn) {
        this.f41841b = bdn;
    }

    /* renamed from: a */
    public final void mo40583a(bqk<?> bqk, bwf<?> bwf) {
        List<bqk> list;
        if (bwf.f44046b == null || bwf.f44046b.mo40059a()) {
            mo40582a(bqk);
            return;
        }
        String c = bqk.mo41151c();
        synchronized (this) {
            list = (List) this.f41840a.remove(c);
        }
        if (list != null) {
            if (C15633dq.f44343a) {
                Object[] objArr = {Integer.valueOf(list.size()), c};
            }
            for (bqk a : list) {
                this.f41841b.f41700e.mo39017a(a, bwf);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo40582a(bqk<?> bqk) {
        String c = bqk.mo41151c();
        List list = (List) this.f41840a.remove(c);
        if (list != null && !list.isEmpty()) {
            if (C15633dq.f44343a) {
                Object[] objArr = {Integer.valueOf(list.size()), c};
            }
            bqk bqk2 = (bqk) list.remove(0);
            this.f41840a.put(c, list);
            bqk2.mo41147a((bsj) this);
            try {
                this.f41841b.f41698c.put(bqk2);
            } catch (InterruptedException e) {
                new Object[1][0] = e.toString();
                Thread.currentThread().interrupt();
                this.f41841b.mo40524a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m48593b(com.google.android.gms.internal.ads.bqk<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo41151c()     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.bqk<?>>> r1 = r5.f41840a     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0048 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.bqk<?>>> r1 = r5.f41840a     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0048 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo41150b(r4)     // Catch:{ all -> 0x0048 }
            r1.add(r6)     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.bqk<?>>> r6 = r5.f41840a     // Catch:{ all -> 0x0048 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0048 }
            boolean r6 = com.google.android.gms.internal.ads.C15633dq.f44343a     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0033
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
            r6[r2] = r0     // Catch:{ all -> 0x0048 }
        L_0x0033:
            monitor-exit(r5)
            return r3
        L_0x0035:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.bqk<?>>> r1 = r5.f41840a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0048 }
            r6.mo41147a(r5)     // Catch:{ all -> 0x0048 }
            boolean r6 = com.google.android.gms.internal.ads.C15633dq.f44343a     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0046
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
            r6[r2] = r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r5)
            return r2
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfm.m48593b(com.google.android.gms.internal.ads.bqk):boolean");
    }
}
