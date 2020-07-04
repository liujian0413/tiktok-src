package com.bytedance.apm.p252m;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.m.b */
public final class C6273b {

    /* renamed from: c */
    public static long f18494c = 30000;

    /* renamed from: a */
    public C6277c f18495a;

    /* renamed from: b */
    public volatile boolean f18496b;

    /* renamed from: d */
    CopyOnWriteArraySet<C6276b> f18497d;

    /* renamed from: e */
    private final Runnable f18498e;

    /* renamed from: com.bytedance.apm.m.b$a */
    static final class C6275a {

        /* renamed from: a */
        static final C6273b f18500a = new C6273b();
    }

    /* renamed from: com.bytedance.apm.m.b$b */
    public interface C6276b {
        /* renamed from: a */
        void mo7731a(long j);
    }

    /* renamed from: a */
    public static C6273b m19475a() {
        return C6275a.f18500a;
    }

    private C6273b() {
        this.f18496b = true;
        this.f18498e = new Runnable() {
            public final void run() {
                Iterator it = C6273b.this.f18497d.iterator();
                while (it.hasNext()) {
                    ((C6276b) it.next()).mo7731a(System.currentTimeMillis());
                }
                if (C6273b.this.f18496b) {
                    C6273b.this.f18495a.mo15072a((Runnable) this, C6273b.f18494c);
                }
            }
        };
        this.f18497d = new CopyOnWriteArraySet<>();
        this.f18495a = new C6277c("AsyncEventManager-Thread");
        this.f18495a.mo15070a();
    }

    /* renamed from: a */
    public final void mo15066a(Runnable runnable) {
        this.f18495a.mo15071a(runnable);
    }

    /* renamed from: b */
    public final void mo15068b(C6276b bVar) {
        try {
            this.f18497d.remove(bVar);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo15065a(C6276b bVar) {
        try {
            this.f18497d.add(bVar);
            if (this.f18496b) {
                this.f18495a.mo15073b(this.f18498e);
                this.f18495a.mo15072a(this.f18498e, f18494c);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo15067a(Runnable runnable, long j) {
        this.f18495a.mo15072a(runnable, j);
    }
}
