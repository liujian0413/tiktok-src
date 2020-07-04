package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.ABMockKevaSettings */
public final class ABMockKevaSettings {
    @C6382b
    private static final boolean ENABLE = false;
    public static final ABMockKevaSettings INSTANCE = new ABMockKevaSettings();

    private ABMockKevaSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
