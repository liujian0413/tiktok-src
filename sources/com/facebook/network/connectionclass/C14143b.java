package com.facebook.network.connectionclass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.network.connectionclass.b */
public final class C14143b {

    /* renamed from: a */
    private C14150d f37374a;

    /* renamed from: b */
    private volatile boolean f37375b;

    /* renamed from: c */
    private AtomicReference<ConnectionQuality> f37376c;

    /* renamed from: d */
    private AtomicReference<ConnectionQuality> f37377d;

    /* renamed from: e */
    private ArrayList<Object> f37378e;

    /* renamed from: f */
    private int f37379f;

    /* renamed from: com.facebook.network.connectionclass.b$a */
    static class C14145a {

        /* renamed from: a */
        public static final C14143b f37380a = new C14143b();
    }

    /* renamed from: a */
    public static C14143b m41756a() {
        return C14145a.f37380a;
    }

    /* renamed from: d */
    private void m41757d() {
        int size = this.f37378e.size();
        for (int i = 0; i < size; i++) {
            this.f37378e.get(i);
            this.f37376c.get();
        }
    }

    /* renamed from: b */
    public final synchronized ConnectionQuality mo33901b() {
        if (this.f37374a == null) {
            return ConnectionQuality.UNKNOWN;
        }
        return m41755a(this.f37374a.f37388a);
    }

    /* renamed from: c */
    public final synchronized double mo33902c() {
        if (this.f37374a == null) {
            return -1.0d;
        }
        return this.f37374a.f37388a;
    }

    private C14143b() {
        this.f37374a = new C14150d(0.05d);
        this.f37375b = false;
        this.f37376c = new AtomicReference<>(ConnectionQuality.UNKNOWN);
        this.f37378e = new ArrayList<>();
    }

    /* renamed from: a */
    private static ConnectionQuality m41755a(double d) {
        if (d < 0.0d) {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 150.0d) {
            return ConnectionQuality.POOR;
        }
        if (d < 550.0d) {
            return ConnectionQuality.MODERATE;
        }
        if (d < 2000.0d) {
            return ConnectionQuality.GOOD;
        }
        return ConnectionQuality.EXCELLENT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33900a(long r5, long r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            double r5 = (double) r5
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r0
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            r7 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r5 = r5 * r7
            r7 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x007a
        L_0x001f:
            com.facebook.network.connectionclass.d r7 = r4.f37374a     // Catch:{ all -> 0x0077 }
            r7.mo33906a(r5)     // Catch:{ all -> 0x0077 }
            boolean r5 = r4.f37375b     // Catch:{ all -> 0x0077 }
            r6 = 1
            if (r5 == 0) goto L_0x005c
            int r5 = r4.f37379f     // Catch:{ all -> 0x0077 }
            int r5 = r5 + r6
            r4.f37379f = r5     // Catch:{ all -> 0x0077 }
            com.facebook.network.connectionclass.ConnectionQuality r5 = r4.mo33901b()     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference<com.facebook.network.connectionclass.ConnectionQuality> r7 = r4.f37377d     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0077 }
            r8 = 0
            if (r5 == r7) goto L_0x003f
            r4.f37375b = r8     // Catch:{ all -> 0x0077 }
            r4.f37379f = r6     // Catch:{ all -> 0x0077 }
        L_0x003f:
            int r5 = r4.f37379f     // Catch:{ all -> 0x0077 }
            double r0 = (double) r5     // Catch:{ all -> 0x0077 }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x005a
            r4.f37375b = r8     // Catch:{ all -> 0x0077 }
            r4.f37379f = r6     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference<com.facebook.network.connectionclass.ConnectionQuality> r5 = r4.f37376c     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference<com.facebook.network.connectionclass.ConnectionQuality> r6 = r4.f37377d     // Catch:{ all -> 0x0077 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0077 }
            r5.set(r6)     // Catch:{ all -> 0x0077 }
            r4.m41757d()     // Catch:{ all -> 0x0077 }
        L_0x005a:
            monitor-exit(r4)
            return
        L_0x005c:
            java.util.concurrent.atomic.AtomicReference<com.facebook.network.connectionclass.ConnectionQuality> r5 = r4.f37376c     // Catch:{ all -> 0x0077 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0077 }
            com.facebook.network.connectionclass.ConnectionQuality r7 = r4.mo33901b()     // Catch:{ all -> 0x0077 }
            if (r5 == r7) goto L_0x0075
            r4.f37375b = r6     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0077 }
            com.facebook.network.connectionclass.ConnectionQuality r6 = r4.mo33901b()     // Catch:{ all -> 0x0077 }
            r5.<init>(r6)     // Catch:{ all -> 0x0077 }
            r4.f37377d = r5     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r4)
            return
        L_0x0077:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x007a:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.network.connectionclass.C14143b.mo33900a(long, long):void");
    }
}
