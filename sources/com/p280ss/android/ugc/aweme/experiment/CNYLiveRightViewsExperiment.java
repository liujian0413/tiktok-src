package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "live_hide_right_views")
/* renamed from: com.ss.android.ugc.aweme.experiment.CNYLiveRightViewsExperiment */
public final class CNYLiveRightViewsExperiment {
    @C6382b
    private static final boolean HIDE = true;
    public static final CNYLiveRightViewsExperiment INSTANCE = new CNYLiveRightViewsExperiment();
    @C6382b(mo15285a = true)
    private static final boolean SHOW = false;

    private CNYLiveRightViewsExperiment() {
    }

    public final boolean getHIDE() {
        return HIDE;
    }

    public final boolean getSHOW() {
        return SHOW;
    }
}
