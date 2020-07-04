package com.p280ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.KeepCookieSettings */
public final class KeepCookieSettings {
    @C6382b
    private static final boolean ENABLED = false;
    public static final KeepCookieSettings INSTANCE = new KeepCookieSettings();

    private KeepCookieSettings() {
    }

    public final boolean getENABLED() {
        return ENABLED;
    }
}
