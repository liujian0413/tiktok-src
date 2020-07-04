package org.greenrobot.eventbus;

import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.b */
final class C48329b implements Runnable, C48340k {

    /* renamed from: a */
    private final C48339j f123388a = new C48339j();

    /* renamed from: b */
    private final C7705c f123389b;

    /* renamed from: c */
    private volatile boolean f123390c;

    public final void run() {
        while (true) {
            try {
                C48338i a = this.f123388a.mo121778a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.f123388a.mo121777a();
                        if (a == null) {
                            this.f123390c = false;
                            this.f123390c = false;
                            return;
                        }
                    }
                }
                this.f123389b.mo20390a(a);
            } catch (InterruptedException e) {
                try {
                    C48332f fVar = this.f123389b.f20943d;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(" was interruppted");
                    fVar.mo121774a(level, sb.toString(), e);
                    return;
                } finally {
                    this.f123390c = false;
                }
            }
        }
    }

    C48329b(C7705c cVar) {
        this.f123389b = cVar;
    }

    /* renamed from: a */
    public final void mo121760a(C48345p pVar, Object obj) {
        C48338i a = C48338i.m149920a(pVar, obj);
        synchronized (this) {
            this.f123388a.mo121779a(a);
            if (!this.f123390c) {
                this.f123390c = true;
                this.f123389b.f20942c.execute(this);
            }
        }
    }
}
