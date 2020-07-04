package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.TikTokRegionList */
public final class TikTokRegionList {
    public static final TikTokRegionList INSTANCE = new TikTokRegionList();
    @C6382b
    private static final String ttRegions = "";

    private TikTokRegionList() {
    }

    public final String getTtRegions() {
        return ttRegions;
    }
}
