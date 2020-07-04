package com.p280ss.ttvideoengine.p1816i;

import android.content.Context;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.ttvideoengine.p1813f.C46102h;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.ttvideoengine.i.j */
public class C46125j {

    /* renamed from: a */
    public static C46127a f118019a = new C46127a();

    /* renamed from: b */
    public static int f118020b = 0;

    /* renamed from: c */
    public static int f118021c = 0;

    /* renamed from: d */
    private static boolean f118022d = true;

    /* renamed from: e */
    private static Context f118023e = null;

    /* renamed from: com.ss.ttvideoengine.i.j$a */
    static class C46127a {

        /* renamed from: a */
        public long f118025a = -1;

        /* renamed from: b */
        public long f118026b = -1;

        C46127a() {
        }

        /* renamed from: a */
        public final boolean mo112298a() {
            if (this.f118025a > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m144552b() {
        synchronized (C46125j.class) {
            if (f118019a == null) {
                return false;
            }
            boolean a = f118019a.mo112298a();
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        m144551a(f118023e);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m144549a() {
        /*
            boolean r0 = f118022d
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.ttvideoengine.i.j> r0 = com.p280ss.ttvideoengine.p1816i.C46125j.class
            monitor-enter(r0)
            com.ss.ttvideoengine.i.j$a r1 = f118019a     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0025
            com.ss.ttvideoengine.i.j$a r1 = f118019a     // Catch:{ all -> 0x002c }
            boolean r1 = r1.mo112298a()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0025
            com.ss.ttvideoengine.i.j$a r1 = f118019a     // Catch:{ all -> 0x002c }
            long r1 = r1.f118025a     // Catch:{ all -> 0x002c }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002c }
            r5 = 0
            long r1 = r1 + r3
            com.ss.ttvideoengine.i.j$a r3 = f118019a     // Catch:{ all -> 0x002c }
            long r3 = r3.f118026b     // Catch:{ all -> 0x002c }
            r5 = 0
            long r1 = r1 - r3
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            android.content.Context r0 = f118023e
            m144551a(r0)
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            long r0 = java.lang.System.currentTimeMillis()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1816i.C46125j.m144549a():long");
    }

    /* renamed from: a */
    public static void m144551a(final Context context) {
        if (!f118022d) {
            synchronized (C46125j.class) {
                if (context != null) {
                    try {
                        f118023e = context;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (f118019a != null && f118019a.mo112298a()) {
                    return;
                }
                if (context != null && !C46102h.m144481b(context)) {
                    C46123h.m144545a("TimeService", "network unavailable");
                } else if (f118020b == 0) {
                    f118020b = 1;
                    if (f118021c <= 6) {
                        C46115b.m144501a((Runnable) new Runnable() {
                            public final void run() {
                                C46120f fVar = new C46120f();
                                boolean a = fVar.mo112296a("time1.bytedance.com", (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                                synchronized (C46125j.class) {
                                    if (a) {
                                        try {
                                            if (C46125j.f118019a != null) {
                                                C46125j.f118019a.f118025a = fVar.f118013a;
                                                C46125j.f118019a.f118026b = fVar.f118014b;
                                                C46125j.f118020b = 2;
                                                StringBuilder sb = new StringBuilder("NTP updated time:");
                                                sb.append(C46125j.m144550a((C46125j.f118019a.f118025a + SystemClock.elapsedRealtime()) - C46125j.f118019a.f118026b, "yyyy-MM-dd HH:mm:ss.SSS"));
                                                C46123h.m144545a("TimeService", sb.toString());
                                            }
                                        } finally {
                                        }
                                    } else {
                                        if (context != null && C46102h.m144481b(context)) {
                                            C46125j.f118021c++;
                                        }
                                        StringBuilder sb2 = new StringBuilder("NTP update fail,error count:");
                                        sb2.append(C46125j.f118021c);
                                        C46123h.m144545a("TimeService", sb2.toString());
                                        C46125j.f118020b = 0;
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m144550a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }
}
