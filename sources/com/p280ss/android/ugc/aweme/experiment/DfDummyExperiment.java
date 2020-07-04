package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_df_dummy")
/* renamed from: com.ss.android.ugc.aweme.experiment.DfDummyExperiment */
public final class DfDummyExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLED = true;
    public static final DfDummyExperiment INSTANCE = new DfDummyExperiment();

    private DfDummyExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLED() {
        return ENABLED;
    }
}
