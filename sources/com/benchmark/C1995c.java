package com.benchmark;

/* renamed from: com.benchmark.c */
final /* synthetic */ class C1995c implements Runnable {

    /* renamed from: a */
    private final C1979a f7060a;

    /* renamed from: b */
    private final Benchmark f7061b;

    /* renamed from: c */
    private final BenchmarkResult f7062c;

    C1995c(C1979a aVar, Benchmark benchmark, BenchmarkResult benchmarkResult) {
        this.f7060a = aVar;
        this.f7061b = benchmark;
        this.f7062c = benchmarkResult;
    }

    public final void run() {
        this.f7060a.mo7619d(this.f7061b, this.f7062c);
    }
}
