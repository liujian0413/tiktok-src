package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "for_you_feed_hide_verification_badge")
/* renamed from: com.ss.android.ugc.aweme.experiment.VerificationExperiment */
public final class VerificationExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DEFAULT = false;
    @C6382b
    private static final boolean GROUP1 = true;
    public static final VerificationExperiment INSTANCE = new VerificationExperiment();

    private VerificationExperiment() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getGROUP1() {
        return GROUP1;
    }
}
