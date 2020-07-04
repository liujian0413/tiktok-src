package com.p280ss.android.ugc.aweme.commercialize.log;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.log.CommerceEggMonitorLogSetting */
public final class CommerceEggMonitorLogSetting {
    @C6382b
    private static final boolean DEFAULT = true;
    public static final CommerceEggMonitorLogSetting INSTANCE = new CommerceEggMonitorLogSetting();

    private CommerceEggMonitorLogSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10292j.m30480a().mo25016a(CommerceEggMonitorLogSetting.class, "enable_commerce_egg_monitor_log", C6384b.m19835a().mo15294c().getEnableCommerceEggMonitorLog());
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
