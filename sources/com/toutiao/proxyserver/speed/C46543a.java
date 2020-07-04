package com.toutiao.proxyserver.speed;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.toutiao.proxyserver.speed.a */
public final class C46543a {

    /* renamed from: a */
    private C46551d f119947a;

    /* renamed from: b */
    private volatile boolean f119948b;

    /* renamed from: c */
    private AtomicReference<ConnectionQuality> f119949c;

    /* renamed from: d */
    private AtomicReference<ConnectionQuality> f119950d;

    /* renamed from: e */
    private ArrayList<Object> f119951e;

    /* renamed from: f */
    private int f119952f;

    /* renamed from: com.toutiao.proxyserver.speed.a$a */
    static class C46545a {

        /* renamed from: a */
        public static final C46543a f119954a = new C46543a();
    }

    /* renamed from: a */
    public static C46543a m146292a() {
        return C46545a.f119954a;
    }

    /* renamed from: d */
    private synchronized ConnectionQuality m146294d() {
        if (this.f119947a == null) {
            return ConnectionQuality.UNKNOWN;
        }
        return m146291a(this.f119947a.f119967a);
    }

    /* renamed from: e */
    private void m146295e() {
        int size = this.f119951e.size();
        for (int i = 0; i < size; i++) {
            this.f119951e.get(i);
            this.f119949c.get();
        }
    }

    /* renamed from: b */
    public final synchronized double mo115720b() {
        if (this.f119947a == null) {
            return -1.0d;
        }
        return this.f119947a.f119967a;
    }

    private C46543a() {
        this.f119947a = new C46551d(0.05d);
        this.f119948b = false;
        this.f119949c = new AtomicReference<>(ConnectionQuality.UNKNOWN);
        this.f119951e = new ArrayList<>();
    }

    /* renamed from: c */
    private boolean m146293c() {
        if (this.f119947a == null) {
            return false;
        }
        double d = 2000.0d;
        double d2 = 550.0d;
        switch ((ConnectionQuality) this.f119949c.get()) {
            case POOR:
                d = 0.0d;
                d2 = 150.0d;
                break;
            case MODERATE:
                d = 150.0d;
                break;
            case GOOD:
                d = 550.0d;
                d2 = 2000.0d;
                break;
            case EXCELLENT:
                d2 = 3.4028234663852886E38d;
                break;
            default:
                return true;
        }
        double d3 = this.f119947a.f119967a;
        if (d3 > d2) {
            if (d3 > d2 * 1.25d) {
                return true;
            }
        } else if (d3 < d * 0.8d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static ConnectionQuality m146291a(double d) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo115719a(long r5, long r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0080
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
            goto L_0x0080
        L_0x001f:
            com.toutiao.proxyserver.speed.d r7 = r4.f119947a     // Catch:{ all -> 0x007d }
            r7.mo115730a(r5)     // Catch:{ all -> 0x007d }
            boolean r5 = r4.f119948b     // Catch:{ all -> 0x007d }
            r6 = 1
            if (r5 == 0) goto L_0x0062
            int r5 = r4.f119952f     // Catch:{ all -> 0x007d }
            int r5 = r5 + r6
            r4.f119952f = r5     // Catch:{ all -> 0x007d }
            com.toutiao.proxyserver.speed.ConnectionQuality r5 = r4.m146294d()     // Catch:{ all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.speed.ConnectionQuality> r7 = r4.f119950d     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x007d }
            r8 = 0
            if (r5 == r7) goto L_0x003f
            r4.f119948b = r8     // Catch:{ all -> 0x007d }
            r4.f119952f = r6     // Catch:{ all -> 0x007d }
        L_0x003f:
            int r5 = r4.f119952f     // Catch:{ all -> 0x007d }
            double r0 = (double) r5     // Catch:{ all -> 0x007d }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            boolean r5 = r4.m146293c()     // Catch:{ all -> 0x007d }
            if (r5 == 0) goto L_0x0060
            r4.f119948b = r8     // Catch:{ all -> 0x007d }
            r4.f119952f = r6     // Catch:{ all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.speed.ConnectionQuality> r5 = r4.f119949c     // Catch:{ all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.speed.ConnectionQuality> r6 = r4.f119950d     // Catch:{ all -> 0x007d }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x007d }
            r5.set(r6)     // Catch:{ all -> 0x007d }
            r4.m146295e()     // Catch:{ all -> 0x007d }
        L_0x0060:
            monitor-exit(r4)
            return
        L_0x0062:
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.speed.ConnectionQuality> r5 = r4.f119949c     // Catch:{ all -> 0x007d }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x007d }
            com.toutiao.proxyserver.speed.ConnectionQuality r7 = r4.m146294d()     // Catch:{ all -> 0x007d }
            if (r5 == r7) goto L_0x007b
            r4.f119948b = r6     // Catch:{ all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x007d }
            com.toutiao.proxyserver.speed.ConnectionQuality r6 = r4.m146294d()     // Catch:{ all -> 0x007d }
            r5.<init>(r6)     // Catch:{ all -> 0x007d }
            r4.f119950d = r5     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r4)
            return
        L_0x007d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0080:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.speed.C46543a.mo115719a(long, long):void");
    }
}
