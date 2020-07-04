package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "douplus_bring_to_front")
/* renamed from: com.ss.android.ugc.aweme.share.libra.DouBringToFrontExperiment */
public final class DouBringToFrontExperiment {
    @C6382b
    private static final int DISABLED = 0;
    @C6382b(mo15285a = true)
    private static final int ENABLED = 1;
    public static final DouBringToFrontExperiment INSTANCE = new DouBringToFrontExperiment();

    private DouBringToFrontExperiment() {
    }

    public final int getDISABLED() {
        return DISABLED;
    }

    public final int getENABLED() {
        return ENABLED;
    }

    public final boolean enable() {
        if (C6384b.m19835a().mo15287a(DouBringToFrontExperiment.class, true, "douplus_bring_to_front", C6384b.m19835a().mo15295d().douplus_bring_to_front, 1) == ENABLED) {
            return true;
        }
        return false;
    }
}
