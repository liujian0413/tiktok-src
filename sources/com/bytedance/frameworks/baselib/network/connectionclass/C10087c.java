package com.bytedance.frameworks.baselib.network.connectionclass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.c */
public class C10087c {

    /* renamed from: a */
    private C10093e f27437a = new C10093e(0.05d);

    /* renamed from: b */
    private volatile boolean f27438b = false;

    /* renamed from: c */
    private AtomicReference<ConnectionQuality> f27439c = new AtomicReference<>(ConnectionQuality.UNKNOWN);

    /* renamed from: d */
    private AtomicReference<ConnectionQuality> f27440d;

    /* renamed from: e */
    private ArrayList<C10089b> f27441e = new ArrayList<>();

    /* renamed from: f */
    private int f27442f;

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.c$a */
    static class C10088a {

        /* renamed from: a */
        public static final C10087c f27443a = new C10087c();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.connectionclass.c$b */
    public interface C10089b {
    }

    /* renamed from: b */
    public static C10087c m29957b() {
        return C10088a.f27443a;
    }

    /* renamed from: e */
    private void m29958e() {
        try {
            int size = this.f27441e.size();
            for (int i = 0; i < size; i++) {
                this.f27441e.get(i);
                this.f27439c.get();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        return com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality.UNKNOWN;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality mo24735c() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.bytedance.frameworks.baselib.network.connectionclass.e r0 = r2.f27437a     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0009
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r0 = com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality.UNKNOWN     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r0
        L_0x0009:
            com.bytedance.frameworks.baselib.network.connectionclass.e r0 = r2.f27437a     // Catch:{ Throwable -> 0x0013 }
            double r0 = r0.f27453a     // Catch:{ Throwable -> 0x0013 }
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r0 = m29955a(r0)     // Catch:{ Throwable -> 0x0013 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r0 = com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality.UNKNOWN     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.connectionclass.C10087c.mo24735c():com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality");
    }

    /* renamed from: d */
    public final synchronized double mo24736d() {
        if (this.f27437a == null) {
            return -1.0d;
        }
        return this.f27437a.f27453a;
    }

    protected C10087c() {
    }

    /* renamed from: a */
    private boolean m29956a() {
        if (this.f27437a == null) {
            return false;
        }
        try {
            ConnectionQuality connectionQuality = (ConnectionQuality) this.f27439c.get();
            double d = 560.0d;
            double d2 = 112.0d;
            if (ConnectionQuality.POOR == connectionQuality) {
                d = 0.0d;
                d2 = 28.0d;
            } else if (ConnectionQuality.MODERATE == connectionQuality) {
                d = 28.0d;
            } else if (ConnectionQuality.GOOD == connectionQuality) {
                d = 112.0d;
                d2 = 560.0d;
            } else if (ConnectionQuality.EXCELLENT != connectionQuality) {
                return true;
            } else {
                d2 = 3.4028234663852886E38d;
            }
            double d3 = this.f27437a.f27453a;
            if (d3 > d2) {
                if (d3 > d2 * 1.25d) {
                    return true;
                }
            } else if (d3 < d * 0.8d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final ConnectionQuality mo24733a(C10089b bVar) {
        if (bVar != null) {
            this.f27441e.add(bVar);
        }
        return (ConnectionQuality) this.f27439c.get();
    }

    /* renamed from: a */
    private static ConnectionQuality m29955a(double d) {
        if (d < 0.0d) {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 28.0d) {
            return ConnectionQuality.POOR;
        }
        if (d < 112.0d) {
            return ConnectionQuality.MODERATE;
        }
        if (d < 560.0d) {
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
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24734a(long r5, long r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            double r5 = (double) r5
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r0
            double r0 = (double) r7
            java.lang.Double.isNaN(r0)
            double r5 = r5 / r0
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r5 = r5 * r0
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0082
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x0082
        L_0x001f:
            com.bytedance.frameworks.baselib.network.connectionclass.e r7 = r4.f27437a     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r7.mo24743a(r5)     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            boolean r5 = r4.f27438b     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r6 = 1
            if (r5 == 0) goto L_0x0062
            int r5 = r4.f27442f     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            int r5 = r5 + r6
            r4.f27442f = r5     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r5 = r4.mo24735c()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality> r7 = r4.f27440d     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.lang.Object r7 = r7.get()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r8 = 0
            if (r5 == r7) goto L_0x003f
            r4.f27438b = r8     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r4.f27442f = r6     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
        L_0x003f:
            int r5 = r4.f27442f     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            double r0 = (double) r5     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            boolean r5 = r4.m29956a()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            if (r5 == 0) goto L_0x0060
            r4.f27438b = r8     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r4.f27442f = r6     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality> r5 = r4.f27439c     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality> r6 = r4.f27440d     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.lang.Object r6 = r6.get()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r5.set(r6)     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r4.m29958e()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
        L_0x0060:
            monitor-exit(r4)
            return
        L_0x0062:
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality> r5 = r4.f27439c     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.lang.Object r5 = r5.get()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r7 = r4.mo24735c()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            if (r5 == r7) goto L_0x007b
            r4.f27438b = r6     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality r6 = r4.mo24735c()     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
            r4.f27440d = r5     // Catch:{ Throwable -> 0x0080, all -> 0x007d }
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
        L_0x0082:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.connectionclass.C10087c.mo24734a(long, long):void");
    }
}
