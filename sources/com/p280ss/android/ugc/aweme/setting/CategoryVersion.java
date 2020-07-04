package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.CategoryVersion */
public final class CategoryVersion {
    public static final CategoryVersion INSTANCE = new CategoryVersion();
    @C6382b
    private static final int VERSION = 0;

    private CategoryVersion() {
    }

    public final int getVERSION() {
        return VERSION;
    }
}
