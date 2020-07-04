package com.p280ss.android.ugc.aweme.poi.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_hybrid_data_prefetch")
/* renamed from: com.ss.android.ugc.aweme.poi.experiment.HybridPrefetchExperiment */
public final class HybridPrefetchExperiment {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    @C6382b
    public static final int ENABLED = 1;
    public static final HybridPrefetchExperiment INSTANCE = new HybridPrefetchExperiment();

    private HybridPrefetchExperiment() {
    }
}
