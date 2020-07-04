package com.p280ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.DislikeReasonsSettings */
public final class DislikeReasonsSettings {
    @C6382b
    private static DislikeReason[] DISLIKE_REASONS;
    public static final DislikeReasonsSettings INSTANCE = new DislikeReasonsSettings();

    private DislikeReasonsSettings() {
    }

    public final DislikeReason[] getDISLIKE_REASONS() {
        return DISLIKE_REASONS;
    }

    public final void setDISLIKE_REASONS(DislikeReason[] dislikeReasonArr) {
        DISLIKE_REASONS = dislikeReasonArr;
    }
}
