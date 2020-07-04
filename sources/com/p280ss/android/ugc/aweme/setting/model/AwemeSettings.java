package com.p280ss.android.ugc.aweme.setting.model;

import android.util.SparseArray;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.sdk.activity.model.AdLandingPageConfig;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.android.ugc.aweme.p1288h.C30218a;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21700d;
import com.p280ss.android.ugc.aweme.redpackage.model.CdnDomainRefresh;
import com.p280ss.android.ugc.aweme.setting.p1518f.C37630b;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.p1659a.C42021b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.aweme.wallet.C43396b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings */
public class AwemeSettings {
    @C6593c(mo15949a = "activity")
    public C30218a activityStruct;
    @C6593c(mo15949a = "ad_coupon_config")
    public AdCouponConfig adCouponConfig;
    @C6593c(mo15949a = "ad_display_time")
    public int adDisplayTime;
    @C6593c(mo15949a = "ad_intro_for_adversitser_flag")
    private int adIntroForAdversitser_flag;
    @C6593c(mo15949a = "ad_intro_landingpage_url")
    public String adIntroLandingpageUrl;
    @C6593c(mo15949a = "ad_landing_page_config")
    public AdLandingPageConfig adLandingPageConfig;
    @C6593c(mo15949a = "aweme_ad_link_priority")
    public List<String> adLinkPriority;
    @C6593c(mo15949a = "ad_web_container")
    public int adWebContainer;
    @C6593c(mo15949a = "at_friends_show_type")
    public int atFriendsShowType;
    @C6593c(mo15949a = "video_duration_limit_ms")
    public long avVideoDurationLimit = 1000;
    @C6593c(mo15949a = "avatar_decoration_enabled")
    public boolean avatarDecorationEnabled = false;
    @C6593c(mo15949a = "awe_network_x_token_disabled")
    public int aweNetworkXTokenDisabled;
    @C6593c(mo15949a = "aweme_switch_1")
    public int awemeSwitch1On;
    @C6593c(mo15949a = "aweme_switch_2")
    public int awemeSwitch2On;
    @C6593c(mo15949a = "awesome_splash_filter_enable")
    public boolean awesomeSplashFilterEnable = false;
    @C6593c(mo15949a = "beauty_model")
    public int beautyModel;
    @C6593c(mo15949a = "bind_fg_guide_texts")
    public List<String> bindFGGuideTexts;
    @C6593c(mo15949a = "bitrate_of_recode_threshold")
    public int bitrateOfRecodeThreshold = 10000000;
    @C6593c(mo15949a = "can_duet")
    public boolean canDuet;
    @C6593c(mo15949a = "im_switch")
    public int canIm = 1;
    @C6593c(mo15949a = "im_image_switch")
    public int canImSendPic;
    @C6593c(mo15949a = "can_show_insights")
    public boolean canInsights;
    @C6593c(mo15949a = "can_be_live_podcast")
    public boolean canLive;
    @C6593c(mo15949a = "can_react")
    public boolean canReact;
    @C6593c(mo15949a = "orange_cdn_config")
    public CdnDomainRefresh cdnDomainRefresh;
    @C6593c(mo15949a = "close_vframe_upload")
    public int closeFramesUpload;
    @C6593c(mo15949a = "comment_setting_enable")
    public int commentSettingEnable;
    @C6593c(mo15949a = "commerce_use_zhima")
    public int commerceUserZhima;
    @C6593c(mo15949a = "complete_profile_policy")
    public CompleteProfilePolicy completeProfilePolicy;
    @C6593c(mo15949a = "coupon_verification_list")
    public String couponVerificationList;
    @C6593c(mo15949a = "current_region")
    public String currentRegion;
    @C6593c(mo15949a = "default_avatar_uris")
    public List<String> defaultAvatarUrls;
    @C6593c(mo15949a = "default_cover_urls")
    public List<UrlModel> defaultCoverUrls;
    @C6593c(mo15949a = "react_mic_status")
    public int defaultMicState;
    @C6593c(mo15949a = "default_second_tab")
    public boolean defaultSecondTab;
    @C6593c(mo15949a = "default_shake_free_mode")
    public boolean defaultShakeFreeOn;
    @C6593c(mo15949a = "fp_upload_device_url")
    public String deviceInfoUrl = "";
    @C6593c(mo15949a = "device_monitor")
    public boolean deviceMonitor;
    @C6593c(mo15949a = "disable_age_gate")
    public int disableAgeGate;
    @C6593c(mo15949a = "disable_iid_in_share_url")
    public boolean disableIidInShareUrl;
    @C6593c(mo15949a = "disable_ucode_in_share_url")
    public boolean disableUCodeInShareUrl;
    @C6593c(mo15949a = "dmt_jsbridge_whitelist")
    public List<String> dmtJsBridgeWhiteList;
    @C6593c(mo15949a = "download_check_status")
    public Integer downloadCheckStatus;
    @C6593c(mo15949a = "download_forbidden_toast")
    public String downloadForbiddenToast;
    @C6593c(mo15949a = "is_download_micro_app")
    public int downloadMicroApp = 1;
    @C6593c(mo15949a = "download_sdk_config")
    public Object downloadSdkConfig;
    @C6593c(mo15949a = "enable_anti_aliasing")
    public boolean enableAntiAliasing;
    @C6593c(mo15949a = "enable_email_login")
    public boolean enableEmailLogin;
    @C6593c(mo15949a = "enable_face_to_face")
    public boolean enableFace2Face;
    @C6593c(mo15949a = "enable_fancy_qrcode")
    public int enableFancyQrcode;
    @C6593c(mo15949a = "enable_force_login")
    public int enableForceLogin = 1;
    @C6593c(mo15949a = "ftc_age_enable")
    public int enableFtcAgeGate;
    @C6593c(mo15949a = "enable_hardware_encode")
    public boolean enableHardwareEncode;
    @C6593c(mo15949a = "enable_home_scan_qrcode")
    public boolean enableHomeScanQrCode;
    @C6593c(mo15949a = "enable_hot_start_gps")
    public boolean enableHotStartGps = false;
    @C6593c(mo15949a = "enable_huawei_super_slow")
    public int enableHuaweiSuperSlowMotion;
    @C6593c(mo15949a = "enable_ijk_player")
    public int enableIJKHardwarePlayer;
    @C6593c(mo15949a = "enable_local_music_entrance")
    public boolean enableLocalMusicEntrance;
    @C6593c(mo15949a = "enable_passport_service")
    public boolean enablePassportService = true;
    @C6593c(mo15949a = "download_setting_enable")
    public int enablePrivacyDownloadSetting;
    @C6593c(mo15949a = "enable_profile_link")
    public boolean enableProfileActivity;
    @C6593c(mo15949a = "enable_read_fancy_qrcode")
    public int enableReadFancyQrcode;
    @C6593c(mo15949a = "enable_synthetic_fps_set")
    public boolean enableSyntheticFpsSet;
    @C6593c(mo15949a = "enable_twitter_new_key_secret")
    public boolean enableTwitterNewKeySecret = false;
    @C6593c(mo15949a = "enable_ultra_resolution")
    public boolean enableUltraResolution;
    @C6593c(mo15949a = "enable_upload_mobile_pcid")
    public boolean enableUploadPC = true;
    @C6593c(mo15949a = "enable_upload_sync_ins")
    public boolean enableUploadSyncIns = true;
    @C6593c(mo15949a = "enable_upload_sync_ins_story")
    public boolean enableUploadSyncInsStory = true;
    @C6593c(mo15949a = "enable_upload_sync_twitter")
    public boolean enableUploadSyncTwitter = true;
    @C6593c(mo15949a = "enable_water_bg_mask")
    public boolean enableWaterBgMask;
    @C6593c(mo15949a = "face_detect_interval")
    public int faceDetectInterval;
    @C6593c(mo15949a = "fe_config_collection")
    public FeConfigCollection feConfigCollection;
    @C6593c(mo15949a = "aweme_fe_conf")
    public AwemeFEConfigs feConfigs;
    @C6593c(mo15949a = "feed_display_inner_msg_platform")
    public int feedDisplayInnerMsgPlatform;
    @C6593c(mo15949a = "feed_tab")
    public int feedTab;
    @C6593c(mo15949a = "follow_feed_as_default")
    public int followFeedAsDefault;
    @C6593c(mo15949a = "show_follow_tab_following_limit")
    public int followPopularThreshold;
    @C6593c(mo15949a = "follow_feed_guide_settings")
    public FollowTabGuideStruct followTabGuideStruct;
    @C6593c(mo15949a = "forbid_download_local")
    public int forbidDownloadLocal;
    @C6593c(mo15949a = "forbid_life_story_local_watermark")
    public boolean forbidLifeStoryLocalWatermark;
    @C6593c(mo15949a = "forbid_local_watermark")
    public boolean forbidLocalWatermark;
    @C6593c(mo15949a = "force_use_textureview")
    public List<DeviceInfo> forceUseTextureviewDevices;
    @C6593c(mo15949a = "free_flow_card")
    public FreeFlowCard freeFlowCard;
    @C6593c(mo15949a = "free_flow_card_url_sticker")
    public String freeFlowCardUrl = "";
    @C6593c(mo15949a = "friend_tab_avatar_duration")
    public int friendTabAvatarDuration;
    @C6593c(mo15949a = "friend_tab_settings")
    public FriendTabStruct friendTabSettings;
    @C6593c(mo15949a = "aweme_game_config")
    public Object gameConfig;
    @C6593c(mo15949a = "aweme_gecko_offline_host_prefix")
    public List<String> geckoOfflineHostPrefix;
    @C6593c(mo15949a = "global_tips")
    public GlobalTips globalTips;
    @C6593c(mo15949a = "hashtag_regex")
    public String hashTagRegex;
    @C6593c(mo15949a = "hateful")
    public C37630b hateFulConfig;
    @C6593c(mo15949a = "wvalantine_activity_bg_profile_url")
    public String hitRankActivityProfileBackground;
    @C6593c(mo15949a = "wvalantine_activity_bg_url")
    public String hitRankActivityStarBackgroud;
    @C6593c(mo15949a = "wvalantine_activity_status")
    public int hitRankActivityStatus;
    @C6593c(mo15949a = "guide_word_display_settings")
    public HotSearchDisplay hotSearchDisplay;
    @C6593c(mo15949a = "hotsearch_switchs")
    public HotSearchWitch hotSearchWitch;
    @C6593c(mo15949a = "search_carousel_intervals")
    public int hotSearchWordShowIntervals;
    @C6593c(mo15949a = "hotsoon_download_url")
    public String hotsoonDownloadUrl;
    @C6593c(mo15949a = "http_retry_count")
    public int httpRetryCount;
    @C6593c(mo15949a = "http_retry_interval")
    public long httpRetryInterval;
    @C6593c(mo15949a = "http_timeout")
    public long httpTimeOut;
    @C6593c(mo15949a = "https_list")
    public ArrayList<String> httpsList;
    @C6593c(mo15949a = "user_login_window")
    public ThirdLoginSetting i18nThridLoginSetting;
    @C6593c(mo15949a = "im_comment_forward_enabled")
    public boolean imCommentForwardEnabled;
    @C6593c(mo15949a = "upload_video_size_category")
    public List<String> importVideoSizeCategory;
    @C6593c(mo15949a = "in_camera2_black_list")
    public int inCamera2BlackList;
    @C6593c(mo15949a = "in_evening")
    public int inEvening;
    @C6593c(mo15949a = "in_ultra_resolution_black_list")
    public boolean inUltraResBlackList;
    @C6593c(mo15949a = "info_sticker_max_count")
    public int infoStickerMaxCount;
    @C6593c(mo15949a = "is_eea_region")
    public Boolean isEEARegion;
    @C6593c(mo15949a = "enable_hq_vframe")
    public boolean isEnableHqVFrame;
    @C6593c(mo15949a = "is_europe_country")
    public boolean isEuropeCountry;
    @C6593c(mo15949a = "is_force_https")
    public int isForceHttps = 1;
    @C6593c(mo15949a = "with_commerce_entry")
    public boolean isGoodsWhiteUser;
    @C6593c(mo15949a = "is_npth_enable")
    public boolean isNpthEnable;
    @C6593c(mo15949a = "is_ob")
    public boolean isOb;
    @C6593c(mo15949a = "private_available")
    public boolean isPrivateAvailable;
    @C6593c(mo15949a = "is_show_gif_button")
    public int isShowGifButton;
    @C6593c(mo15949a = "nearby_tab")
    public boolean isShowNearByTab;
    @C6593c(mo15949a = "is_target_binding_user")
    public boolean isTargetBindingUser;
    @C6593c(mo15949a = "refresh_available")
    public boolean isUseBackRefresh;
    @C6593c(mo15949a = "is_use_ttnet")
    public boolean isUseTTnet;
    @C6593c(mo15949a = "is_use_tongdun_sdk")
    public boolean isUseTongdunSdk;
    @C6593c(mo15949a = "js_actlog_url")
    public String jsActLogUrl;
    @C6593c(mo15949a = "lab_title")
    public String labTitle;
    @C6593c(mo15949a = "live_default_bitrate")
    public int liveDefaultBitrate;
    @C6593c(mo15949a = "live_fe_conf")
    public LiveFEConfigs liveFEConfigs;
    @C6593c(mo15949a = "live_label_display_settings")
    private LiveLabelDisplaySettings liveLabelDisplaySettings;
    @C6593c(mo15949a = "live_max_bitrate")
    public int liveMaxBitrate;
    @C6593c(mo15949a = "live_min_bitrate")
    public int liveMinBitrate;
    @C6593c(mo15949a = "live_skylight_show_animation")
    public boolean liveSkylightShowAnimation;
    @C6593c(mo15949a = "live_use_zhima")
    public int liveUserZhima;
    @C6593c(mo15949a = "long_video_permitted")
    public boolean longVideoPermitted;
    @C6593c(mo15949a = "long_video_threshold")
    public long longVideoThreshold;
    @C6593c(mo15949a = "luban_entry_url")
    public String lubanEntryUrl;
    @C6593c(mo15949a = "tt_fusion_fuel_sdk_settings")
    public JSONObject mFusionFuelSdkSettings;
    @C6593c(mo15949a = "gdpr_cookies_url")
    public String mGDPRCookiesUrl;
    @C6593c(mo15949a = "gdpr_privacy_url")
    public String mGDPRPrivacyUrl;
    @C6593c(mo15949a = "aweme_gecko_conf")
    public GeckoConfig mGeckoConfig;
    @C6593c(mo15949a = "invite_friends_strategy")
    public int mInviteFriendsStrategy;
    @C6593c(mo15949a = "live_clarity_adapt_auto")
    public int mLiveClarityAdaptAuto;
    @C6593c(mo15949a = "live_shortcut_gift_id")
    public long mLiveShortcutGiftId;
    @C6593c(mo15949a = "show_invite_friends_entry")
    public boolean mShowInviteFriends;
    @C6593c(mo15949a = "video_upload_normalization_param")
    public int maxFansCount;
    @C6593c(mo15949a = "music_billboard_rule_url")
    public String musicBillboardRuleUrl;
    @C6593c(mo15949a = "music_copyright_granted")
    public boolean musicCopyRight;
    @C6593c(mo15949a = "musician_show_type")
    public int musicianShowType;
    @C6593c(mo15949a = "need_choose_languages")
    public String[] needChooseLanguages;
    @C6593c(mo15949a = "need_pre_load")
    public int needPreLoad = 1;
    @C6593c(mo15949a = "negative_share_entry")
    public String negativeShareEntry;
    @C6593c(mo15949a = "network_lib_type")
    public int netWorkLibType;
    @C6593c(mo15949a = "new_anchor_show_bubble")
    public boolean newAnchorShowBubble;
    @C6593c(mo15949a = "not_support_dou_devices")
    public List<DeviceInfo> notSupportDouDevices;
    @C6593c(mo15949a = "notice_close_time")
    public long noticeCloseTime;
    @C6593c(mo15949a = "notice_count_latency")
    public int noticeCountLatency;
    @C6593c(mo15949a = "old_style_challenge_ids")
    public Set<String> oldStyleChallengeIds;
    @C6593c(mo15949a = "open_forward")
    public int openForward;
    @C6593c(mo15949a = "orange_activity_info_use_api")
    public boolean orangeActivityInfoUseApi = false;
    @C6593c(mo15949a = "orginal_musician_url")
    public String orginalMusicianUrl;
    @C6593c(mo15949a = "original_musician_share_style")
    public boolean originalMusicianShare;
    @C6593c(mo15949a = "other_profile_landing_tabs")
    public List<Integer> otherProfileLandingTabs;
    @C6593c(mo15949a = "pic_qrcode_recognition_switch")
    public int picQrcodeRecognitionSwitch = 1;
    @C6593c(mo15949a = "policy_notice_enable")
    public boolean policyNoticeEnanble;
    @C6593c(mo15949a = "popWindowEveryTime_postaweme")
    public boolean popWindowEveryTimePostAweme;
    @C6593c(mo15949a = "popWindowEveryTime_postcomment")
    public boolean popWindowEveryTimePostComment;
    @C6593c(mo15949a = "privacy_reminder")
    public String privacyReminder = "";
    @C6593c(mo15949a = "private_permission")
    public int privatePermission;
    @C6593c(mo15949a = "profile_completion_threshold")
    public float profileCompletionThreshold;
    @C6593c(mo15949a = "profile_completion")
    public ProfilePerfection profilePerfection;
    @C6593c(mo15949a = "progressbar_threshold")
    public long progressBarThreshold;
    @C6593c(mo15949a = "story_publish_sync_duoshan")
    public C42021b publishSyncDuoshanAllConfig;
    @C6593c(mo15949a = "push_pre_permission_view")
    public PushPrePermissionView pushPrePermissionView;
    @C6593c(mo15949a = "qrcode_domain_whitelist")
    public List<String> qrcodeDomainWhiteList;
    @C6593c(mo15949a = "video_bitrate_category")
    public List<Float> recordBitrateCategory;
    @C6593c(mo15949a = "record_bitrate_mode")
    public int recordBitrateMode = 1;
    @C6593c(mo15949a = "record_camera_compat_level")
    public int recordCameraCompatLevel = 1;
    @C6593c(mo15949a = "record_camera_type")
    public int recordCameraType;
    @C6593c(mo15949a = "record_open_high_profile")
    public int recordHardwareProfile = 1;
    @C6593c(mo15949a = "video_quality_category")
    public List<Integer> recordQualityCategory;
    @C6593c(mo15949a = "shoot_tutorial_link")
    public String recordTutorialLink;
    @C6593c(mo15949a = "video_quality")
    public int recordVideoQuality;
    @C6593c(mo15949a = "redpackage_on")
    public boolean redPackageOn = true;
    @C6593c(mo15949a = "referral_program_url")
    public String referralProgramUrl;
    @C6593c(mo15949a = "refresh_zhima")
    public int refreshZhima;
    @C6593c(mo15949a = "region_of_residence")
    public String regionOfResidence;
    @C6593c(mo15949a = "remove_follower_switch")
    public boolean removeFollowerSwitch;
    @C6593c(mo15949a = "request_user_info_for_start")
    public boolean requestUserInfoForStart = false;
    @C6593c(mo15949a = "search_tab")
    public List<String> searchTabIndex;
    @C6593c(mo15949a = "search_trend_banner_url")
    public UrlModel searchTrendBannerUrl;
    @C6593c(mo15949a = "self_profile_landing_tabs")
    public List<Integer> selfProfileLandingTabs;
    @C6593c(mo15949a = "self_see_watermark_switch")
    public boolean selfSeeWaterMarkSwitch = true;
    @C6593c(mo15949a = "settings_change_test")
    public int settingChangeTest;
    @C6593c(mo15949a = "settings_version")
    public String settingVersion;
    @C6593c(mo15949a = "shake_free_white_list")
    public int shakeFreeWhiteList;
    @C6593c(mo15949a = "share_direct_with_pic")
    public boolean sharePictureDirect;
    @C6593c(mo15949a = "share_url_whitelist")
    public WhiteList shareUrlWhiteList;
    @C6593c(mo15949a = "share_h5_url_whitelist")
    public List<String> share_h5_url_whitelist;
    @C6593c(mo15949a = "shield_music_sdk")
    public boolean shieldMusicSDK;
    @C6593c(mo15949a = "shopping")
    public ShoppingConfig shoppingConfig;
    @C6593c(mo15949a = "download_setting_desc_enable")
    public boolean showAllowDownloadTip;
    @C6593c(mo15949a = "show_creator_license_230")
    public ShowCreatorLicense showCreatorLicense;
    @C6593c(mo15949a = "enable_hashtag_profile")
    public int showHashTagBg;
    @C6593c(mo15949a = "show_interaction_stickers")
    public boolean showInteractionStickers;
    @C6593c(mo15949a = "show_large_gif")
    public boolean showLargeGif = false;
    @C6593c(mo15949a = "story_support_animate")
    public boolean showLastStoryFrame;
    @C6593c(mo15949a = "show_live_rewards")
    public int showLiveRewards;
    @C6593c(mo15949a = "original_musician_entry")
    public boolean showOriginalMusicianEntry;
    @C6593c(mo15949a = "show_creator_license_210")
    public int showPromoteLicense;
    @C6593c(mo15949a = "fresh_tab")
    public int showTimeLineTab;
    @C6593c(mo15949a = "shutter_sound_enable")
    public boolean shutterSoundEnable;
    @C6593c(mo15949a = "sort_speed_enable")
    public boolean sortSpeedEnable = false;
    @C6593c(mo15949a = "sp")

