package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.m */
public final class C1784m<T> {

    /* renamed from: a */
    public Executor f6426a;

    /* renamed from: b */
    public final FutureTask<C1783l<T>> f6427b;

    /* renamed from: c */
    public volatile C1783l<T> f6428c;

    /* renamed from: d */
    private Thread f6429d;

    /* renamed from: e */
    private final Set<C1781j<T>> f6430e;

    /* renamed from: f */
    private final Set<C1781j<Throwable>> f6431f;

    /* renamed from: g */
    private final Handler f6432g;

    /* renamed from: b */
    private void m8473b() {
        this.f6432g.post(new Runnable() {
            public final void run() {
                if (C1784m.this.f6428c != null && !C1784m.this.f6427b.isCancelled()) {
                    C1783l<T> lVar = C1784m.this.f6428c;
                    if (lVar.f6424a != null) {
                        C1784m.this.mo7278a(lVar.f6424a);
                    } else {
                        C1784m.this.mo7279a(lVar.f6425b);
                    }
                }
            }
        });
    }

    /* renamed from: d */
    private boolean m8475d() {
        if (this.f6429d == null || !this.f6429d.isAlive()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8474c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m8475d()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            com.airbnb.lottie.l<T> r0 = r2.f6428c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            com.airbnb.lottie.m$2 r0 = new com.airbnb.lottie.m$2     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x001e }
            r2.f6429d = r0     // Catch:{ all -> 0x001e }
            java.lang.Thread r0 = r2.f6429d     // Catch:{ all -> 0x001e }
            r0.start()     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1784m.m8474c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7276a() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m8475d()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.util.Set<com.airbnb.lottie.j<T>> r0 = r1.f6430e     // Catch:{ all -> 0x001f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0015
            com.airbnb.lottie.l<T> r0 = r1.f6428c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
        L_0x0015:
            java.lang.Thread r0 = r1.f6429d     // Catch:{ all -> 0x001f }
            r0.interrupt()     // Catch:{ all -> 0x001f }
            r0 = 0
            r1.f6429d = r0     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1784m.mo7276a():void");
    }

    public C1784m(Callable<C1783l<T>> callable) {
        this(callable, false);
    }

    /* renamed from: a */
    public final synchronized C1784m<T> mo7275a(C1781j<T> jVar) {
        if (!(this.f6428c == null || this.f6428c.f6424a == null)) {
            jVar.mo7127a(this.f6428c.f6424a);
        }
        this.f6430e.add(jVar);
        m8474c();
        return this;
    }

    /* renamed from: b */
    public final synchronized C1784m<T> mo7280b(C1781j<T> jVar) {
        this.f6430e.remove(jVar);
        mo7276a();
        return this;
    }

    /* renamed from: c */
    public final synchronized C1784m<T> mo7281c(C1781j<Throwable> jVar) {
        if (!(this.f6428c == null || this.f6428c.f6425b == null)) {
            jVar.mo7127a(this.f6428c.f6425b);
        }
        this.f6431f.add(jVar);
        m8474c();
        return this;
    }

    /* renamed from: d */
    public final synchronized C1784m<T> mo7282d(C1781j<T> jVar) {
        this.f6431f.remove(jVar);
        mo7276a();
        return this;
    }

    /* renamed from: a */
    public final void mo7277a(C1783l<T> lVar) {
        if (this.f6428c == null) {
            this.f6428c = lVar;
            m8473b();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public final void mo7278a(T t) {
        for (C1781j a : new ArrayList(this.f6430e)) {
            a.mo7127a(t);
        }
    }

    /* renamed from: a */
    public final void mo7279a(Throwable th) {
        ArrayList<C1781j> arrayList = new ArrayList<>(this.f6431f);
        if (!arrayList.isEmpty()) {
            for (C1781j a : arrayList) {
                a.mo7127a(th);
            }
        }
    }

    private C1784m(Callable<C1783l<T>> callable, boolean z) {
        this.f6426a = Executors.newCachedThreadPool();
        this.f6430e = new LinkedHashSet(1);
        this.f6431f = new LinkedHashSet(1);
        this.f6432g = new Handler(Looper.getMainLooper());
        this.f6428c = null;
        this.f6427b = new FutureTask<>(callable);
        this.f6426a.execute(this.f6427b);
        m8474c();
    }
}
