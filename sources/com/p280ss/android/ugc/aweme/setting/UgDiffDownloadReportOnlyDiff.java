package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.UgDiffDownloadReportOnlyDiff */
public final class UgDiffDownloadReportOnlyDiff {
    @C6382b
    private static final boolean DEFAULT = false;
    public static final UgDiffDownloadReportOnlyDiff INSTANCE = new UgDiffDownloadReportOnlyDiff();

    private UgDiffDownloadReportOnlyDiff() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
