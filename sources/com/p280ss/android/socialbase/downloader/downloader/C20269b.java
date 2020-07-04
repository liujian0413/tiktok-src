package com.p280ss.android.socialbase.downloader.downloader;

import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import com.p280ss.android.socialbase.downloader.constants.DownloadCacheSyncStatus;
import com.p280ss.android.socialbase.downloader.depend.C20211ac;
import com.p280ss.android.socialbase.downloader.depend.C20232j;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.impls.C20295a;
import com.p280ss.android.socialbase.downloader.impls.C20300b;
import com.p280ss.android.socialbase.downloader.impls.C20301c;
import com.p280ss.android.socialbase.downloader.impls.C20302d;
import com.p280ss.android.socialbase.downloader.impls.C20306e;
import com.p280ss.android.socialbase.downloader.impls.C20307f;
import com.p280ss.android.socialbase.downloader.impls.C20309g;
import com.p280ss.android.socialbase.downloader.impls.C20311h;
import com.p280ss.android.socialbase.downloader.impls.C20312i;
import com.p280ss.android.socialbase.downloader.impls.C20313j;
import com.p280ss.android.socialbase.downloader.impls.C20315l;
import com.p280ss.android.socialbase.downloader.impls.C20318n;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20344c;
import com.p280ss.android.socialbase.downloader.network.C20345d;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Protocol;

/* renamed from: com.ss.android.socialbase.downloader.downloader.b */
public class C20269b {

    /* renamed from: A */
    private static int f54733A;

    /* renamed from: B */
    private static final int f54734B = (Runtime.getRuntime().availableProcessors() + 1);

    /* renamed from: C */
    private static final int f54735C = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: D */
    private static final int f54736D = (Runtime.getRuntime().availableProcessors() + 1);

    /* renamed from: E */
    private static int f54737E = VideoCacheReadBuffersizeExperiment.DEFAULT;

    /* renamed from: F */
    private static boolean f54738F = false;

    /* renamed from: G */
    private static boolean f54739G;

    /* renamed from: H */
    private static volatile List<C20232j> f54740H = new ArrayList();

    /* renamed from: I */
    private static int f54741I;

    /* renamed from: J */
    private static volatile boolean f54742J = false;

    /* renamed from: a */
    private static volatile Context f54743a;

    /* renamed from: b */
    private static volatile C20285j f54744b;

    /* renamed from: c */
    private static volatile C20286k f54745c;

    /* renamed from: d */
    private static volatile C20281h f54746d;

    /* renamed from: e */
    private static volatile C20259y f54747e;

    /* renamed from: f */
    private static volatile C20295a f54748f;

    /* renamed from: g */
    private static volatile C20290o f54749g;

    /* renamed from: h */
    private static volatile C20290o f54750h;

    /* renamed from: i */
    private static volatile C20347f f54751i;

    /* renamed from: j */
    private static volatile C20345d f54752j;

    /* renamed from: k */
    private static volatile C20347f f54753k;

    /* renamed from: l */
    private static volatile C20345d f54754l;

    /* renamed from: m */
    private static volatile C20287l f54755m;

    /* renamed from: n */
    private static volatile ExecutorService f54756n;

    /* renamed from: o */
    private static volatile ExecutorService f54757o;

    /* renamed from: p */
    private static volatile ExecutorService f54758p;

    /* renamed from: q */
    private static volatile ExecutorService f54759q;

    /* renamed from: r */
    private static volatile C20280g f54760r;

    /* renamed from: s */
    private static volatile DownloadReceiver f54761s;

    /* renamed from: t */
    private static volatile C20292q f54762t;

    /* renamed from: u */
    private static volatile C20291p f54763u;

    /* renamed from: v */
    private static volatile List<C20211ac> f54764v = new ArrayList();

    /* renamed from: w */
    private static volatile boolean f54765w = false;

    /* renamed from: x */
    private static volatile OkHttpClient f54766x = null;

    /* renamed from: y */
    private static volatile AlarmManager f54767y;

    /* renamed from: z */
    private static boolean f54768z = false;

