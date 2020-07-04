package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "is_deep_clean_enabled")
/* renamed from: com.ss.android.ugc.aweme.experiment.DeepCleanExperiment */
public final class DeepCleanExperiment {
    @C6382b(mo15285a = true)
    private static final int DISABLE = 0;
    public static final DeepCleanExperiment INSTANCE = new DeepCleanExperiment();

    private DeepCleanExperiment() {
    }

    public final int getDISABLE() {
        return DISABLE;
    }
}