    /* renamed from: sp */
    public C37662Sp f98128sp;
    @C6593c(mo15949a = "splash_image_center")
    public boolean splashImageCenter = (!C6399b.m19944t());
    @C6593c(mo15949a = "splash_support_timeout")
    public boolean splashSupportTimeOut = false;
    @C6593c(mo15949a = "splash_video_center")
    public boolean splashVideoCenter = (!C6399b.m19944t());
    @C6593c(mo15949a = "life_effects_cold_req")
    public boolean springEffectCacheController = true;
    @C6593c(mo15949a = "star_atlas_setting")
    private StarAtlasSetting starAtlasSetting;
    @C6593c(mo15949a = "star_billboard_rule_url")
    public String starBillboardRuleUrl;
    @C6593c(mo15949a = "sticker_artist_entry")
    public boolean stickerArtistEntry;
    @C6593c(mo15949a = "sticker_artist_url")
    public String stickerArtistUrl;
    @C6593c(mo15949a = "effect_font_list")
    public List<C42038c> storyFontDataList;
    @C6593c(mo15949a = "story_friend_banner_switch")
    public int storyFriendBannerSwitch;
    @C6593c(mo15949a = "story_friend_banner_url")
    public String storyFriendBannerUrl;
    @C6593c(mo15949a = "story_image_play_time")
    public int storyImagePlayTime;
    @C6593c(mo15949a = "sync_to_toutiao")
    public int syncToTT;
    @C6593c(mo15949a = "sync_to_toutiao_url")
    public String syncToTTUrl;
    @C6593c(mo15949a = "synthetic_video_bitrate")
    public float syntheticVideoBitrate;
    @C6593c(mo15949a = "synthetic_video_gop")
    public int syntheticVideoGop = 35;
    @C6593c(mo15949a = "synthetic_video_maxrate")
    public long syntheticVideoMaxRate = 15000000;
    @C6593c(mo15949a = "synthetic_video_preset")
    public int syntheticVideoPreset;
    @C6593c(mo15949a = "synthetic_video_quality")
    public int syntheticVideoQuality;
    @C6593c(mo15949a = "tencent_sdk_disabled")
    public boolean tencentSdkDisabled;
    @C6593c(mo15949a = "text_sticker_max_count")
    public int textStickerMaxCount;
    @C6593c(mo15949a = "third_login_bind_settings")
    public C21700d thirdPlatformLoginSettings;
    @C6593c(mo15949a = "tt_device_info_collect_controller")
    public TTDeviceInfoCollectController ttDeviceInfoCollectController;
    @C6593c(mo15949a = "ttregion")
    public boolean ttRegion;
    @C6593c(mo15949a = "ttnet_route")
    public boolean ttRoute;
    @C6593c(mo15949a = "ttplayer_buffer_duration_switch")
    public int ttplayerBufferDuration;
    @C6593c(mo15949a = "ultra_resolution_level")
    public int ultraResolutionLevel;
    @C6593c(mo15949a = "wx_toast_config")
    public UpdateUserConfig updateUserConfig;
    @C6593c(mo15949a = "upload_origin_audio_track")
    public boolean uploadOriginAudioTrack;
    @C6593c(mo15949a = "upload_contacts_policy_caption")
    public String upload_contacts_policy_caption;
    @C6593c(mo15949a = "upload_contacts_policy_interval")
    public int upload_contacts_policy_interval;
    @C6593c(mo15949a = "upload_contacts_policy_pic")
    public String upload_contacts_policy_pic;
    @C6593c(mo15949a = "upload_contacts_policy_text")
    public String upload_contacts_policy_text;
    @C6593c(mo15949a = "upload_contacts_policy_times")
    public int upload_contacts_policy_times;
    @C6593c(mo15949a = "use_hardcode")
    public int useHardcode;
    @C6593c(mo15949a = "enable_large_gesture_detect_model")
    public boolean useLargeDetectModel = true;
    @C6593c(mo15949a = "enable_large_matting_detect_model")
    public boolean useLargeMattingModel = false;
    @C6593c(mo15949a = "use_live_wallpaper")
    public int useLiveWallpaper;
    @C6593c(mo15949a = "awe_security_center_v2")
    public int useNewDouyinSaftyCenter;
    @C6593c(mo15949a = "use_new_ffmpeg")
    public boolean useNewFFmpeg;
    @C6593c(mo15949a = "use_synthetic_hardcode")
    public int useSyntheticHardcode;
    @C6593c(mo15949a = "use_watermark_hardcode")
    public boolean useWatermarkHardcode;
    @C6593c(mo15949a = "cache_user_recommend")
    public UserCacheSetting userCacheSetting;
    @C6593c(mo15949a = "verify_exceed")
    public int verifyExceed;
    @C6593c(mo15949a = "user_badge_click_settings")
    public VerifyTypeSetting verifyTypeSetting;
    @C6593c(mo15949a = "video_bitrate")
    public float videoBitrate;
    @C6593c(mo15949a = "video_commit")
    public int videoCommit;
    @C6593c(mo15949a = "video_compose")
    public int videoCompose;
    @C6593c(mo15949a = "video_preload_size")
    public int videoPreloadSize = VideoPreloadSizeExperiment.DEFAULT;
    @C6593c(mo15949a = "video_size")
    public String videoSize;
    @C6593c(mo15949a = "video_size_category")
    public List<String> videoSizeCategory;
    @C6593c(mo15949a = "wallet_conf")
    public C43396b walletConfig;
    @C6593c(mo15949a = "weak_net_pre_load_switch")
    public int weakNetPreLoadSwitch = 1;
    @C6593c(mo15949a = "wide_camera_info")
    public int wideCameraInfo;
    @C6593c(mo15949a = "x2c_switch")
    public int x2cSwitch;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$AdCouponConfig */
    public static class AdCouponConfig {
        @C6593c(mo15949a = "show")
        public int show;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$AwemeFEConfigs */
    public static class AwemeFEConfigs {
        @C6593c(mo15949a = "business_ec")
        public BusinessEC businessEC;
        @C6593c(mo15949a = "goods_report")
        public GoodsReport goodsReport;
        @C6593c(mo15949a = "link_plan")
        public LinkPlan linkPlan;
        @C6593c(mo15949a = "live")
        public ShopLiveConfig live;
        @C6593c(mo15949a = "mp_tab")
        public MpTab mpTab;
        @C6593c(mo15949a = "poi_error_report")
        public PoiConfig poiConfig;
        @C6593c(mo15949a = "seeding")
        public Seeding seeding;
        @C6593c(mo15949a = "star_atlas_order")
        public StarAtlasOrder starAtlasOrder;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$BusinessEC */
    public static class BusinessEC {
        @C6593c(mo15949a = "page_eshop_toolbox")
        public String pageEShopToolbox;
        @C6593c(mo15949a = "page_edit")
        public String pageEdit;
        @C6593c(mo15949a = "page_home")
        public String pageHome;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$CompleteProfilePolicy */
    public static class CompleteProfilePolicy {
        public int interval;
        public int times;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$DeviceInfo */
    public static class DeviceInfo {
        @C6593c(mo15949a = "brand")
        public String brand;
        @C6593c(mo15949a = "device")
        public String device;
        @C6593c(mo15949a = "model")
        public String model;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FEConfig */
    public static class FEConfig {
        @C6593c(mo15949a = "fallback_url")
        public String fallbackUrl;
        @C6593c(mo15949a = "schema")
        public String schema;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FeConfigCollection */
    public static class FeConfigCollection {
        @C6593c(mo15949a = "billboard_fans")
        public FEConfig billboardFans;
        @C6593c(mo15949a = "billboard_star")
        public FEConfig billboardStar;
        @C6593c(mo15949a = "brand_rank")
        public FEConfig brandRank;
        @C6593c(mo15949a = "douyincard")
        public FEConfig douyincard;
        @C6593c(mo15949a = "guardian_child")
        public FEConfig guardianChild;
        @C6593c(mo15949a = "guardian_parent")
        public FEConfig guardianParent;
        @C6593c(mo15949a = "judgment_clause")
        public FEConfig judgementClause;
        @C6593c(mo15949a = "ringtone")
        public FEConfig ringtone;
        @C6593c(mo15949a = "teen_protection")
        public FEConfig teenageProtection;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FreeFlowCard */
    public static class FreeFlowCard {
        @C6593c(mo15949a = "toast_url_text")
        public String dialogContent = "";
        @C6593c(mo15949a = "toast_slogan")
        public String dialogSlogan;
        @C6593c(mo15949a = "toast_title")
        public String dialogTitle = "";
        @C6593c(mo15949a = "toast_type")
        public int dialogType;
        @C6593c(mo15949a = "toast_url")
        public String dialogUrl = "";
        @C6593c(mo15949a = "entry_url_text")
        public String settingsTitle = "";
        @C6593c(mo15949a = "entry_url")
        public String settingsUrl = "";

