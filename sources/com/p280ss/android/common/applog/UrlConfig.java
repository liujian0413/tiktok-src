package com.p280ss.android.common.applog;

/* renamed from: com.ss.android.common.applog.UrlConfig */
public class UrlConfig {
    public static final UrlConfig AMERICA;
    public static final UrlConfig AMERICA_HTTP;
    public static final UrlConfig CHINA;
    public static final UrlConfig MUSICALLY;
    public static final UrlConfig MUSICALLY_HTTP;
    public static final UrlConfig SIG_ALIYUN;
    public static final UrlConfig SIG_AWS;
    final String mAppActiveUrl;
    final String mApplogFallbackUrl;
    final String mApplogSettingsFallbackUrl;
    final String mApplogSettingsUrl;
    final String mApplogTimelyUrl;
    final String mApplogURL;
    final String[] mDeviceRegisterUrl;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(":\nmApplogURL : ");
        sb.append(this.mApplogURL);
        sb.append("\nmApplogTimelyUrl : ");
        sb.append(this.mApplogTimelyUrl);
        sb.append("\nmDeviceRegisterUrl : ");
        sb.append(this.mDeviceRegisterUrl);
        sb.append("\nmAppActiveUrl : ");
        sb.append(this.mAppActiveUrl);
        sb.append("\nmApplogSettingsUrl : ");
        sb.append(this.mApplogSettingsUrl);
        sb.append("\n\nmApplogFallbackUrl : ");
        sb.append(this.mApplogFallbackUrl);
        sb.append("\nmApplogSettingsFallbackUrl : ");
        sb.append(this.mApplogSettingsFallbackUrl);
        sb.append("\n\n\n\n");
        return sb.toString();
    }

    static {
        UrlConfig urlConfig = new UrlConfig("https://log.snssdk.com/service/2/app_log/", "https://rtlog.snssdk.com/service/2/app_log/", new String[]{"https://log.snssdk.com/service/2/device_register/", "https://log.snssdk.com/service/2/device_register/"}, "https://ichannel.snssdk.com/service/2/app_alert_check/", "https://log.snssdk.com/service/2/log_settings/", "https://log.snssdk.com/service/2/app_log/", "https://log.snssdk.com/service/2/log_settings/");
        CHINA = urlConfig;
        UrlConfig urlConfig2 = new UrlConfig("https://log.isnssdk.com/service/2/app_log/", "https://rtlog.isnssdk.com/service/2/app_log/", new String[]{"https://log.isnssdk.com/service/2/device_register/", "https://log.isnssdk.com/service/2/device_register/"}, "https://ichannel.isnssdk.com/service/2/app_alert_check/", "https://log.isnssdk.com/service/2/log_settings/", "https://log.isnssdk.com/service/2/app_log/", "https://log.isnssdk.com/service/2/log_settings/");
        AMERICA = urlConfig2;
        UrlConfig urlConfig3 = new UrlConfig("https://log.isnssdk.com/service/2/app_log/", "https://rtlog.isnssdk.com/service/2/app_log/", new String[]{"https://log.isnssdk.com/service/2/device_register/", "https://log.isnssdk.com/service/2/device_register/"}, "https://ichannel.isnssdk.com/service/2/app_alert_check/", "https://log.isnssdk.com/service/2/log_settings/", "https://log.isnssdk.com/service/2/app_log/", "https://log.isnssdk.com/service/2/log_settings/");
        AMERICA_HTTP = urlConfig3;
        UrlConfig urlConfig4 = new UrlConfig("https://log.sgsnssdk.com/service/2/app_log/", "https://rtlog.sgsnssdk.com/service/2/app_log/", new String[]{"https://log.sgsnssdk.com/service/2/device_register/", "https://log15.byteoversea.com/service/2/device_register/", "https://log.sgsnssdk.com/service/2/device_register/", "https://log15.byteoversea.com/service/2/device_register/"}, "https://ichannel.sgsnssdk.com/service/2/app_alert_check/", "https://log.sgsnssdk.com/service/2/log_settings/", "https://log.sgsnssdk.com/service/2/app_log/", "https://log.sgsnssdk.com/service/2/log_settings/");
        SIG_AWS = urlConfig4;
        UrlConfig urlConfig5 = new UrlConfig("https://log.byteoversea.com/service/2/app_log/", "https://rtlog.byteoversea.com/service/2/app_log/", new String[]{"https://log.byteoversea.com/service/2/device_register/", "https://log.byteoversea.com/service/2/device_register/"}, "https://i.byteoversea.com/service/2/app_alert_check/", "https://log.byteoversea.com/service/2/log_settings/", "https://log.byteoversea.com/service/2/app_log/", "https://log.byteoversea.com/service/2/log_settings/");
        SIG_ALIYUN = urlConfig5;
        UrlConfig urlConfig6 = new UrlConfig("https://applog.musical.ly/service/2/app_log/", "https://rtlog.musical.ly/service/2/app_log/", new String[]{"https://applog.musical.ly/service/2/device_register/", "https://applog.musical.ly/service/2/device_register/"}, "https://ichannel.musical.ly/service/2/app_alert_check/", "https://applog.musical.ly/service/2/log_settings/", "https://applog.musical.ly/service/2/app_log/", "https://applog.musical.ly/service/2/log_settings/");
        MUSICALLY = urlConfig6;
        UrlConfig urlConfig7 = new UrlConfig("https://applog.musical.ly/service/2/app_log/", "https://rtlog.musical.ly/service/2/app_log/", new String[]{"https://applog.musical.ly/service/2/device_register/", "https://applog.musical.ly/service/2/device_register/"}, "https://ichannel.musical.ly/service/2/app_alert_check/", "https://applog.musical.ly/service/2/log_settings/", "https://applog.musical.ly/service/2/app_log/", "https://applog.musical.ly/service/2/log_settings/");
        MUSICALLY_HTTP = urlConfig7;
    }

    public UrlConfig(String str, String str2, String[] strArr, String str3, String str4, String str5, String str6) {
        this.mApplogURL = str;
        this.mApplogSettingsUrl = str4;
        this.mApplogTimelyUrl = str2;
        this.mAppActiveUrl = str3;
        this.mDeviceRegisterUrl = strArr;
        this.mApplogFallbackUrl = str5;
        this.mApplogSettingsFallbackUrl = str6;
    }
}
