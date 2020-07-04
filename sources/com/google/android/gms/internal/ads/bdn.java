package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class bdn extends Thread {

    /* renamed from: a */
    private static final boolean f41696a = C15633dq.f44343a;

    /* renamed from: b */
    private final BlockingQueue<bqk<?>> f41697b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<bqk<?>> f41698c;

    /* renamed from: d */
    private final C16197yn f41699d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15465a f41700e;

    /* renamed from: f */
    private volatile boolean f41701f;

    /* renamed from: g */
    private final bfm f41702g = new bfm(this);

    public bdn(BlockingQueue<bqk<?>> blockingQueue, BlockingQueue<bqk<?>> blockingQueue2, C16197yn ynVar, C15465a aVar) {
        this.f41697b = blockingQueue;
        this.f41698c = blockingQueue2;
        this.f41699d = ynVar;
        this.f41700e = aVar;
    }

    /* renamed from: a */
    public final void mo40524a() {
        this.f41701f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f41699d.mo41691a();
        while (true) {
            try {
                m48470b();
            } catch (InterruptedException unused) {
                if (this.f41701f) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m48470b() throws InterruptedException {
        bqk bqk = (bqk) this.f41697b.take();
        bqk.mo41150b("cache-queue-take");
        aux a = this.f41699d.mo41690a(bqk.mo41151c());
        if (a == null) {
            bqk.mo41150b("cache-miss");
            if (!this.f41702g.m48593b(bqk)) {
                this.f41698c.put(bqk);
            }
        } else if (a.mo40059a()) {
            bqk.mo41150b("cache-hit-expired");
            bqk.mo41145a(a);
            if (!this.f41702g.m48593b(bqk)) {
                this.f41698c.put(bqk);
            }
        } else {
            bqk.mo41150b("cache-hit");
            bwf a2 = bqk.mo39257a(new bor(a.f41066a, a.f41072g));
            bqk.mo41150b("cache-hit-parsed");
            if (a.f41071f < System.currentTimeMillis()) {
                bqk.mo41150b("cache-hit-refresh-needed");
                bqk.mo41145a(a);
                a2.f44048d = true;
                if (!this.f41702g.m48593b(bqk)) {
                    this.f41700e.mo39018a(bqk, a2, new bel(this, bqk));
                    return;
                }
            }
            this.f41700e.mo39017a(bqk, a2);
        }
    }
}
