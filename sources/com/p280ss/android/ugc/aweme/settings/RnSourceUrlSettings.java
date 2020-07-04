package com.p280ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.RnSourceUrlSettings */
public final class RnSourceUrlSettings {
    public static final RnSourceUrlSettings INSTANCE = new RnSourceUrlSettings();
    @C6382b
    private static final RnSourceUrlSetting[] androidSourceUrl = null;

    private RnSourceUrlSettings() {
    }

    public final RnSourceUrlSetting[] getAndroidSourceUrl() {
        return androidSourceUrl;
    }
}
