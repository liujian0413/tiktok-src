package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "micro_app_item_type")
/* renamed from: com.ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment */
public final class MicroAppItemTypeExperiment {
    public static final MicroAppItemTypeExperiment INSTANCE = new MicroAppItemTypeExperiment();
    @C6382b
    private static final int MOST_USE = 1;
    @C6382b(mo15285a = true)
    private static final int RECENT_USE = 0;

    private MicroAppItemTypeExperiment() {
    }

    public final int getMOST_USE() {
        return MOST_USE;
    }

    public final int getRECENT_USE() {
        return RECENT_USE;
    }
}
