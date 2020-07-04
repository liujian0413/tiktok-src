package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.C15041e.C15042a;
import com.google.android.gms.common.api.C15043f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.C15045h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15259n;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.base.C16355d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends C15044g> extends C15041e<R> {

    /* renamed from: c */
    static final ThreadLocal<Boolean> f38917c = new C15119cl();

    /* renamed from: a */
    private final Object f38918a;

    /* renamed from: b */
    private final C15047a<R> f38919b;

    /* renamed from: d */
    private final WeakReference<C15037d> f38920d;

    /* renamed from: e */
    private final CountDownLatch f38921e;

    /* renamed from: f */
    private final ArrayList<C15042a> f38922f;

    /* renamed from: g */
    private C15045h<? super R> f38923g;

    /* renamed from: h */
    private final AtomicReference<C15102by> f38924h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public R f38925i;

    /* renamed from: j */
    private Status f38926j;

    /* renamed from: k */
    private volatile boolean f38927k;

    /* renamed from: l */
    private boolean f38928l;

    /* renamed from: m */
    private boolean f38929m;
    private C15048b mResultGuardian;

    /* renamed from: n */
    private C15259n f38930n;

    /* renamed from: o */
    private volatile C15097bt<R> f38931o;

    /* renamed from: p */
    private boolean f38932p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C15047a<R extends C15044g> extends C16355d {
        public C15047a() {
            this(Looper.getMainLooper());
        }

        public C15047a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo38273a(C15045h<? super R> hVar, R r) {
            sendMessage(obtainMessage(1, new Pair(hVar, r)));
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C15045h hVar = (C15045h) pair.first;
                    C15044g gVar = (C15044g) pair.second;
                    try {
                        hVar.mo29952a(gVar);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m43628b(gVar);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).mo38269c(Status.f38870d);
                    return;
                default:
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    final class C15048b {
        private C15048b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m43628b(BasePendingResult.this.f38925i);
            super.finalize();
        }

        /* synthetic */ C15048b(BasePendingResult basePendingResult, C15119cl clVar) {
            this();
        }
    }

    BasePendingResult() {
        this.f38918a = new Object();
        this.f38921e = new CountDownLatch(1);
        this.f38922f = new ArrayList<>();
        this.f38924h = new AtomicReference<>();
        this.f38932p = false;
        this.f38919b = new C15047a<>(Looper.getMainLooper());
        this.f38920d = new WeakReference<>(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo38135a(Status status);

    /* renamed from: c */
    public final Integer mo38264c() {
        return null;
    }

    protected BasePendingResult(C15037d dVar) {
        this.f38918a = new Object();
        this.f38921e = new CountDownLatch(1);
        this.f38922f = new ArrayList<>();
        this.f38924h = new AtomicReference<>();
        this.f38932p = false;
        this.f38919b = new C15047a<>(dVar != null ? dVar.mo38242c() : Looper.getMainLooper());
        this.f38920d = new WeakReference<>(dVar);
    }

    /* renamed from: d */
    public final boolean mo38270d() {
        return this.f38921e.getCount() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38262a(com.google.android.gms.common.api.C15045h<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f38918a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.f38923g = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.f38927k     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C15267r.m44391a(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.bt<R> r1 = r4.f38931o     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C15267r.m44391a(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.mo38263b()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.mo38270d()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f38919b     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.g r2 = r4.m43630g()     // Catch:{ all -> 0x000a }
            r1.mo38273a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.f38923g = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo38262a(com.google.android.gms.common.api.h):void");
    }

    /* renamed from: a */
    public final void mo38261a(C15042a aVar) {
        C15267r.m44395b(true, "Callback cannot be null.");
        synchronized (this.f38918a) {
            if (mo38270d()) {
                aVar.mo38265a(this.f38926j);
            } else {
                this.f38922f.add(aVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38260a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f38918a
            monitor-enter(r0)
            boolean r1 = r2.f38928l     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f38927k     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.f38925i     // Catch:{ all -> 0x0021 }
            m43628b(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f38928l = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f38871e     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.g r1 = r2.mo38135a(r1)     // Catch:{ all -> 0x0021 }
            r2.m43629c((R) r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo38260a():void");
    }

    /* renamed from: e */
    public final boolean mo38271e() {
        boolean b;
        synchronized (this.f38918a) {
            if (((C15037d) this.f38920d.get()) == null || !this.f38932p) {
                mo38260a();
            }
            b = mo38263b();
        }
        return b;
    }

    /* renamed from: b */
    public final boolean mo38263b() {
        boolean z;
        synchronized (this.f38918a) {
            z = this.f38928l;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo38267a(R r) {
        synchronized (this.f38918a) {
            if (this.f38929m || this.f38928l) {
                m43628b(r);
                return;
            }
            mo38270d();
            C15267r.m44391a(!mo38270d(), (Object) "Results have already been set");
            C15267r.m44391a(!this.f38927k, (Object) "Result has already been consumed");
            m43629c(r);
        }
    }

    /* renamed from: c */
    public final void mo38269c(Status status) {
        synchronized (this.f38918a) {
            if (!mo38270d()) {
                mo38267a((R) mo38135a(status));
                this.f38929m = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo38268a(C15102by byVar) {
        this.f38924h.set(byVar);
    }

    /* renamed from: f */
    public final void mo38272f() {
        this.f38932p = this.f38932p || ((Boolean) f38917c.get()).booleanValue();
    }

    /* renamed from: g */
    private final R m43630g() {
        R r;
        synchronized (this.f38918a) {
            C15267r.m44391a(!this.f38927k, (Object) "Result has already been consumed.");
            C15267r.m44391a(mo38270d(), (Object) "Result is not ready.");
            r = this.f38925i;
            this.f38925i = null;
            this.f38923g = null;
            this.f38927k = true;
        }
        C15102by byVar = (C15102by) this.f38924h.getAndSet(null);
        if (byVar != null) {
            byVar.mo38361a(this);
        }
        return r;
    }

    /* renamed from: c */
    private final void m43629c(R r) {
        this.f38925i = r;
        this.f38930n = null;
        this.f38921e.countDown();
        this.f38926j = this.f38925i.mo38101a();
        if (this.f38928l) {
            this.f38923g = null;
        } else if (this.f38923g != null) {
            this.f38919b.removeMessages(2);
            this.f38919b.mo38273a(this.f38923g, m43630g());
        } else if (this.f38925i instanceof C15043f) {
            this.mResultGuardian = new C15048b(this, null);
        }
        ArrayList arrayList = this.f38922f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C15042a) obj).mo38265a(this.f38926j);
        }
        this.f38922f.clear();
    }

    /* renamed from: b */
    public static void m43628b(C15044g gVar) {
        if (gVar instanceof C15043f) {
            try {
                ((C15043f) gVar).mo38266b();
            } catch (RuntimeException unused) {
            }
        }
    }
}
