package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.UgDiffDownloadUnreportExtra */
public final class UgDiffDownloadUnreportExtra {
    @C6382b
    private static final boolean DEFAULT = false;
    public static final UgDiffDownloadUnreportExtra INSTANCE = new UgDiffDownloadUnreportExtra();

    private UgDiffDownloadUnreportExtra() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
