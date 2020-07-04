package com.p280ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.PhoneBindFlowSettings */
public final class PhoneBindFlowSettings {
    public static final PhoneBindFlowSettings INSTANCE = new PhoneBindFlowSettings();
    @C6382b
    private static final boolean NEW_PHONE_BIND_FLOW = true;

    private PhoneBindFlowSettings() {
    }

    public final boolean getNEW_PHONE_BIND_FLOW() {
        return NEW_PHONE_BIND_FLOW;
    }
}
