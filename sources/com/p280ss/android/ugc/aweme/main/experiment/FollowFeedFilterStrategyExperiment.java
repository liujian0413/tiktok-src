package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "follow_feed_filter_strategy")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.FollowFeedFilterStrategyExperiment */
public final class FollowFeedFilterStrategyExperiment {
    @C6382b
    public static final int FILTER_LIVE_FORWARD = 1;
    @C6382b(mo15285a = true)
    public static final int FILTER_LIVE_FORWARD_RECOMMEND = 2;
    @C6382b
    public static final int FILTER_NONE = 0;
    public static final FollowFeedFilterStrategyExperiment INSTANCE = new FollowFeedFilterStrategyExperiment();

    private FollowFeedFilterStrategyExperiment() {
    }
}
