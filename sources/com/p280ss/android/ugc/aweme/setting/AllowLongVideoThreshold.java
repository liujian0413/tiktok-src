package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AllowLongVideoThreshold */
public final class AllowLongVideoThreshold {
    public static final AllowLongVideoThreshold INSTANCE = new AllowLongVideoThreshold();
    @C6382b
    private static final int THRESHOLD = 0;

    private AllowLongVideoThreshold() {
    }

    public final int getTHRESHOLD() {
        return THRESHOLD;
    }
}
