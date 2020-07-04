package com.p280ss.android.socialbase.downloader.network;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.socialbase.downloader.network.g */
public class C20348g {

    /* renamed from: a */
    private static final String f54998a = "g";

    /* renamed from: b */
    private final C20343b f54999b;

    /* renamed from: c */
    private volatile boolean f55000c;

    /* renamed from: d */
    private final AtomicReference<NetworkQuality> f55001d;

    /* renamed from: e */
    private AtomicReference<NetworkQuality> f55002e;

    /* renamed from: f */
    private final ArrayList<Object> f55003f;

    /* renamed from: g */
    private int f55004g;

    /* renamed from: com.ss.android.socialbase.downloader.network.g$a */
    static class C20350a {

        /* renamed from: a */
        public static final C20348g f55006a = new C20348g();
    }

    /* renamed from: a */
    public static C20348g m67505a() {
        return C20350a.f55006a;
    }

    /* renamed from: d */
    private void m67507d() {
        try {
            int size = this.f55003f.size();
            for (int i = 0; i < size; i++) {
                this.f55003f.get(i);
                this.f55001d.get();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        return com.p280ss.android.socialbase.downloader.network.NetworkQuality.UNKNOWN;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.socialbase.downloader.network.NetworkQuality mo54907b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ss.android.socialbase.downloader.network.b r0 = r2.f54999b     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0009
            com.ss.android.socialbase.downloader.network.NetworkQuality r0 = com.p280ss.android.socialbase.downloader.network.NetworkQuality.UNKNOWN     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r0
        L_0x0009:
            com.ss.android.socialbase.downloader.network.b r0 = r2.f54999b     // Catch:{ Throwable -> 0x0013 }
            double r0 = r0.f54994a     // Catch:{ Throwable -> 0x0013 }
            com.ss.android.socialbase.downloader.network.NetworkQuality r0 = m67504a(r0)     // Catch:{ Throwable -> 0x0013 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            com.ss.android.socialbase.downloader.network.NetworkQuality r0 = com.p280ss.android.socialbase.downloader.network.NetworkQuality.UNKNOWN     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.network.C20348g.mo54907b():com.ss.android.socialbase.downloader.network.NetworkQuality");
    }

    private C20348g() {
        this.f54999b = new C20343b(0.05d);
        this.f55000c = false;
        this.f55001d = new AtomicReference<>(NetworkQuality.UNKNOWN);
        this.f55003f = new ArrayList<>();
    }

    /* renamed from: c */
    private boolean m67506c() {
        if (this.f54999b == null) {
            return false;
        }
        try {
            double d = 2000.0d;
            double d2 = 550.0d;
            switch ((NetworkQuality) this.f55001d.get()) {
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
            double d3 = this.f54999b.f54994a;
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
    private static NetworkQuality m67504a(double d) {
        if (d < 0.0d) {
            return NetworkQuality.UNKNOWN;
        }
        if (d < 150.0d) {
            return NetworkQuality.POOR;
        }
        if (d < 550.0d) {
            return NetworkQuality.MODERATE;
        }
        if (d < 2000.0d) {
            return NetworkQuality.GOOD;
        }
        return NetworkQuality.EXCELLENT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo54906a(long r4, long r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            double r4 = (double) r4
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r0
            double r0 = (double) r6
            java.lang.Double.isNaN(r0)
            double r4 = r4 / r0
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r4 = r4 * r0
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            goto L_0x007a
        L_0x001f:
            com.ss.android.socialbase.downloader.network.b r6 = r3.f54999b     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r6.mo54905a(r4)     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            com.ss.android.socialbase.downloader.network.NetworkQuality r4 = r3.mo54907b()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            boolean r5 = r3.f55000c     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r6 = 1
            if (r5 == 0) goto L_0x0062
            int r5 = r3.f55004g     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            int r5 = r5 + r6
            r3.f55004g = r5     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.NetworkQuality> r5 = r3.f55002e     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.lang.Object r5 = r5.get()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r7 = 0
            if (r4 == r5) goto L_0x003f
            r3.f55000c = r7     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r3.f55004g = r6     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
        L_0x003f:
            int r4 = r3.f55004g     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            double r4 = (double) r4     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0060
            boolean r4 = r3.m67506c()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            if (r4 == 0) goto L_0x0060
            r3.f55000c = r7     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r3.f55004g = r6     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.NetworkQuality> r4 = r3.f55001d     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.NetworkQuality> r5 = r3.f55002e     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.lang.Object r5 = r5.get()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r4.set(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r3.m67507d()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
        L_0x0060:
            monitor-exit(r3)
            return
        L_0x0062:
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.NetworkQuality> r5 = r3.f55001d     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.lang.Object r5 = r5.get()     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            if (r5 == r4) goto L_0x0073
            r3.f55000c = r6     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
            r3.f55002e = r5     // Catch:{ Throwable -> 0x0078, all -> 0x0075 }
        L_0x0073:
            monitor-exit(r3)
            return
        L_0x0075:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0078:
            monitor-exit(r3)
            return
        L_0x007a:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.network.C20348g.mo54906a(long, long):void");
    }
}
