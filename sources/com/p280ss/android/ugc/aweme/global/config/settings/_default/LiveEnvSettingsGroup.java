package com.p280ss.android.ugc.aweme.global.config.settings._default;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings.Builder;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings._default.LiveEnvSettingsGroup */
public class LiveEnvSettingsGroup extends AbstractSettingsGroup {
    /* access modifiers changed from: protected */
    public void addOptionalObjectDefaultValue() {
    }

    public void addDefaultValues(Builder builder) {
        builder.live_square_guide_show_count(Integer.valueOf(0));
    }
}
