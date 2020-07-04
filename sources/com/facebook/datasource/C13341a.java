package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.datasource.a */
public abstract class C13341a<T> implements C13346c<T> {

    /* renamed from: a */
    private C13344a f35258a = C13344a.IN_PROGRESS;

    /* renamed from: b */
    private boolean f35259b;

    /* renamed from: c */
    private T f35260c;

    /* renamed from: d */
    private Throwable f35261d;

    /* renamed from: e */
    private float f35262e;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<C13349e<T>, Executor>> f35263f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.datasource.a$a */
    enum C13344a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32634a(T t) {
    }

    /* renamed from: a */
    public final synchronized boolean mo32635a() {
        return this.f35259b;
    }

    /* renamed from: d */
    public synchronized T mo32641d() {
        return this.f35260c;
    }

    /* renamed from: e */
    public final synchronized Throwable mo32642e() {
        return this.f35261d;
    }

    /* renamed from: f */
    public final synchronized float mo32643f() {
        return this.f35262e;
    }

    protected C13341a() {
    }

    /* renamed from: h */
    private synchronized boolean mo33253h() {
        boolean z;
        if (this.f35258a == C13344a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo32639b() {
        boolean z;
        if (this.f35258a != C13344a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo32640c() {
        boolean z;
        if (this.f35260c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    private synchronized boolean m39054j() {
        boolean z;
        if (!mo32635a() || mo32639b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    private void m39053i() {
        boolean h = mo33253h();
        boolean j = m39054j();
        Iterator it = this.f35263f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m39048a((C13349e) pair.first, (Executor) pair.second, h, j);
        }
    }

    /* renamed from: k */
    private void m39055k() {
        Iterator it = this.f35263f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            final C13349e eVar = (C13349e) pair.first;
            ((Executor) pair.second).execute(new Runnable() {
                public final void run() {
                    eVar.onProgressUpdate(C13341a.this);
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo32634a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo32639b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        m39053i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f35263f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32644g() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35259b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f35259b = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f35260c     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f35260c = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo32634a((T) r1)
        L_0x0016:
            boolean r1 = r3.mo32639b()
            if (r1 != 0) goto L_0x001f
            r3.m39053i()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.e<T>, java.util.concurrent.Executor>> r1 = r3.f35263f     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13341a.mo32644g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m39049b(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35259b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            com.facebook.datasource.a$a r0 = r3.f35258a     // Catch:{ all -> 0x001c }
            com.facebook.datasource.a$a r2 = com.facebook.datasource.C13341a.C13344a.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f35262e     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f35262e = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13341a.m39049b(float):boolean");
    }

    /* renamed from: a */
    public boolean mo32636a(float f) {
        boolean b = m39049b(f);
        if (b) {
            m39055k();
        }
        return b;
    }

    /* renamed from: b */
    private synchronized boolean mo33252b(Throwable th) {
        if (!this.f35259b) {
            if (this.f35258a == C13344a.IN_PROGRESS) {
                this.f35258a = C13344a.FAILURE;
                this.f35261d = th;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32638a(Throwable th) {
        boolean b = mo33252b(th);
        if (b) {
            m39053i();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32637a(T t, boolean z) {
        boolean b = m39050b(t, z);
        if (b) {
            m39053i();
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        if (r4 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        mo32634a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0025=Splitter:B:20:0x0025, B:26:0x002d=Splitter:B:26:0x002d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m39050b(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f35259b     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            com.facebook.datasource.a$a r1 = r3.f35258a     // Catch:{ all -> 0x0039 }
            com.facebook.datasource.a$a r2 = com.facebook.datasource.C13341a.C13344a.IN_PROGRESS     // Catch:{ all -> 0x0039 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.a$a r5 = com.facebook.datasource.C13341a.C13344a.SUCCESS     // Catch:{ all -> 0x0039 }
            r3.f35258a = r5     // Catch:{ all -> 0x0039 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f35262e = r5     // Catch:{ all -> 0x0039 }
        L_0x0017:
            T r5 = r3.f35260c     // Catch:{ all -> 0x0039 }
            if (r5 == r4) goto L_0x0024
            T r5 = r3.f35260c     // Catch:{ all -> 0x0039 }
            r3.f35260c = r4     // Catch:{ all -> 0x0021 }
            r4 = r5
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0024:
            r4 = r0
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002b
            r3.mo32634a((T) r4)
        L_0x002b:
            r4 = 1
            return r4
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0033
            r3.mo32634a((T) r4)
        L_0x0033:
            r4 = 0
            return r4
        L_0x0035:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.mo32634a((T) r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13341a.m39050b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        m39048a(r3, r4, mo33253h(), m39054j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32633a(com.facebook.datasource.C13349e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.C13307g.m38940a(r3)
            com.facebook.common.internal.C13307g.m38940a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f35259b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.datasource.a$a r0 = r2.f35258a     // Catch:{ all -> 0x0041 }
            com.facebook.datasource.a$a r1 = com.facebook.datasource.C13341a.C13344a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.e<T>, java.util.concurrent.Executor>> r0 = r2.f35263f     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo32640c()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo32639b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m39054j()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.mo33253h()
            boolean r1 = r2.m39054j()
            r2.m39048a(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13341a.mo32633a(com.facebook.datasource.e, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    private void m39048a(final C13349e<T> eVar, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            public final void run() {
                if (z) {
                    eVar.onFailure(C13341a.this);
                } else if (z2) {
                    eVar.onCancellation(C13341a.this);
                } else {
                    eVar.onNewResult(C13341a.this);
                }
            }
        });
    }
}
