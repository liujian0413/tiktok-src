package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_cellinfo_report")
/* renamed from: com.ss.android.ugc.aweme.experiment.CellInfoEnableExperiment */
public final class CellInfoEnableExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLE = true;
    public static final CellInfoEnableExperiment INSTANCE = new CellInfoEnableExperiment();

    private CellInfoEnableExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
