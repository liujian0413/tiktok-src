package com.p280ss.android.ugc.aweme.follow.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "is_smart_feed")
/* renamed from: com.ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment */
public final class SmartFeedExperiment {
    @C6382b(mo15285a = true)
    private static final int DISABLE = 0;
    @C6382b
    private static final int ENABLE = 1;
    public static final SmartFeedExperiment INSTANCE = new SmartFeedExperiment();

    private SmartFeedExperiment() {
    }

    public final int getDISABLE() {
        return DISABLE;
    }

    public final int getENABLE() {
        return ENABLE;
    }

    public static final boolean isEnabled() {
        if (C6384b.m19835a().mo15287a(SmartFeedExperiment.class, true, "is_smart_feed", C6384b.m19835a().mo15295d().is_smart_feed, 0) == ENABLE) {
            return true;
        }
        return false;
    }
}
