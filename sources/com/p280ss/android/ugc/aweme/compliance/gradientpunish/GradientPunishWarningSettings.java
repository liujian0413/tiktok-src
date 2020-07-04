package com.p280ss.android.ugc.aweme.compliance.gradientpunish;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.compliance.gradientpunish.GradientPunishWarningSettings */
public final class GradientPunishWarningSettings {
    public static final GradientPunishWarningSettings INSTANCE = new GradientPunishWarningSettings();
    @C6382b
    private static GradientPunishWarning WARNING_SETTINGS;

    private GradientPunishWarningSettings() {
    }

    public final GradientPunishWarning getWARNING_SETTINGS() {
        return WARNING_SETTINGS;
    }

    public final void setWARNING_SETTINGS(GradientPunishWarning gradientPunishWarning) {
        WARNING_SETTINGS = gradientPunishWarning;
    }
}
