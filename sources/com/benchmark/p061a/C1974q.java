package com.benchmark.p061a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2006j;

/* renamed from: com.benchmark.a.q */
public final class C1974q implements C2006j {

    /* renamed from: a */
    private Benchmark f7013a;

    /* renamed from: b */
    public final int mo7605b() {
        return 0;
    }

    /* renamed from: c */
    public final void mo7606c() {
    }

    /* renamed from: a */
    public final BenchmarkResult mo7608a() {
        try {
            Thread.sleep(10);
            BenchmarkResult benchmarkResult = new BenchmarkResult(this.f7013a, 0, "", null, null);
            return benchmarkResult;
        } catch (InterruptedException unused) {
            return new BenchmarkResult(this.f7013a, 1, "", (long[]) null);
        }
    }

    public C1974q(Benchmark benchmark) {
        this.f7013a = benchmark;
    }
}
