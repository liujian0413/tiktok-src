package com.p280ss.android.ugc.aweme.discover.abtest;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p280ss.android.ugc.aweme.discover.abtest.modules.LiveSquareEntranceAnimConfig;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.discover.abtest.LiveSquareEntranceSettings */
public final class LiveSquareEntranceSettings {
    public static final LiveSquareEntranceSettings INSTANCE = new LiveSquareEntranceSettings();
    @C6382b
    private static final LiveSquareEntranceAnimConfig configs = null;

    private LiveSquareEntranceSettings() {
    }

    public final LiveSquareEntranceAnimConfig getConfigs() {
        return configs;
    }
}
