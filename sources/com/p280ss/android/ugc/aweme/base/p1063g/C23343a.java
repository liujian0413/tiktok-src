package com.p280ss.android.ugc.aweme.base.p1063g;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.g.a */
public class C23343a<T> {

    /* renamed from: a */
    private boolean f61426a;

    /* renamed from: b */
    private final ArrayList<C23344b<T>> f61427b = new ArrayList<>();

    /* renamed from: c */
    private synchronized boolean m76595c() {
        return this.f61426a;
    }

    /* renamed from: b */
    private synchronized void mo103182b() {
        this.f61426a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo60638a() {
        this.f61426a = true;
    }

    /* renamed from: a */
    public final synchronized void mo60639a(C23344b bVar) {
        if (!this.f61427b.contains(bVar)) {
            this.f61427b.add(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0[r1].mo60641a(r3, r4);
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = r0.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 < 0) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60640a(T r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m76595c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            java.util.ArrayList<com.ss.android.ugc.aweme.base.g.b<T>> r0 = r3.f61427b     // Catch:{ all -> 0x002b }
            java.util.ArrayList<com.ss.android.ugc.aweme.base.g.b<T>> r1 = r3.f61427b     // Catch:{ all -> 0x002b }
            int r1 = r1.size()     // Catch:{ all -> 0x002b }
            com.ss.android.ugc.aweme.base.g.b[] r1 = new com.p280ss.android.ugc.aweme.base.p1063g.C23344b[r1]     // Catch:{ all -> 0x002b }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x002b }
            com.ss.android.ugc.aweme.base.g.b[] r0 = (com.p280ss.android.ugc.aweme.base.p1063g.C23344b[]) r0     // Catch:{ all -> 0x002b }
            r3.mo103182b()     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            int r1 = r0.length
            int r1 = r1 + -1
        L_0x0020:
            if (r1 < 0) goto L_0x002a
            r2 = r0[r1]
            r2.mo60641a(r3, r4)
            int r1 = r1 + -1
            goto L_0x0020
        L_0x002a:
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p1063g.C23343a.mo60640a(java.lang.Object):void");
    }
}
