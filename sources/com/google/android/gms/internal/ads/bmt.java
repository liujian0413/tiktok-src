package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class bmt extends Thread {

    /* renamed from: a */
    private final BlockingQueue<bqk<?>> f42698a;

    /* renamed from: b */
    private final blv f42699b;

    /* renamed from: c */
    private final C16197yn f42700c;

    /* renamed from: d */
    private final C15465a f42701d;

    /* renamed from: e */
    private volatile boolean f42702e;

    public bmt(BlockingQueue<bqk<?>> blockingQueue, blv blv, C16197yn ynVar, C15465a aVar) {
        this.f42698a = blockingQueue;
        this.f42699b = blv;
        this.f42700c = ynVar;
        this.f42701d = aVar;
    }

    /* renamed from: a */
    public final void mo40989a() {
        this.f42702e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m49398b();
            } catch (InterruptedException unused) {
                if (this.f42702e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m49398b() throws InterruptedException {
        bqk bqk = (bqk) this.f42698a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bqk.mo41150b("network-queue-take");
            TrafficStats.setThreadStatsTag(bqk.f43253c);
            bor a = this.f42699b.mo39236a(bqk);
            bqk.mo41150b("network-http-complete");
            if (!a.f43052e || !bqk.mo41156f()) {
                bwf a2 = bqk.mo39257a(a);
                bqk.mo41150b("network-parse-complete");
                if (bqk.f43254d && a2.f44046b != null) {
                    this.f42700c.mo41692a(bqk.mo41151c(), a2.f44046b);
                    bqk.mo41150b("network-cache-written");
                }
                bqk.mo41155e();
                this.f42701d.mo39017a(bqk, a2);
                bqk.mo41148a(a2);
                return;
            }
            bqk.mo41152c("not-modified");
            bqk.mo41157g();
        } catch (zzae e) {
            e.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.f42701d.mo39019a(bqk, e);
            bqk.mo41157g();
        } catch (Exception e2) {
            new Object[1][0] = e2.toString();
            zzae zzae = new zzae((Throwable) e2);
            zzae.zzad = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.f42701d.mo39019a(bqk, zzae);
            bqk.mo41157g();
        }
    }
}