        public String toString() {
            StringBuilder sb = new StringBuilder("FreeFlowCard{dialogUrl='");
            sb.append(this.dialogUrl);
            sb.append('\'');
            sb.append(", settingsTitle='");
            sb.append(this.settingsTitle);
            sb.append('\'');
            sb.append(", settingsUrl='");
            sb.append(this.settingsUrl);
            sb.append('\'');
            sb.append(", dialogTitle='");
            sb.append(this.dialogTitle);
            sb.append('\'');
            sb.append(", dialogContent='");
            sb.append(this.dialogContent);
            sb.append('\'');
            sb.append(", dialogType=");
            sb.append(this.dialogType);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GeckoConfig */
    public static class GeckoConfig {
        @C6593c(mo15949a = "initial_high_priority_channel")
        public List<String> initialHighPriorityChannels;
        @C6593c(mo15949a = "dyc_channel")
        public List<String> mDynamicChannels;
        @C6593c(mo15949a = "initial_channel")
        public List<String> mInitChannels;
        @C6593c(mo15949a = "rn_context_create_timeout")
        public int rnContextCreateTimeOut;
        @C6593c(mo15949a = "rn_preload_context")
        public boolean rnPreloadContextOn = true;
        @C6593c(mo15949a = "rn_use_snapshot")
        public boolean rnSnapShotOn = true;
        @C6593c(mo15949a = "use_new_package_now")
        public boolean useNewPackageNow;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GlobalTips */
    public static class GlobalTips {
        public String at_too_more = "";
        public String draft_publish = "";
        public String net_weak = "";
        public String not_comment = "";
        public String not_has_more = "";
        public String not_share = "";
        public String search_tips = "";
        public String self_see_not_share = "";
        public String share_fail = "";

        public static SparseArray<String> buildGlobalTipsMap(GlobalTips globalTips) {
            SparseArray<String> sparseArray = new SparseArray<>();
            sparseArray.put(R.string.c8n, globalTips.at_too_more);
            sparseArray.put(R.string.w5, globalTips.not_comment);
            sparseArray.put(R.string.w7, globalTips.not_share);
            sparseArray.put(R.string.dib, globalTips.draft_publish);
            sparseArray.put(R.string.cjt, globalTips.net_weak);
            sparseArray.put(R.string.dlr, globalTips.self_see_not_share);
            return sparseArray;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GoodsReport */
    public static class GoodsReport {
        @C6593c(mo15949a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HonorLevel */
    public static class HonorLevel {
        @C6593c(mo15949a = "schema")
        public String schema;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HotSearchDisplay */
    public static class HotSearchDisplay {
        @C6593c(mo15949a = "one_display_intervals")
        public long normalGuideDisplayTimeIntervals;
        @C6593c(mo15949a = "most_display_times")
        public int normalGuideDisplayTimes;
        @C6593c(mo15949a = "op_one_display_intervals")
        public long operationGuideDisplayTimeIntervals;
        @C6593c(mo15949a = "op_most_display_times")
        public int operationGuideDisplayTimes;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HotSearchWitch */
    public static class HotSearchWitch {
        @C6593c(mo15949a = "hotsearch_aweme_billboard_switch")
        public boolean isHotSearchAwemeBillboardEnable;
        @C6593c(mo15949a = "hotsearch_billboard_switch")
        public boolean isHotSearchBillboardEnable;
        @C6593c(mo15949a = "hotsearch_music_billboard_switch")
        public boolean isHotSearchMusicBillboardEnable;
        @C6593c(mo15949a = "hotsearch_positive_energy_billboard_switch")
        public boolean isHotSearchPositiveEnergyBillboardEnable;
        @C6593c(mo15949a = "hotsearch_star_billboard_switch")
        public boolean isHotSearchStarBillboardEnable;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LinkPlan */
    public static class LinkPlan {
        @C6593c(mo15949a = "publish")
        public String publish;
        @C6593c(mo15949a = "settings")
        public String settings;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LiveFEConfigs */
    public static class LiveFEConfigs {
        @C6593c(mo15949a = "honor_level")
        public HonorLevel honorLevel;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LiveLabelDisplaySettings */
    public static class LiveLabelDisplaySettings {
        @C6593c(mo15949a = "display_duration")
        public long displayDuration;
        @C6593c(mo15949a = "display_intervals")
        public long displayIntervals;
        @C6593c(mo15949a = "most_display_times")
        public int mostDisplayTimes;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$MpTab */
    public static class MpTab {
        @C6593c(mo15949a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$PoiConfig */
    public static class PoiConfig {
        @C6593c(mo15949a = "poi_detail")
        public String poiDetail;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ProfilePerfection */
    public static class ProfilePerfection {
        public float avatar;
        public float birthday;
        public float gender;
        public float location;
        public float nickname;
        public float school;
        @C6593c(mo15949a = "short_id")
        public float shortId;
        public float signature;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$PushPrePermissionView */
    public static class PushPrePermissionView {
        @C6593c(mo15949a = "toast_text")
        public String toastText;
        @C6593c(mo15949a = "toast_title")
        public String toastTitle;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$Seeding */
    public static class Seeding {
        @C6593c(mo15949a = "shop_wish_list_url")
        public String shopWishListUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShopLiveConfig */
    public static class ShopLiveConfig {
        @C6593c(mo15949a = "merch_picker_url")
        public String merchPickerUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingConfig */
    public static class ShoppingConfig {
        @C6593c(mo15949a = "enable")
        public boolean enable;
        @C6593c(mo15949a = "enable_float_video")
        public boolean enableFloatVideo = true;
        @C6593c(mo15949a = "enable_user")
        public boolean enableUser;
        @C6593c(mo15949a = "law_window")
        public boolean lawWindow;
        @C6593c(mo15949a = "live")
        public ShoppingLiveConfig liveConfig;
        @C6593c(mo15949a = "newbie_help")
        public ShoppingNewbieHelp newbieHelp;
        @C6593c(mo15949a = "order_share_intro_url")
        public String orderShareIntroUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingLiveConfig */
    public static class ShoppingLiveConfig {
        @C6593c(mo15949a = "compatible_with_old_version")
        public boolean commerceLiveCompatibleOld;
        @C6593c(mo15949a = "disable_taobao")
        public int disableTaobao;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingNewbieHelp */
    public static class ShoppingNewbieHelp {
        @C6593c(mo15949a = "shop_url")
        public String shopUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShowCreatorLicense */
    public static class ShowCreatorLicense {
        @C6593c(mo15949a = "click_type")
        public int clickType;
        @C6593c(mo15949a = "popup_content")
        public String content;
        @C6593c(mo15949a = "popup_interval")
        public int interval;
        @C6593c(mo15949a = "popup_linkText")
        public String linkText;
        @C6593c(mo15949a = "popup_msg")
        public String msg;
        @C6593c(mo15949a = "show")
        public int show;
        @C6593c(mo15949a = "popup_times_limit")
        public int timeLimit;
        @C6593c(mo15949a = "popup_title")
        public String title;
        @C6593c(mo15949a = "popup_url")
        public String url;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$StarAtlasOrder */
    public static class StarAtlasOrder {
        @C6593c(mo15949a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$StarAtlasSetting */
    public static class StarAtlasSetting {
        @C6593c(mo15949a = "star_atlas_enable")
        public boolean starAtlasEnable = true;
        @C6593c(mo15949a = "star_atlas_redirect_url")
        public String starAtlasRedirectUrl;
        @C6593c(mo15949a = "star_atlas_url")
        public String starAtlasUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$UpdateUserConfig */
    public static class UpdateUserConfig {
        @C6593c(mo15949a = "wx_toast_enable")
        public boolean enableUpdateUserDialog;
        @C6593c(mo15949a = "wx_toast_frequence")
        public int updateUserFrequency;
        @C6593c(mo15949a = "wx_toast_content")
        public String updateUserPolicyContent;
        @C6593c(mo15949a = "wx_toast_position")
        public int updateUserPosition = -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$UserCacheSetting */
    public static class UserCacheSetting {
        @C6593c(mo15949a = "enable_ru_insert")
        public int enableCacheUserInsert;
        @C6593c(mo15949a = "enable_ru_cache")
        public int enableUserCache;
        @C6593c(mo15949a = "ru_cache_intervals")
        public long fetchUserCacheIntervals;
    }

    public boolean getAdIntroForAdversitserFlag() {
        if (this.adIntroForAdversitser_flag == 1) {
            return true;
        }
        return false;
    }

    public boolean getNeedPreLoad() {
        if (this.needPreLoad == 1) {
            return true;
        }
        return false;
    }

    public int getSharePictureDirect() {
        if (this.sharePictureDirect) {
            return 1;
        }
        return 0;
    }

    public boolean isChangeFollowTab() {
        if (this.feedTab == 1) {
            return true;
        }
        return false;
    }

    public boolean isShowTimeLineTab() {
        if (this.showTimeLineTab == 1) {
            return true;
        }
        return false;
    }

    public long getDisplayDuration() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayDuration;
    }

    public long getDisplayIntervals() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayIntervals;
    }

    public int getMostDisplayTimes() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.mostDisplayTimes;
    }

    public String getSearchTabIndex() {
        return new C6600e().mo15979b((Object) this.searchTabIndex);
    }

    public String getStarAtlasRedirectUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasRedirectUrl;
    }

    public String getStarAtlasUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasUrl;
    }

    public boolean isStarAtlasNoticeEnable() {
        if (this.starAtlasSetting == null || this.starAtlasSetting.starAtlasEnable) {
            return true;
        }
        return false;
    }

    public AwemeSettings setDefaultSecondTab(boolean z) {
        this.defaultSecondTab = z;
        return this;
    }

    public AwemeSettings setDisableAgeGate(int i) {
        this.disableAgeGate = i;
        return this;
    }

    public AwemeSettings setEnableFtcAgeGate(int i) {
        this.enableFtcAgeGate = i;
        return this;
    }

    public AwemeSettings setFriendTabSettings(FriendTabStruct friendTabStruct) {
        this.friendTabSettings = friendTabStruct;
        return this;
    }

    public AwemeSettings setHttpsList(ArrayList<String> arrayList) {
        this.httpsList = arrayList;
        return this;
    }

    public AwemeSettings setIsForceHttps(int i) {
        this.isForceHttps = i;
        return this;
    }

    public AwemeSettings setUseTTnet(boolean z) {
        this.isUseTTnet = z;
        return this;
    }

    public AwemeSettings setUseTongdunSdk(boolean z) {
        this.isUseTongdunSdk = z;
        return this;
    }
}
