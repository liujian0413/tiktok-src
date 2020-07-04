package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10294b;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.share.C37969ah;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy */
public final class IESSettingsProxy {
    private final C10294b hook;
    private final IESSettings rawValue;

    public final IESSettings getSettings() {
        return this.rawValue;
    }

    public final Boolean getAbmockKevaSwitch() {
        if (this.hook == null) {
            return this.rawValue.getAbmockKevaSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "abmock_keva_switch", Boolean.class, (T) this.rawValue.getAbmockKevaSwitch());
    }

    public final String getAdTrackerConfig() {
        if (this.hook == null) {
            return this.rawValue.getAdTrackerConfig();
        }
        return (String) getProxyValue(this.hook, "ad_tracker_config", String.class, (T) this.rawValue.getAdTrackerConfig());
    }

    public final Integer getAddDeviceFingerprintOpen() {
        if (this.hook == null) {
            return this.rawValue.getAddDeviceFingerprintOpen();
        }
        return (Integer) getProxyValue(this.hook, "add_device_fingerprint_open", Integer.class, (T) this.rawValue.getAddDeviceFingerprintOpen());
    }

    public final Boolean getAllowLongVideo() {
        if (this.hook == null) {
            return this.rawValue.getAllowLongVideo();
        }
        return (Boolean) getProxyValue(this.hook, "allow_long_video", Boolean.class, (T) this.rawValue.getAllowLongVideo());
    }

    public final Integer getAllowLongVideoThreshold() {
        if (this.hook == null) {
            return this.rawValue.getAllowLongVideoThreshold();
        }
        return (Integer) getProxyValue(this.hook, "allow_long_video_threshold", Integer.class, (T) this.rawValue.getAllowLongVideoThreshold());
    }

    public final List<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting> getAndroidSourceUrl() {
        if (this.hook == null) {
            return this.rawValue.getAndroidSourceUrl();
        }
        return getProxyValue(this.hook, "android_source_url", com_ss_android_ugc_aweme_settings_RnSourceUrlSetting.class, this.rawValue.getAndroidSourceUrl());
    }

