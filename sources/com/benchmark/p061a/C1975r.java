package com.benchmark.p061a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C1957a;
import com.benchmark.C2006j;

/* renamed from: com.benchmark.a.r */
public abstract class C1975r implements C2006j {

    /* renamed from: a */
    protected Benchmark f7014a;

    /* renamed from: d */
    public abstract int mo7610e();

    /* renamed from: a */
    public final BenchmarkResult mo7608a() {
        long[] jArr = new long[this.f7014a.times];
        return new BenchmarkResult(this.f7014a, C1957a.m8941a((C1971n) new C1976s(this), jArr), "", jArr);
    }

    public C1975r(Benchmark benchmark) {
        this.f7014a = benchmark;
    }
}
