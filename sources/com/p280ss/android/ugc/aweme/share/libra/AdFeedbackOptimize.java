package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_ad_feedback_optimize")
/* renamed from: com.ss.android.ugc.aweme.share.libra.AdFeedbackOptimize */
public final class AdFeedbackOptimize {
    @C6382b
    private static final boolean DISABLED = false;
    @C6382b(mo15285a = true)
    private static final boolean ENABLED = true;
    public static final AdFeedbackOptimize INSTANCE = new AdFeedbackOptimize();

    private AdFeedbackOptimize() {
    }

    public final boolean getDISABLED() {
        return DISABLED;
    }

    public final boolean getENABLED() {
        return ENABLED;
    }

    public final boolean enable() {
        return C6384b.m19835a().mo15292a(AdFeedbackOptimize.class, true, "enable_ad_feedback_optimize", C6384b.m19835a().mo15295d().enable_ad_feedback_optimize, true);
    }
}
