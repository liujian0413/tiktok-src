package com.p280ss.android.ugc.aweme.global.config.settings;

import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsReaderUtil */
public class SettingsReaderUtil {
    public static void monitorError(JSONObject jSONObject) {
        C6893q.m21447a("aweme_settings_error_log", jSONObject);
    }
}
