package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AppCurrentRegionSetting */
public final class AppCurrentRegionSetting {
    public static final AppCurrentRegionSetting INSTANCE = new AppCurrentRegionSetting();
    @C6382b
    private static final String priorityRegion = "";

    private AppCurrentRegionSetting() {
    }

    public final String getPriorityRegion() {
        return priorityRegion;
    }
}
