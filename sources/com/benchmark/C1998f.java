package com.benchmark;

import android.os.RemoteException;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.benchmark.f */
public final class C1998f implements Runnable {

    /* renamed from: a */
    public Benchmark f7068a;

    /* renamed from: b */
    public C2006j f7069b;

    /* renamed from: c */
    public C1999g f7070c;

    /* renamed from: d */
    public boolean f7071d;

    public final void run() {
        try {
            this.f7070c.mo7614a(this.f7068a);
        } catch (RemoteException e) {
            C1957a.m8943a((Throwable) e);
        }
        try {
            BenchmarkResult a = this.f7069b.mo7608a();
            if (a.f6994a == 0) {
                this.f7070c.mo7615a(this.f7068a, a);
            } else {
                this.f7070c.mo7617b(this.f7068a, a);
            }
        } catch (Throwable th) {
            try {
                C1999g gVar = this.f7070c;
                Benchmark benchmark = this.f7068a;
                BenchmarkResult benchmarkResult = new BenchmarkResult(this.f7068a, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT, C1957a.m8949b(th), null, null);
                gVar.mo7617b(benchmark, benchmarkResult);
            } catch (RemoteException unused) {
                C1957a.m8943a(th);
            }
        }
    }

    public C1998f(Benchmark benchmark, C2006j jVar, C1999g gVar) {
        this.f7068a = benchmark;
        this.f7069b = jVar;
        this.f7070c = gVar;
    }
}
