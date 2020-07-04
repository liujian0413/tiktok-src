package com.p280ss.android.statistic.p907a;

import android.content.Context;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.UrlConfig;
import com.p280ss.android.statistic.Configuration;

/* renamed from: com.ss.android.statistic.a.b */
final class C20405b {
    /* renamed from: a */
    static void m67718a(C20404a aVar, Context context, Configuration configuration) {
        AppLog.setAppId(configuration.f55100h);
        AppLog.setChannel(configuration.f55096d);
        UrlConfig urlConfig = new UrlConfig("https://log2.musical.ly/service/2/app_log/", "https://log2.musical.ly/service/2/app_log/", new String[]{"https://log2.musical.ly/service/2/device_register/", "https://log2.musical.ly/service/2/device_register/"}, "https://log2.musical.ly/service/2/app_alert_check/", "https://log2.musical.ly/service/2/log_settings/", "https://log2.musical.ly/service/2/app_log/", "https://log2.musical.ly/service/2/log_settings/");
        AppLog.init(context, false, urlConfig);
    }
}
