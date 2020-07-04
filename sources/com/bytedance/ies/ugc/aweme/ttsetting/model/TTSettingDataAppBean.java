package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;

public final class TTSettingDataAppBean {
    @C6593c(mo15949a = "aweme_live_podcast")
    private C10977b awemeLivePodcast;
    @C6593c(mo15949a = "aweme_music_ailab")
    private C10978c awemeMusicAilab;
    @C6593c(mo15949a = "aweme_push_monitor_config")
    private C10979d awemePushMonitorConfig;
    @C6593c(mo15949a = "aweme_uniqueid_settings")
    private C10980e awemeUniqueidSettings;
    @C6593c(mo15949a = "pre_download_delay_days")
    private Integer preDownloadDelayDays;
    @C6593c(mo15949a = "pre_download_delay_second")
    private Long preDownloadDelaySecond;
    @C6593c(mo15949a = "pre_download_start_time")
    private Integer preDownloadStartTime;
    @C6593c(mo15949a = "pre_download_version")
    private Integer preDownloadVersion;
    @C6593c(mo15949a = "teens_mode_alert_count")
    private Integer teensModeAlertCount;
    @C6593c(mo15949a = "teens_mode_match_alert_switch")
    private Boolean teensModeMatchAlertSwitch;
    @C6593c(mo15949a = "update_sdk")
    private Integer updateSdk;
    @C6593c(mo15949a = "user_badge_click_settings")
    private C10976a userBadgeClickSettings;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$a */
    public static final class C10976a {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$b */
    public static final class C10977b {
        @C6593c(mo15949a = "can_be_obs_live_podcast")

        /* renamed from: a */
        public Boolean f29685a;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$c */
    public static final class C10978c {
        @C6593c(mo15949a = "song_url_list")

        /* renamed from: a */
        public ArrayList<String> f29686a;
        @C6593c(mo15949a = "frame_count")

        /* renamed from: b */
        public Integer f29687b;
        @C6593c(mo15949a = "song_uri")

        /* renamed from: c */
        public String f29688c;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$d */
    public static final class C10979d {
        @C6593c(mo15949a = "monitor_live_interval_second")

        /* renamed from: a */
        public Integer f29689a;
        @C6593c(mo15949a = "enable_upload_unactive_apps")

        /* renamed from: b */
        public Boolean f29690b;
        @C6593c(mo15949a = "upload_unactive_app_packages")

        /* renamed from: c */
        public ArrayList<String> f29691c;
        @C6593c(mo15949a = "default_send_data_interval")

        /* renamed from: d */
        public Integer f29692d;
        @C6593c(mo15949a = "max_send_start_info_num")

        /* renamed from: e */
        public Integer f29693e;
        @C6593c(mo15949a = "is_monitor_alive_enable")

        /* renamed from: f */
        public Integer f29694f;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$e */
    public static final class C10980e {
        @C6593c(mo15949a = "other_info_enable")

        /* renamed from: a */
        public Integer f29695a;
        @C6593c(mo15949a = "get_phone_enable")

        /* renamed from: b */
        public Integer f29696b;
        @C6593c(mo15949a = "tt_get_mobile_retry_times")

        /* renamed from: c */
        public Integer f29697c;
        @C6593c(mo15949a = "enable_al")

        /* renamed from: d */
        public Integer f29698d;
        @C6593c(mo15949a = "get_mobile_delay")

        /* renamed from: e */
        public Integer f29699e;
    }

    public final C10977b getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final C10978c getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final C10979d getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final C10980e getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final C10976a getUserBadgeClickSettings() {
        return this.userBadgeClickSettings;
    }

    public final void setAwemeLivePodcast(C10977b bVar) {
        this.awemeLivePodcast = bVar;
    }

    public final void setAwemeMusicAilab(C10978c cVar) {
        this.awemeMusicAilab = cVar;
    }

    public final void setAwemePushMonitorConfig(C10979d dVar) {
        this.awemePushMonitorConfig = dVar;
    }

    public final void setAwemeUniqueidSettings(C10980e eVar) {
        this.awemeUniqueidSettings = eVar;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l) {
        this.preDownloadDelaySecond = l;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }

    public final void setUserBadgeClickSettings(C10976a aVar) {
        this.userBadgeClickSettings = aVar;
    }
}
