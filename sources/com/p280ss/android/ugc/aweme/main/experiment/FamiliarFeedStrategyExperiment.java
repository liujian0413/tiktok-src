package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "familiar_feed_strategy")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.FamiliarFeedStrategyExperiment */
public final class FamiliarFeedStrategyExperiment {
    public static final FamiliarFeedStrategyExperiment INSTANCE = new FamiliarFeedStrategyExperiment();
    @C6382b
    public static final int TYPE_FAMILIAR_WITHOUT_NEARBY = 1;
    @C6382b
    public static final int TYPE_FAMILIAR_WITH_NEARBY = 2;
    @C6382b(mo15285a = true)
    public static final int TYPE_NO_FAMILIAR = 0;

    private FamiliarFeedStrategyExperiment() {
    }
}
