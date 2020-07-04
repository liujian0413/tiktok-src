package com.benchmark.p061a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2006j;
import com.benchmark.C2013m;
import com.p280ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.a.p */
public final class C1973p implements C2006j {

    /* renamed from: a */
    private Benchmark f7012a;

    /* renamed from: c */
    public final void mo7606c() {
        VEBenchmark.m142412a().mo107782e();
    }

    /* renamed from: a */
    public final BenchmarkResult mo7608a() {
        return new BenchmarkResult(this.f7012a, 0, "", VEBenchmark.m142412a().mo107785f());
    }

    /* renamed from: b */
    public final int mo7605b() {
        int b = C2013m.m9071a().mo7658b();
        if (b != 0) {
            return b;
        }
        return VEBenchmark.m142412a().mo107780d();
    }

    public C1973p(Benchmark benchmark) {
        this.f7012a = benchmark;
    }
}
