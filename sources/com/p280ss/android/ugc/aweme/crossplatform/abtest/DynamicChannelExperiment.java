package com.p280ss.android.ugc.aweme.crossplatform.abtest;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "bundle_dynamic_load")
/* renamed from: com.ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment */
public final class DynamicChannelExperiment {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    @C6382b
    public static final int DYNAMIC = 1;
    public static final DynamicChannelExperiment INSTANCE = new DynamicChannelExperiment();

    private DynamicChannelExperiment() {
    }
}
