package com.benchmark.p061a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2006j;
import com.benchmark.C2013m;
import com.p280ss.android.vesdk.VEBenchmark;
import java.util.Map;

/* renamed from: com.benchmark.a.h */
public final class C1965h implements C2006j {

    /* renamed from: a */
    private Benchmark f7006a;

    /* renamed from: c */
    public final void mo7606c() {
    }

    /* renamed from: b */
    public final int mo7605b() {
        return C2013m.m9071a().mo7658b();
    }

    /* renamed from: a */
    public final BenchmarkResult mo7608a() {
        return new BenchmarkResult(this.f7006a, 0, "", (Map<String, String>) VEBenchmark.m142412a().mo107779c());
    }

    public C1965h(Benchmark benchmark) {
        this.f7006a = benchmark;
    }
}