    public final Integer getAntiAddictionDayTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionDayTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_day_time", Integer.class, (T) this.rawValue.getAntiAddictionDayTime());
    }

    public final Integer getAntiAddictionNightTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionNightTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_night_time", Integer.class, (T) this.rawValue.getAntiAddictionNightTime());
    }

    public final String getAntiAddictionPopUpText() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionPopUpText();
        }
        return (String) getProxyValue(this.hook, "anti_addiction_pop_up_text", String.class, (T) this.rawValue.getAntiAddictionPopUpText());
    }

    public final Integer getAntiAddictionSeparation() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionSeparation();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_separation", Integer.class, (T) this.rawValue.getAntiAddictionSeparation());
    }

    public final Integer getAntiAddictionToastTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionToastTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_toast_time", Integer.class, (T) this.rawValue.getAntiAddictionToastTime());
    }

    public final List<String> getApiAlogWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getApiAlogWhiteList();
        }
        return getProxyValue(this.hook, "api_alog_white_list", String.class, this.rawValue.getApiAlogWhiteList());
    }

    public final List<String> getAwemeAdLinkPriority() {
        if (this.hook == null) {
            return this.rawValue.getAwemeAdLinkPriority();
        }
        return getProxyValue(this.hook, "aweme_ad_link_priority", String.class, this.rawValue.getAwemeAdLinkPriority());
    }

    public final List<String> getAwemeGeckoOfflineHostPrefix() {
        if (this.hook == null) {
            return this.rawValue.getAwemeGeckoOfflineHostPrefix();
        }
        return getProxyValue(this.hook, "aweme_gecko_offline_host_prefix", String.class, this.rawValue.getAwemeGeckoOfflineHostPrefix());
    }

    public final List<String> getAwemeHighRiskAreaCode() {
        if (this.hook == null) {
            return this.rawValue.getAwemeHighRiskAreaCode();
        }
        return getProxyValue(this.hook, "aweme_high_risk_area_code", String.class, this.rawValue.getAwemeHighRiskAreaCode());
    }

    public final Boolean getAwesomeSplashForceUseH264() {
        if (this.hook == null) {
            return this.rawValue.getAwesomeSplashForceUseH264();
        }
        return (Boolean) getProxyValue(this.hook, "awesome_splash_force_use_h264", Boolean.class, (T) this.rawValue.getAwesomeSplashForceUseH264());
    }

    public final List<String> getBindFgGuideTexts() {
        if (this.hook == null) {
            return this.rawValue.getBindFgGuideTexts();
        }
        return getProxyValue(this.hook, "bind_fg_guide_texts", String.class, this.rawValue.getBindFgGuideTexts());
    }

    public final String getBusinessEshopManager() {
        if (this.hook == null) {
            return this.rawValue.getBusinessEshopManager();
        }
        return (String) getProxyValue(this.hook, "business_eshop_manager", String.class, (T) this.rawValue.getBusinessEshopManager());
    }

    public final List<String> getCacheCleanDefaultWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getCacheCleanDefaultWhiteList();
        }
        return getProxyValue(this.hook, "cache_clean_default_white_list", String.class, this.rawValue.getCacheCleanDefaultWhiteList());
    }

    public final Integer getCategoryVersion() {
        if (this.hook == null) {
            return this.rawValue.getCategoryVersion();
        }
        return (Integer) getProxyValue(this.hook, "category_version", Integer.class, (T) this.rawValue.getCategoryVersion());
    }

    public final Integer getChangeNetworkClient() {
        if (this.hook == null) {
            return this.rawValue.getChangeNetworkClient();
        }
        return (Integer) getProxyValue(this.hook, "change_network_client", Integer.class, (T) this.rawValue.getChangeNetworkClient());
    }

    public final List<OriginChannelTab> getChannelTabs() {
        if (this.hook == null) {
            return this.rawValue.getChannelTabs();
        }
        return getProxyValue(this.hook, "channel_tabs", OriginChannelTab.class, this.rawValue.getChannelTabs());
    }

    public final Integer getCheckLarkInhouseNet() {
        if (this.hook == null) {
            return this.rawValue.getCheckLarkInhouseNet();
        }
        return (Integer) getProxyValue(this.hook, "check_lark_inhouse_net", Integer.class, (T) this.rawValue.getCheckLarkInhouseNet());
    }

    public final Integer getCloseLoginAgreement() {
        if (this.hook == null) {
            return this.rawValue.getCloseLoginAgreement();
        }
        return (Integer) getProxyValue(this.hook, "close_login_agreement", Integer.class, (T) this.rawValue.getCloseLoginAgreement());
    }

    public final Integer getContentLangLimit() {
        if (this.hook == null) {
            return this.rawValue.getContentLangLimit();
        }
        return (Integer) getProxyValue(this.hook, "content_lang_limit", Integer.class, (T) this.rawValue.getContentLangLimit());
    }

    public final List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        if (this.hook == null) {
            return this.rawValue.getContentLanguageGuideCodes();
        }
        return getProxyValue(this.hook, "content_language_guide_codes", ContentLanguageGuideSetting.class, this.rawValue.getContentLanguageGuideCodes());
    }

    public final String getCouponVerificationList() {
        if (this.hook == null) {
            return this.rawValue.getCouponVerificationList();
        }
        return (String) getProxyValue(this.hook, "coupon_verification_list", String.class, (T) this.rawValue.getCouponVerificationList());
    }

    public final List<String> getDefaultAvatarUris() {
        if (this.hook == null) {
            return this.rawValue.getDefaultAvatarUris();
        }
        return getProxyValue(this.hook, "default_avatar_uris", String.class, this.rawValue.getDefaultAvatarUris());
    }

    public final List<UrlModel> getDefaultCoverUrls() {
        if (this.hook == null) {
            return this.rawValue.getDefaultCoverUrls();
        }
        return getProxyValue(this.hook, "default_cover_urls", UrlModel.class, this.rawValue.getDefaultCoverUrls());
    }

    public final Boolean getDisableVastBitrate() {
        if (this.hook == null) {
            return this.rawValue.getDisableVastBitrate();
        }
        return (Boolean) getProxyValue(this.hook, "disable_vast_bitrate", Boolean.class, (T) this.rawValue.getDisableVastBitrate());
    }

    public final List<com_ss_android_ugc_aweme_settings_DislikeReason> getDislikeReasons() {
        if (this.hook == null) {
            return this.rawValue.getDislikeReasons();
        }
        return getProxyValue(this.hook, "dislike_reasons", com_ss_android_ugc_aweme_settings_DislikeReason.class, this.rawValue.getDislikeReasons());
    }

    public final List<String> getDmtJsbridgeWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getDmtJsbridgeWhitelist();
        }
        return getProxyValue(this.hook, "dmt_jsbridge_whitelist", String.class, this.rawValue.getDmtJsbridgeWhitelist());
    }

    public final List<String> getDmtSourceUrlWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getDmtSourceUrlWhitelist();
        }
        return getProxyValue(this.hook, "dmt_source_url_whitelist", String.class, this.rawValue.getDmtSourceUrlWhitelist());
    }

    public final String getDoulabUseInformationUrl() {
        if (this.hook == null) {
            return this.rawValue.getDoulabUseInformationUrl();
        }
        return (String) getProxyValue(this.hook, "doulab_use_information_url", String.class, (T) this.rawValue.getDoulabUseInformationUrl());
    }

    public final Integer getDouplusEntryFeed() {
        if (this.hook == null) {
            return this.rawValue.getDouplusEntryFeed();
        }
        return (Integer) getProxyValue(this.hook, "douplus_entry_feed", Integer.class, (T) this.rawValue.getDouplusEntryFeed());
    }

    public final List<DouplusTextStruct> getDouplusEntryTitle() {
        if (this.hook == null) {
            return this.rawValue.getDouplusEntryTitle();
        }
        return getProxyValue(this.hook, "douplus_entry_title", DouplusTextStruct.class, this.rawValue.getDouplusEntryTitle());
    }

    public final Integer getEditEffectAutoDownloadSize() {
        if (this.hook == null) {
            return this.rawValue.getEditEffectAutoDownloadSize();
        }
        return (Integer) getProxyValue(this.hook, "edit_effect_auto_download_size", Integer.class, (T) this.rawValue.getEditEffectAutoDownloadSize());
    }

    public final List<TextFontStyleData> getEffectFontList() {
        if (this.hook == null) {
            return this.rawValue.getEffectFontList();
        }
        return getProxyValue(this.hook, "effect_font_list", TextFontStyleData.class, this.rawValue.getEffectFontList());
    }

    public final Boolean getEnableAdPlayfunMonitorLog() {
        if (this.hook == null) {
            return this.rawValue.getEnableAdPlayfunMonitorLog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_ad_playfun_monitor_log", Boolean.class, (T) this.rawValue.getEnableAdPlayfunMonitorLog());
    }

    public final Boolean getEnableAvStorageMonitor() {
        if (this.hook == null) {
            return this.rawValue.getEnableAvStorageMonitor();
        }
        return (Boolean) getProxyValue(this.hook, "enable_av_storage_monitor", Boolean.class, (T) this.rawValue.getEnableAvStorageMonitor());
    }

    public final Boolean getEnableCameraBeautifyEffect() {
        if (this.hook == null) {
            return this.rawValue.getEnableCameraBeautifyEffect();
        }
        return (Boolean) getProxyValue(this.hook, "enable_camera_beautify_effect", Boolean.class, (T) this.rawValue.getEnableCameraBeautifyEffect());
    }

    public final Boolean getEnableCommentCreateSticker() {
        if (this.hook == null) {
            return this.rawValue.getEnableCommentCreateSticker();
        }
        return (Boolean) getProxyValue(this.hook, "enable_comment_create_sticker", Boolean.class, (T) this.rawValue.getEnableCommentCreateSticker());
    }

    public final Boolean getEnableCommerceEggMonitorLog() {
        if (this.hook == null) {
            return this.rawValue.getEnableCommerceEggMonitorLog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_commerce_egg_monitor_log", Boolean.class, (T) this.rawValue.getEnableCommerceEggMonitorLog());
    }

    public final Integer getEnableCoverEffect() {
        if (this.hook == null) {
            return this.rawValue.getEnableCoverEffect();
        }
        return (Integer) getProxyValue(this.hook, "enable_cover_effect", Integer.class, (T) this.rawValue.getEnableCoverEffect());
    }

    public final Integer getEnableEmailVerification() {
        if (this.hook == null) {
            return this.rawValue.getEnableEmailVerification();
        }
        return (Integer) getProxyValue(this.hook, "enable_email_verification", Integer.class, (T) this.rawValue.getEnableEmailVerification());
    }

    public final Boolean getEnableHighRiskRebindAlert() {
        if (this.hook == null) {
            return this.rawValue.getEnableHighRiskRebindAlert();
        }
        return (Boolean) getProxyValue(this.hook, "enable_high_risk_rebind_alert", Boolean.class, (T) this.rawValue.getEnableHighRiskRebindAlert());
    }

    public final Boolean getEnableLiveDrawerDialog() {
        if (this.hook == null) {
            return this.rawValue.getEnableLiveDrawerDialog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_live_drawer_dialog", Boolean.class, (T) this.rawValue.getEnableLiveDrawerDialog());
    }

    public final Boolean getEnableLiveSplash() {
        if (this.hook == null) {
            return this.rawValue.getEnableLiveSplash();
        }
        return (Boolean) getProxyValue(this.hook, "enable_live_splash", Boolean.class, (T) this.rawValue.getEnableLiveSplash());
    }

    public final Integer getEnableMusicDownloadHttps() {
        if (this.hook == null) {
            return this.rawValue.getEnableMusicDownloadHttps();
        }
        return (Integer) getProxyValue(this.hook, "enable_music_download_https", Integer.class, (T) this.rawValue.getEnableMusicDownloadHttps());
    }

    public final Integer getEnableMusicOvertimeDetect() {
        if (this.hook == null) {
            return this.rawValue.getEnableMusicOvertimeDetect();
        }
        return (Integer) getProxyValue(this.hook, "enable_music_overtime_detect", Integer.class, (T) this.rawValue.getEnableMusicOvertimeDetect());
    }

    public final Boolean getEnableNewPhoneBindFlow() {
        if (this.hook == null) {
            return this.rawValue.getEnableNewPhoneBindFlow();
        }
        return (Boolean) getProxyValue(this.hook, "enable_new_phone_bind_flow", Boolean.class, (T) this.rawValue.getEnableNewPhoneBindFlow());
    }

    public final Boolean getEnableNewUserInfoSync() {
        if (this.hook == null) {
            return this.rawValue.getEnableNewUserInfoSync();
        }
        return (Boolean) getProxyValue(this.hook, "enable_new_user_info_sync", Boolean.class, (T) this.rawValue.getEnableNewUserInfoSync());
    }

    public final Boolean getEnableNormalSplashAd() {
        if (this.hook == null) {
            return this.rawValue.getEnableNormalSplashAd();
        }
        return (Boolean) getProxyValue(this.hook, "enable_normal_splash_ad", Boolean.class, (T) this.rawValue.getEnableNormalSplashAd());
    }

    public final Boolean getEnablePreloadComponent() {
        if (this.hook == null) {
            return this.rawValue.getEnablePreloadComponent();
        }
        return (Boolean) getProxyValue(this.hook, "enable_preload_component", Boolean.class, (T) this.rawValue.getEnablePreloadComponent());
    }

    public final Boolean getEnablePushAllianceSdk() {
        if (this.hook == null) {
            return this.rawValue.getEnablePushAllianceSdk();
        }
        return (Boolean) getProxyValue(this.hook, "enable_push_alliance_sdk", Boolean.class, (T) this.rawValue.getEnablePushAllianceSdk());
    }

    public final Boolean getEnableUseGameRotationSensor() {
        if (this.hook == null) {
            return this.rawValue.getEnableUseGameRotationSensor();
        }
        return (Boolean) getProxyValue(this.hook, "enable_use_game_rotation_sensor", Boolean.class, (T) this.rawValue.getEnableUseGameRotationSensor());
    }

    public final Integer getEnableYoutubeAppAuth() {
        if (this.hook == null) {
            return this.rawValue.getEnableYoutubeAppAuth();
        }
        return (Integer) getProxyValue(this.hook, "enable_youtube_app_auth", Integer.class, (T) this.rawValue.getEnableYoutubeAppAuth());
    }

    public final Integer getFeedFindBugSetting() {
        if (this.hook == null) {
            return this.rawValue.getFeedFindBugSetting();
        }
        return (Integer) getProxyValue(this.hook, "feed_find_bug_setting", Integer.class, (T) this.rawValue.getFeedFindBugSetting());
    }

    public final Integer getFeedVideoViewResizeStrategy() {
        if (this.hook == null) {
            return this.rawValue.getFeedVideoViewResizeStrategy();
        }
        return (Integer) getProxyValue(this.hook, "feed_video_view_resize_strategy", Integer.class, (T) this.rawValue.getFeedVideoViewResizeStrategy());
    }

    public final List<String> getFilterColors() {
        if (this.hook == null) {
            return this.rawValue.getFilterColors();
        }
        return getProxyValue(this.hook, "filter_colors", String.class, this.rawValue.getFilterColors());
    }

    public final Integer getFirstInstallTime() {
        if (this.hook == null) {
            return this.rawValue.getFirstInstallTime();
        }
        return (Integer) getProxyValue(this.hook, "first_install_time", Integer.class, (T) this.rawValue.getFirstInstallTime());
    }

    public final Integer getFixDislikeEventSetting() {
        if (this.hook == null) {
            return this.rawValue.getFixDislikeEventSetting();
        }
        return (Integer) getProxyValue(this.hook, "fix_dislike_event_setting", Integer.class, (T) this.rawValue.getFixDislikeEventSetting());
    }

    public final Boolean getForbidVoiceChangeOnEditPage() {
        if (this.hook == null) {
            return this.rawValue.getForbidVoiceChangeOnEditPage();
        }
        return (Boolean) getProxyValue(this.hook, "forbid_voice_change_on_edit_page", Boolean.class, (T) this.rawValue.getForbidVoiceChangeOnEditPage());
    }

    public final List<DeviceInfo> getForceUseTextureview() {
        if (this.hook == null) {
            return this.rawValue.getForceUseTextureview();
        }
        return getProxyValue(this.hook, "force_use_textureview", DeviceInfo.class, this.rawValue.getForceUseTextureview());
    }

    public final Boolean getFreshAnimation() {
        if (this.hook == null) {
            return this.rawValue.getFreshAnimation();
        }
        return (Boolean) getProxyValue(this.hook, "fresh_animation", Boolean.class, (T) this.rawValue.getFreshAnimation());
    }

    public final Integer getGuideSearchItemLen() {
        if (this.hook == null) {
            return this.rawValue.getGuideSearchItemLen();
        }
        return (Integer) getProxyValue(this.hook, "guide_search_item_len", Integer.class, (T) this.rawValue.getGuideSearchItemLen());
    }

    public final Boolean getHasWeixinSuppress() {
        if (this.hook == null) {
            return this.rawValue.getHasWeixinSuppress();
        }
        return (Boolean) getProxyValue(this.hook, "has_weixin_suppress", Boolean.class, (T) this.rawValue.getHasWeixinSuppress());
    }

    public final List<String> getHttpsList() {
        if (this.hook == null) {
            return this.rawValue.getHttpsList();
        }
        return getProxyValue(this.hook, "https_list", String.class, this.rawValue.getHttpsList());
    }

    public final AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        if (this.hook == null) {
            return this.rawValue.getImAssociativeEmoticonAll();
        }
        return (AssociativeEmoticonAll) getProxyValue(this.hook, "im_associative_emoticon_all", AssociativeEmoticonAll.class, (T) this.rawValue.getImAssociativeEmoticonAll());
    }

    public final String getImGroupPasswordRegex() {
        if (this.hook == null) {
            return this.rawValue.getImGroupPasswordRegex();
        }
        return (String) getProxyValue(this.hook, "im_group_password_regex", String.class, (T) this.rawValue.getImGroupPasswordRegex());
    }

    public final List<String> getImImageDomains() {
        if (this.hook == null) {
            return this.rawValue.getImImageDomains();
        }
        return getProxyValue(this.hook, "im_image_domains", String.class, this.rawValue.getImImageDomains());
    }

    public final Integer getInappUpdateSwitchStrategy() {
        if (this.hook == null) {
            return this.rawValue.getInappUpdateSwitchStrategy();
        }
        return (Integer) getProxyValue(this.hook, "inapp_update_switch_strategy", Integer.class, (T) this.rawValue.getInappUpdateSwitchStrategy());
    }

    public final Boolean getIsHotUser() {
        if (this.hook == null) {
            return this.rawValue.getIsHotUser();
        }
        return (Boolean) getProxyValue(this.hook, "is_hot_user", Boolean.class, (T) this.rawValue.getIsHotUser());
    }

    public final Boolean getIsLowMemoryMachineForTools() {
        if (this.hook == null) {
            return this.rawValue.getIsLowMemoryMachineForTools();
        }
        return (Boolean) getProxyValue(this.hook, "is_low_memory_machine_for_tools", Boolean.class, (T) this.rawValue.getIsLowMemoryMachineForTools());
    }

    public final Boolean getKeepCookies() {
        if (this.hook == null) {
            return this.rawValue.getKeepCookies();
        }
        return (Boolean) getProxyValue(this.hook, "keep_cookies", Boolean.class, (T) this.rawValue.getKeepCookies());
    }

    public final Boolean getKeepLobbyCookies() {
        if (this.hook == null) {
            return this.rawValue.getKeepLobbyCookies();
        }
        return (Boolean) getProxyValue(this.hook, "keep_lobby_cookies", Boolean.class, (T) this.rawValue.getKeepLobbyCookies());
    }

    public final List<String> getKevaBlacklist() {
        if (this.hook == null) {
            return this.rawValue.getKevaBlacklist();
        }
        return getProxyValue(this.hook, "keva_blacklist", String.class, this.rawValue.getKevaBlacklist());
    }

    public final Integer getKevaSwitch() {
        if (this.hook == null) {
            return this.rawValue.getKevaSwitch();
        }
        return (Integer) getProxyValue(this.hook, "keva_switch", Integer.class, (T) this.rawValue.getKevaSwitch());
    }

    public final List<String> getLabFeatureIds() {
        if (this.hook == null) {
            return this.rawValue.getLabFeatureIds();
        }
        return getProxyValue(this.hook, "lab_feature_ids", String.class, this.rawValue.getLabFeatureIds());
    }

    public final Integer getLightEnhanceThreshold() {
        if (this.hook == null) {
            return this.rawValue.getLightEnhanceThreshold();
        }
        return (Integer) getProxyValue(this.hook, "light_enhance_threshold", Integer.class, (T) this.rawValue.getLightEnhanceThreshold());
    }

    public final Integer getLiveSquareGuideShowCount() {
        if (this.hook == null) {
            return this.rawValue.getLiveSquareGuideShowCount();
        }
        return (Integer) getProxyValue(this.hook, "live_square_guide_show_count", Integer.class, (T) this.rawValue.getLiveSquareGuideShowCount());
    }

    public final Integer getMinFollowNumForLandingFollowTab() {
        if (this.hook == null) {
            return this.rawValue.getMinFollowNumForLandingFollowTab();
        }
        return (Integer) getProxyValue(this.hook, "min_follow_num_for_landing_follow_tab", Integer.class, (T) this.rawValue.getMinFollowNumForLandingFollowTab());
    }

    public final Boolean getMiniappWonderlandEnable() {
        if (this.hook == null) {
            return this.rawValue.getMiniappWonderlandEnable();
        }
        return (Boolean) getProxyValue(this.hook, "miniapp_wonderland_enable", Boolean.class, (T) this.rawValue.getMiniappWonderlandEnable());
    }

    public final Integer getMixPermission() {
        if (this.hook == null) {
            return this.rawValue.getMixPermission();
        }
        return (Integer) getProxyValue(this.hook, "mix_permission", Integer.class, (T) this.rawValue.getMixPermission());
    }

    public final Integer getMusicDownloadUseTtnet() {
        if (this.hook == null) {
            return this.rawValue.getMusicDownloadUseTtnet();
        }
        return (Integer) getProxyValue(this.hook, "music_download_use_ttnet", Integer.class, (T) this.rawValue.getMusicDownloadUseTtnet());
    }

    public final Boolean getMuteV1Log() {
        if (this.hook == null) {
            return this.rawValue.getMuteV1Log();
        }
        return (Boolean) getProxyValue(this.hook, "mute_v1_log", Boolean.class, (T) this.rawValue.getMuteV1Log());
    }

    public final List<String> getNeedChooseLanguages() {
        if (this.hook == null) {
            return this.rawValue.getNeedChooseLanguages();
        }
        return getProxyValue(this.hook, "need_choose_languages", String.class, this.rawValue.getNeedChooseLanguages());
    }

    public final Integer getNonFeedVideoViewResizeStrategy() {
        if (this.hook == null) {
            return this.rawValue.getNonFeedVideoViewResizeStrategy();
        }
        return (Integer) getProxyValue(this.hook, "non_feed_video_view_resize_strategy", Integer.class, (T) this.rawValue.getNonFeedVideoViewResizeStrategy());
    }

    public final List<DeviceInfo> getNotSupportDouDevices() {
        if (this.hook == null) {
            return this.rawValue.getNotSupportDouDevices();
        }
        return getProxyValue(this.hook, "not_support_dou_devices", DeviceInfo.class, this.rawValue.getNotSupportDouDevices());
    }

    public final List<String> getOldStyleChallengeIds() {
        if (this.hook == null) {
            return this.rawValue.getOldStyleChallengeIds();
        }
        return getProxyValue(this.hook, "old_style_challenge_ids", String.class, this.rawValue.getOldStyleChallengeIds());
    }

    public final List<Integer> getOneBindNetSetting() {
        if (this.hook == null) {
            return this.rawValue.getOneBindNetSetting();
        }
        return getProxyValue(this.hook, "one_bind_net_setting", Integer.class, this.rawValue.getOneBindNetSetting());
    }

    public final List<Integer> getOtherProfileLandingTabs() {
        if (this.hook == null) {
            return this.rawValue.getOtherProfileLandingTabs();
        }
        return getProxyValue(this.hook, "other_profile_landing_tabs", Integer.class, this.rawValue.getOtherProfileLandingTabs());
    }

    public final Integer getPlayermanagerBackgroundCheck() {
        if (this.hook == null) {
            return this.rawValue.getPlayermanagerBackgroundCheck();
        }
        return (Integer) getProxyValue(this.hook, "playermanager_background_check", Integer.class, (T) this.rawValue.getPlayermanagerBackgroundCheck());
    }

    public final Boolean getPostDownloadSetting() {
        if (this.hook == null) {
            return this.rawValue.getPostDownloadSetting();
        }
        return (Boolean) getProxyValue(this.hook, "post_download_setting", Boolean.class, (T) this.rawValue.getPostDownloadSetting());
    }

    public final List<String> getPreloadMicroAppList() {
        if (this.hook == null) {
            return this.rawValue.getPreloadMicroAppList();
        }
        return getProxyValue(this.hook, "preload_micro_app_list", String.class, this.rawValue.getPreloadMicroAppList());
    }

    public final String getPriorityRegion() {
        if (this.hook == null) {
            return this.rawValue.getPriorityRegion();
        }
        return (String) getProxyValue(this.hook, "priority_region", String.class, (T) this.rawValue.getPriorityRegion());
    }

    public final Integer getPushdelayinitSwitch() {
        if (this.hook == null) {
            return this.rawValue.getPushdelayinitSwitch();
        }
        return (Integer) getProxyValue(this.hook, "pushdelayinit_switch", Integer.class, (T) this.rawValue.getPushdelayinitSwitch());
    }

    public final List<String> getQrcodeDomainWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getQrcodeDomainWhitelist();
        }
        return getProxyValue(this.hook, "qrcode_domain_whitelist", String.class, this.rawValue.getQrcodeDomainWhitelist());
    }

    public final Double getRecommendFixSplashBug() {
        if (this.hook == null) {
            return this.rawValue.getRecommendFixSplashBug();
        }
        return (Double) getProxyValue(this.hook, "recommend_fix_splash_bug", Double.class, (T) this.rawValue.getRecommendFixSplashBug());
    }

    public final Boolean getRefreshFeedDelHistory() {
        if (this.hook == null) {
            return this.rawValue.getRefreshFeedDelHistory();
        }
        return (Boolean) getProxyValue(this.hook, "refresh_feed_del_history", Boolean.class, (T) this.rawValue.getRefreshFeedDelHistory());
    }

    public final Long getReusePhoneCheckInterval() {
        if (this.hook == null) {
            return this.rawValue.getReusePhoneCheckInterval();
        }
        return (Long) getProxyValue(this.hook, "reuse_phone_check_interval", Long.class, (T) this.rawValue.getReusePhoneCheckInterval());
    }

    public final Long getSafeInfoNoticeFrequency() {
        if (this.hook == null) {
            return this.rawValue.getSafeInfoNoticeFrequency();
        }
        return (Long) getProxyValue(this.hook, "safe_info_notice_frequency", Long.class, (T) this.rawValue.getSafeInfoNoticeFrequency());
    }

    public final Integer getSearchHistoryCollapseNum() {
        if (this.hook == null) {
            return this.rawValue.getSearchHistoryCollapseNum();
        }
        return (Integer) getProxyValue(this.hook, "search_history_collapse_num", Integer.class, (T) this.rawValue.getSearchHistoryCollapseNum());
    }

    public final Integer getSearchMiddleRecommendWordsCount() {
        if (this.hook == null) {
            return this.rawValue.getSearchMiddleRecommendWordsCount();
        }
        return (Integer) getProxyValue(this.hook, "search_middle_recommend_words_count", Integer.class, (T) this.rawValue.getSearchMiddleRecommendWordsCount());
    }

    public final Integer getSearchNewGsStyle() {
        if (this.hook == null) {
            return this.rawValue.getSearchNewGsStyle();
        }
        return (Integer) getProxyValue(this.hook, "search_new_gs_style", Integer.class, (T) this.rawValue.getSearchNewGsStyle());
    }

    public final List<String> getSearchTab() {
        if (this.hook == null) {
            return this.rawValue.getSearchTab();
        }
        return getProxyValue(this.hook, "search_tab", String.class, this.rawValue.getSearchTab());
    }

    public final Integer getSecIdSwitch() {
        if (this.hook == null) {
            return this.rawValue.getSecIdSwitch();
        }
        return (Integer) getProxyValue(this.hook, "sec_id_switch", Integer.class, (T) this.rawValue.getSecIdSwitch());
    }

    public final List<Integer> getSelfProfileLandingTabs() {
        if (this.hook == null) {
            return this.rawValue.getSelfProfileLandingTabs();
        }
        return getProxyValue(this.hook, "self_profile_landing_tabs", Integer.class, this.rawValue.getSelfProfileLandingTabs());
    }

    public final Boolean getShareDownloadDisabled() {
        if (this.hook == null) {
            return this.rawValue.getShareDownloadDisabled();
        }
        return (Boolean) getProxyValue(this.hook, "share_download_disabled", Boolean.class, (T) this.rawValue.getShareDownloadDisabled());
    }

    public final Double getShareDownloadDisabledEndtime() {
        if (this.hook == null) {
            return this.rawValue.getShareDownloadDisabledEndtime();
        }
        return (Double) getProxyValue(this.hook, "share_download_disabled_endtime", Double.class, (T) this.rawValue.getShareDownloadDisabledEndtime());
    }

    public final List<String> getShareH5UrlWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getShareH5UrlWhitelist();
        }
        return getProxyValue(this.hook, "share_h5_url_whitelist", String.class, this.rawValue.getShareH5UrlWhitelist());
    }

    public final Integer getShowCreatorRewards() {
        if (this.hook == null) {
            return this.rawValue.getShowCreatorRewards();
        }
        return (Integer) getProxyValue(this.hook, "show_creator_rewards", Integer.class, (T) this.rawValue.getShowCreatorRewards());
    }

    public final Integer getShowDeviceManagerEntry() {
        if (this.hook == null) {
            return this.rawValue.getShowDeviceManagerEntry();
        }
        return (Integer) getProxyValue(this.hook, "show_device_manager_entry", Integer.class, (T) this.rawValue.getShowDeviceManagerEntry());
    }

    public final Boolean getShowDoulabEntrance() {
        if (this.hook == null) {
            return this.rawValue.getShowDoulabEntrance();
        }
        return (Boolean) getProxyValue(this.hook, "show_doulab_entrance", Boolean.class, (T) this.rawValue.getShowDoulabEntrance());
    }

    public final Boolean getShowPreventDownload() {
        if (this.hook == null) {
            return this.rawValue.getShowPreventDownload();
        }
        return (Boolean) getProxyValue(this.hook, "show_prevent_download", Boolean.class, (T) this.rawValue.getShowPreventDownload());
    }

    public final List<WhatsAppCodeItem> getShowWhatsappByCallingCode() {
        if (this.hook == null) {
            return this.rawValue.getShowWhatsappByCallingCode();
        }
        return getProxyValue(this.hook, "show_whatsapp_by_calling_code", WhatsAppCodeItem.class, this.rawValue.getShowWhatsappByCallingCode());
    }

    public final List<ShareChannelSettings> getSilentShareList() {
        if (this.hook == null) {
            return this.rawValue.getSilentShareList();
        }
        return getProxyValue(this.hook, "silent_share_list", ShareChannelSettings.class, this.rawValue.getSilentShareList());
    }

    public final List<String> getSplashSwitchServerList() {
        if (this.hook == null) {
            return this.rawValue.getSplashSwitchServerList();
        }
        return getProxyValue(this.hook, "splash_switch_server_list", String.class, this.rawValue.getSplashSwitchServerList());
    }

    public final Boolean getStickerUpdateApp() {
        if (this.hook == null) {
            return this.rawValue.getStickerUpdateApp();
        }
        return (Boolean) getProxyValue(this.hook, "sticker_update_app", Boolean.class, (T) this.rawValue.getStickerUpdateApp());
    }

    public final Boolean getSupportFilterErrorFile() {
        if (this.hook == null) {
            return this.rawValue.getSupportFilterErrorFile();
        }
        return (Boolean) getProxyValue(this.hook, "support_filter_error_file", Boolean.class, (T) this.rawValue.getSupportFilterErrorFile());
    }

    public final List<Integer> getThirdpartyLoginBindSkip() {
        if (this.hook == null) {
            return this.rawValue.getThirdpartyLoginBindSkip();
        }
        return getProxyValue(this.hook, "thirdparty_login_bind_skip", Integer.class, this.rawValue.getThirdpartyLoginBindSkip());
    }

    public final String getTtRegions() {
        if (this.hook == null) {
            return this.rawValue.getTtRegions();
        }
        return (String) getProxyValue(this.hook, "tt_regions", String.class, (T) this.rawValue.getTtRegions());
    }

    public final List<String> getTtnetInterceptWebviewBlackList() {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewBlackList();
        }
        return getProxyValue(this.hook, "ttnet_intercept_webview_black_list", String.class, this.rawValue.getTtnetInterceptWebviewBlackList());
    }

    public final List<String> getTtnetInterceptWebviewWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewWhiteList();
        }
        return getProxyValue(this.hook, "ttnet_intercept_webview_white_list", String.class, this.rawValue.getTtnetInterceptWebviewWhiteList());
    }

    public final Boolean getUgDiffDownloadReportOnlyDiff() {
        if (this.hook == null) {
            return this.rawValue.getUgDiffDownloadReportOnlyDiff();
        }
        return (Boolean) getProxyValue(this.hook, "ug_diff_download_report_only_diff", Boolean.class, (T) this.rawValue.getUgDiffDownloadReportOnlyDiff());
    }

    public final Boolean getUgDiffDownloadUnreportExtra() {
        if (this.hook == null) {
            return this.rawValue.getUgDiffDownloadUnreportExtra();
        }
        return (Boolean) getProxyValue(this.hook, "ug_diff_download_unreport_extra", Boolean.class, (T) this.rawValue.getUgDiffDownloadUnreportExtra());
    }

    public final String getUgSecLinkUrl() {
        if (this.hook == null) {
            return this.rawValue.getUgSecLinkUrl();
        }
        return (String) getProxyValue(this.hook, "ug_sec_link_url", String.class, (T) this.rawValue.getUgSecLinkUrl());
    }

    public final Integer getUgShareWebviewSecLevel() {
        if (this.hook == null) {
            return this.rawValue.getUgShareWebviewSecLevel();
        }
        return (Integer) getProxyValue(this.hook, "ug_share_webview_sec_level", Integer.class, (T) this.rawValue.getUgShareWebviewSecLevel());
    }

    public final List<String> getUploadVideoSizeCategory() {
        if (this.hook == null) {
            return this.rawValue.getUploadVideoSizeCategory();
        }
        return getProxyValue(this.hook, "upload_video_size_category", String.class, this.rawValue.getUploadVideoSizeCategory());
    }

    public final Boolean getUseDownloaderForVideo() {
        if (this.hook == null) {
            return this.rawValue.getUseDownloaderForVideo();
        }
        return (Boolean) getProxyValue(this.hook, "use_downloader_for_video", Boolean.class, (T) this.rawValue.getUseDownloaderForVideo());
    }

    public final Boolean getUseNewSplashView() {
        if (this.hook == null) {
            return this.rawValue.getUseNewSplashView();
        }
        return (Boolean) getProxyValue(this.hook, "use_new_splash_view", Boolean.class, (T) this.rawValue.getUseNewSplashView());
    }

    public final Boolean getUseTtnetForDownloader() {
        if (this.hook == null) {
            return this.rawValue.getUseTtnetForDownloader();
        }
        return (Boolean) getProxyValue(this.hook, "use_ttnet_for_downloader", Boolean.class, (T) this.rawValue.getUseTtnetForDownloader());
    }

    public final Integer getUseVeImage() {
        if (this.hook == null) {
            return this.rawValue.getUseVeImage();
        }
        return (Integer) getProxyValue(this.hook, "use_ve_image", Integer.class, (T) this.rawValue.getUseVeImage());
    }

    public final Boolean getVeFastImportIgnoreRecode() {
        if (this.hook == null) {
            return this.rawValue.getVeFastImportIgnoreRecode();
        }
        return (Boolean) getProxyValue(this.hook, "ve_fast_import_ignore_recode", Boolean.class, (T) this.rawValue.getVeFastImportIgnoreRecode());
    }

    public final Boolean getVeFastImportIgnoreRecodeForRotation() {
        if (this.hook == null) {
            return this.rawValue.getVeFastImportIgnoreRecodeForRotation();
        }
        return (Boolean) getProxyValue(this.hook, "ve_fast_import_ignore_recode_for_rotation", Boolean.class, (T) this.rawValue.getVeFastImportIgnoreRecodeForRotation());
    }

    public final String getVendorKeyBackUrl() {
        if (this.hook == null) {
            return this.rawValue.getVendorKeyBackUrl();
        }
        return (String) getProxyValue(this.hook, "vendor_key_back_url", String.class, (T) this.rawValue.getVendorKeyBackUrl());
    }

    public final List<Float> getVideoBitrateCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoBitrateCategory();
        }
        return getProxyValue(this.hook, "video_bitrate_category", Float.class, this.rawValue.getVideoBitrateCategory());
    }

    public final List<Integer> getVideoQualityCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoQualityCategory();
        }
        return getProxyValue(this.hook, "video_quality_category", Integer.class, this.rawValue.getVideoQualityCategory());
    }

    public final List<String> getVideoSizeCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoSizeCategory();
        }
        return getProxyValue(this.hook, "video_size_category", String.class, this.rawValue.getVideoSizeCategory());
    }

    public final List<String> getWebviewCacheUrls() {
        if (this.hook == null) {
            return this.rawValue.getWebviewCacheUrls();
        }
        return getProxyValue(this.hook, "webview_cache_urls", String.class, this.rawValue.getWebviewCacheUrls());
    }

    public final String getWikipediaAnchorUrlPlaceholder() {
        if (this.hook == null) {
            return this.rawValue.getWikipediaAnchorUrlPlaceholder();
        }
        return (String) getProxyValue(this.hook, "wikipedia_anchor_url_placeholder", String.class, (T) this.rawValue.getWikipediaAnchorUrlPlaceholder());
    }

    public final Boolean getWithDouplusEntry() {
        if (this.hook == null) {
            return this.rawValue.getWithDouplusEntry();
        }
        return (Boolean) getProxyValue(this.hook, "with_douplus_entry", Boolean.class, (T) this.rawValue.getWithDouplusEntry());
    }

    public final ActivityStruct getActivity() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getActivity();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getActivity();
        } catch (NullValueException unused) {
        }
        ActivityStruct activityStruct = (ActivityStruct) getProxyValue(this.hook, "activity", ActivityStruct.class, (T) obj);
        if (activityStruct != null) {
            return activityStruct;
        }
        throw new NullValueException();
    }

    public final AdCouponConfig getAdCouponConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdCouponConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdCouponConfig();
        } catch (NullValueException unused) {
        }
        AdCouponConfig adCouponConfig = (AdCouponConfig) getProxyValue(this.hook, "ad_coupon_config", AdCouponConfig.class, (T) obj);
        if (adCouponConfig != null) {
            return adCouponConfig;
        }
        throw new NullValueException();
    }

    public final Integer getAdDisplayTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdDisplayTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdDisplayTime();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ad_display_time", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final AdFeSettings getAdFeSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdFeSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdFeSettings();
        } catch (NullValueException unused) {
        }
        AdFeSettings adFeSettings = (AdFeSettings) getProxyValue(this.hook, "ad_fe_settings", AdFeSettings.class, (T) obj);
        if (adFeSettings != null) {
            return adFeSettings;
        }
        throw new NullValueException();
    }

    public final Integer getAdIntroForAdversitserFlag() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdIntroForAdversitserFlag();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdIntroForAdversitserFlag();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ad_intro_for_adversitser_flag", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getAdIntroLandingpageUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdIntroLandingpageUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdIntroLandingpageUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "ad_intro_landingpage_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final AdLandingPageConfig getAdLandingPageConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAdLandingPageConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdLandingPageConfig();
        } catch (NullValueException unused) {
        }
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) getProxyValue(this.hook, "ad_landing_page_config", AdLandingPageConfig.class, (T) obj);
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        throw new NullValueException();
    }

    public final UserAntiAddiction getAddictionSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAddictionSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAddictionSettings();
        } catch (NullValueException unused) {
        }
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) getProxyValue(this.hook, "addiction_settings", UserAntiAddiction.class, (T) obj);
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        throw new NullValueException();
    }

    public final AgeGateSettings getAgeGateSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAgeGateSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAgeGateSettings();
        } catch (NullValueException unused) {
        }
        AgeGateSettings ageGateSettings = (AgeGateSettings) getProxyValue(this.hook, "age_gate_settings", AgeGateSettings.class, (T) obj);
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        throw new NullValueException();
    }

    public final Boolean getAiMusicBackupStrategy() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAiMusicBackupStrategy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAiMusicBackupStrategy();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "ai_music_backup_strategy", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Long getAnchorFetchDelayMillisTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAnchorFetchDelayMillisTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAnchorFetchDelayMillisTime();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "anchor_fetch_delay_millis_time", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Boolean getAntiAddictionToastEnable24hourTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionToastEnable24hourTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAntiAddictionToastEnable24hourTime();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "anti_addiction_toast_enable_24hour_time", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final AppStoreScore getAppGooglePlay() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAppGooglePlay();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAppGooglePlay();
        } catch (NullValueException unused) {
        }
        AppStoreScore appStoreScore = (AppStoreScore) getProxyValue(this.hook, "app_google_play", AppStoreScore.class, (T) obj);
        if (appStoreScore != null) {
            return appStoreScore;
        }
        throw new NullValueException();
    }

    public final AppStoreMessage getAppStoreScore() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAppStoreScore();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAppStoreScore();
        } catch (NullValueException unused) {
        }
        AppStoreMessage appStoreMessage = (AppStoreMessage) getProxyValue(this.hook, "app_store_score", AppStoreMessage.class, (T) obj);
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        throw new NullValueException();
    }

    public final com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl getAssistantSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAssistantSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAssistantSettings();
        } catch (NullValueException unused) {
        }
        com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl = (com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl) getProxyValue(this.hook, "assistant_settings", com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl.class, (T) obj);
        if (com_ss_android_ugc_aweme_notice_api_sp_assistanturl != null) {
            return com_ss_android_ugc_aweme_notice_api_sp_assistanturl;
        }
        throw new NullValueException();
    }

    public final Integer getAtFriendsShowType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAtFriendsShowType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAtFriendsShowType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "at_friends_show_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Long getAutoLiveStateIntervalMills() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAutoLiveStateIntervalMills();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAutoLiveStateIntervalMills();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "auto_live_state_interval_mills", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Boolean getAvDefaultWideMode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAvDefaultWideMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAvDefaultWideMode();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "av_default_wide_mode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getAvatarDecorationEnabled() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAvatarDecorationEnabled();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAvatarDecorationEnabled();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "avatar_decoration_enabled", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getAweNetworkXTokenDisabled() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAweNetworkXTokenDisabled();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAweNetworkXTokenDisabled();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "awe_network_x_token_disabled", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getAweSecurityCenterV2() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAweSecurityCenterV2();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAweSecurityCenterV2();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "awe_security_center_v2", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final UgAwemeActivitySetting getAwemeActivitySetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeActivitySetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeActivitySetting();
        } catch (NullValueException unused) {
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) getProxyValue(this.hook, "aweme_activity_setting", UgAwemeActivitySetting.class, (T) obj);
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        throw new NullValueException();
    }

    public final C30207xa03e9512 getAwemeAdRank() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeAdRank();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeAdRank();
        } catch (NullValueException unused) {
        }
        C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel = (C30207xa03e9512) getProxyValue(this.hook, "aweme_ad_rank", C30207xa03e9512.class, (T) obj);
        if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel != null) {
            return com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel;
        }
        throw new NullValueException();
    }

    public final Boolean getAwemeEnableChinaMobileService() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaMobileService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaMobileService();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_mobile_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getAwemeEnableChinaTelecomService() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaTelecomService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaTelecomService();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_telecom_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getAwemeEnableChinaUnionService() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaUnionService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaUnionService();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_union_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final AwemeFEConfigs getAwemeFeConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeFeConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeFeConf();
        } catch (NullValueException unused) {
        }
        AwemeFEConfigs awemeFEConfigs = (AwemeFEConfigs) getProxyValue(this.hook, "aweme_fe_conf", AwemeFEConfigs.class, (T) obj);
        if (awemeFEConfigs != null) {
            return awemeFEConfigs;
        }
        throw new NullValueException();
    }

    public final AwemeFeEliteItem getAwemeFeElite() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeFeElite();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeFeElite();
        } catch (NullValueException unused) {
        }
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) getProxyValue(this.hook, "aweme_fe_elite", AwemeFeEliteItem.class, (T) obj);
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        throw new NullValueException();
    }

    public final GeckoConfig getAwemeGeckoConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeGeckoConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeGeckoConf();
        } catch (NullValueException unused) {
        }
        GeckoConfig geckoConfig = (GeckoConfig) getProxyValue(this.hook, "aweme_gecko_conf", GeckoConfig.class, (T) obj);
        if (geckoConfig != null) {
            return geckoConfig;
        }
        throw new NullValueException();
    }

    public final Integer getAwemeSwitch1() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeSwitch1();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeSwitch1();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "aweme_switch_1", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getAwemeSwitch2() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwemeSwitch2();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeSwitch2();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "aweme_switch_2", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getAwesomeSplashFilterEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getAwesomeSplashFilterEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwesomeSplashFilterEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "awesome_splash_filter_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getBackgroundPausePlayerSetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getBackgroundPausePlayerSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBackgroundPausePlayerSetting();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "background_pause_player_setting", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getBeautyModel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getBeautyModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBeautyModel();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "beauty_model", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final BioSettings getBioSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getBioSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBioSettings();
        } catch (NullValueException unused) {
        }
        BioSettings bioSettings = (BioSettings) getProxyValue(this.hook, "bio_settings", BioSettings.class, (T) obj);
        if (bioSettings != null) {
            return bioSettings;
        }
        throw new NullValueException();
    }

    public final Integer getBitrateOfRecodeThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getBitrateOfRecodeThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBitrateOfRecodeThreshold();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "bitrate_of_recode_threshold", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getBodyDanceEnabled() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getBodyDanceEnabled();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBodyDanceEnabled();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "body_dance_enabled", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final UserCacheSetting getCacheUserRecommend() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCacheUserRecommend();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCacheUserRecommend();
        } catch (NullValueException unused) {
        }
        UserCacheSetting userCacheSetting = (UserCacheSetting) getProxyValue(this.hook, "cache_user_recommend", UserCacheSetting.class, (T) obj);
        if (userCacheSetting != null) {
            return userCacheSetting;
        }
        throw new NullValueException();
    }

    public final Boolean getCanBeLivePodcast() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCanBeLivePodcast();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCanBeLivePodcast();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "can_be_live_podcast", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getCanDuet() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCanDuet();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCanDuet();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "can_duet", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getCanReact() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCanReact();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCanReact();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "can_react", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getCanShowInsights() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCanShowInsights();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCanShowInsights();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "can_show_insights", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getCleanShareFiles() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCleanShareFiles();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCleanShareFiles();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "clean_share_files", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getCloseSyncToHeloEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCloseSyncToHeloEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCloseSyncToHeloEntry();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "close_sync_to_helo_entry", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getCloseVframeUpload() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCloseVframeUpload();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCloseVframeUpload();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "close_vframe_upload", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getCommentFilterTipsSupported() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCommentFilterTipsSupported();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommentFilterTipsSupported();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "comment_filter_tips_supported", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final CommentListAdMigration getCommentListAdMigration() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCommentListAdMigration();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommentListAdMigration();
        } catch (NullValueException unused) {
        }
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) getProxyValue(this.hook, "comment_list_ad_migration", CommentListAdMigration.class, (T) obj);
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        throw new NullValueException();
    }

    public final Integer getCommentSettingEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCommentSettingEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommentSettingEnable();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "comment_setting_enable", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final CommerceEggConfig getCommerceEggConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCommerceEggConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommerceEggConfig();
        } catch (NullValueException unused) {
        }
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) getProxyValue(this.hook, "commerce_egg_config", CommerceEggConfig.class, (T) obj);
        if (commerceEggConfig != null) {
            return commerceEggConfig;
        }
        throw new NullValueException();
    }

    public final Integer getCommerceUseZhima() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCommerceUseZhima();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommerceUseZhima();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "commerce_use_zhima", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final CompleteProfilePolicy getCompleteProfilePolicy() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCompleteProfilePolicy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCompleteProfilePolicy();
        } catch (NullValueException unused) {
        }
        CompleteProfilePolicy completeProfilePolicy = (CompleteProfilePolicy) getProxyValue(this.hook, "complete_profile_policy", CompleteProfilePolicy.class, (T) obj);
        if (completeProfilePolicy != null) {
            return completeProfilePolicy;
        }
        throw new NullValueException();
    }

    public final ContactUploadUiLimits getContactUploadUiLimits() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getContactUploadUiLimits();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getContactUploadUiLimits();
        } catch (NullValueException unused) {
        }
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) getProxyValue(this.hook, "contact_upload_ui_limits", ContactUploadUiLimits.class, (T) obj);
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        throw new NullValueException();
    }

    public final com_ss_android_ugc_trill_settings_ContentLangDialogContent getContentLangDialog() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getContentLangDialog();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getContentLangDialog();
        } catch (NullValueException unused) {
        }
        com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent = (com_ss_android_ugc_trill_settings_ContentLangDialogContent) getProxyValue(this.hook, "content_lang_dialog", com_ss_android_ugc_trill_settings_ContentLangDialogContent.class, (T) obj);
        if (com_ss_android_ugc_trill_settings_contentlangdialogcontent != null) {
            return com_ss_android_ugc_trill_settings_contentlangdialogcontent;
        }
        throw new NullValueException();
    }

    public final String getCurrentRegion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getCurrentRegion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCurrentRegion();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "current_region", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getDataSaverSetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDataSaverSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDataSaverSetting();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "data_saver_setting", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getDefaultSecondTab() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDefaultSecondTab();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDefaultSecondTab();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "default_second_tab", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDefaultShakeFreeMode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDefaultShakeFreeMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDefaultShakeFreeMode();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "default_shake_free_mode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getDelayGeckoRequestTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDelayGeckoRequestTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDelayGeckoRequestTime();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "delay_gecko_request_time", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getDeviceMonitor() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDeviceMonitor();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDeviceMonitor();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "device_monitor", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getDisableAgeGate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableAgeGate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableAgeGate();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "disable_age_gate", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableChallengeDetailRefactor() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableChallengeDetailRefactor();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableChallengeDetailRefactor();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_challenge_detail_refactor", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayAbSdkRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayAbSdkRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayAbSdkRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_ab_sdk_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayAppAlertRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayAppAlertRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayAppAlertRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_app_alert_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayFetchCommerceSetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchCommerceSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchCommerceSetting();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_commerce_setting", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayFetchSamecityActiveRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchSamecityActiveRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchSamecityActiveRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_samecity_active_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayFetchShareSettingRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchShareSettingRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchShareSettingRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_share_setting_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayFetchUserCacheRecommendRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchUserCacheRecommendRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchUserCacheRecommendRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_user_cache_recommend_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayFetchUserRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchUserRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchUserRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_user_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelaySecReport() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelaySecReport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelaySecReport();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_sec_report", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayTokenBeatRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayTokenBeatRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayTokenBeatRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_token_beat_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDelayWsRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayWsRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayWsRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_ws_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableDvmLinearAllocOpt() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableDvmLinearAllocOpt();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDvmLinearAllocOpt();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_dvm_linear_alloc_opt", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableIidInShareUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableIidInShareUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableIidInShareUrl();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, C37969ah.f98866a, Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableImMessageFullFeedSlide() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableImMessageFullFeedSlide();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableImMessageFullFeedSlide();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_im_message_full_feed_slide", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableOmSdk() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableOmSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableOmSdk();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_om_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableOnlineSmallEmoji() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableOnlineSmallEmoji();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableOnlineSmallEmoji();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_online_small_emoji", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableUcodeInShareUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisableUcodeInShareUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableUcodeInShareUrl();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, C37969ah.f98867b, Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDisallowVastHasAuthor() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDisallowVastHasAuthor();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisallowVastHasAuthor();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disallow_vast_has_author", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getDiscardRefreshTopDsp() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDiscardRefreshTopDsp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDiscardRefreshTopDsp();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "discard_refresh_top_dsp", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getDiscoveryLocationBackgroundUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDiscoveryLocationBackgroundUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDiscoveryLocationBackgroundUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "discovery_location_background_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getDouplusBulletEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDouplusBulletEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouplusBulletEntry();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "douplus_bullet_entry", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getDouyidouThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDouyidouThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouyidouThreshold();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "douyidou_threshold", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final DouyinFeBusiness getDouyinFeBusiness() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDouyinFeBusiness();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouyinFeBusiness();
        } catch (NullValueException unused) {
        }
        DouyinFeBusiness douyinFeBusiness = (DouyinFeBusiness) getProxyValue(this.hook, "douyin_fe_business", DouyinFeBusiness.class, (T) obj);
        if (douyinFeBusiness != null) {
            return douyinFeBusiness;
        }
        throw new NullValueException();
    }

    public final DouyinOrderSetting getDouyinOrder() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDouyinOrder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouyinOrder();
        } catch (NullValueException unused) {
        }
        DouyinOrderSetting douyinOrderSetting = (DouyinOrderSetting) getProxyValue(this.hook, "douyin_order", DouyinOrderSetting.class, (T) obj);
        if (douyinOrderSetting != null) {
            return douyinOrderSetting;
        }
        throw new NullValueException();
    }

    public final Integer getDownloadCheckStatus() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDownloadCheckStatus();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadCheckStatus();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "download_check_status", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getDownloadForbiddenToast() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDownloadForbiddenToast();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadForbiddenToast();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "download_forbidden_toast", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final DownloadSettings getDownloadSdkConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDownloadSdkConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadSdkConfig();
        } catch (NullValueException unused) {
        }
        DownloadSettings downloadSettings = (DownloadSettings) getProxyValue(this.hook, "download_sdk_config", DownloadSettings.class, (T) obj);
        if (downloadSettings != null) {
            return downloadSettings;
        }
        throw new NullValueException();
    }

    public final Boolean getDownloadSettingDescEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDownloadSettingDescEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadSettingDescEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "download_setting_desc_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getDownloadSettingEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDownloadSettingEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadSettingEnable();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "download_setting_enable", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getDraftUseMultiVideoEdit() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDraftUseMultiVideoEdit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDraftUseMultiVideoEdit();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "draft_use_multi_video_edit", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle getDynamicSearchResultTabTitle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getDynamicSearchResultTabTitle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDynamicSearchResultTabTitle();
        } catch (NullValueException unused) {
        }
        com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle = (com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle) getProxyValue(this.hook, "dynamic_search_result_tab_title", com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle.class, (T) obj);
        if (com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle != null) {
            return com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle;
        }
        throw new NullValueException();
    }

    public final EPlatformSettings getEPlatformSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEPlatformSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEPlatformSettings();
        } catch (NullValueException unused) {
        }
        EPlatformSettings ePlatformSettings = (EPlatformSettings) getProxyValue(this.hook, "e_platform_settings", EPlatformSettings.class, (T) obj);
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        throw new NullValueException();
    }

    public final Boolean getEffectNeedCdn() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEffectNeedCdn();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEffectNeedCdn();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "effect_need_cdn", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getEffectSdkConfigSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEffectSdkConfigSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEffectSdkConfigSettings();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "effect_sdk_config_settings", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final EmailLoginSettings getEmailLoginSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEmailLoginSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEmailLoginSettings();
        } catch (NullValueException unused) {
        }
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) getProxyValue(this.hook, "email_login_settings", EmailLoginSettings.class, (T) obj);
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        throw new NullValueException();
    }

    public final Integer getEnable1080pFastImport() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnable1080pFastImport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnable1080pFastImport();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_1080p_fast_import", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getEnable4kImport() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnable4kImport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnable4kImport();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_4k_import", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAdRouter() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAdRouter();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAdRouter();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_ad_router", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAnchorCache() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAnchorCache();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAnchorCache();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_anchor_cache", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAntiAliasing() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAntiAliasing();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAntiAliasing();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_anti_aliasing", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableAppInnerUpdate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAppInnerUpdate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAppInnerUpdate();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_app_inner_update", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAudioAutoPlay() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAudioAutoPlay();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAudioAutoPlay();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_audio_auto_play", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAutoLiveState() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAutoLiveState();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAutoLiveState();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_auto_live_state", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableAutoRetryRecord() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableAutoRetryRecord();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAutoRetryRecord();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_auto_retry_record", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableCommentOffensiveFilterSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableCommentOffensiveFilterSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableCommentOffensiveFilterSwitch();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_comment_offensive_filter_switch", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableCommerceOrder() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableCommerceOrder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableCommerceOrder();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_commerce_order", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDelayRequest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableDelayRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDelayRequest();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_delay_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDisplayFavoriteMiniapp() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableDisplayFavoriteMiniapp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDisplayFavoriteMiniapp();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_display_favorite_miniapp", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDisplayFavoriteMinigame() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableDisplayFavoriteMinigame();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDisplayFavoriteMinigame();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_display_favorite_minigame", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDouyidouAndShake() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableDouyidouAndShake();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDouyidouAndShake();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_douyidou_and_shake", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDownloadTtData() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableDownloadTtData();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDownloadTtData();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_download_tt_data", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableEmailLogin() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableEmailLogin();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableEmailLogin();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_email_login", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableEnterLiveRoomStreamOpt() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableEnterLiveRoomStreamOpt();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableEnterLiveRoomStreamOpt();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_enter_live_room_stream_opt", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableEnterLiveRoomStreamOptFromFollowSky() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableEnterLiveRoomStreamOptFromFollowSky();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableEnterLiveRoomStreamOptFromFollowSky();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_enter_live_room_stream_opt_from_follow_sky", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableFaceToFace() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableFaceToFace();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableFaceToFace();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_face_to_face", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableFancyQrcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableFancyQrcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableFancyQrcode();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_fancy_qrcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getEnableForceLogin() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableForceLogin();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableForceLogin();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_force_login", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableGroupMemberByFollowers() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableGroupMemberByFollowers();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableGroupMemberByFollowers();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_group_member_by_followers", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableHardwareEncode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHardwareEncode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHardwareEncode();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hardware_encode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableHashtagProfile() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHashtagProfile();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHashtagProfile();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_hashtag_profile", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableHdH264HwDecoder() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHdH264HwDecoder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHdH264HwDecoder();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hd_h264_hw_decoder", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableHomeScanQrcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHomeScanQrcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHomeScanQrcode();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_home_scan_qrcode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableHotStartGps() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHotStartGps();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHotStartGps();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hot_start_gps", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableHqVframe() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHqVframe();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHqVframe();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hq_vframe", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableHuaweiSuperSlow() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableHuaweiSuperSlow();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHuaweiSuperSlow();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_huawei_super_slow", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getEnableIjkPlayer() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableIjkPlayer();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableIjkPlayer();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_ijk_player", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableImageAlog() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableImageAlog();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableImageAlog();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_image_alog", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableLargeGestureDetectModel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableLargeGestureDetectModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLargeGestureDetectModel();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_large_gesture_detect_model", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableLargeMattingDetectModel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableLargeMattingDetectModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLargeMattingDetectModel();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_large_matting_detect_model", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableLocalMusicEntrance() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableLocalMusicEntrance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLocalMusicEntrance();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_local_music_entrance", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableMojiUpdateResources() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableMojiUpdateResources();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableMojiUpdateResources();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_moji_update_resources", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableOnPageSelectPauseCheck() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableOnPageSelectPauseCheck();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableOnPageSelectPauseCheck();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_on_page_select_pause_check", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnablePassportService() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnablePassportService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnablePassportService();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_passport_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableProfileLink() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableProfileLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableProfileLink();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_profile_link", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableReadFancyQrcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableReadFancyQrcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableReadFancyQrcode();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_read_fancy_qrcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableReuseEditorForFastimport() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableReuseEditorForFastimport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableReuseEditorForFastimport();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_reuse_editor_for_fastimport", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableSplashLaunchFix() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableSplashLaunchFix();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableSplashLaunchFix();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_splash_launch_fix", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableSymphonySdk() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableSymphonySdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableSymphonySdk();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_symphony_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableSyntheticFpsSet() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableSyntheticFpsSet();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableSyntheticFpsSet();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_synthetic_fps_set", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableTImChatEveryone() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableTImChatEveryone();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableTImChatEveryone();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_t_im_chat_everyone", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableTwitterNewKeySecret() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableTwitterNewKeySecret();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableTwitterNewKeySecret();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_twitter_new_key_secret", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUltraResolution() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableUltraResolution();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUltraResolution();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_ultra_resolution", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUploadMobilePcid() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadMobilePcid();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadMobilePcid();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_mobile_pcid", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUploadSyncIns() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncIns();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncIns();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_ins", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUploadSyncInsStory() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncInsStory();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncInsStory();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_ins_story", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableUploadSyncTwitter() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncTwitter();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncTwitter();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_twitter", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnableVeSingleGl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableVeSingleGl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableVeSingleGl();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_ve_single_gl", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableWaterBgMask() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnableWaterBgMask();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableWaterBgMask();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_water_bg_mask", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getEnabledImAsupporterFuncs() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnabledImAsupporterFuncs();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnabledImAsupporterFuncs();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enabled_im_asupporter_funcs", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getEnabledImAsupporterMsgTypes() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getEnabledImAsupporterMsgTypes();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnabledImAsupporterMsgTypes();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enabled_im_asupporter_msg_types", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getF2NoticeType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getF2NoticeType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getF2NoticeType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "f2_notice_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getFaceDetectInterval() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFaceDetectInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFaceDetectInterval();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "face_detect_interval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final FeAnchorAdConf getFeAnchorAdConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeAnchorAdConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeAnchorAdConf();
        } catch (NullValueException unused) {
        }
        FeAnchorAdConf feAnchorAdConf = (FeAnchorAdConf) getProxyValue(this.hook, "fe_anchor_ad_conf", FeAnchorAdConf.class, (T) obj);
        if (feAnchorAdConf != null) {
            return feAnchorAdConf;
        }
        throw new NullValueException();
    }

    public final FeConfigCollection getFeConfigCollection() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeConfigCollection();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeConfigCollection();
        } catch (NullValueException unused) {
        }
        FeConfigCollection feConfigCollection = (FeConfigCollection) getProxyValue(this.hook, "fe_config_collection", FeConfigCollection.class, (T) obj);
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        throw new NullValueException();
    }

    public final Integer getFeedDisplayInnerMsgPlatform() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeedDisplayInnerMsgPlatform();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedDisplayInnerMsgPlatform();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "feed_display_inner_msg_platform", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getFeedHandleGenericMotion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeedHandleGenericMotion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedHandleGenericMotion();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "feed_handle_generic_motion", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getFeedTab() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeedTab();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedTab();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "feed_tab", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final FeedbackConf getFeedbackConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeedbackConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedbackConf();
        } catch (NullValueException unused) {
        }
        FeedbackConf feedbackConf = (FeedbackConf) getProxyValue(this.hook, "feedback_conf", FeedbackConf.class, (T) obj);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        throw new NullValueException();
    }

    public final Boolean getFeedbackRecordEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFeedbackRecordEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedbackRecordEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "feedback_record_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final FlexibleUpdateStrategy getFlexibleUpdateStrategy() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFlexibleUpdateStrategy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFlexibleUpdateStrategy();
        } catch (NullValueException unused) {
        }
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) getProxyValue(this.hook, "flexible_update_strategy", FlexibleUpdateStrategy.class, (T) obj);
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        throw new NullValueException();
    }

    public final FlipChatSettings getFlipchatSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFlipchatSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFlipchatSettings();
        } catch (NullValueException unused) {
        }
        FlipChatSettings flipChatSettings = (FlipChatSettings) getProxyValue(this.hook, "flipchat_settings", FlipChatSettings.class, (T) obj);
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        throw new NullValueException();
    }

    public final Integer getFollowFeedAsDefault() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFollowFeedAsDefault();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowFeedAsDefault();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "follow_feed_as_default", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final FollowTabGuideStruct getFollowFeedGuideSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFollowFeedGuideSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowFeedGuideSettings();
        } catch (NullValueException unused) {
        }
        FollowTabGuideStruct followTabGuideStruct = (FollowTabGuideStruct) getProxyValue(this.hook, "follow_feed_guide_settings", FollowTabGuideStruct.class, (T) obj);
        if (followTabGuideStruct != null) {
            return followTabGuideStruct;
        }
        throw new NullValueException();
    }

    public final String getFollowFeedSkyLiveUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFollowFeedSkyLiveUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowFeedSkyLiveUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "follow_feed_sky_live_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getFollowTabLiveType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFollowTabLiveType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowTabLiveType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "follow_tab_live_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getFollowingFollowerPermissionSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFollowingFollowerPermissionSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowingFollowerPermissionSwitch();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "following_follower_permission_switch", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getForbidDownloadLocal() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getForbidDownloadLocal();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getForbidDownloadLocal();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "forbid_download_local", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getForbidLifeStoryLocalWatermark() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getForbidLifeStoryLocalWatermark();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getForbidLifeStoryLocalWatermark();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "forbid_life_story_local_watermark", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getForbidLocalWatermark() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getForbidLocalWatermark();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getForbidLocalWatermark();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "forbid_local_watermark", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getFpUploadDeviceUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFpUploadDeviceUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFpUploadDeviceUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "fp_upload_device_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final FreeFlowCard getFreeFlowCard() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFreeFlowCard();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFreeFlowCard();
        } catch (NullValueException unused) {
        }
        FreeFlowCard freeFlowCard = (FreeFlowCard) getProxyValue(this.hook, "free_flow_card", FreeFlowCard.class, (T) obj);
        if (freeFlowCard != null) {
            return freeFlowCard;
        }
        throw new NullValueException();
    }

    public final String getFreeFlowCardUrlSticker() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFreeFlowCardUrlSticker();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFreeFlowCardUrlSticker();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "free_flow_card_url_sticker", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getFreshTab() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFreshTab();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFreshTab();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "fresh_tab", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getFriendTabAvatarDuration() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFriendTabAvatarDuration();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFriendTabAvatarDuration();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "friend_tab_avatar_duration", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final FriendTabStruct getFriendTabSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFriendTabSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFriendTabSettings();
        } catch (NullValueException unused) {
        }
        FriendTabStruct friendTabStruct = (FriendTabStruct) getProxyValue(this.hook, "friend_tab_settings", FriendTabStruct.class, (T) obj);
        if (friendTabStruct != null) {
            return friendTabStruct;
        }
        throw new NullValueException();
    }

    public final Integer getFtcAgeEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getFtcAgeEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFtcAgeEnable();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ftc_age_enable", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getGdprCookiesUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGdprCookiesUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGdprCookiesUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "gdpr_cookies_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getGdprPrivacyUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGdprPrivacyUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGdprPrivacyUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "gdpr_privacy_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final GlobalTips getGlobalTips() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGlobalTips();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGlobalTips();
        } catch (NullValueException unused) {
        }
        GlobalTips globalTips = (GlobalTips) getProxyValue(this.hook, "global_tips", GlobalTips.class, (T) obj);
        if (globalTips != null) {
            return globalTips;
        }
        throw new NullValueException();
    }

    public final C30209xd5778f6a getGradientPunishWarning() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGradientPunishWarning();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGradientPunishWarning();
        } catch (NullValueException unused) {
        }
        C30209xd5778f6a com_ss_android_ugc_aweme_compliance_gradientpunish_gradientpunishwarning = (C30209xd5778f6a) getProxyValue(this.hook, "gradient_punish_warning", C30209xd5778f6a.class, (T) obj);
        if (com_ss_android_ugc_aweme_compliance_gradientpunish_gradientpunishwarning != null) {
            return com_ss_android_ugc_aweme_compliance_gradientpunish_gradientpunishwarning;
        }
        throw new NullValueException();
    }

    public final Boolean getGroupNewMemberCanPullOldMsg() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGroupNewMemberCanPullOldMsg();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGroupNewMemberCanPullOldMsg();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "group_new_member_can_pull_old_msg", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final HotSearchDisplay getGuideWordDisplaySettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getGuideWordDisplaySettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGuideWordDisplaySettings();
        } catch (NullValueException unused) {
        }
        HotSearchDisplay hotSearchDisplay = (HotSearchDisplay) getProxyValue(this.hook, "guide_word_display_settings", HotSearchDisplay.class, (T) obj);
        if (hotSearchDisplay != null) {
            return hotSearchDisplay;
        }
        throw new NullValueException();
    }

    public final String getHardcodeChannel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHardcodeChannel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHardcodeChannel();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "hardcode_channel", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getHdHwDecoderMinSideSize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHdHwDecoderMinSideSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHdHwDecoderMinSideSize();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "hd_hw_decoder_min_side_size", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getHeartbeatDefaultUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHeartbeatDefaultUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHeartbeatDefaultUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "heartbeat_default_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getHookSpFinishers() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHookSpFinishers();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHookSpFinishers();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "hook_sp_finishers", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final HotSearchWitch getHotsearchSwitchs() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHotsearchSwitchs();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHotsearchSwitchs();
        } catch (NullValueException unused) {
        }
        HotSearchWitch hotSearchWitch = (HotSearchWitch) getProxyValue(this.hook, "hotsearch_switchs", HotSearchWitch.class, (T) obj);
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        throw new NullValueException();
    }

    public final String getHotsoonDownloadUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHotsoonDownloadUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHotsoonDownloadUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "hotsoon_download_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getHotspotGuideTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHotspotGuideTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHotspotGuideTime();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "hotspot_guide_time", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getHttpRetryCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHttpRetryCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHttpRetryCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "http_retry_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Long getHttpRetryInterval() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHttpRetryInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHttpRetryInterval();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "http_retry_interval", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Long getHttpTimeout() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHttpTimeout();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHttpTimeout();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "http_timeout", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final HybridMonitorConfig getHybridMonitorConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getHybridMonitorConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHybridMonitorConfig();
        } catch (NullValueException unused) {
        }
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) getProxyValue(this.hook, "hybrid_monitor_config", HybridMonitorConfig.class, (T) obj);
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        throw new NullValueException();
    }

    public final Boolean getImCommentForwardEnabled() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImCommentForwardEnabled();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImCommentForwardEnabled();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "im_comment_forward_enabled", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getImContactsMultiSelectLimit() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImContactsMultiSelectLimit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImContactsMultiSelectLimit();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_contacts_multi_select_limit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final ImCreateChatBubble getImCreateChatBubble() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImCreateChatBubble();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImCreateChatBubble();
        } catch (NullValueException unused) {
        }
        ImCreateChatBubble imCreateChatBubble = (ImCreateChatBubble) getProxyValue(this.hook, "im_create_chat_bubble", ImCreateChatBubble.class, (T) obj);
        if (imCreateChatBubble != null) {
            return imCreateChatBubble;
        }
        throw new NullValueException();
    }

    public final Integer getImImageSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImImageSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImImageSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_image_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getImShareVideoMessageStyle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImShareVideoMessageStyle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImShareVideoMessageStyle();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_share_video_message_style", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getImSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getImUrlTemplate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImUrlTemplate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImUrlTemplate();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "im_url_template", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final IMUseOkHttpClientConfig getImUseOkhttpclient() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImUseOkhttpclient();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImUseOkhttpclient();
        } catch (NullValueException unused) {
        }
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) getProxyValue(this.hook, "im_use_okhttpclient", IMUseOkHttpClientConfig.class, (T) obj);
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        throw new NullValueException();
    }

    public final IMXPlanSetting getImXDisplayStyleConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImXDisplayStyleConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXDisplayStyleConfig();
        } catch (NullValueException unused) {
        }
        IMXPlanSetting iMXPlanSetting = (IMXPlanSetting) getProxyValue(this.hook, "im_x_display_style_config", IMXPlanSetting.class, (T) obj);
        if (iMXPlanSetting != null) {
            return iMXPlanSetting;
        }
        throw new NullValueException();
    }

    public final Integer getImXUnreadCountStrategy() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImXUnreadCountStrategy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXUnreadCountStrategy();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_x_unread_count_strategy", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getImXUseEncryptedImage() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImXUseEncryptedImage();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXUseEncryptedImage();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_x_use_encrypted_image", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getImageTosRegx() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImageTosRegx();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImageTosRegx();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "image_tos_regx", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getImpressionPageSchema() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getImpressionPageSchema();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImpressionPageSchema();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "impression_page_schema", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getInCamera2BlackList() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getInCamera2BlackList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInCamera2BlackList();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "in_camera2_black_list", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getInEvening() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getInEvening();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInEvening();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "in_evening", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getInUltraResolutionBlackList() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getInUltraResolutionBlackList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInUltraResolutionBlackList();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "in_ultra_resolution_black_list", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getInfoStickerMaxCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getInfoStickerMaxCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInfoStickerMaxCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "info_sticker_max_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getIsAdapterVideoPlaySize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsAdapterVideoPlaySize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsAdapterVideoPlaySize();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_adapter_video_play_size", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getIsAdapterVideoPlaySizeAd() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsAdapterVideoPlaySizeAd();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsAdapterVideoPlaySizeAd();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_adapter_video_play_size_ad", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getIsDownloadMicroApp() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsDownloadMicroApp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsDownloadMicroApp();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_download_micro_app", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getIsEeaRegion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsEeaRegion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsEeaRegion();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_eea_region", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getIsEnableSplashFirstShowRetrieval() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsEnableSplashFirstShowRetrieval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsEnableSplashFirstShowRetrieval();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_enable_splash_first_show_retrieval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getIsEuropeCountry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsEuropeCountry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsEuropeCountry();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_europe_country", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getIsForceHttps() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsForceHttps();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsForceHttps();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_force_https", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getIsNearbyOldUser() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsNearbyOldUser();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsNearbyOldUser();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_nearby_old_user", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getIsNewLongVideoActivity() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsNewLongVideoActivity();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsNewLongVideoActivity();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_new_long_video_activity", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getIsNpthEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsNpthEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsNpthEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_npth_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getIsOb() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsOb();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsOb();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_ob", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getIsShowGifButton() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsShowGifButton();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsShowGifButton();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_show_gif_button", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getIsTargetBindingUser() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsTargetBindingUser();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsTargetBindingUser();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_target_binding_user", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getIsUseTongdunSdk() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsUseTongdunSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsUseTongdunSdk();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_use_tongdun_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getIsUseTtnet() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getIsUseTtnet();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsUseTtnet();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "is_use_ttnet", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getJsActlogUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getJsActlogUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getJsActlogUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "js_actlog_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getLabTitle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLabTitle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLabTitle();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "lab_title", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getLifeEffectsColdReq() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLifeEffectsColdReq();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLifeEffectsColdReq();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "life_effects_cold_req", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final LikePraiseDialogInfo getLikePraiseDialogInfo() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLikePraiseDialogInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLikePraiseDialogInfo();
        } catch (NullValueException unused) {
        }
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) getProxyValue(this.hook, "like_praise_dialog_info", LikePraiseDialogInfo.class, (T) obj);
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        throw new NullValueException();
    }

    public final Integer getLiveClarityAdaptAuto() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveClarityAdaptAuto();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveClarityAdaptAuto();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "live_clarity_adapt_auto", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final LiveCnySetting getLiveCnySettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveCnySettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveCnySettings();
        } catch (NullValueException unused) {
        }
        LiveCnySetting liveCnySetting = (LiveCnySetting) getProxyValue(this.hook, "live_cny_settings", LiveCnySetting.class, (T) obj);
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        throw new NullValueException();
    }

    public final Integer getLiveDefaultBitrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveDefaultBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveDefaultBitrate();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "live_default_bitrate", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final LiveFEConfigs getLiveFeConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveFeConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveFeConf();
        } catch (NullValueException unused) {
        }
        LiveFEConfigs liveFEConfigs = (LiveFEConfigs) getProxyValue(this.hook, "live_fe_conf", LiveFEConfigs.class, (T) obj);
        if (liveFEConfigs != null) {
            return liveFEConfigs;
        }
        throw new NullValueException();
    }

    public final LiveInnerPushConfig getLiveInnerPushConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveInnerPushConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveInnerPushConfig();
        } catch (NullValueException unused) {
        }
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) getProxyValue(this.hook, "live_inner_push_config", LiveInnerPushConfig.class, (T) obj);
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        throw new NullValueException();
    }

    public final LiveLabelDisplaySettings getLiveLabelDisplaySettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveLabelDisplaySettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveLabelDisplaySettings();
        } catch (NullValueException unused) {
        }
        LiveLabelDisplaySettings liveLabelDisplaySettings = (LiveLabelDisplaySettings) getProxyValue(this.hook, "live_label_display_settings", LiveLabelDisplaySettings.class, (T) obj);
        if (liveLabelDisplaySettings != null) {
            return liveLabelDisplaySettings;
        }
        throw new NullValueException();
    }

    public final Integer getLiveMaxBitrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveMaxBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveMaxBitrate();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "live_max_bitrate", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getLiveMinBitrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveMinBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveMinBitrate();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "live_min_bitrate", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Long getLiveShortcutGiftId() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveShortcutGiftId();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveShortcutGiftId();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "live_shortcut_gift_id", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Boolean getLiveSkylightShowAnimation() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveSkylightShowAnimation();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveSkylightShowAnimation();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "live_skylight_show_animation", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final C30211xb9e2f2d7 getLiveSquareEntranceAnimConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveSquareEntranceAnimConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveSquareEntranceAnimConfig();
        } catch (NullValueException unused) {
        }
        C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig = (C30211xb9e2f2d7) getProxyValue(this.hook, "live_square_entrance_anim_config", C30211xb9e2f2d7.class, (T) obj);
        if (com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig != null) {
            return com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig;
        }
        throw new NullValueException();
    }

    public final Integer getLiveUseZhima() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLiveUseZhima();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveUseZhima();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "live_use_zhima", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getLocalVideoCacheMaxAge() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLocalVideoCacheMaxAge();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLocalVideoCacheMaxAge();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "local_video_cache_max_age", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getLocalVideoCacheMaxLength() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLocalVideoCacheMaxLength();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLocalVideoCacheMaxLength();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "local_video_cache_max_length", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final LogPbBean getLogPb() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLogPb();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLogPb();
        } catch (NullValueException unused) {
        }
        LogPbBean logPbBean = (LogPbBean) getProxyValue(this.hook, "log_pb", LogPbBean.class, (T) obj);
        if (logPbBean != null) {
            return logPbBean;
        }
        throw new NullValueException();
    }

    public final Boolean getLongVideoPermitted() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLongVideoPermitted();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLongVideoPermitted();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "long_video_permitted", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Long getLongVideoThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLongVideoThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLongVideoThreshold();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "long_video_threshold", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final String getLubanEntryUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getLubanEntryUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLubanEntryUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "luban_entry_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getMainTabFollowUseLazyViewpager() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMainTabFollowUseLazyViewpager();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMainTabFollowUseLazyViewpager();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "main_tab_follow_use_lazy_viewpager", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getMaxMessageCountForRecommend() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMaxMessageCountForRecommend();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMaxMessageCountForRecommend();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "max_message_count_for_recommend", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getMiniappPreloadEmptyProcessEnbale() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMiniappPreloadEmptyProcessEnbale();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMiniappPreloadEmptyProcessEnbale();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "miniapp_preload_empty_process_enbale", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getMiniappPreloadEnbale() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMiniappPreloadEnbale();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMiniappPreloadEnbale();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "miniapp_preload_enbale", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getMovieDetail() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMovieDetail();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMovieDetail();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "movie_detail", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getMtForbidInsertPlaceholderWord() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMtForbidInsertPlaceholderWord();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMtForbidInsertPlaceholderWord();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "mt_forbid_insert_placeholder_word", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getMtLocalAnalysisHprof() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMtLocalAnalysisHprof();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMtLocalAnalysisHprof();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "mt_local_analysis_hprof", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getMtSearchHistoryFoldCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMtSearchHistoryFoldCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMtSearchHistoryFoldCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "mt_search_history_fold_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final MtcertSettings getMtcertSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMtcertSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMtcertSettings();
        } catch (NullValueException unused) {
        }
        MtcertSettings mtcertSettings = (MtcertSettings) getProxyValue(this.hook, "mtcert_settings", MtcertSettings.class, (T) obj);
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        throw new NullValueException();
    }

    public final String getMusicBillboardRuleUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMusicBillboardRuleUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMusicBillboardRuleUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "music_billboard_rule_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getMusicCopyrightGranted() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMusicCopyrightGranted();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMusicCopyrightGranted();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "music_copyright_granted", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getMusicianShowType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getMusicianShowType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMusicianShowType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "musician_show_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance getNearbyDistance() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNearbyDistance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNearbyDistance();
        } catch (NullValueException unused) {
        }
        com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance = (com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance) getProxyValue(this.hook, "nearby_distance", com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance.class, (T) obj);
        if (com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance != null) {
            return com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance;
        }
        throw new NullValueException();
    }

    public final Boolean getNearbyTab() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNearbyTab();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNearbyTab();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "nearby_tab", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getNeedPreLoad() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNeedPreLoad();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNeedPreLoad();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "need_pre_load", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getNegativeShareEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNegativeShareEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNegativeShareEntry();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "negative_share_entry", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getNetworkLibType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNetworkLibType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNetworkLibType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "network_lib_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final com_ss_android_ugc_network_observer_bean_DetectorParam getNetworkMonitorConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNetworkMonitorConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNetworkMonitorConfig();
        } catch (NullValueException unused) {
        }
        com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam = (com_ss_android_ugc_network_observer_bean_DetectorParam) getProxyValue(this.hook, "network_monitor_config", com_ss_android_ugc_network_observer_bean_DetectorParam.class, (T) obj);
        if (com_ss_android_ugc_network_observer_bean_detectorparam != null) {
            return com_ss_android_ugc_network_observer_bean_detectorparam;
        }
        throw new NullValueException();
    }

    public final Boolean getNewAnchorShowBubble() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNewAnchorShowBubble();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNewAnchorShowBubble();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "new_anchor_show_bubble", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final NewAnchorShowBubbleSettings getNewAnchorShowBubbleSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNewAnchorShowBubbleSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNewAnchorShowBubbleSettings();
        } catch (NullValueException unused) {
        }
        NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = (NewAnchorShowBubbleSettings) getProxyValue(this.hook, "new_anchor_show_bubble_settings", NewAnchorShowBubbleSettings.class, (T) obj);
        if (newAnchorShowBubbleSettings != null) {
            return newAnchorShowBubbleSettings;
        }
        throw new NullValueException();
    }

    public final NewYearConfig getNewyearConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNewyearConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNewyearConfig();
        } catch (NullValueException unused) {
        }
        NewYearConfig newYearConfig = (NewYearConfig) getProxyValue(this.hook, "newyear_config", NewYearConfig.class, (T) obj);
        if (newYearConfig != null) {
            return newYearConfig;
        }
        throw new NullValueException();
    }

    public final Long getNoticeCloseTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNoticeCloseTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNoticeCloseTime();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "notice_close_time", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Integer getNoticeCountLatency() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getNoticeCountLatency();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNoticeCountLatency();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "notice_count_latency", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getOpenForward() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOpenForward();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOpenForward();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "open_forward", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getOpenImLink() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOpenImLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOpenImLink();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "open_im_link", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getOrangeActivityInfoUseApi() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOrangeActivityInfoUseApi();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOrangeActivityInfoUseApi();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "orange_activity_info_use_api", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final CdnDomainRefresh getOrangeCdnConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOrangeCdnConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOrangeCdnConfig();
        } catch (NullValueException unused) {
        }
        CdnDomainRefresh cdnDomainRefresh = (CdnDomainRefresh) getProxyValue(this.hook, "orange_cdn_config", CdnDomainRefresh.class, (T) obj);
        if (cdnDomainRefresh != null) {
            return cdnDomainRefresh;
        }
        throw new NullValueException();
    }

    public final String getOrginalMusicianUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOrginalMusicianUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOrginalMusicianUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "orginal_musician_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getOriginalMusicianEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOriginalMusicianEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOriginalMusicianEntry();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "original_musician_entry", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getOriginalMusicianShareStyle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getOriginalMusicianShareStyle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOriginalMusicianShareStyle();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "original_musician_share_style", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getPicQrcodeRecognitionSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPicQrcodeRecognitionSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPicQrcodeRecognitionSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "pic_qrcode_recognition_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final PoiSetting getPoiSetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPoiSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPoiSetting();
        } catch (NullValueException unused) {
        }
        PoiSetting poiSetting = (PoiSetting) getProxyValue(this.hook, "poi_setting", PoiSetting.class, (T) obj);
        if (poiSetting != null) {
            return poiSetting;
        }
        throw new NullValueException();
    }

    public final Boolean getPolicyNoticeEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPolicyNoticeEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPolicyNoticeEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "policy_notice_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getPopWindowEveryTimePostaweme() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPopWindowEveryTimePostaweme();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPopWindowEveryTimePostaweme();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "popWindowEveryTime_postaweme", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getPopWindowEveryTimePostcomment() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPopWindowEveryTimePostcomment();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPopWindowEveryTimePostcomment();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "popWindowEveryTime_postcomment", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final PopupBlackList getPopupBlackList() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPopupBlackList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPopupBlackList();
        } catch (NullValueException unused) {
        }
        PopupBlackList popupBlackList = (PopupBlackList) getProxyValue(this.hook, "popup_black_list", PopupBlackList.class, (T) obj);
        if (popupBlackList != null) {
            return popupBlackList;
        }
        throw new NullValueException();
    }

    public final Integer getPosterSrType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPosterSrType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPosterSrType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "poster_sr_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getPreUploadMemoryLimit() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPreUploadMemoryLimit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPreUploadMemoryLimit();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "pre_upload_memory_limit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getPrivacyReminder() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPrivacyReminder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPrivacyReminder();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "privacy_reminder", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getPrivacyUseOldStyle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPrivacyUseOldStyle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPrivacyUseOldStyle();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "privacy_use_old_style", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getPrivateAvailable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPrivateAvailable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPrivateAvailable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "private_available", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final ProAccountEnableDetailInfo getProAccountEnableDetailInfo() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getProAccountEnableDetailInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProAccountEnableDetailInfo();
        } catch (NullValueException unused) {
        }
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) getProxyValue(this.hook, "pro_account_enable_detail_info", ProAccountEnableDetailInfo.class, (T) obj);
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        throw new NullValueException();
    }

    public final ProfilePerfection getProfileCompletion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getProfileCompletion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProfileCompletion();
        } catch (NullValueException unused) {
        }
        ProfilePerfection profilePerfection = (ProfilePerfection) getProxyValue(this.hook, "profile_completion", ProfilePerfection.class, (T) obj);
        if (profilePerfection != null) {
            return profilePerfection;
        }
        throw new NullValueException();
    }

    public final Float getProfileCompletionThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getProfileCompletionThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProfileCompletionThreshold();
        } catch (NullValueException unused) {
        }
        Float f = (Float) getProxyValue(this.hook, "profile_completion_threshold", Float.class, (T) obj);
        if (f != null) {
            return f;
        }
        throw new NullValueException();
    }

    public final Boolean getProfilePageSkipRemove() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getProfilePageSkipRemove();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProfilePageSkipRemove();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "profile_page_skip_remove", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Long getProgressbarThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getProgressbarThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProgressbarThreshold();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "progressbar_threshold", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final String getPtMd5() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPtMd5();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPtMd5();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "pt_md5", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getPtSign() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPtSign();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPtSign();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "pt_sign", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getPtUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPtUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPtUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "pt_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final pushGuideInfo getPushGuideInfo() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPushGuideInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPushGuideInfo();
        } catch (NullValueException unused) {
        }
        pushGuideInfo pushguideinfo = (pushGuideInfo) getProxyValue(this.hook, "push_guide_info", pushGuideInfo.class, (T) obj);
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        throw new NullValueException();
    }

    public final PushPrePermissionView getPushPrePermissionView() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getPushPrePermissionView();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPushPrePermissionView();
        } catch (NullValueException unused) {
        }
        PushPrePermissionView pushPrePermissionView = (PushPrePermissionView) getProxyValue(this.hook, "push_pre_permission_view", PushPrePermissionView.class, (T) obj);
        if (pushPrePermissionView != null) {
            return pushPrePermissionView;
        }
        throw new NullValueException();
    }

    public final QuickShopLoadingPage getQuickShopLoadingPage() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getQuickShopLoadingPage();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getQuickShopLoadingPage();
        } catch (NullValueException unused) {
        }
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) getProxyValue(this.hook, "quick_shop_loading_page", QuickShopLoadingPage.class, (T) obj);
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        throw new NullValueException();
    }

    public final Integer getReactMicStatus() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getReactMicStatus();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getReactMicStatus();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "react_mic_status", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getRealTimeReportEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRealTimeReportEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRealTimeReportEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "real_time_report_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getRecordBitrateMode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRecordBitrateMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordBitrateMode();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_bitrate_mode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getRecordCameraCompatLevel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRecordCameraCompatLevel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordCameraCompatLevel();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_camera_compat_level", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getRecordCameraType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRecordCameraType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordCameraType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_camera_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getRecordOpenHighProfile() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRecordOpenHighProfile();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordOpenHighProfile();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_open_high_profile", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getRedpackageOn() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRedpackageOn();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRedpackageOn();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "redpackage_on", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getReferralProgramUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getReferralProgramUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getReferralProgramUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "referral_program_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getRefreshAvailable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRefreshAvailable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRefreshAvailable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "refresh_available", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getRefreshZhima() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRefreshZhima();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRefreshZhima();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "refresh_zhima", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getRegionOfResidence() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRegionOfResidence();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRegionOfResidence();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "region_of_residence", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getRequestUserInfoForStart() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getRequestUserInfoForStart();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRequestUserInfoForStart();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "request_user_info_for_start", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getSatCameraType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSatCameraType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSatCameraType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "sat_camera_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getSearchCarouselIntervals() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSearchCarouselIntervals();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSearchCarouselIntervals();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "search_carousel_intervals", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final SearchPullFeedbackStruct getSearchPullFeedback() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSearchPullFeedback();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSearchPullFeedback();
        } catch (NullValueException unused) {
        }
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) getProxyValue(this.hook, "search_pull_feedback", SearchPullFeedbackStruct.class, (T) obj);
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        throw new NullValueException();
    }

    public final UrlModel getSearchTrendBannerUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSearchTrendBannerUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSearchTrendBannerUrl();
        } catch (NullValueException unused) {
        }
        UrlModel urlModel = (UrlModel) getProxyValue(this.hook, "search_trend_banner_url", UrlModel.class, (T) obj);
        if (urlModel != null) {
            return urlModel;
        }
        throw new NullValueException();
    }

    public final Integer getSecuidReportMinCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSecuidReportMinCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSecuidReportMinCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "secuid_report_min_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getSelfSeeWatermarkSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSelfSeeWatermarkSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSelfSeeWatermarkSwitch();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "self_see_watermark_switch", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getSettingsChangeTest() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSettingsChangeTest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSettingsChangeTest();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "settings_change_test", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getSettingsVersion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSettingsVersion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSettingsVersion();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "settings_version", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getShakeFreeWhiteList() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShakeFreeWhiteList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShakeFreeWhiteList();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "shake_free_white_list", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getShakeThreshold() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShakeThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShakeThreshold();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "shake_threshold", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getShareDirectWithPic() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShareDirectWithPic();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShareDirectWithPic();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "share_direct_with_pic", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final WhiteList getShareUrlWhitelist() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShareUrlWhitelist();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShareUrlWhitelist();
        } catch (NullValueException unused) {
        }
        WhiteList whiteList = (WhiteList) getProxyValue(this.hook, "share_url_whitelist", WhiteList.class, (T) obj);
        if (whiteList != null) {
            return whiteList;
        }
        throw new NullValueException();
    }

    public final Boolean getShieldMusicSdk() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShieldMusicSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShieldMusicSdk();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "shield_music_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getShootTutorialLink() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShootTutorialLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShootTutorialLink();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "shoot_tutorial_link", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getShootingGuideChallengeId() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShootingGuideChallengeId();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShootingGuideChallengeId();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "shooting_guide_challenge_id", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getShopLinkAnchorDisclaimer() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShopLinkAnchorDisclaimer();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShopLinkAnchorDisclaimer();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "shop_link_anchor_disclaimer", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final ShoppingConfig getShopping() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShopping();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShopping();
        } catch (NullValueException unused) {
        }
        ShoppingConfig shoppingConfig = (ShoppingConfig) getProxyValue(this.hook, "shopping", ShoppingConfig.class, (T) obj);
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        throw new NullValueException();
    }

    public final Integer getShowCreatorLicense210() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowCreatorLicense210();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowCreatorLicense210();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "show_creator_license_210", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final ShowCreatorLicense getShowCreatorLicense230() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowCreatorLicense230();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowCreatorLicense230();
        } catch (NullValueException unused) {
        }
        ShowCreatorLicense showCreatorLicense = (ShowCreatorLicense) getProxyValue(this.hook, "show_creator_license_230", ShowCreatorLicense.class, (T) obj);
        if (showCreatorLicense != null) {
            return showCreatorLicense;
        }
        throw new NullValueException();
    }

    public final Integer getShowFollowTabFollowingLimit() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowFollowTabFollowingLimit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowFollowTabFollowingLimit();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "show_follow_tab_following_limit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getShowFromDuoshanLabel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowFromDuoshanLabel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowFromDuoshanLabel();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "show_from_duoshan_label", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getShowInteractionStickers() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowInteractionStickers();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowInteractionStickers();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_interaction_stickers", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getShowInviteFriendsEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowInviteFriendsEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowInviteFriendsEntry();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_invite_friends_entry", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getShowLargeGif() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowLargeGif();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowLargeGif();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_large_gif", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getShowLiveRewards() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowLiveRewards();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowLiveRewards();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "show_live_rewards", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getShowMusicFeedbackEntrance() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowMusicFeedbackEntrance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowMusicFeedbackEntrance();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_music_feedback_entrance", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getShowRocketShareIfInstall() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowRocketShareIfInstall();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowRocketShareIfInstall();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_rocket_share_if_install", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Long getShowStorageDotSize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowStorageDotSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowStorageDotSize();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "show_storage_dot_size", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Long getShowStorageTipSize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShowStorageTipSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowStorageTipSize();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "show_storage_tip_size", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Boolean getShutterSoundEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getShutterSoundEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShutterSoundEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "shutter_sound_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getSilentShareConfigurable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSilentShareConfigurable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSilentShareConfigurable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "silent_share_configurable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getSmartisanDataSharingSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSmartisanDataSharingSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSmartisanDataSharingSwitch();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "smartisan_data_sharing_switch", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final C30206Sp getSp() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSp();
        } catch (NullValueException unused) {
        }
        C30206Sp sp = (C30206Sp) getProxyValue(this.hook, "sp", C30206Sp.class, (T) obj);
        if (sp != null) {
            return sp;
        }
        throw new NullValueException();
    }

    public final Boolean getSplashImageCenter() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSplashImageCenter();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashImageCenter();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "splash_image_center", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Long getSplashPreloadDelay() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSplashPreloadDelay();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashPreloadDelay();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "splash_preload_delay", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Long getSplashStockDelayMillisTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSplashStockDelayMillisTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashStockDelayMillisTime();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "splash_stock_delay_millis_time", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Boolean getSplashSupportTimeout() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSplashSupportTimeout();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashSupportTimeout();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "splash_support_timeout", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getSplashVideoCenter() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSplashVideoCenter();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashVideoCenter();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "splash_video_center", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final SpringApiLimitConfig getSpringApiLimitConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSpringApiLimitConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSpringApiLimitConfig();
        } catch (NullValueException unused) {
        }
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) getProxyValue(this.hook, "spring_api_limit_config", SpringApiLimitConfig.class, (T) obj);
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        throw new NullValueException();
    }

    public final String getStarAtlasProfileLink() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStarAtlasProfileLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStarAtlasProfileLink();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "star_atlas_profile_link", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final StarAtlasSetting getStarAtlasSetting() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStarAtlasSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStarAtlasSetting();
        } catch (NullValueException unused) {
        }
        StarAtlasSetting starAtlasSetting = (StarAtlasSetting) getProxyValue(this.hook, "star_atlas_setting", StarAtlasSetting.class, (T) obj);
        if (starAtlasSetting != null) {
            return starAtlasSetting;
        }
        throw new NullValueException();
    }

    public final String getStarBillboardRuleUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStarBillboardRuleUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStarBillboardRuleUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "star_billboard_rule_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getStatisticsBackupPct() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStatisticsBackupPct();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStatisticsBackupPct();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "statistics_backup_pct", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getStatusLottieUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStatusLottieUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStatusLottieUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "status_lottie_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getStatusPhoneType() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStatusPhoneType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStatusPhoneType();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "status_phone_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getStatusTabKey() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStatusTabKey();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStatusTabKey();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "status_tab_key", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getStickerArtistEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStickerArtistEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStickerArtistEntry();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "sticker_artist_entry", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final String getStickerArtistIconUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStickerArtistIconUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStickerArtistIconUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "sticker_artist_icon_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getStickerArtistUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStickerArtistUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStickerArtistUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "sticker_artist_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getStoryFriendBannerSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStoryFriendBannerSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStoryFriendBannerSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "story_friend_banner_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getStoryFriendBannerUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStoryFriendBannerUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStoryFriendBannerUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "story_friend_banner_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getStoryImagePlayTime() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStoryImagePlayTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStoryImagePlayTime();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "story_image_play_time", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final PublishSyncDuoshanAllConfig getStoryPublishSyncDuoshan() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStoryPublishSyncDuoshan();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStoryPublishSyncDuoshan();
        } catch (NullValueException unused) {
        }
        PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig = (PublishSyncDuoshanAllConfig) getProxyValue(this.hook, "story_publish_sync_duoshan", PublishSyncDuoshanAllConfig.class, (T) obj);
        if (publishSyncDuoshanAllConfig != null) {
            return publishSyncDuoshanAllConfig;
        }
        throw new NullValueException();
    }

    public final Boolean getStorySupportAnimate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getStorySupportAnimate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStorySupportAnimate();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "story_support_animate", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final SuperEntranceConfig getSuperEntranceConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSuperEntranceConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSuperEntranceConfig();
        } catch (NullValueException unused) {
        }
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) getProxyValue(this.hook, "super_entrance_config", SuperEntranceConfig.class, (T) obj);
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        throw new NullValueException();
    }

    public final Integer getSyncToToutiao() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyncToToutiao();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyncToToutiao();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "sync_to_toutiao", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getSyncToToutiaoUrl() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyncToToutiaoUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyncToToutiaoUrl();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "sync_to_toutiao_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getSyntheticHardcodeChannel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticHardcodeChannel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticHardcodeChannel();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "synthetic_hardcode_channel", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Float getSyntheticVideoBitrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoBitrate();
        } catch (NullValueException unused) {
        }
        Float f = (Float) getProxyValue(this.hook, "synthetic_video_bitrate", Float.class, (T) obj);
        if (f != null) {
            return f;
        }
        throw new NullValueException();
    }

    public final Integer getSyntheticVideoGop() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoGop();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoGop();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_gop", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Long getSyntheticVideoMaxrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoMaxrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoMaxrate();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "synthetic_video_maxrate", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Integer getSyntheticVideoPreset() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoPreset();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoPreset();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_preset", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getSyntheticVideoQuality() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoQuality();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoQuality();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_quality", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getTcmCtrySettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTcmCtrySettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTcmCtrySettings();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "tcm_ctry_settings", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getTcmNameCtry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTcmNameCtry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTcmNameCtry();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "tcm_name_ctry", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Boolean getTencentSdkDisabled() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTencentSdkDisabled();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTencentSdkDisabled();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, C37969ah.f98868c, Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getTextStickerMaxCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTextStickerMaxCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTextStickerMaxCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "text_sticker_max_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final ThirdPlatformLoginSettings getThirdLoginBindSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getThirdLoginBindSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getThirdLoginBindSettings();
        } catch (NullValueException unused) {
        }
        ThirdPlatformLoginSettings thirdPlatformLoginSettings = (ThirdPlatformLoginSettings) getProxyValue(this.hook, "third_login_bind_settings", ThirdPlatformLoginSettings.class, (T) obj);
        if (thirdPlatformLoginSettings != null) {
            return thirdPlatformLoginSettings;
        }
        throw new NullValueException();
    }

    public final Integer getThirdPartyDataRefresh() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getThirdPartyDataRefresh();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getThirdPartyDataRefresh();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "third_party_data_refresh", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getTosImageFmt() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTosImageFmt();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTosImageFmt();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "tos_image_fmt", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final JsonStubWillConvertToString getTtDeviceInfoCollectController() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtDeviceInfoCollectController();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtDeviceInfoCollectController();
        } catch (NullValueException unused) {
        }
        JsonStubWillConvertToString jsonStubWillConvertToString = (JsonStubWillConvertToString) getProxyValue(this.hook, "tt_device_info_collect_controller", JsonStubWillConvertToString.class, (T) obj);
        if (jsonStubWillConvertToString != null) {
            return jsonStubWillConvertToString;
        }
        throw new NullValueException();
    }

    public final JsonStubWillConvertToString getTtFusionFuelSdkSettings() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtFusionFuelSdkSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtFusionFuelSdkSettings();
        } catch (NullValueException unused) {
        }
        JsonStubWillConvertToString jsonStubWillConvertToString = (JsonStubWillConvertToString) getProxyValue(this.hook, "tt_fusion_fuel_sdk_settings", JsonStubWillConvertToString.class, (T) obj);
        if (jsonStubWillConvertToString != null) {
            return jsonStubWillConvertToString;
        }
        throw new NullValueException();
    }

    public final Boolean getTtnetInterceptWebviewAllEnable() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewAllEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtnetInterceptWebviewAllEnable();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "ttnet_intercept_webview_all_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getTtnetInterceptWebviewEnbale() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewEnbale();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtnetInterceptWebviewEnbale();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "ttnet_intercept_webview_enbale", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getTtnetRoute() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtnetRoute();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtnetRoute();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "ttnet_route", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getTtplayerBufferDurationSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtplayerBufferDurationSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtplayerBufferDurationSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ttplayer_buffer_duration_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getTtregion() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getTtregion();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getTtregion();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "ttregion", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final UlikeParams getUlikeParams() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUlikeParams();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUlikeParams();
        } catch (NullValueException unused) {
        }
        UlikeParams ulikeParams = (UlikeParams) getProxyValue(this.hook, "ulike_params", UlikeParams.class, (T) obj);
        if (ulikeParams != null) {
            return ulikeParams;
        }
        throw new NullValueException();
    }

    public final Integer getUlikeParamsGroup() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUlikeParamsGroup();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUlikeParamsGroup();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ulike_params_group", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getUltraResolutionLevel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUltraResolutionLevel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUltraResolutionLevel();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ultra_resolution_level", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getUploadContactsNoticeInterval() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsNoticeInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsNoticeInterval();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_notice_interval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getUploadContactsNoticeTimes() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsNoticeTimes();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsNoticeTimes();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_notice_times", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getUploadContactsPolicyCaption() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsPolicyCaption();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsPolicyCaption();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "upload_contacts_policy_caption", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getUploadContactsPolicyInterval() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsPolicyInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsPolicyInterval();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_policy_interval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getUploadContactsPolicyPic() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsPolicyPic();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsPolicyPic();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "upload_contacts_policy_pic", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final String getUploadContactsPolicyText() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsPolicyText();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsPolicyText();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "upload_contacts_policy_text", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getUploadContactsPolicyTimes() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsPolicyTimes();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsPolicyTimes();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_policy_times", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getUploadOriginAudioTrack() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUploadOriginAudioTrack();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadOriginAudioTrack();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "upload_origin_audio_track", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getUseBridgeEngineV2() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseBridgeEngineV2();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseBridgeEngineV2();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_bridge_engine_v2", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getUseHardcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseHardcode();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "use_hardcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getUseLiveWallpaper() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseLiveWallpaper();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseLiveWallpaper();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "use_live_wallpaper", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getUseNewFfmpeg() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseNewFfmpeg();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseNewFfmpeg();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_new_ffmpeg", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getUseNewyearDirectUpload() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseNewyearDirectUpload();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseNewyearDirectUpload();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_newyear_direct_upload", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Boolean getUseRightSwipeBack() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseRightSwipeBack();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseRightSwipeBack();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_right_swipe_back", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getUseSyntheticHardcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseSyntheticHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseSyntheticHardcode();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "use_synthetic_hardcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getUseWatermarkHardcode() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUseWatermarkHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseWatermarkHardcode();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_watermark_hardcode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final ThirdLoginSetting getUserLoginWindow() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUserLoginWindow();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUserLoginWindow();
        } catch (NullValueException unused) {
        }
        ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) getProxyValue(this.hook, "user_login_window", ThirdLoginSetting.class, (T) obj);
        if (thirdLoginSetting != null) {
            return thirdLoginSetting;
        }
        throw new NullValueException();
    }

    public final UserPreferSettings getUserPrefer() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getUserPrefer();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUserPrefer();
        } catch (NullValueException unused) {
        }
        UserPreferSettings userPreferSettings = (UserPreferSettings) getProxyValue(this.hook, "user_prefer", UserPreferSettings.class, (T) obj);
        if (userPreferSettings != null) {
            return userPreferSettings;
        }
        throw new NullValueException();
    }

    public final VCDV1ConfigStruct getVcdV1ConfigInfo() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVcdV1ConfigInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVcdV1ConfigInfo();
        } catch (NullValueException unused) {
        }
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) getProxyValue(this.hook, "vcd_v1_config_info", VCDV1ConfigStruct.class, (T) obj);
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        throw new NullValueException();
    }

    public final String getVeRuntimeConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVeRuntimeConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVeRuntimeConfig();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "ve_runtime_config", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getVerifyExceed() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVerifyExceed();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVerifyExceed();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "verify_exceed", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Float getVideoBitrate() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoBitrate();
        } catch (NullValueException unused) {
        }
        Float f = (Float) getProxyValue(this.hook, "video_bitrate", Float.class, (T) obj);
        if (f != null) {
            return f;
        }
        throw new NullValueException();
    }

    public final Integer getVideoCommit() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoCommit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoCommit();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_commit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getVideoCompose() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoCompose();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoCompose();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_compose", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Long getVideoDurationLimitMs() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoDurationLimitMs();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoDurationLimitMs();
        } catch (NullValueException unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "video_duration_limit_ms", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new NullValueException();
    }

    public final Integer getVideoPlayProgressCount() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoPlayProgressCount();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoPlayProgressCount();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_play_progress_count", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getVideoPreloadSize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoPreloadSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoPreloadSize();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_preload_size", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getVideoQuality() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoQuality();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoQuality();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_quality", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getVideoSize() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoSize();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "video_size", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getVideoUploadNormalizationParam() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVideoUploadNormalizationParam();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoUploadNormalizationParam();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_upload_normalization_param", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final VisionSearchStruct getVisionSearch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVisionSearch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVisionSearch();
        } catch (NullValueException unused) {
        }
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) getProxyValue(this.hook, "vision_search", VisionSearchStruct.class, (T) obj);
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        throw new NullValueException();
    }

    public final String getVisualSearchDetectionModel() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getVisualSearchDetectionModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVisualSearchDetectionModel();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "visual_search_detection_model", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final WalletConfig getWalletConf() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWalletConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWalletConf();
        } catch (NullValueException unused) {
        }
        WalletConfig walletConfig = (WalletConfig) getProxyValue(this.hook, "wallet_conf", WalletConfig.class, (T) obj);
        if (walletConfig != null) {
            return walletConfig;
        }
        throw new NullValueException();
    }

    public final Integer getWeakNetPreLoadSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWeakNetPreLoadSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWeakNetPreLoadSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "weak_net_pre_load_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final String getWhatsappFriendInviteTitle() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWhatsappFriendInviteTitle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWhatsappFriendInviteTitle();
        } catch (NullValueException unused) {
        }
        String str = (String) getProxyValue(this.hook, "whatsapp_friend_invite_title", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new NullValueException();
    }

    public final Integer getWhatsappMaxIdleDays() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWhatsappMaxIdleDays();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWhatsappMaxIdleDays();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "whatsapp_max_idle_days", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Integer getWideCameraInfo() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWideCameraInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWideCameraInfo();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "wide_camera_info", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final Boolean getWithCommerceEntry() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWithCommerceEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWithCommerceEntry();
        } catch (NullValueException unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "with_commerce_entry", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new NullValueException();
    }

    public final Integer getWsUseNewSdk() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWsUseNewSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWsUseNewSdk();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ws_use_new_sdk", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public final UpdateUserConfig getWxToastConfig() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getWxToastConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWxToastConfig();
        } catch (NullValueException unused) {
        }
        UpdateUserConfig updateUserConfig = (UpdateUserConfig) getProxyValue(this.hook, "wx_toast_config", UpdateUserConfig.class, (T) obj);
        if (updateUserConfig != null) {
            return updateUserConfig;
        }
        throw new NullValueException();
    }

    public final Integer getX2cSwitch() throws NullValueException {
        if (this.hook == null) {
            return this.rawValue.getX2cSwitch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getX2cSwitch();
        } catch (NullValueException unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "x2c_switch", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new NullValueException();
    }

    public IESSettingsProxy(IESSettings iESSettings, C10294b bVar) {
        this.rawValue = iESSettings;
        this.hook = bVar;
    }

    private static <T> T getProxyValue(C10294b bVar, String str, Class<T> cls, T t) {
        T t2;
        try {
            t2 = bVar.mo25017a(str, cls, t);
        } catch (Throwable unused) {
            t2 = t;
        }
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    private static <T> List<T> getProxyValue(C10294b bVar, String str, Class<T> cls, List<T> list) {
        List<T> list2;
        try {
            list2 = bVar.mo25018a(str, cls, list);
        } catch (Throwable unused) {
            list2 = list;
        }
        if (list2 != null) {
            return list2;
        }
        return list;
    }
}
