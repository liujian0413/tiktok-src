package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "m_post_push_group")
/* renamed from: com.ss.android.ugc.aweme.experiment.HidePushSettingsExperiment */
public final class HidePushSettingsExperiment {
    @C6382b(mo15285a = true)
    public static final int CONTROL_GROUP = 1;
    @C6382b
    public static final int GROUP1 = 2;
    @C6382b
    public static final int GROUP2 = 3;
    public static final HidePushSettingsExperiment INSTANCE = new HidePushSettingsExperiment();

    private HidePushSettingsExperiment() {
    }
}
