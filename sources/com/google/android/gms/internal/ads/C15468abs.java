package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;

/* renamed from: com.google.android.gms.internal.ads.abs */
final class C15468abs {

    /* renamed from: a */
    private final Object f39936a;

    /* renamed from: b */
    private volatile int f39937b;

    /* renamed from: c */
    private volatile long f39938c;

    private C15468abs() {
        this.f39936a = new Object();
        this.f39937b = abt.f39939a;
        this.f39938c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m45404a(int r5, int r6) {
        /*
            r4 = this;
            r4.m45405d()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r0 = r0.mo38684a()
            java.lang.Object r2 = r4.f39936a
            monitor-enter(r2)
            int r3 = r4.f39937b     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f39937b = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f39937b     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.abt.f39941c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f39938c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15468abs.m45404a(int, int):void");
    }

    /* renamed from: d */
    private final void m45405d() {
        long a = C14793ay.m42901g().mo38684a();
        synchronized (this.f39936a) {
            if (this.f39937b == abt.f39941c) {
                if (this.f39938c + ((Long) bym.m50299d().mo41272a(C15585bw.f43880cU)).longValue() <= a) {
                    this.f39937b = abt.f39939a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39104a(boolean z) {
        if (z) {
            m45404a(abt.f39939a, abt.f39940b);
        } else {
            m45404a(abt.f39940b, abt.f39939a);
        }
    }

    /* renamed from: a */
    public final boolean mo39105a() {
        m45405d();
        return this.f39937b == abt.f39940b;
    }

    /* renamed from: b */
    public final boolean mo39106b() {
        m45405d();
        return this.f39937b == abt.f39941c;
    }

    /* renamed from: c */
    public final void mo39107c() {
        m45404a(abt.f39940b, abt.f39941c);
    }

    /* synthetic */ C15468abs(abr abr) {
        this();
    }
}
