package com.p280ss.android.ugc.trill.settings;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.trill.settings.ContentLangLimitSettings */
public final class ContentLangLimitSettings {
    public static final ContentLangLimitSettings INSTANCE = new ContentLangLimitSettings();
    @C6382b
    private static final int contentLangLimit = 5;

    private ContentLangLimitSettings() {
    }

    public final int getContentLangLimit() {
        return contentLangLimit;
    }

    public static final int getContentLangLimitSetting() {
        try {
            return C10292j.m30480a().mo25012a(ContentLangLimitSettings.class, "content_lang_limit", C6384b.m19835a().mo15294c().getContentLangLimit());
        } catch (Throwable unused) {
            return 5;
        }
    }
}
