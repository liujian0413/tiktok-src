package com.p280ss.android.ugc.aweme.notice.api.p1429sp;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.notice.api.sp.AssistantSettings */
public final class AssistantSettings {
    public static final AssistantSettings INSTANCE = new AssistantSettings();
    @C6382b
    private static final AssistantUrl assistantUrl = null;

    private AssistantSettings() {
    }

    public final AssistantUrl getAssistantUrl() {
        return assistantUrl;
    }
}
