package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AllowLongVideo */
public final class AllowLongVideo {
    private static final boolean ALLOW = true;
    @C6382b(mo15285a = true)
    private static final boolean DISALLOW = false;
    public static final AllowLongVideo INSTANCE = new AllowLongVideo();

    private AllowLongVideo() {
    }

    public static /* synthetic */ void ALLOW$annotations() {
    }

    public static /* synthetic */ void DISALLOW$annotations() {
    }

    public final boolean getALLOW() {
        return ALLOW;
    }

    public final boolean getDISALLOW() {
        return DISALLOW;
    }
}
