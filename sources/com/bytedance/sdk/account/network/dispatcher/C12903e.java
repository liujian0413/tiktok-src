package com.bytedance.sdk.account.network.dispatcher;

import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.sdk.account.network.dispatcher.IRequest.Priority;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.account.network.dispatcher.e */
public class C12903e {

    /* renamed from: a */
    private static AtomicInteger f34102a = new AtomicInteger();

    /* renamed from: c */
    private static volatile C12903e f34103c;

    /* renamed from: d */
    private static volatile boolean f34104d = true;

    /* renamed from: b */
    private volatile boolean f34105b;

    /* renamed from: e */
    private int f34106e;

    /* renamed from: f */
    private int f34107f;

    /* renamed from: g */
    private final PriorityBlockingQueue<IRequest> f34108g;

    /* renamed from: h */
    private final PriorityBlockingQueue<IRequest> f34109h;

    /* renamed from: i */
    private final PriorityBlockingQueue<IRequest> f34110i;

    /* renamed from: j */
    private C12899a[] f34111j;

    /* renamed from: k */
    private C12902d[] f34112k;

    /* renamed from: l */
    private C12900b f34113l;

    /* renamed from: m */
    private volatile long f34114m;

    /* renamed from: n */
    private volatile long f34115n;

    /* renamed from: o */
    private volatile long f34116o;

    /* renamed from: p */
    private volatile long f34117p;

    public C12903e() {
        this(4, 4);
    }

    /* renamed from: f */
    private static int m37566f() {
        return f34102a.incrementAndGet();
    }

    /* renamed from: a */
    public static C12903e m37565a() {
        if (f34103c == null) {
            synchronized (C12903e.class) {
                if (f34103c == null) {
                    f34103c = new C12903e();
                }
            }
        }
        return f34103c;
    }

    /* renamed from: g */
    private synchronized void m37567g() {
        m37568h();
        this.f34113l = new C12900b(this.f34108g, this.f34109h);
        this.f34113l.start();
        for (int i = 0; i < this.f34106e; i++) {
            C12899a aVar = new C12899a(this.f34109h, "ApiDispatcher-Thread", "ApiDispatcher");
            this.f34111j[i] = aVar;
            aVar.start();
        }
        for (int i2 = 0; i2 < this.f34107f; i2++) {
            C12902d dVar = new C12902d(this.f34110i, "DownloadDispatcher-Thread", "DownloadDispatcher");
            this.f34112k[i2] = dVar;
            dVar.start();
        }
        this.f34105b = true;
    }

