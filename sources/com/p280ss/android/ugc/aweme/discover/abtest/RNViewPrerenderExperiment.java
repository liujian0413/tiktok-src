package com.p280ss.android.ugc.aweme.discover.abtest;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "search_transfer_is_prerender")
/* renamed from: com.ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment */
public final class RNViewPrerenderExperiment {
    public static final RNViewPrerenderExperiment INSTANCE = new RNViewPrerenderExperiment();
    @C6382b(mo15285a = true)
    public static final int NOT_PRERENDER = 0;
    @C6382b
    public static final int PRERENDER = 1;

    private RNViewPrerenderExperiment() {
    }
}
