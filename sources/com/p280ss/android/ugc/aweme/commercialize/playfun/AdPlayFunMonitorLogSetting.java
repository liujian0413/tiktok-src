package com.p280ss.android.ugc.aweme.commercialize.playfun;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunMonitorLogSetting */
public final class AdPlayFunMonitorLogSetting {
    @C6382b
    private static final boolean DEFAULT = true;
    public static final AdPlayFunMonitorLogSetting INSTANCE = new AdPlayFunMonitorLogSetting();

    private AdPlayFunMonitorLogSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10292j.m30480a().mo25016a(AdPlayFunMonitorLogSetting.class, "enable_ad_playfun_monitor_log", C6384b.m19835a().mo15294c().getEnableAdPlayfunMonitorLog());
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
