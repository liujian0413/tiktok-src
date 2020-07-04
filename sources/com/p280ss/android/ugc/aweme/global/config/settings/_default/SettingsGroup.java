package com.p280ss.android.ugc.aweme.global.config.settings._default;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings.Builder;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings._default.SettingsGroup */
public class SettingsGroup extends AbstractSettingsGroup {
    public void addOptionalObjectDefaultValue() {
        registerDefaultValue(new Builder().main_switch(Boolean.valueOf(false)).show_launch_page_popup(Boolean.valueOf(false)).show_login_icon(Boolean.valueOf(false)).show_msg_cell(Boolean.valueOf(false)).build());
    }

    public void addDefaultValues(IESSettings.Builder builder) {
        builder.add_device_fingerprint_open(Integer.valueOf(1));
        builder.fresh_animation(Boolean.valueOf(false));
        builder.refresh_feed_del_history(Boolean.valueOf(false));
        builder.close_login_agreement(Integer.valueOf(0));
        builder.anti_addiction_separation(Integer.valueOf(0));
        builder.anti_addiction_day_time(Integer.valueOf(0));
        builder.anti_addiction_night_time(Integer.valueOf(0));
        builder.anti_addiction_toast_time(Integer.valueOf(0));
        builder.show_prevent_download(Boolean.valueOf(false));
        builder.has_weixin_suppress(Boolean.valueOf(false));
        builder.show_creator_rewards(Integer.valueOf(0));
        builder.with_douplus_entry(Boolean.valueOf(false));
        builder.close_sync_to_helo_entry(Integer.valueOf(0));
        builder.use_new_splash_view(Boolean.valueOf(false));
        builder.im_associative_emoticon_all(new AssociativeEmoticonAll.Builder().show(Integer.valueOf(0)).sourceMessage("").build());
        builder.aweme_high_risk_area_code(new ArrayList(Arrays.asList(new String[]{"+90", "+963", "+93", "+92"})));
        builder.ug_sec_link_url("https://link-va.byteoversea.com/");
    }
}
