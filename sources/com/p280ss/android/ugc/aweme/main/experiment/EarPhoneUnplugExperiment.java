package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "aweme_will_stop_when_headphones_pulled")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment */
public final class EarPhoneUnplugExperiment {
    public static final EarPhoneUnplugExperiment INSTANCE = new EarPhoneUnplugExperiment();
    @C6382b
    public static final boolean NEW = true;
    @C6382b(mo15285a = true)
    public static final boolean OLD = false;

    private EarPhoneUnplugExperiment() {
    }

    public static final boolean shouldPausePlayVideo() {
        return C6384b.m19835a().mo15292a(EarPhoneUnplugExperiment.class, true, "aweme_will_stop_when_headphones_pulled", C6384b.m19835a().mo15295d().aweme_will_stop_when_headphones_pulled, false);
    }
}