    private C20269b() {
    }

    /* renamed from: r */
    public static int m66759r() {
        return f54741I;
    }

    /* renamed from: u */
    public static C20259y m66762u() {
        return f54747e;
    }

    /* renamed from: y */
    public static boolean m66766y() {
        return f54738F;
    }

    /* renamed from: a */
    static synchronized void m66730a(C20279f fVar) {
        synchronized (C20269b.class) {
            if (!f54742J) {
                boolean z = f54765w;
                if (fVar != null) {
                    m66725a(fVar.f54815a);
                    m66733a(fVar.f54816b);
                    m66734a(fVar.f54817c);
                    m66732a(fVar.f54819e);
                    m66729a(fVar.f54820f);
                    m66724a(fVar.f54818d);
                    m66737a(fVar.f54821g);
                    m66736a(fVar.f54822h);
                    m66735a(fVar.f54823i);
                    m66738a(fVar.f54824j);
                    m66741b(fVar.f54825k);
                    m66742c(fVar.f54826l);
                    m66745d(fVar.f54827m);
                    if (fVar.f54831q != null) {
                        f54763u = fVar.f54831q;
                    }
                    if (fVar.f54828n > 1024) {
                        f54737E = fVar.f54828n;
                    }
                    m66731a(fVar.f54829o);
                    if (fVar.f54830p) {
                        f54765w = true;
                    }
                    f54738F = fVar.f54832r;
                    f54741I = fVar.f54833s;
                }
                synchronized (C20269b.class) {
                    if (f54744b == null) {
                        f54744b = new C20302d();
                    }
                    if (f54749g == null) {
                        f54749g = new C20311h();
                    }
                    if (f54750h == null) {
                        f54750h = new C20318n();
                    }
                    if (f54745c == null) {
                        f54745c = new C20312i();
                    }
                    if (f54748f == null) {
                        f54748f = new C20306e();
                    }
                    if (f54746d == null) {
                        f54746d = new C20301c();
                    }
                    if (f54760r == null) {
                        f54760r = new C20300b();
                    }
                    if (f54762t == null) {
                        f54762t = new C20313j();
                    }
                    if (f54733A <= 0 || f54733A > f54734B) {
                        f54733A = f54734B;
                    }
                }
                m66713A();
                if (f54765w && !z && !C20359e.m67590c()) {
                    C20315l.m67199a(true).mo54435d();
                } else if (C20359e.m67593d()) {
                    ExecutorService h = m66749h();
                    if (h != null) {
                        h.execute(new Runnable() {
                            public final void run() {
                                Context x = C20269b.m66765x();
                                if (x != null) {
                                    C20359e.m67588c(x);
                                }
                            }
                        });
                    }
                } else {
                    Context x = m66765x();
                    if (x != null) {
                        C20359e.m67588c(x);
                    }
                }
                f54742J = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66728a(com.p280ss.android.socialbase.downloader.depend.C20232j r2) {
        /*
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r0 = f54740H
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0017
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r1 = f54740H     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x000e
            goto L_0x0017
        L_0x000e:
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r1 = f54740H     // Catch:{ all -> 0x0015 }
            r1.add(r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66728a(com.ss.android.socialbase.downloader.depend.j):void");
    }

    /* renamed from: a */
    public static synchronized void m66735a(C20287l lVar) {
        synchronized (C20269b.class) {
            if (lVar != null) {
                f54755m = lVar;
                if (f54744b instanceof C20302d) {
                    ((C20302d) f54744b).mo54515c();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m66738a(ExecutorService executorService) {
        if (executorService != null) {
            f54756n = executorService;
        }
    }

    /* renamed from: a */
    private static void m66737a(C20347f fVar) {
        if (fVar != null) {
            f54751i = fVar;
        }
        f54739G = f54751i != null;
    }

    /* renamed from: a */
    private static void m66736a(C20345d dVar) {
        if (dVar != null) {
            f54752j = dVar;
        }
    }

    /* renamed from: a */
    private static void m66733a(C20285j jVar) {
        if (jVar != null) {
            f54744b = jVar;
        }
    }

    /* renamed from: a */
    private static void m66734a(C20286k kVar) {
        if (kVar != null) {
            f54745c = kVar;
        }
    }

    /* renamed from: a */
    private static void m66732a(C20281h hVar) {
        if (hVar != null) {
            f54746d = hVar;
        }
    }

    /* renamed from: a */
    private static void m66729a(C20259y yVar) {
        if (yVar != null) {
            f54747e = yVar;
        }
    }

    /* renamed from: a */
    private static void m66731a(C20280g gVar) {
        if (gVar != null) {
            f54760r = gVar;
        }
    }

    /* renamed from: c */
    public static synchronized boolean m66743c() {
        boolean z;
        synchronized (C20269b.class) {
            z = f54765w;
        }
        return z;
    }

    /* renamed from: d */
    public static List<C20211ac> m66744d() {
        List<C20211ac> list;
        synchronized (f54764v) {
            list = f54764v;
        }
        return list;
    }

    /* renamed from: f */
    public static synchronized C20291p m66747f() {
        C20291p pVar;
        synchronized (C20269b.class) {
            pVar = f54763u;
        }
        return pVar;
    }

    /* renamed from: l */
    public static synchronized C20287l m66753l() {
        C20287l lVar;
        synchronized (C20269b.class) {
            lVar = f54755m;
        }
        return lVar;
    }

    /* renamed from: s */
    public static synchronized int m66760s() {
        int i;
        synchronized (C20269b.class) {
            i = f54737E;
        }
        return i;
    }

    /* renamed from: x */
    public static synchronized Context m66765x() {
        Context context;
        synchronized (C20269b.class) {
            context = f54743a;
        }
        return context;
    }

    /* renamed from: z */
    public static synchronized boolean m66767z() {
        boolean z;
        synchronized (C20269b.class) {
            z = f54739G;
        }
        return z;
    }

    /* renamed from: B */
    private static C20347f m66714B() {
        if (f54751i == null) {
            synchronized (C20269b.class) {
                if (f54751i == null) {
                    f54751i = new C20309g();
                }
            }
        }
        return f54751i;
    }

    /* renamed from: C */
    private static C20345d m66715C() {
        if (f54752j == null) {
            synchronized (C20269b.class) {
                if (f54752j == null) {
                    f54752j = new C20307f();
                }
            }
        }
        return f54752j;
    }

    /* renamed from: D */
    private static C20347f m66716D() {
        if (f54753k == null) {
            synchronized (C20269b.class) {
                if (f54753k == null) {
                    f54753k = new C20309g();
                }
            }
        }
        return f54753k;
    }

    /* renamed from: E */
    private static C20345d m66717E() {
        if (f54754l == null) {
            synchronized (C20269b.class) {
                if (f54754l == null) {
                    f54754l = new C20307f();
                }
            }
        }
        return f54754l;
    }

    /* renamed from: F */
    private static int m66718F() {
        if (f54733A <= 0 || f54733A > f54734B) {
            f54733A = f54734B;
        }
        return f54733A;
    }

    /* renamed from: m */
    public static C20285j m66754m() {
        if (f54744b == null) {
            synchronized (C20269b.class) {
                if (f54744b == null) {
                    f54744b = new C20302d();
                }
            }
        }
        return f54744b;
    }

    /* renamed from: n */
    public static C20290o m66755n() {
        if (f54749g == null) {
            synchronized (C20269b.class) {
                if (f54749g == null) {
                    f54749g = new C20311h();
                }
            }
        }
        return f54749g;
    }

    /* renamed from: o */
    public static C20290o m66756o() {
        if (f54750h == null) {
            synchronized (C20269b.class) {
                if (f54750h == null) {
                    f54750h = new C20318n();
                }
            }
        }
        return f54750h;
    }

    /* renamed from: p */
    public static C20286k m66757p() {
        if (f54745c == null) {
            synchronized (C20269b.class) {
                if (f54745c == null) {
                    f54745c = new C20312i();
                }
            }
        }
        return f54745c;
    }

    /* renamed from: q */
    public static C20295a m66758q() {
        if (f54748f == null) {
            synchronized (C20269b.class) {
                if (f54748f == null) {
                    f54748f = new C20306e();
                }
            }
        }
        return f54748f;
    }

    /* renamed from: t */
    public static C20281h m66761t() {
        if (f54746d == null) {
            synchronized (C20269b.class) {
                if (f54746d == null) {
                    f54746d = new C20301c();
                }
            }
        }
        return f54746d;
    }

    /* renamed from: v */
    public static C20280g m66763v() {
        if (f54760r == null) {
            synchronized (C20269b.class) {
                if (f54760r == null) {
                    f54760r = new C20300b();
                }
            }
        }
        return f54760r;
    }

    /* renamed from: w */
    public static C20292q m66764w() {
        if (f54762t == null) {
            synchronized (C20269b.class) {
                if (f54762t == null) {
                    f54762t = new C20313j();
                }
            }
        }
        return f54762t;
    }

    /* renamed from: A */
    private static void m66713A() {
        if (f54761s == null) {
            f54761s = new DownloadReceiver();
        }
        if (!f54768z) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                f54743a.registerReceiver(f54761s, intentFilter);
                f54768z = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m66739b() {
        /*
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.class
            monitor-enter(r0)
            boolean r1 = f54765w     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            f54765w = r1     // Catch:{ all -> 0x0037 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Throwable -> 0x0032 }
            android.content.Context r3 = m66765x()     // Catch:{ Throwable -> 0x0032 }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r4 = com.p280ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0032 }
            java.lang.String r3 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            r2.setAction(r3)     // Catch:{ Throwable -> 0x0032 }
            android.content.Context r3 = m66765x()     // Catch:{ Throwable -> 0x0032 }
            r3.startService(r2)     // Catch:{ Throwable -> 0x0032 }
            boolean r2 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67590c()     // Catch:{ Throwable -> 0x0032 }
            if (r2 != 0) goto L_0x0030
            com.ss.android.socialbase.downloader.downloader.m r1 = com.p280ss.android.socialbase.downloader.impls.C20315l.m67199a(r1)     // Catch:{ Throwable -> 0x0032 }
            r1.mo54435d()     // Catch:{ Throwable -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r1 = 0
            f54765w = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66739b():void");
    }

    /* renamed from: e */
    public static AlarmManager m66746e() {
        if (f54767y == null) {
            synchronized (C20269b.class) {
                if (f54767y == null && f54743a != null) {
                    f54767y = (AlarmManager) f54743a.getSystemService("alarm");
                }
            }
        }
        return f54767y;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m66748g() {
        /*
            java.util.concurrent.ExecutorService r0 = f54756n
            if (r0 != 0) goto L_0x0031
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54756n     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x002c
            int r4 = m66718F()     // Catch:{ all -> 0x002e }
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002e }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002e }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002e }
            r8.<init>()     // Catch:{ all -> 0x002e }
            com.ss.android.socialbase.downloader.d.a r9 = new com.ss.android.socialbase.downloader.d.a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "DownloadThreadPool-cpu-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002e }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002e }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x002a }
        L_0x002a:
            f54756n = r1     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        L_0x0031:
            java.util.concurrent.ExecutorService r0 = f54756n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66748g():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m66749h() {
        /*
            java.util.concurrent.ExecutorService r0 = f54757o
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54757o     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54735C     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.d.a r9 = new com.ss.android.socialbase.downloader.d.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-io-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54757o = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54757o
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66749h():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m66750i() {
        /*
            java.util.concurrent.ExecutorService r0 = f54759q
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54759q     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54735C     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.d.a r9 = new com.ss.android.socialbase.downloader.d.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-chunk-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54759q = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54759q
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66750i():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m66751j() {
        /*
            java.util.concurrent.ExecutorService r0 = f54758p
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54758p     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54736D     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.d.a r9 = new com.ss.android.socialbase.downloader.d.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-db-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54758p = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54758p
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66751j():java.util.concurrent.ExecutorService");
    }

    /* renamed from: k */
    public static OkHttpClient m66752k() {
        if (f54766x == null) {
            synchronized (C20269b.class) {
                if (f54766x == null) {
                    Builder builder = new Builder();
                    builder.connectTimeout(30000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).dispatcher(new Dispatcher(m66749h())).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
                    f54766x = builder.build();
                }
            }
        }
        return f54766x;
    }

    /* renamed from: a */
    static synchronized void m66723a() {
        synchronized (C20269b.class) {
            try {
                if (!(!f54768z || f54761s == null || f54743a == null)) {
                    f54743a.unregisterReceiver(f54761s);
                    f54768z = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m66724a(int i) {
        if (i > 0) {
            f54733A = i;
        }
    }

    /* renamed from: b */
    private static void m66741b(ExecutorService executorService) {
        if (executorService != null) {
            f54757o = executorService;
        }
    }

    /* renamed from: c */
    private static void m66742c(ExecutorService executorService) {
        if (executorService != null) {
            f54758p = executorService;
        }
    }

    /* renamed from: d */
    private static void m66745d(ExecutorService executorService) {
        if (executorService != null) {
            f54759q = executorService;
        }
    }

    /* renamed from: a */
    public static int m66719a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        return m66720a(downloadInfo.getUrl(), downloadInfo.getSavePath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66740b(com.p280ss.android.socialbase.downloader.depend.C20232j r2) {
        /*
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r0 = f54740H
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0017
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r1 = f54740H     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x000e
            goto L_0x0017
        L_0x000e:
            java.util.List<com.ss.android.socialbase.downloader.depend.j> r1 = f54740H     // Catch:{ all -> 0x0015 }
            r1.remove(r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20269b.m66740b(com.ss.android.socialbase.downloader.depend.j):void");
    }

    /* renamed from: a */
    public static synchronized void m66725a(Context context) {
        synchronized (C20269b.class) {
            if (context != null) {
                if (f54743a == null) {
                    f54743a = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m66726a(DownloadCacheSyncStatus downloadCacheSyncStatus) {
        synchronized (f54740H) {
            if (f54740H != null) {
                Iterator it = f54740H.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                f54740H.clear();
            }
        }
    }

    /* renamed from: a */
    public static void m66727a(C20211ac acVar) {
        if (acVar != null) {
            synchronized (f54764v) {
                f54764v.add(acVar);
            }
        }
    }

    /* renamed from: a */
    public static int m66720a(String str, String str2) {
        C20286k p = m66757p();
        if (p == null) {
            return 0;
        }
        return p.mo54402a(str, str2);
    }

    /* renamed from: a */
    public static C20344c m66721a(String str, List<HttpHeader> list) throws BaseException, IOException {
        Throwable e;
        C20345d C = m66715C();
        C20344c cVar = null;
        if (C != null) {
            try {
                cVar = C.mo54518a(str, list);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            e = null;
        }
        if (cVar == null) {
            C20345d E = m66717E();
            if (E != null) {
                cVar = E.mo54518a(str, list);
            }
        }
        if (cVar != null || e == null) {
            return cVar;
        }
        throw e;
    }

    /* renamed from: a */
    public static C20346e m66722a(boolean z, int i, String str, List<HttpHeader> list) throws BaseException, IOException {
        Throwable e;
        C20347f B = m66714B();
        if (B != null || z) {
            C20346e eVar = null;
            if (B != null) {
                try {
                    e = null;
                    eVar = B.mo20815a(i, str, list);
                } catch (IOException e2) {
                    e = e2;
                }
            } else {
                e = null;
            }
            if (z && eVar == null && (B == null || B.getClass() != C20309g.class)) {
                C20347f D = m66716D();
                if (D != null) {
                    eVar = D.mo20815a(i, str, list);
                }
            }
            if (eVar != null || e == null) {
                return eVar;
            }
            throw e;
        }
        throw new BaseException(1022, (Throwable) new IOException("download can't continue, because httpService not exist"));
    }
}
