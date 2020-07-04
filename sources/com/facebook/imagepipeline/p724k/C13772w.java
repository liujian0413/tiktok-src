package com.facebook.imagepipeline.p724k;

import android.os.SystemClock;
import com.facebook.imagepipeline.p720g.C13647e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.k.w */
public final class C13772w {

    /* renamed from: a */
    C13647e f36556a = null;

    /* renamed from: b */
    int f36557b = 0;

    /* renamed from: c */
    C13778c f36558c = C13778c.IDLE;

    /* renamed from: d */
    long f36559d = 0;

    /* renamed from: e */
    long f36560e = 0;

    /* renamed from: f */
    private final Executor f36561f;

    /* renamed from: g */
    private final C13776a f36562g;

    /* renamed from: h */
    private final Runnable f36563h = new Runnable() {
        public final void run() {
            C13772w.this.mo33379d();
        }
    };

    /* renamed from: i */
    private final Runnable f36564i = new Runnable() {
        public final void run() {
            C13772w.this.mo33378c();
        }
    };

    /* renamed from: j */
    private final int f36565j;

    /* renamed from: com.facebook.imagepipeline.k.w$a */
    public interface C13776a {
        /* renamed from: a */
        void mo33343a(C13647e eVar, int i);
    }

    /* renamed from: com.facebook.imagepipeline.k.w$b */
    static class C13777b {

        /* renamed from: a */
        private static ScheduledExecutorService f36569a;

        /* renamed from: a */
        static ScheduledExecutorService m40653a() {
            if (f36569a == null) {
                f36569a = C13779x.m40654a();
            }
            return f36569a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.w$c */
    enum C13778c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* renamed from: c */
    public final void mo33378c() {
        this.f36561f.execute(this.f36563h);
    }

    /* renamed from: e */
    public final synchronized long mo33380e() {
        return this.f36560e - this.f36559d;
    }

    /* renamed from: f */
    private void m40645f() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f36558c == C13778c.RUNNING_AND_PENDING) {
                j = Math.max(this.f36560e + ((long) this.f36565j), uptimeMillis);
                z = true;
                this.f36559d = uptimeMillis;
                this.f36558c = C13778c.QUEUED;
            } else {
                this.f36558c = C13778c.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m40643a(j - uptimeMillis);
        }
    }

    /* renamed from: a */
    public final void mo33375a() {
        C13647e eVar;
        synchronized (this) {
            eVar = this.f36556a;
            this.f36556a = null;
            this.f36557b = 0;
        }
        C13647e.m40237d(eVar);
    }

    /* renamed from: d */
    public final void mo33379d() {
        C13647e eVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f36556a;
            i = this.f36557b;
            this.f36556a = null;
            this.f36557b = 0;
            this.f36558c = C13778c.RUNNING;
            this.f36560e = uptimeMillis;
        }
        try {
            if (m40644b(eVar, i)) {
                this.f36562g.mo33343a(eVar, i);
            }
        } finally {
            C13647e.m40237d(eVar);
            m40645f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        m40643a(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33377b() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            com.facebook.imagepipeline.g.e r2 = r7.f36556a     // Catch:{ all -> 0x0043 }
            int r3 = r7.f36557b     // Catch:{ all -> 0x0043 }
            boolean r2 = m40644b(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.p724k.C13772w.C137753.f36568a     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.k.w$c r4 = r7.f36558c     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            switch(r2) {
                case 1: goto L_0x0026;
                case 2: goto L_0x0039;
                case 3: goto L_0x0021;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x0043 }
        L_0x0020:
            goto L_0x0039
        L_0x0021:
            com.facebook.imagepipeline.k.w$c r2 = com.facebook.imagepipeline.p724k.C13772w.C13778c.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.f36558c = r2     // Catch:{ all -> 0x0043 }
            goto L_0x0039
        L_0x0026:
            long r2 = r7.f36560e     // Catch:{ all -> 0x0043 }
            int r5 = r7.f36565j     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.f36559d = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.k.w$c r5 = com.facebook.imagepipeline.p724k.C13772w.C13778c.QUEUED     // Catch:{ all -> 0x0043 }
            r7.f36558c = r5     // Catch:{ all -> 0x0043 }
            r5 = r2
            r3 = 1
            goto L_0x003b
        L_0x0039:
            r5 = 0
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.m40643a(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13772w.mo33377b():boolean");
    }

    /* renamed from: a */
    private void m40643a(long j) {
        if (j > 0) {
            C13777b.m40653a().schedule(this.f36564i, j, TimeUnit.MILLISECONDS);
        } else {
            this.f36564i.run();
        }
    }

    /* renamed from: b */
    private static boolean m40644b(C13647e eVar, int i) {
        if (C13728b.m40493a(i) || C13728b.m40495b(i, 4) || C13647e.m40238e(eVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo33376a(C13647e eVar, int i) {
        C13647e eVar2;
        if (!m40644b(eVar, i)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f36556a;
            this.f36556a = C13647e.m40235a(eVar);
            this.f36557b = i;
        }
        C13647e.m40237d(eVar2);
        return true;
    }

    public C13772w(Executor executor, C13776a aVar, int i) {
        this.f36561f = executor;
        this.f36562g = aVar;
        this.f36565j = i;
    }
}