    /* renamed from: h */
    private synchronized void m37568h() {
        this.f34105b = false;
        if (this.f34113l != null) {
            this.f34113l.mo31375a();
        }
        for (int i = 0; i < this.f34111j.length; i++) {
            if (this.f34111j[i] != null) {
                this.f34111j[i].mo31369a();
                this.f34111j[i] = null;
            }
        }
        for (int i2 = 0; i2 < this.f34112k.length; i2++) {
            if (this.f34112k[i2] != null) {
                this.f34112k[i2].mo31369a();
                this.f34112k[i2] = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31386b() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f34104d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            long r2 = r7.f34114m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.f34114m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0013:
            long r2 = r7.f34114m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.f34114m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r0 = 0
            r1 = 0
        L_0x0024:
            com.bytedance.sdk.account.network.dispatcher.a[] r2 = r7.f34111j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r2 = r2.length     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 >= r2) goto L_0x004a
            com.bytedance.sdk.account.network.dispatcher.a[] r2 = r7.f34111j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r7.f34106e     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r1 > r2) goto L_0x004a
            com.bytedance.sdk.account.network.dispatcher.a r2 = new com.bytedance.sdk.account.network.dispatcher.a     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.network.dispatcher.IRequest> r3 = r7.f34109h     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "ApiDispatcher-Thread"
            java.lang.String r5 = "ApiDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            com.bytedance.sdk.account.network.dispatcher.a[] r3 = r7.f34111j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r3[r0] = r2     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2.start()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004f:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.network.dispatcher.C12903e.mo31386b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31387c() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f34104d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            long r2 = r7.f34115n     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.f34115n = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0013:
            long r2 = r7.f34115n     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.f34115n = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r0 = 0
            r1 = 0
        L_0x0024:
            com.bytedance.sdk.account.network.dispatcher.d[] r2 = r7.f34112k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r2 = r2.length     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 >= r2) goto L_0x004a
            com.bytedance.sdk.account.network.dispatcher.d[] r2 = r7.f34112k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r7.f34107f     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r1 > r2) goto L_0x004a
            com.bytedance.sdk.account.network.dispatcher.d r2 = new com.bytedance.sdk.account.network.dispatcher.d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.network.dispatcher.IRequest> r3 = r7.f34110i     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "DownloadDispatcher-Thread"
            java.lang.String r5 = "DownloadDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            com.bytedance.sdk.account.network.dispatcher.d[] r3 = r7.f34112k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r3[r0] = r2     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2.start()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004f:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.network.dispatcher.C12903e.mo31387c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31388d() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f34104d     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            long r2 = r9.f34116o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.f34116o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
        L_0x0013:
            long r2 = r9.f34116o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.network.dispatcher.a[] r2 = r9.f34111j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x0027:
            int r6 = r9.f34106e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r2 < r6) goto L_0x003f
            com.bytedance.sdk.account.network.dispatcher.a[] r6 = r9.f34111j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r7 = 0
            if (r6 == 0) goto L_0x0039
            boolean r8 = r6.mo31371b()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r8 == 0) goto L_0x0039
            r4 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            int r2 = r2 + -1
            goto L_0x0027
        L_0x003f:
            r9.f34116o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            com.bytedance.sdk.account.network.dispatcher.a[] r0 = r9.f34111j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0 - r3
        L_0x004a:
            int r1 = r9.f34106e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 < r1) goto L_0x006d
            com.bytedance.sdk.account.network.dispatcher.a[] r1 = r9.f34111j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r1 == 0) goto L_0x006a
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 == r3) goto L_0x006a
            boolean r2 = r1.mo31371b()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 != 0) goto L_0x006a
            r1.mo31369a()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            com.bytedance.sdk.account.network.dispatcher.a[] r1 = r9.f34111j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
        L_0x006a:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0074:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.network.dispatcher.C12903e.mo31388d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31389e() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f34104d     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            long r2 = r9.f34117p     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.f34117p = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
        L_0x0013:
            long r2 = r9.f34117p     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.network.dispatcher.d[] r2 = r9.f34112k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x0027:
            int r6 = r9.f34107f     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r2 < r6) goto L_0x003f
            com.bytedance.sdk.account.network.dispatcher.d[] r6 = r9.f34112k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r7 = 0
            if (r6 == 0) goto L_0x0039
            boolean r8 = r6.mo31371b()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r8 == 0) goto L_0x0039
            r4 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            int r2 = r2 + -1
            goto L_0x0027
        L_0x003f:
            r9.f34117p = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            com.bytedance.sdk.account.network.dispatcher.d[] r0 = r9.f34112k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0 - r3
        L_0x004a:
            int r1 = r9.f34107f     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 < r1) goto L_0x006d
            com.bytedance.sdk.account.network.dispatcher.d[] r1 = r9.f34112k     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r1 == 0) goto L_0x006a
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 == r3) goto L_0x006a
            boolean r2 = r1.mo31371b()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 != 0) goto L_0x006a
            r1.mo31369a()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            com.bytedance.sdk.account.network.dispatcher.d[] r1 = r9.f34112k     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
        L_0x006a:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0074:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.network.dispatcher.C12903e.mo31389e():void");
    }

    /* renamed from: a */
    public final synchronized void mo31385a(C12901c cVar) {
        cVar.mo31377a(m37566f());
        if (!this.f34105b) {
            m37567g();
        }
        if (cVar.mo31367d() == Priority.IMMEDIATE) {
            C6304f.submitRunnable(cVar);
            return;
        }
        cVar.mo31382f();
        this.f34109h.add(cVar);
    }

    private C12903e(int i, int i2) {
        this.f34108g = new PriorityBlockingQueue<>();
        this.f34109h = new PriorityBlockingQueue<>();
        this.f34110i = new PriorityBlockingQueue<>();
        this.f34114m = 0;
        this.f34115n = 0;
        this.f34116o = 0;
        this.f34117p = 0;
        this.f34106e = 4;
        this.f34107f = 4;
        this.f34111j = new C12899a[16];
        this.f34112k = new C12902d[16];
    }
}
