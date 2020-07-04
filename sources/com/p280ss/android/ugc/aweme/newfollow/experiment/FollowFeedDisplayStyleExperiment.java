package com.p280ss.android.ugc.aweme.newfollow.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "remove_friend_tab")
/* renamed from: com.ss.android.ugc.aweme.newfollow.experiment.FollowFeedDisplayStyleExperiment */
public final class FollowFeedDisplayStyleExperiment {
    @C6382b
    public static final int FOLLOW = 2;
    @C6382b
    public static final int FOLLOW_AND_FRIEND = 1;
    public static final FollowFeedDisplayStyleExperiment INSTANCE = new FollowFeedDisplayStyleExperiment();
    @C6382b(mo15285a = true)
    public static final int NORMAL = 0;

    private FollowFeedDisplayStyleExperiment() {
    }
}
