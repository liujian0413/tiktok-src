package com.p280ss.android.ugc.aweme.feed.panel;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.panel.FixDislikeEventSetting */
public final class FixDislikeEventSetting {
    @C6382b(mo15285a = true)
    private static final int FIX = 1;
    public static final FixDislikeEventSetting INSTANCE = new FixDislikeEventSetting();

    private FixDislikeEventSetting() {
    }

    public static final boolean isOpen() {
        if (C10292j.m30480a().mo25012a(FixDislikeEventSetting.class, "fix_dislike_event_setting", C6384b.m19835a().mo15294c().getFixDislikeEventSetting()) == 1) {
            return true;
        }
        return false;
    }
}
