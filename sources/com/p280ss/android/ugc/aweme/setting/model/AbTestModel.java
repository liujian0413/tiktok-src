package com.p280ss.android.ugc.aweme.setting.model;

import com.bytedance.ies.abmock.ABModel;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.account.model.C6862d;
import com.p280ss.android.ugc.aweme.setting.p336a.C7204b;
import com.p280ss.android.ugc.aweme.setting.p336a.C7205f;
import com.p280ss.android.ugc.aweme.setting.p336a.C7206i;

/* renamed from: com.ss.android.ugc.aweme.setting.model.AbTestModel */
public class AbTestModel extends ABModel implements C6862d {
    public static final boolean AWEME_SPLASH_FIRST_LAUNCH_ENABLED_DEFAULT = true;
    @C6593c(mo15949a = "america_record_optim_new")
    @C7206i(mo18699a = "美国拍摄器优化", mo18700b = {0, 1, 2, 3}, mo18701c = {"不使用美国拍摄器", "使用美国拍摄器", "美拍上传引导方案A", "美拍上传引导方案B"})
    public int americaRecordOptim;
    @C6593c(mo15949a = "unlogin_anti_addicted_continuous_use_time")
    @C7206i(mo18699a = "防沉迷强制登录单次连续使用时长", mo18700b = {10, 30})
    @C7205f(mo18698a = "登录和账户")
    public int antiAddictedContinuousUseTime;
    @C6593c(mo15949a = "unlogin_anti_addicted_enable_login_guide")
    @C7204b(mo18696a = "启动强制登录策略", mo18697b = "关闭强制登录策略")
    @C7205f(mo18698a = "登录和账户")
    public boolean antiAddictedLoginGuideEnable;
    @C6593c(mo15949a = "unlogin_anti_addicted_enable_skip_login_guide")
    @C7204b(mo18696a = "允许跳过强制登录", mo18697b = "不允许跳过")
    @C7205f(mo18698a = "登录和账户")
    private boolean antiAddictedSkipLoginEnable;
    @C6593c(mo15949a = "unlogin_anti_addicted_total_use_time")
    @C7206i(mo18699a = "防沉迷强制登录每日连续使用时长", mo18700b = {45, 60})
    @C7205f(mo18698a = "登录和账户")
    private int antiAddictedTotalUseTime;
    @C6593c(mo15949a = "poi_nearby_live_stream")
    @C7206i(mo18699a = "POI同城直播自动播放", mo18700b = {0, 1}, mo18701c = {"对照组-关闭", "实验组-开启"})
    @C7205f(mo18698a = "POI")
    public int autoPlayLive;
    @C6593c(mo15949a = "aweme_setting_asyn")
    @C7206i(mo18699a = "Setting异步优化", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    @C7205f(mo18698a = "UG和分享")
    public int awemeSettingAsyn = 1;
    @C6593c(mo15949a = "aweme_splash_first_launch_enabled")
    @C7204b(mo18696a = "开启原生开屏首刷", mo18697b = "关闭原生开屏首刷")
    @C7205f(mo18698a = "商业化")
    public boolean awemeSplashFirstLaunchEnabled = true;
    @C6593c(mo15949a = "awesome_splash_ad_delay_millis")
    @C7206i(mo18699a = "原生开屏展示延迟*ms", mo18700b = {0, 500, 100, 1500})
    @C7205f(mo18698a = "商业化")
    public int awesomeSplashAdDelayMillis;
    @C6593c(mo15949a = "awesome_splash_init_profile_delay_disable")
    @C7204b(mo18696a = "原生开屏不delay个人页的初始化", mo18697b = "原生开屏保留原有逻辑，依然delay个人页的初始化")
    @C7205f(mo18698a = "商业化")
    public boolean awesomeSplashInitProfileDelayDisable;
    @C6593c(mo15949a = "ban_recommend_slide_story_carema")
    @C7206i(mo18699a = "实验：禁掉推荐页左滑进入随拍相机", mo18700b = {0, 1}, mo18701c = {"线上", "禁掉推荐页左滑进入随拍相机"})
    @C7205f(mo18698a = "关注Tab")
    public int banRecommendSlideStoryCarema;
    @C6593c(mo15949a = "bind_fg_guide_text_index")
    @C7206i(mo18699a = "绑定 fg notice 文案", mo18700b = {-1, 0, 1}, mo18701c = {"不显示", "显示第一条文案", "显示第二条文案"})
    @C7205f(mo18698a = "登录和账户")
    public int bindFGGuideTextIndex = -1;
    @C6593c(mo15949a = "bind_phone_for_post_im")
    @C7206i(mo18699a = "私信绑定", mo18700b = {10, 20, 21, 30, 40}, mo18701c = {"无限制", "每次", "一次", "自见", "强绑"})
    @C7205f(mo18698a = "IM")
    public int bindPhoneForIm = 10;
    @C6593c(mo15949a = "bind_phone_for_post_aweme")
    @C7206i(mo18699a = "发布视频绑定", mo18700b = {10, 20, 21, 30, 40}, mo18701c = {"无限制", "可以发送(每次都出)", "可以发送(一次)", "只能自见", "无法发送"})
    @C7205f(mo18698a = "价值观")
    public int bindPhoneForPostAweme = 10;
    @C6593c(mo15949a = "block_v1")
    @C7204b(mo18696a = "不上报1.0的点", mo18697b = "上报1.0的点")
    @C7205f(mo18698a = "埋点")
    public boolean blockV1;
    @C6593c(mo15949a = "block_v3_double_send")
    @C7204b(mo18696a = "不上报staging_flag", mo18697b = "上报staging_flag")
    @C7205f(mo18698a = "埋点")
    public boolean blockV3DoubleSend;
    @C6593c(mo15949a = "categorylist_use_v2")
    @C7206i(mo18699a = "I18n使用", mo18700b = {0, 1}, mo18701c = {"V1接口", "V2接口"})
    @C7205f(mo18698a = "发现")
    public int categoryListUseV2;
    @C6593c(mo15949a = "click_sky_enter_live_feed")
    @C7206i(mo18699a = "实验组：天窗按钮样式以及打开或者进入直播广场", mo18700b = {1, 0}, mo18701c = {"进入直播广场", "打开天窗"})
    @C7205f(mo18698a = "live")
    public int clickSkyEnterLiveFeed;
    @C6593c(mo15949a = "weibo_entry_close")
    @C7206i(mo18699a = "关闭微博入口", mo18700b = {0, 1})
    public int closeWeiboEntry;
    @C6593c(mo15949a = "new_combo_send_gift")
    @C7206i(mo18699a = "礼物面板送礼样式", mo18700b = {0, 1}, mo18701c = {"老版本送礼", "新礼物连送"})
    public int comboGiftSendStyle;
    @C6593c(mo15949a = "comment_bgcolor_type")
    @C7206i(mo18699a = "评论背景颜色", mo18700b = {1, 0}, mo18701c = {"白", "黑"})
    @C7205f(mo18698a = "评论")
    public int commentBG = 1;
    @C6593c(mo15949a = "comment_reply_grouped_by_conversation")
    @C7206i(mo18699a = "二级评论是否以对话聚合", mo18700b = {0, 1}, mo18701c = {"不聚合，混合序", "以对话聚合"})
    @C7205f(mo18698a = "评论")
    private int commentReplyGroupedByConversation;
    @C6593c(mo15949a = "comment_support_gif_emoji")
    @C7206i(mo18699a = "评论支持大表情", mo18700b = {0, 1, 2, 3}, mo18701c = {"不支持", "可见不可发", "打压，尽量不可见，不可发", "可见可发"})
    @C7205f(mo18698a = "评论")
    public int commentSupportGifEmoji;
    @C6593c(mo15949a = "commerce_splash_optimize_enable")
    @C7204b(mo18696a = "开启开屏sdk调用优化", mo18697b = "关闭开屏sdk调用优化")
    @C7205f(mo18698a = "商业化")
    public boolean commerceSplashOptimizeEnable = true;
    @C6593c(mo15949a = "enable_good_search")
    @C7206i(mo18699a = "商品搜索", mo18700b = {0, 1}, mo18701c = {"关闭商品搜索", "开启商品搜索"})
    @C7205f(mo18698a = "搜索")
    public int commoditySearchState;
    @C6593c(mo15949a = "common_video_optimize")
    @C7204b(mo18696a = "开启普通视频广告逻辑优化", mo18697b = "关闭普通视频广告逻辑优化")
    @C7205f(mo18698a = "商业化")
    public boolean commonVideoOptimize;
    @C7204b(mo18696a = "开启code_coverage上报", mo18697b = "关闭code_coverage上报")
    @C7205f(mo18698a = "基础业务")
    public boolean constructor_coverage;
    @C6593c(mo15949a = "contact_optimize_strategy")
    @C7206i(mo18699a = "登陆引导通讯录", mo18700b = {0, 1}, mo18701c = {"线上样式", "登陆后上传通讯录"})
    @C7205f(mo18698a = "好友")
    public int contactOptimizeStrategy;
    @C6593c(mo15949a = "d_bind_phone_after_third_party_login")
    @C7204b(mo18696a = "启动第三方登陆后绑定手机", mo18697b = "关闭第三方登陆后绑定手机")
    @C7205f(mo18698a = "登录和账户")
    private boolean dBindPhoneAfterThirdPartyLogin;
    @C6593c(mo15949a = "use_new_login_style")
    @C7206i(mo18699a = "抖音登陆界面", mo18700b = {0, 1}, mo18701c = {"抖音紫色登陆界面", "抖音白色登陆界面"})
    @C7205f(mo18698a = "登录和账户")
    private int dUseNewLoginStyle;
    @C6593c(mo15949a = "deeplink_retarget_enable")
    @C7206i(mo18699a = "是否启用retarget Toast", mo18700b = {0, 1}, mo18701c = {"不启用", "启用"})
    @C7205f(mo18698a = "UG和分享")
    public int deeplinkRetargetEnable;
    @C6593c(mo15949a = "play_tab_switch")
    public int defaultRecordTab = 1;
    @C6593c(mo15949a = "direct_shoot")
    public int direct_shoot;
    @C6593c(mo15949a = "disable_async_userchanged")
    @C7204b(mo18696a = "使用异步更新user回调", mo18697b = "不使用异步更新user回调")
    @C7205f(mo18698a = "Feed")
    public boolean disableAsyncAccountOnChange;
    @C6593c(mo15949a = "disable_search_refresh")
    @C7206i(mo18699a = "禁用掉刷新功能", mo18700b = {0, 1}, mo18701c = {"不禁用", "禁用"})
    @C7205f(mo18698a = "搜索")
    public int disableSearchRefresh;
    @C6593c(mo15949a = "discover_mvp")
    @C7206i(mo18699a = "发现激进演化", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    @C7205f(mo18698a = "发现")
    private int discoverMvpMode;
    @C6593c(mo15949a = "dongtai_strategy")
    public int dongtaiStrategy;
    @C6593c(mo15949a = "douplus_entry_style")
    @C7206i(mo18699a = "dou+入口增强", mo18700b = {1, 2})
    @C7205f(mo18698a = "Dou+")
    public int douPlusEntryStyle = 1;
    @C6593c(mo15949a = "douyin_login_white_interface")
    @C7206i(mo18699a = "抖音新登陆界面", mo18700b = {0, 1, 2}, mo18701c = {"抖音紫色登陆界面", "抖音白色一步登录", "抖音白色两步登录"})
    @C7205f(mo18698a = "登录和账户")
    private int douyinLoginWhiteInterface = 2;
    @C6593c(mo15949a = "enable_ab_test_sdk")
    @C7204b(mo18696a = "打开ABsdk测试", mo18697b = "关闭ABsdk测试")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableAbTestSdk = true;
    @C6593c(mo15949a = "enable_bodydance")
    @C7204b(mo18696a = "打开尬舞", mo18697b = "关闭尬舞")
    public boolean enableBodydance;
    @C6593c(mo15949a = "enable_caption_watermark")
    @C7204b(mo18696a = "打开Caption水印下载", mo18697b = "关闭Caption水印下载")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableCaptionWatermark;
    @C6593c(mo15949a = "enable_company_profile_page_optimize")
    @C7204b(mo18696a = "商家转换组件优化关", mo18697b = "商家转换组件优化开")
    @C7205f(mo18698a = "个人页")
    public boolean enableCompanyProfilePageOptimize;
    @C6593c(mo15949a = "enable_concern_live_slide")
    @C7204b(mo18696a = "关注天窗直播支持上下滑", mo18697b = "关注天窗直播不支持上下滑")
    @C7205f(mo18698a = "live")
    public boolean enableConcernLiveSlide = true;
    @C6593c(mo15949a = "country_roaming_enable")
    @C7206i(mo18699a = "数据漫游", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    @C7205f
    private int enableContentRoaming;
    @C6593c(mo15949a = "enable_editor_screen_adaptation")
    @C7204b(mo18696a = "生产端适配全面屏", mo18697b = "生产端不适配全面屏")
    public boolean enableEditorScreenAdaptation;
    @C6593c(mo15949a = "use_effect_lru_cache")
    @C7204b(mo18696a = "使用DiskLRUCache", mo18697b = "不使用DiskLRUCache")
    @C7205f(mo18698a = "基础业务")
    public boolean enableEffectDiskCache = true;
    @C6593c(mo15949a = "followtab_user_recommend")
    @C7204b(mo18696a = "打开推荐页好友推荐", mo18697b = "关闭推荐页好友推荐")
    @C7205f(mo18698a = "Feed")
    public boolean enableFollowTabRecommendUser;
    @C6593c(mo15949a = "friends_enhance_followback")
    @C7204b(mo18696a = "打开好友推荐回关与负反馈", mo18697b = "关闭好友推荐回关与负反馈")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableFriendsEnhanceFollowBack;
    @C6593c(mo15949a = "enable_hbinfo_preload")
    @C7204b(mo18696a = "启用新的hbinfo 预加载方案", mo18697b = "使用旧的预加载方案，只在消耗一个广告之后预加载")
    public boolean enableHbinfoPreload;
    @C6593c(mo15949a = "enable_hourly_list")
    @C7206i(mo18699a = "小时榜功能开启", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    public int enableHourRank;
    @C6593c(mo15949a = "enable_jssdk_check")
    @C7204b(mo18696a = "打开jssdk检查", mo18697b = "关闭jssdk检查")
    @C7205f(mo18698a = "小程序")
    public boolean enableJssdkCheck = true;
    @C6593c(mo15949a = "share_after_download")
    @C7204b(mo18696a = "打开下载完成后引导分享", mo18697b = "关闭下载完成后引导分享")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableLeadShareAfterDownload;
    @C6593c(mo15949a = "enable_live_cover_image")
    public int enableLiveCoverImage;
    @C6593c(mo15949a = "enable_long_press_guid")
    @C7206i(mo18699a = "新用户体验优化3.0", mo18700b = {0, 1}, mo18701c = {"禁掉长按引导", "打开长按引导"})
    @C7205f(mo18698a = "UG和分享")
    public int enableLongPressGuid = 1;
    @C6593c(mo15949a = "enable_mt_video_search")
    @C7204b(mo18696a = "mt上线视频搜索tab", mo18697b = "mt无视频搜索")
    @C7205f(mo18698a = "发现")
    public boolean enableMTVideoSearch;
    @C6593c(mo15949a = "enable_mock_ui_watermark")
    @C7204b(mo18696a = "打开类UI水印下载", mo18697b = "关闭类UI水印下载")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableMockUIWatermark;
    @C6593c(mo15949a = "enable_multi_account_login")
    @C7204b(mo18696a = "启用多账号登录", mo18697b = "关闭多账号登录")
    @C7205f(mo18698a = "登录和账户")
    private boolean enableMultiAccountLogin;
    @C6593c(mo15949a = "enable_new_user_detail_share_icon")
    @C7206i(mo18699a = "强化非视频的分享按键", mo18700b = {0, 1}, mo18701c = {"三个点", "分享图标"})
    public int enableNewUserDetailShareIcon;
    @C6593c(mo15949a = "enable_normal_splash_ad_ab")
    @C7204b(mo18696a = "开启普通开屏广告", mo18697b = "关闭普通开屏广告")
    @C7205f(mo18698a = "商业化")
    public boolean enableNormalSplashAdAb = true;
    @C6593c(mo15949a = "enable_notification_prefetch_video")
    @C7206i(mo18699a = "是否对push过来的Video进行预加载", mo18700b = {0, 1}, mo18701c = {"不需要预加载", "需要预加载"})
    public int enableNotificationPrefetchVideo;
    @C6593c(mo15949a = "one_click_login_switch")
    @C7204b(mo18696a = "启用一键登陆", mo18697b = "关闭一键登录")
    @C7205f(mo18698a = "登录和账户")
    private boolean enableOneClickLogin;
    @C6593c(mo15949a = "one_click_token_preloaded")
    @C7204b(mo18696a = "启动一键登录预加载", mo18697b = "关闭一键登录预加载")
    @C7205f(mo18698a = "登录和账户")
    private boolean enableOneClickLoginPreGet;
    @C6593c(mo15949a = "enable_profile_notify_method")
    @C7204b(mo18696a = "开启强制notifyDataSetChanged", mo18697b = "关闭强制notifyDataSetChanged")
    @C7205f(mo18698a = "个人页")
    public boolean enableProfileNotifyMethod;
    @C6593c(mo15949a = "enable_screenshot_share")
    @C7204b(mo18696a = "支持截屏弹出分享弹窗", mo18697b = "不支持截屏弹出分享弹窗，同线上逻辑")
    @C7205f(mo18698a = "UG和分享")
    public boolean enableScreenshotShare;
    @C6593c(mo15949a = "send_gift_shortcut_enable")
    @C7204b(mo18696a = "启用直播间快捷礼物", mo18697b = "关闭直播间快捷礼物")
    @C7205f(mo18698a = "live")
    public boolean enableShortcutGift;
    @C6593c(mo15949a = "enable_swipe_up_guid_style3")
    @C7206i(mo18699a = "新用户体验优化3.0", mo18700b = {0, 1}, mo18701c = {"禁掉新版上下滑引导", "打开新版上下滑引导"})
    @C7205f(mo18698a = "UG和分享")
    public int enableSwipeUpGuidStyle3;
    @C6593c(mo15949a = "enable_symphony_sdk_ab")
    @C7204b(mo18696a = "开启symphony", mo18697b = "关闭symphony sdk，并干掉相关耗时组件的调用")
    @C7205f(mo18698a = "商业化")
    public boolean enableSymphonySdk = true;
    @C6593c(mo15949a = "enable_symphony_sdk_musically_debug")
    @C7204b(mo18696a = "启用musically symphony sdk debug模式", mo18697b = "关闭musically symphony sdk debug模式")
    @C7205f(mo18698a = "商业化")
    public boolean enableSymphonySdkMusicallyDebug;
    @C6593c(mo15949a = "enable_sync_to_helo_entry")
    @C7204b(mo18696a = "开启 Helo 分享入口", mo18697b = "关闭 Helo 分享入口")
    @C7205f
    public boolean enableSyncToHeloEntry;
    @C6593c(mo15949a = "enable_sync_toutiao")
    public boolean enableSyncToutiao;
    @C6593c(mo15949a = "enable_teenager_mode_new")
    @C7206i(mo18699a = "280青少年模式新版", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    @C7205f(mo18698a = "价值观")
    public int enableTeenagerModeNew = 1;
    @C6593c(mo15949a = "enable_tracker_sdk")
    @C7204b(mo18696a = "使用trackerSDK", mo18697b = "不使用trackerSDK")
    @C7205f(mo18698a = "商业化")
    public boolean enableTrackerSDK;
    @C6593c(mo15949a = "enable_transition_to_profile_guid")
    @C7206i(mo18699a = "新用户体验优化3.0", mo18700b = {0, 1}, mo18701c = {"禁掉滑动进入profile引导", "打开滑动进入profile引导"})
    @C7205f(mo18698a = "UG和分享")
    public int enableTransitionToProfileGuid = 1;
    @C6593c(mo15949a = "enable_user_page_action")
    @C7204b(mo18696a = "打开用户页面切换收集预测", mo18697b = "关闭用户页面切换收集预测")
    @C7205f(mo18698a = "Feed")
    public boolean enableUserPageAction;
    @C6593c(mo15949a = "enable_verified_profile_relation")
    @C7204b(mo18696a = "开启认证用户开启关系解释", mo18697b = "关闭认证用户关系解释")
    @C7205f(mo18698a = "个人页")
    public boolean enableVerifyUserRecommendReason;
    @C6593c(mo15949a = "is_wifi_toast")
    @C7206i(mo18699a = "wifi是否弹窗", mo18700b = {0, 1}, mo18701c = {"wifi下不弹窗", "wifi下弹窗"})
    @C7205f
    public int enableWifiToast;
    @C6593c(mo15949a = "enable_cold_start_land_follow")
    @C7204b(mo18696a = "冷启进关注TAB的记忆功能-开启", mo18697b = "冷启进关注TAB的记忆功能-关闭")
    @C7205f(mo18698a = "关注Tab")
    public boolean enable_remember_cold_start_follow;
    @C6593c(mo15949a = "fan_following_list_recommend")
    @C7206i(mo18699a = "粉丝接入推荐", mo18700b = {0, 1}, mo18701c = {"不接入", "接入推荐"})
    @C7205f(mo18698a = "UG和分享")
    private int fanFollowingListRecommend;
    @C6593c(mo15949a = "feed_ad_async_log")
    @C7204b(mo18696a = "开启Feed广告异步打点", mo18697b = "关闭Feed广告异步打点")
    @C7205f(mo18698a = "商业化")
    public boolean feedAdAsyncLog;
    @C6593c(mo15949a = "feed_avatar_style")
    @C7206i(mo18699a = "视频Feed头像动态+直播AB测试", mo18700b = {0, 1}, mo18701c = {"线上样式", "动态+直播"})
    @C7205f(mo18698a = "Feed")
    public int feedAvatarStyle;
    @C6593c(mo15949a = "feedback_host")
    public String feedbackHost;
    @C6593c(mo15949a = "find_fascinating_mode")
    @C7206i(mo18699a = "发现下部分改版", mo18700b = {0, 1, 2}, mo18701c = {"不出现发现精彩", "底部发现精彩用新样式", "底部发现精彩用新样式+顶部热搜词区域改版"})
    @C7205f(mo18698a = "发现")
    public int findFascinatingMode;
    @C6593c(mo15949a = "fixed_share_icon_order")
    @C7204b(mo18696a = "MT/分享渠道顺序固定", mo18697b = "MT/分享渠道顺序动态变化")
    @C7205f(mo18698a = "UG和分享")
    public boolean fixedShareIconOrder;
    @C6593c(mo15949a = "follow_feed_first_item_auto_play")
    @C7206i(mo18699a = "关注单列自动播放实验", mo18700b = {0, 1}, mo18701c = {"不自动", "自动"})
    @C7205f(mo18698a = "Feed")
    public int followFeedFirstItemAutoPlay;
    @C6593c(mo15949a = "live_follow_feed_style")
    @C7206i(mo18699a = "关注单列直播样式", mo18700b = {1, 2, 3, 4, 5}, mo18701c = {"DEFAULT", "A", "B", "C", "D"})
    @C7205f(mo18698a = "Feed")
    public int followFeedLiveType;
    @C6593c(mo15949a = "follow_tab_style")
    @C7206i(mo18699a = "follow_tab_style", mo18700b = {0, 1}, mo18701c = {"单列大屏", "双列"})
    @C7205f(mo18698a = "Feed")
    public int followTabStyle;
    @C6593c(mo15949a = "follow_toast_type")
    @C7206i(mo18699a = "关注页面弹窗策略", mo18700b = {0, 1}, mo18701c = {"策略不变", "在原有策略上判断是否在关注页面点击过暂停，点击过则不自动播放"})
    @C7205f
    public int followToastType;
    @C6593c(mo15949a = "follow_top_live_breath")
    @C7206i(mo18699a = "关注tab顶部天窗“呼吸”实验3.0", mo18700b = {0, 1}, mo18701c = {"线上样式", "关注tab直播呼吸动效"})
    @C7205f(mo18698a = "关注Tab")
    public int followTopLiveBreath;
    @C6593c(mo15949a = "new_third_party_user_forbid_skipping_bind_phone")
    @C7204b(mo18696a = "第三方注册不允许跳过绑定手机号", mo18697b = "第三方注册允许跳过绑定手机号")
    @C7205f(mo18698a = "登录和账户")
    private boolean forbidSkipBindPhone;
    @C6593c(mo15949a = "force_backup_oldweb")
    @C7204b(mo18696a = "backup老webview", mo18697b = "新web")
    public boolean forceBackOldWeb;
    @C6593c(mo15949a = "ftc_bind_enable")
    @C7204b(mo18696a = "ftc绑定", mo18697b = "关闭ftc绑定")
    @C7205f(mo18698a = "登录和账户")
    private boolean ftcBindEnable;
    @C6593c(mo15949a = "gather_mode_video_level")
    public String gatherModeVideoLevel;
    @C6593c(mo15949a = "gecko_performance")
    @C7204b(mo18696a = "Gecko性能测试 已开启", mo18697b = "Gecko性能测试 已关闭")
    @C7205f(mo18698a = "基础业务")
    public boolean geckoPerformanceState;
    @C6593c(mo15949a = "im_group_chat_switch")
    @C7206i(mo18699a = "打开创建聊天入口", mo18700b = {0, 1}, mo18701c = {"关闭创建聊天入口", "打开创建聊天入口"})
    @C7205f(mo18698a = "IM")
    public int groupChatSwitch;
    @C6593c(mo15949a = "hot_live_enter_new_style")
    @C7206i(mo18699a = "热门直播新样式", mo18700b = {0, 1})
    @C7205f(mo18698a = "live")
    public int hotLiveEnterNewStyle;
    @C6593c(mo15949a = "hot_search_ranking_item_style")
    @C7206i(mo18699a = "热搜榜Item样式", mo18700b = {0, 1}, mo18701c = {"没有图片", "有图片"})
    @C7205f(mo18698a = "发现")
    public int hotSearchRankingItemStyle;
    @C6593c(mo15949a = "new_hot_search_section")
    @C7206i(mo18699a = "热搜栏", mo18700b = {0, 1}, mo18701c = {"旧版", "新版"})
    @C7205f(mo18698a = "发现")
    private int hotSearchType;
    @C6593c(mo15949a = "hot_spot_use_uv")
    @C7206i(mo18699a = "热搜条在看文案", mo18700b = {0, 1}, mo18701c = {"热度", "在看"})
    @C7205f(mo18698a = "发现")
    public int hotSpotUseUv;
    @C6593c(mo15949a = "login_platforms_from_server")
    @C7206i(mo18699a = "是否从服务端获取登录方式", mo18700b = {0, 1}, mo18701c = {"不", "获取"})
    @C7205f(mo18698a = "UG和分享")
    private int i18nNewLoginPlatformStrategy;
    @C6593c(mo15949a = "mt_comment_api_v2")
    @C7204b(mo18696a = "开启盖楼模式", mo18697b = "关闭盖楼模式")
    @C7205f(mo18698a = "评论")
    public boolean i18nReplyBuildingStyle;
    @C6593c(mo15949a = "i18n_share_button_style")
    public int i18nShareButtonStyle;
    @C6593c(mo15949a = "im_fans_vc_style")
    @C7206i(mo18699a = "IM粉丝页展示模式", mo18700b = {0, 1}, mo18701c = {"普通粉丝列表", "折叠粉丝 + 推荐列表"})
    @C7205f(mo18698a = "IM")
    public int imFansVsStyle;
    @C6593c(mo15949a = "im_inner_push_strategy")
    @C7206i(mo18699a = "私信站内通知", mo18700b = {0, 1, 2}, mo18701c = {"线上样式", "展示站内通知", "展示站内通知含策略"})
    @C7205f(mo18698a = "IM")
    public int imInnerPushOpen;
    @C6593c(mo15949a = "im_fragment_style")
    @C7206i(mo18699a = "联系人列表改版", mo18700b = {0, 1}, mo18701c = {"关闭新版联系人列表", "打开新版联系人列表"})
    @C7205f(mo18698a = "IM")
    private int imNewRelationFragmentStyle;
    @C6593c(mo15949a = "im_home_style")
    @C7206i(mo18699a = "消息页改版", mo18700b = {0, 1}, mo18701c = {"关闭消息页联系人tab", "打开消息页联系人tab"})
    @C7205f(mo18698a = "IM")
    private int imNotificationTabStyle;
    @C6593c(mo15949a = "im_qrcode_share_direct")
    @C7206i(mo18699a = "二维码转发回流", mo18700b = {0, 1}, mo18701c = {"默认值，跳转到视频详情", "跳转到私信"})
    @C7205f(mo18698a = "IM")
    public int imQrcodeShareDirect;
    @C6593c(mo15949a = "im_share_show_user_icon_plan")
    @C7206i(mo18699a = "展示分享头像", mo18700b = {0, 1, 2, 3, 4}, mo18701c = {"不展示", "关注>=5展示", "关注>=10展示", "关注>=15展示", "关注>=20展示"})
    @C7205f(mo18698a = "IM")
    public int imShareShowUserIconPlan;
    @C6593c(mo15949a = "im_share_style")
    @C7206i(mo18699a = "im 分享样式", mo18700b = {1, 2, 3, 4})
    @C7205f(mo18698a = "IM")
    public int imShareStyle = 2;
    @C6593c(mo15949a = "ins_share_type")
    public int insShareType;
    @C6593c(mo15949a = "remind_user_tiktok_hashtag")
    @C7206i(mo18699a = "ins分享粘贴文案引导样式", mo18700b = {0, 1, 2}, mo18701c = {"无", "dialog", "toast"})
    @C7205f(mo18698a = "UG和分享")
    private int instgramShareHashTag;
    @C6593c(mo15949a = "invisible_watermark")
    public boolean invisibleWatermark = true;
    @C6593c(mo15949a = "story_share_type")
    @C7206i(mo18699a = "站外邀请好友使用图片还是文字口令实验", mo18700b = {0, 1}, mo18701c = {"图片", "文字"})
    @C7205f(mo18698a = "好友")
    public int inviteWithTextOrPic;
    @C6593c(mo15949a = "profile_intro_new_style")
    @C7204b(mo18696a = "个人签名大字白色字", mo18697b = "个人签名小字灰色字")
    @C7205f(mo18698a = "个人页")
    public boolean isBigselfIntroduce;
    @C6593c(mo15949a = "contains_key_with_lruEntries")
    @C7204b(mo18696a = "是否使用LruEntries来判断是否ContainsKey", mo18697b = "对照组")
    @C7205f(mo18698a = "UG和分享")
    public boolean isContainsKeyWithLruEntries = true;
    @C6593c(mo15949a = "is_copy_link_QR_code_in_first_row")
    @C7204b(mo18696a = "D/复制链接二维码在分享第一行", mo18697b = "D/复制链接二维码在分享第二行")
    @C7205f(mo18698a = "UG和分享")
    public boolean isCopyLinkQRCodeInFirstRow;
    @C6593c(mo15949a = "enable_alog_upload")
    @C7204b(mo18696a = "开启ALog主动上传", mo18697b = "关闭ALog主动上传")
    @C7205f(mo18698a = "UG和分享")
    public boolean isEnableALogUpload;
    @C6593c(mo15949a = "enable_bugly")
    @C7204b(mo18696a = "MT开启Bugly", mo18697b = "MT关闭Bugly")
    @C7205f(mo18698a = "UG和分享")
    public boolean isEnableBugly;
    @C6593c(mo15949a = "enable_check_beta_version")
    public boolean isEnableCheckBetaVersion;
    @C6593c(mo15949a = "facebook_lite_share")
    @C7204b(mo18696a = "facebook lite 链接分享开", mo18697b = "facebook lite 链接分享关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isFacebookLiteShareEnable;
    @C6593c(mo15949a = "facebook_url_share")
    @C7204b(mo18696a = "facebook 链接分享开", mo18697b = "facebook 链接分享关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isFacebookShareLinkEnable;
    @C6593c(mo15949a = "facebook_story")
    @C7204b(mo18696a = " facebook story分享开", mo18697b = " facebook story分享关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isFacebookStoryEnable;
    @C6593c(mo15949a = "is_feed_show_guide")
    private boolean isFeedShowGuide;
    @C6593c(mo15949a = "enable_guess_u_search")
    @C7204b(mo18696a = "搜索中间页使用猜你想搜", mo18697b = "搜索中间页使用抖音热点")
    @C7205f(mo18698a = "发现")
    public boolean isGuessUSearchEnabled;
    @C6593c(mo15949a = "is_hash_tag")
    public int isHashTag;
    @C6593c(mo15949a = "is_hook_sp_clear")
    @C7204b(mo18696a = "是不是清除SP等待队列", mo18697b = "对照组")
    @C7205f(mo18698a = "UG和分享")
    public boolean isHookSPClear = true;
    @C6593c(mo15949a = "hot_words_recommend")
    @C7204b(mo18696a = "热点词推荐已开启", mo18697b = "热点词推荐")
    @C7205f(mo18698a = "发现")
    public boolean isHotWordsRecommendEnabled;
    @C6593c(mo15949a = "enable_ins_story_share")
    @C7204b(mo18696a = "ins story分享开", mo18697b = "ins story分享关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isInsStoryEnable;
    @C6593c(mo15949a = "is_lazy_viewpager")
    @C7204b(mo18696a = "使用lazy加载搜索结果页", mo18697b = "不使用lazy加载搜索结果页")
    @C7205f(mo18698a = "搜索")
    public boolean isLazyFragmentPager = true;
    @C6593c(mo15949a = "is_low_push_when_active")
    @C7204b(mo18696a = "降低优先级，不显示弹窗", mo18697b = "显示弹窗")
    @C7205f(mo18698a = "UG和分享")
    public boolean isLowPushWhenActive;
    @C6593c(mo15949a = "messenger_lite_share")
    @C7204b(mo18696a = " messenger lite 链接分享开", mo18697b = " messenger lite 链接分享开关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isMessengerLiteEnable;
    @C6593c(mo15949a = "is_monitor_fresco_image_loading")
    @C7204b(mo18696a = "是否监控Fresco的未压缩大图片", mo18697b = "对照组")
    @C7205f(mo18698a = "UG和分享")
    public boolean isMonitorFrescoImageLoading = true;
    @C6593c(mo15949a = "is_open_flow_window")
    public int isOpenFlowWindow = 1;
    @C6593c(mo15949a = "is_performance_poor")
    @C7204b(mo18696a = "通过AB下发判断为低端机", mo18697b = "通过AB下发判断为不是低端机")
    @C7205f(mo18698a = "Feed")
    public boolean isPerformancePoor;
    @C6593c(mo15949a = "share_user_style")
    @C7206i(mo18699a = "个人主页分享", mo18700b = {0, 1, 2}, mo18701c = {"原来的样式", "新样式且分享链接", "新样式且分享图片"})
    @C7205f(mo18698a = "UG和分享")
    public int isProfilePageShareStyle;
    @C6593c(mo15949a = "recommend_item_show_more_info")
    @C7204b(mo18696a = "启用推人卡片新样式", mo18697b = "关闭推人卡片新样式")
    @C7205f(mo18698a = "IM")
    public boolean isRecommendItemShowMoreInfo;
    @C6593c(mo15949a = "is_replace_aweme_manager_with_lrucache")
    @C7204b(mo18696a = "是否替换AwemeManager的缓存机制", mo18697b = "对照组")
    @C7205f(mo18698a = "UG和分享")
    public boolean isReplaceAwemeManagerWithLRUCache = true;
    @C6593c(mo15949a = "is_replace_sp_impl")
    @C7204b(mo18696a = "是否替换SharedPreference实现类", mo18697b = "对照组")
    @C7205f(mo18698a = "UG和分享")
    private boolean isReplaceSPImpl = true;
    @C6593c(mo15949a = "search_empty_optimize")
    @C7204b(mo18696a = "搜索空结果优化打开", mo18697b = "搜索空结果优化关闭")
    @C7205f(mo18698a = "发现")
    public boolean isSearchEmptyOptimizeEnabled;
    @C6593c(mo15949a = "search_native_fragment")
    @C7204b(mo18696a = "React Native 搜索中间页", mo18697b = "Native搜索中间页")
    @C7205f(mo18698a = "发现")
    public boolean isSearchFragmentReactNative;
    @C6593c(mo15949a = "general_search_feed_style")
    @C7204b(mo18696a = "综搜使用Feed全屏播放样式", mo18697b = "综搜不使用Feed全屏播放样式")
    @C7205f(mo18698a = "发现")
    public boolean isSearchMixFeedStyle;
    @C6593c(mo15949a = "aweme_share_show_forward")
    @C7206i(mo18699a = "分享展示转发", mo18700b = {0, 1}, mo18701c = {"不启用", "启用"})
    @C7205f(mo18698a = "UG和分享")
    private int isShareDialogShowForward;
    @C6593c(mo15949a = "is_share_link_only")
    @C7204b(mo18696a = "分享时不带文案", mo18697b = "分享时带文案")
    @C7205f(mo18698a = "UG和分享")
    public boolean isShareLinkOnly;
    @C6593c(mo15949a = "enable_tiktok_discovery_v3_page")
    @C7204b(mo18696a = "Musically发现页3.0 开启", mo18697b = "Musically发现页3.0 关闭")
    @C7205f(mo18698a = "发现")
    public boolean isShowDiscoveryV3Page;
    @C6593c(mo15949a = "is_show_long_video_operation")
    @C7206i(mo18699a = "长视频播放器固定显示互动入口", mo18700b = {0, 1}, mo18701c = {"不显示", "显示"})
    @C7205f(mo18698a = "视频")
    public int isShowLongVideoOperation;
    @C6593c(mo15949a = "im_mutual_follow_hello_sticker")
    @C7204b(mo18696a = "显示破冰消息", mo18697b = "不显示破冰消息")
    @C7205f(mo18698a = "IM")
    public boolean isShowSayHelloMsg = true;
    @C6593c(mo15949a = "is_show_video_mix")
    @C7204b(mo18696a = "开启视频合集", mo18697b = "关闭视频合集")
    @C7205f(mo18698a = "Feed")
    public boolean isShowVideoMix = true;
    @C6593c(mo15949a = "enable_snapchat_share_2")
    @C7204b(mo18696a = "snapchat 链接分享开", mo18697b = "snapchat 链接分享关")
    @C7205f(mo18698a = "UG和分享")
    public boolean isSnapchatShareEnable;
    @C6593c(mo15949a = "is_ttnet_intercept_all")
    @C7204b(mo18696a = "use", mo18697b = "no")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isTTNetInterceptAll;
    @C6593c(mo15949a = "is_ttnet_intercept_webview")
    @C7204b(mo18696a = "use", mo18697b = "no")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isTTNetInterceptWebview;
    @C6593c(mo15949a = "is_use_cookie_sync")
    @C7204b(mo18696a = "use", mo18697b = "no")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isUseCookieSync = true;
    @C6593c(mo15949a = "is_use_fresco_fast_image")
    @C7204b(mo18696a = "use", mo18697b = "no")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isUseFrescoFastImage;
    @C6593c(mo15949a = "is_use_net_cache")
    @C7204b(mo18696a = "ttnet", mo18697b = "NetExecutor")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isUseNetCache = true;
    @C6593c(mo15949a = "combine_settings_req")
    @C7204b(mo18696a = "使用Settings合并Api", mo18697b = "不使用Settings合并Api")
    @C7205f(mo18698a = "基础业务")
    public boolean isUseSettingCombineApi = true;
    @C6593c(mo15949a = "is_use_ttnet_v2")
    @C7204b(mo18696a = "ttnet", mo18697b = "okhttp")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isUseTTNet = true;
    @C6593c(mo15949a = "is_use_ttwebview")
    @C7204b(mo18696a = "ttwebview", mo18697b = "default")
    @C7205f(mo18698a = "网络库/加载")
    public boolean isUseTTWebView = true;
    @C6593c(mo15949a = "musically_digg_detail_list")
    @C7204b(mo18696a = "M通知页-开启点赞列表", mo18697b = "M通知页-不开启点赞列表")
    @C7205f(mo18698a = "IM")
    public boolean likeListDetail;
    @C6593c(mo15949a = "line_share_with_link")
    @C7204b(mo18696a = "line分享有link", mo18697b = "line分享无link")
    @C7205f(mo18698a = "UG和分享")
    public boolean lineShareWithLink;
    @C6593c(mo15949a = "live_auto_open_window")
    public int liveAutoOpenWindow;
    @C6593c(mo15949a = "show_live_mark_in_detail")
    @C7206i(mo18699a = "直播首页feed", mo18700b = {0, 1}, mo18701c = {"进入个人详情页", "点击头像进入直播间 "})
    @C7205f(mo18698a = "live")
    public int liveEntry;
    @C6593c(mo15949a = "live_follow_guide")
    @C7206i(mo18699a = "直播间引导关注", mo18700b = {0, 1, 2, 3}, mo18701c = {"对照组", "实验组1：观看1min", "实验组2：观看3min", "实验组3：观看5min"})
    @C7205f(mo18698a = "live")
    public int liveFollowGuide;
    @C6593c(mo15949a = "livelist_refresh_available")
    @C7204b(mo18696a = "冷热启动展开story天窗", mo18697b = "冷热启动不展开story天窗")
    @C7205f(mo18698a = "live")
    public boolean livelistRefreshAvailable;
    @C6593c(mo15949a = "load_new_ffmpeg")
    @C7204b(mo18696a = "加载新的ffmpeg", mo18697b = "不加载新的ffmpeg")
    @C7205f(mo18698a = "视频")
    public boolean loadNewFFmpeg;
    @C6593c(mo15949a = "login_device_manager_url")
    public String loginDeviceManagerUrl;
    @C6593c(mo15949a = "im_associative_emoticon_second_ab")
    @C7206i(mo18699a = "联想表情", mo18700b = {0, 1, 2}, mo18701c = {"关闭", "列表使用原图", "列表使用缩略图"})
    @C7205f(mo18698a = "IM")
    public int mAssociativeEmoji = 1;
    @C6593c(mo15949a = "m_bind_phone_after_third_party_login")
    @C7204b(mo18696a = "启动第三方登陆后绑定手机", mo18697b = "关闭第三方登陆后绑定手机")
    @C7205f(mo18698a = "登录和账户")
    private boolean mBindPhoneAfterThirdPartyLogin;
    @C6593c(mo15949a = "enable_im_have_read")
    @C7206i(mo18699a = "私信已读状态", mo18700b = {0, 1}, mo18701c = {"关闭", "开启"})
    @C7205f(mo18698a = "IM")
    public int mEnableReadState;
    @C6593c(mo15949a = "use_new_edit")
    @C7204b(mo18696a = "使用新版编辑页面", mo18697b = "不使用新版编辑页面")
    private boolean mIsUseNewEdit;
    @C6593c(mo15949a = "send_gift_shortcut_guide")
    @C7206i(mo18699a = "送礼引导时间", mo18700b = {0, 1, 2, 3}, mo18701c = {"无送礼引导", "1min出现引导", "3min出现引导", "5min出现引导"})
    @C7205f(mo18698a = "live")
    public int mSendGiftShortcutGuide;
    @C6593c(mo15949a = "single_conv_hello_msg")
    @C7206i(mo18699a = "单聊破冰消息", mo18700b = {0, 1}, mo18701c = {"3个GIF图样式", "群聊表情包样式"})
    @C7205f(mo18698a = "IM")
    public int mSingleChatHelloMsg;
    @C6593c(mo15949a = "whatsapp_share_strategy")
    @C7206i(mo18699a = "whatsapp分享策略", mo18700b = {0, 1, 2, 3}, mo18701c = {"纯视频", "视频加文案", "链接卡片", "视频加文字加承载页链接"})
    @C7205f(mo18698a = "UG和分享")
    public int mWhatsappShareType;
    @C6593c(mo15949a = "im_x_display_style")
    @C7206i(mo18699a = "X-导流策略", mo18700b = {0, 1, 1001}, mo18701c = {"关导流", "B策略", "A策略"})
    @C7205f(mo18698a = "IM")
    public int mXPlanStyle;
    @C6593c(mo15949a = "enable_main_use_fragments_cache")
    @C7204b(mo18696a = "主页使用fragments缓存", mo18697b = "主页不使用fragments缓存")
    @C7205f(mo18698a = "Feed")
    public boolean mainUseFragmentsCache = true;
    @C6593c(mo15949a = "mini_emoji_panel_enabled")
    @C7204b(mo18696a = "启用快捷表情面板", mo18697b = "不启用快捷表情面板")
    @C7205f(mo18698a = "评论")
    public boolean miniEmojiPanelEnabled;
    @C6593c(mo15949a = "miniapp_auto_download")
    @C7206i(mo18699a = "自动下载小程序开关", mo18700b = {0, 1}, mo18701c = {"打开自动下载小程序插件功能", "关闭自动下载小程序插件功能"})
    @C7205f(mo18698a = "小程序")
    public int miniappAutoDownload = 1;
    @C6593c(mo15949a = "mt_guess_word_style")
    @C7206i(mo18699a = "MT中间页引入guess word", mo18700b = {0, 1, 2}, mo18701c = {"无入口", "猜你想搜在历史下方", "猜你想搜在历史上方"})
    @C7205f(mo18698a = "发现")
    public int mtGuessWordStyle;
    @C6593c(mo15949a = "location_sdk_setting")
    @C7206i(mo18699a = "请求地理位置权限弹窗", mo18700b = {0, 1, 2, 3, 4}, mo18701c = {"对照组", "有弹窗，N=3,上报地理位置", "有弹窗，N=6，上报地理位置", "有弹窗，N=3，不上报地理位置", "没弹窗，上报地理位置信息，6.0以下手机有效"})
    @C7205f(mo18698a = "Feed")
    public int mtLocationPopupType;
    @C6593c(mo15949a = "need_recode")
    @C7204b(mo18696a = "不省略二次编码", mo18697b = "符合条件省略二次编码")
    public boolean need_recode = true;
    @C6593c(mo15949a = "neiguang_enabled")
    @C7206i(mo18699a = "neiguang", mo18700b = {0, 1})
    public int neiguangEnabled;
    @C6593c(mo15949a = "new_profile_live_avatar_animation")
    @C7206i(mo18699a = "露出直播小窗", mo18700b = {0, 1, 2}, mo18701c = {"线上状态", "头像出直播中下方有直播流", "头像出红圈，下方有直播流"})
    @C7205f(mo18698a = "个人页")
    public int newProfileLiveAvatarAnimation;
    @C6593c(mo15949a = "new_user_tab_change_switch")
    public int newUserTabChangeSwitch = -1;
    @C6593c(mo15949a = "non_standard_ad_hot_search_style")
    @C7206i(mo18699a = "非标广告位-热搜榜", mo18700b = {0, 1, 2}, mo18701c = {"关闭", "仅展示", "启用"})
    public int nonStdHotSearch;
    @C6593c(mo15949a = "normal_splash_ad_delay_millis")
    @C7206i(mo18699a = "普通开屏展示延迟*ms", mo18700b = {0, 250, 500, 750})
    @C7205f(mo18698a = "商业化")
    public int normalSplashAdDelayMillis;
    @C6593c(mo15949a = "not_show_notification_tips")
    @C7204b(mo18696a = "不展示消息提醒", mo18697b = "展示消息提醒")
    @C7205f(mo18698a = "Feed")
    public boolean notShowNotification;
    @C6593c(mo15949a = "one_bind_type")
    @C7206i(mo18699a = "一键绑定类型", mo18700b = {0, 1, 2}, mo18701c = {"不实用一键绑定", "一键绑定不设置密码", "一键绑定设置密码"})
    @C7205f(mo18698a = "登录和账户")
    private int oneBindType;
    @C6593c(mo15949a = "one_login_v2_type")
    @C7206i(mo18699a = "一键登录流程优化", mo18700b = {0, 1, 2}, mo18701c = {"原有一键登录", "一键登录优化 + 原文案【手机验证码或密码登录】", "一键登录优化 + 新文案【其他手机号码登录】"})
    @C7205f(mo18698a = "登录和账户")
    private int oneLoginV2Type;
    @C6593c(mo15949a = "comment_filter_switch")
    @C7204b(mo18696a = "开启评论过滤", mo18697b = "关闭评论过滤")
    @C7205f(mo18698a = "评论")
    public boolean openCommentFilter;
    @C6593c(mo15949a = "share_openExperienceKit")
    @C7204b(mo18696a = "开启厂商合作优化", mo18697b = "关闭厂商合作优化")
    @C7205f(mo18698a = "UG和分享")
    public boolean openExperienceKit = true;
    @C6593c(mo15949a = "oppo_red_point_appear_again_time_interval")
    @C7206i(mo18699a = "红点再次出现的时间间隔", mo18700b = {0, 1, 2, 3, 30, 60, -1}, mo18701c = {"0s", "1s", "2s", "3s", "30s", "60s", "消失后不再出现"})
    @C7205f(mo18698a = "基础业务")
    public int oppoRedPointAppearAgainTimeInterval;
    @C6593c(mo15949a = "oppo_red_point_appear_model")
    @C7206i(mo18699a = "OPPO红点出现", mo18700b = {0, 1, 2, 3}, mo18701c = {"不出红点", "出B组红点", "出C组红点", "出随机红点"})
    @C7205f(mo18698a = "基础业务")
    public int oppoRedPointAppearModel;
    @C6593c(mo15949a = "out_app_share_direct")
    @C7206i(mo18699a = "im消息回流", mo18700b = {0, 1}, mo18701c = {"默认值，跳转到视频详情", "跳转到私信"})
    @C7205f(mo18698a = "IM")
    public int outAppShareDirect;
    @C6593c(mo15949a = "get_cross_user_access")
    @C7206i(mo18699a = "换机ab开关", mo18700b = {0, 1})
    @C7205f(mo18698a = "UG和分享")
    private int phoneChangeEnable;
    @C6593c(mo15949a = "pic_qrcode_icon_switch")
    @C7206i(mo18699a = "pic_qrcode_icon_switch", mo18700b = {0, 1})
    @C7205f(mo18698a = "UG和分享")
    public int picQrCodeIconSwitch;
    @C6593c(mo15949a = "platform_share_notify_ahead")
    @C7206i(mo18699a = "分享提醒前置", mo18700b = {0, 1})
    @C7205f(mo18698a = "UG和分享")
    public int platformShareNotifyAhead;
    @C6593c(mo15949a = "player_force_no_ijk")
    @C7205f(mo18698a = "播放器")
    public boolean playerForceNoIJK;
    @C6593c(mo15949a = "player_release_on_shoot")
    @C7205f(mo18698a = "播放器")
    public boolean playerReleaseOnShoot;
    @C6593c(mo15949a = "player_request_timeout")
    public int playerRequestTimeout = 120;
    @C6593c(mo15949a = "enable_privacy_reminder")
    @C7204b(mo18696a = "启用隐私说明提示", mo18697b = "不启用隐私说明提示")
    @C7205f(mo18698a = "UG和分享")
    public boolean privacyReminder;
    @C6593c(mo15949a = "private_prompt")
    @C7206i(mo18699a = "私聊弹窗", mo18700b = {0, 1})
    private int privatePrompt;
    @C6593c(mo15949a = "profile_follow_relation_style")
    @C7206i(mo18699a = "个人页改版(三期)", mo18700b = {0, 1}, mo18701c = {"线上样式", "展示共同关系和关注-粉丝页面"})
    @C7205f(mo18698a = "个人页")
    public int profileFollowRelationStyle;
    @C6593c(mo15949a = "enable_profile_navbar_share")
    @C7206i(mo18699a = "Action Sheet/分享弹窗AB设置", mo18700b = {0, 1}, mo18701c = {"线上样式Action Sheet", "分享弹窗"})
    @C7205f(mo18698a = "UG和分享")
    public int profileNavbarShareStyle;
    @C6593c(mo15949a = "profile_recommend_user_strategy")
    @C7206i(mo18699a = "发现好友页推荐策略", mo18700b = {0, 1}, mo18701c = {"老策略", "新策略"})
    @C7205f(mo18698a = "个人页")
    public int profileRecommendUserStrategy;
    @C6593c(mo15949a = "profile_recommend_user_unread_strategy")
    @C7206i(mo18699a = "个人主页推荐用户未读数", mo18700b = {0, 1}, mo18701c = {"黄点", "数字"})
    @C7205f(mo18698a = "个人页")
    public int profileRecommendUserUnreadStrategy;
    @C6593c(mo15949a = "pub_rec_hashtag")
    @C7204b(mo18696a = "发布页智能推荐打开", mo18697b = "发布页智能推荐关闭")
    @C7205f(mo18698a = "发现")
    public boolean pubRecHashtag;
    @C6593c(mo15949a = "enable_publish_privacy_setting")
    @C7206i(mo18699a = "发布页展示视频是否可下载选项", mo18700b = {0, 1, 2}, mo18701c = {"对照组", "发布页不展示视频是否可下载选项", "发布页展示视频是否可下载选项"})
    @C7205f(mo18698a = "视频")
    public int publishPrivacySettingStyle;
    @C6593c(mo15949a = "push_when_screen_on")
    @C7206i(mo18699a = "亮屏推送", mo18700b = {0, 1, 2, 3, 4, 5, 6})
    @C7205f(mo18698a = "UG和分享")
    public int pushWhenScreenOn;
    @C6593c(mo15949a = "pushdelay_duration")
    @C7205f(mo18698a = "埋点")
    public int pushdelayDuration;
    @C6593c(mo15949a = "rec_num")
    @C7206i(mo18699a = "关注tab出黄点数字", mo18700b = {0, 1})
    public int recNum;
    @C6593c(mo15949a = "recommend_contact_position")
    @C7206i(mo18699a = "通讯录推人卡片", mo18700b = {0, 2, 4, 6}, mo18701c = {"线上样式", "卡片插入到第2位", "卡片插入到第4位", "卡片插入到第6位"})
    @C7205f(mo18698a = "好友")
    public int recommendContactPosition = 4;
    @C6593c(mo15949a = "music_ailab")
    public int recommentMusicByAI;
    @C6593c(mo15949a = "red_packet_activity_r_action")
    @C7206i(mo18699a = "红包导量banner是否跳中间页", mo18700b = {0, 1}, mo18701c = {"直接下载", "跳中间页"})
    @C7205f(mo18698a = "商业化")
    public int redPacketActivityRAction;
    @C6593c(mo15949a = "remind_system_push")
    @C7204b(mo18696a = "开启推送开关提醒", mo18697b = "关闭推送开关提醒")
    @C7205f(mo18698a = "IM")
    public boolean remindSystemPush;
    @C6593c(mo15949a = "use_new_comment_style")
    @C7206i(mo18699a = "评论框如何发起回复", mo18700b = {0, 1}, mo18701c = {"点击评论后弹窗选择回复", "点击评论直接回复"})
    @C7205f(mo18698a = "评论")
    public int replyStrategy;
    @C6593c(mo15949a = "rp_throw_try_catch")
    @C7204b(mo18696a = "主会场异常抛出", mo18697b = "主会场异常不抛出")
    @C7205f(mo18698a = "红包")
    public boolean rpThrowTryCatch;
    @C6593c(mo15949a = "screen_adapting")
    @C7204b(mo18696a = "使用自研人脸识别", mo18697b = "使用商汤")
    private boolean screenAdapting;
    @C6593c(mo15949a = "screen_on_push_max_size")
    @C7206i(mo18699a = "亮屏推送max_size", mo18700b = {0, 1, 3, 5})
    @C7205f(mo18698a = "UG和分享")
    public int screen_on_push_max_size;
    @C6593c(mo15949a = "search_egg_disable_prefetch")
    @C7204b(mo18696a = "禁止有彩蛋加载时视频预加载", mo18697b = "有彩蛋时允许视频预加载")
    @C7205f(mo18698a = "商业化")
    public boolean searchEggDisablePrefetch;
    @C6593c(mo15949a = "search_egg_max_wait_to_show_time")
    @C7206i(mo18699a = "搜索彩蛋最长等待加载时间", mo18700b = {3, 4, 5}, mo18701c = {"默认时长", "增加时长"})
    @C7205f(mo18698a = "商业化")
    public int searchEggMaxWaitToShowTime = 4;
    @C6593c(mo15949a = "settings_frequency")
    @C7205f(mo18698a = "埋点")
    public int settingsFrequency;
    @C6593c(mo15949a = "settings_request_interval")
    private int settingsRequestInterval;
    @C6593c(mo15949a = "settings_version")
    public String settingsVersion;
    @C6593c(mo15949a = "settings_loop")
    @C7205f(mo18698a = "埋点")
    public int settings_loop;
    @C6593c(mo15949a = "share_button_style_unite")
    @C7206i(mo18699a = "分享按键样式调整", mo18700b = {0, 1}, mo18701c = {"原样", "实验组"})
    @C7205f(mo18698a = "UG和分享")
    public int shareButtonStyleUnite;
    @C6593c(mo15949a = "share_download_modify_md5")
    @C7206i(mo18699a = "下载视频后处理放折叠", mo18700b = {0, 1}, mo18701c = {"下载后不处理", "下载后插入UUID"})
    public int shareDownloadModifyMd5;
    @C6593c(mo15949a = "share_kakaotalk_with_url")
    public int shareKakaoTalkWithUrl;
    @C6593c(mo15949a = "share_mini_program")
    @C7204b(mo18696a = "share_mini_program", mo18697b = "share_mini_program")
    public boolean shareMiniProgram;
    @C6593c(mo15949a = "show_ads")
    @C7206i(mo18699a = "push通知不显示广告", mo18700b = {0, 1}, mo18701c = {"push通知不显示广告", "push通知显示广告，线上逻辑"})
    @C7205f(mo18698a = "UG和分享")
    public int showAds = 1;
    @C6593c(mo15949a = "bodydance_alert")
    @C7204b(mo18696a = "使用尬舞dialog", mo18697b = "不使用尬舞dialog")
    public boolean showBodyDanceDialog;
    @C6593c(mo15949a = "show_feed_tag_guide_arrow")
    @C7204b(mo18696a = "所有业务锚点变成新样式，文案后面统一增加“>”", mo18697b = "所有业务锚点保持线上样式")
    @C7205f(mo18698a = "Feed")
    public boolean showFeedTagGuideArrow;
    @C6593c(mo15949a = "is_show_feed_back")
    @C7206i(mo18699a = "登录注册反馈按钮", mo18700b = {0, 1})
    @C7205f
    public int showFeedback;
    @C6593c(mo15949a = "show_follow_tab_avatar_pop")
    @C7206i(mo18699a = "关注tab头像弹出", mo18700b = {5, 2, 0, -1}, mo18701c = {"大于5展示", "大于2展示", "大于0展示", "隐藏tab头像"})
    @C7205f(mo18698a = "Feed")
    public int showFollowTabAvatarLimit = -1;
    @C6593c(mo15949a = "show_gdpr_dialog")
    @C7204b(mo18696a = "显示GDPR弹窗", mo18697b = "不显示GDPR弹窗")
    @C7205f(mo18698a = "价值观")
    public boolean showGDPRDialog;
    @C6593c(mo15949a = "comment_show_keyboard_strategy")
    @C7206i(mo18699a = "评论调起键盘阈值", mo18700b = {0, 1, 2, 3}, mo18701c = {"默认不弹起", "评论数小于0弹起", "评论数小于3弹起", "评论数小于5弹起"})
    @C7205f(mo18698a = "评论")
    public int showKeyboardStrategy;
    @C6593c(mo15949a = "show_live_button_while_not_login")
    @C7204b(mo18696a = "未登录用户 展示直播入口", mo18697b = "未登录用户 不展示直播入口")
    @C7205f(mo18698a = "live")
    public boolean showLiveNotLogin = true;
    @C6593c(mo15949a = "un_logined_click_ask_login")
    public int showLoginDialogWhenClickPublishTab;
    @C6593c(mo15949a = "movie_show_like_num")
    @C7206i(mo18699a = "影集详情页展示点赞数", mo18700b = {0, 1}, mo18701c = {"不展示", "展示"})
    @C7205f(mo18698a = "基础业务")
    private int showMovieLike;
    @C6593c(mo15949a = "show_new_add_friends_icon")
    @C7204b(mo18696a = "发现好友icon展示新样式", mo18697b = "发现好友icon展示线上样式")
    @C7205f(mo18698a = "个人页")
    public boolean showNewAddFriendsIcon;
    @C6593c(mo15949a = "prop_show_like_num")
    @C7206i(mo18699a = "道具详情页展示点赞数", mo18700b = {0, 1}, mo18701c = {"不展示", "展示"})
    @C7205f(mo18698a = "发现")
    private int showPropLike;
    @C6593c(mo15949a = "show_push_pre_permission_view_interval")
    @C7206i(mo18699a = "通知权限弹出间隔时间", mo18700b = {1, 2, 2880}, mo18701c = {"1分钟", "2分钟", "2天"})
    @C7205f(mo18698a = "UG和分享")
    public int showPushPrePermissionViewInterval;
    @C6593c(mo15949a = "show_push_pre_permission_view_max_times")
    @C7206i(mo18699a = "通知权限弹出最大弹出次数", mo18700b = {1, 2, 3, 4, 5}, mo18701c = {"1", "2", "3", "4", "5"})
    @C7205f(mo18698a = "UG和分享")
    public int showPushPrePermissionViewMaxTimes;
    @C6593c(mo15949a = "show_remark_icon_style")
    @C7206i(mo18699a = "引导填写备注名", mo18700b = {0, 1, 2, 3}, mo18701c = {"默认", "关注页及他人主页", "粉丝页，发现好友", "both"})
    @C7205f(mo18698a = "个人页")
    public int showRemarkIconStyle;
    @C6593c(mo15949a = "feedback_report_ui_display")
    @C7206i(mo18699a = "印尼举报按钮", mo18700b = {0, 1}, mo18701c = {"关闭举报按钮", "开启举报按钮"})
    @C7205f(mo18698a = "价值观")
    private int showReportButton;
    @C6593c(mo15949a = "show_spot")
    @C7204b(mo18696a = "热点", mo18697b = "热搜")
    @C7205f(mo18698a = "发现")
    public boolean showSpot;
    @C6593c(mo15949a = "hd_transfer_switch")
    @C7206i(mo18699a = "抖火互通", mo18700b = {0, 1})
    private int showSyncHotsoon;
    @C6593c(mo15949a = "count_to_show_teen_mode_guide_alert")
    public int showTeenModeGuideCount;
    @C6593c(mo15949a = "show_uninstall_sheet")
    @C7206i(mo18699a = "卸载问卷", mo18700b = {0, 1})
    @C7205f(mo18698a = "UG和分享")
    public boolean showUninstallSheet;
    @C6593c(mo15949a = "skylight_new_style")
    @C7204b(mo18696a = "打开天窗直播新样式", mo18697b = "关闭天窗直播新样式")
    @C7205f(mo18698a = "live")
    public boolean skyLightNewStyle;
    @C6593c(mo15949a = "skylight_recommend_live")
    @C7204b(mo18696a = "引入推荐", mo18697b = "不引入推荐")
    @C7205f(mo18698a = "live")
    public boolean skyLightRecommendLive;
    @C6593c(mo15949a = "slow_start_strategy")
    @C7206i(mo18699a = "慢启动实验", mo18700b = {0, 1, 2, 3, 4}, mo18701c = {"不延迟启动", "延迟500ms", "延迟1s", "延迟2s", "延迟3s"})
    @C7205f(mo18698a = "UG和分享")
    public int slowStartStrategy;
    @C6593c(mo15949a = "share_speedRecycler")
    @C7204b(mo18696a = "开启个人页RecyclerView优化", mo18697b = "关闭个人页RecyclerView优化")
    @C7205f(mo18698a = "UG和分享")
    public boolean speedRecycler;
    @C6593c(mo15949a = "splash_video_transit")
    @C7204b(mo18696a = "开屏视频广告添加过渡", mo18697b = "开屏视频广告不添加过渡")
    @C7205f(mo18698a = "商业化")
    public boolean splashVideoTransit = true;
    @C6593c(mo15949a = "spot_list_style")
    @C7206i(mo18699a = "", mo18700b = {0, 1, 2}, mo18701c = {"热搜", "纵向", "横向"})
    @C7205f(mo18698a = "发现")
    public int spotListStyle;
    @C6593c(mo15949a = "star_atlas_cooperation_entry_open")
    @C7204b(mo18696a = "显示个人主页星图链接", mo18697b = "关闭个人主页星图链接")
    @C7205f(mo18698a = "商业化")
    public boolean starAtlasCooperationEntryOpen;
    @C6593c(mo15949a = "stop_previous_video_anima")
    @C7204b(mo18696a = "Feed停止上一个视频的动画", mo18697b = "Feed不停止上一个视频的动画")
    @C7205f(mo18698a = "Feed")
    public boolean stopPreviousVideoAnima;
    @C6593c(mo15949a = "story_entrance")
    @C7204b(mo18696a = "story已打开", mo18697b = "story已关闭")
    public boolean storyEntrance;
    @C6593c(mo15949a = "awesome_splash_show_live_window")
    @C7206i(mo18699a = "原生开屏直播天窗逻辑", mo18700b = {1, 0}, mo18701c = {"结束后展", "下个视频展示"})
    @C7205f(mo18698a = "UG和分享")
    public int storyPanelAwesomeSplashStrategy;
    @C6593c(mo15949a = "tabbar_contain_text")
    public int tabbarContainText;
    @C6593c(mo15949a = "teens_mode_days_alert_count")
    @C7206i(mo18699a = "弹窗重复间隔天数", mo18700b = {0, 1, 2, 3}, mo18701c = {"0天", "1天", "2天", "3天"})
    @C7205f(mo18698a = "价值观")
    public int teensModeDaysAlertCount;
    @C6593c(mo15949a = "tiktok_notification_tab_style")
    @C7206i(mo18699a = "tt notice样式", mo18700b = {0, 1, 2}, mo18701c = {"老UI，无点赞列表，老聚合逻辑", "新UI+点赞列表+新聚合逻辑 ", "新UI+无点赞列表+老聚合逻辑 "})
    @C7205f
    public int tiktokNotificationStyle;
    @C6593c(mo15949a = "topview_feed_gap_optimize_enabled")
    @C7204b(mo18696a = "开启原生开屏热启动后续优化，会抛弃后面的feed内容", mo18697b = "保持原样，只做原来的插入逻辑")
    @C7205f(mo18698a = "商业化")
    public boolean topviewFeedGapOptimizeEnabled;
    @C6593c(mo15949a = "ttnet_thread_priority")
    public int ttnetThreadPriority = 10;
    @C6593c(mo15949a = "enable_youth_control_plus")
    @C7206i(mo18699a = "青少年模式 plus", mo18700b = {0, 1})
    @C7205f(mo18698a = "价值观")
    public int underageProtect;
    @C6593c(mo15949a = "creator_center")
    @C7204b(mo18696a = "开启创作者中心", mo18697b = "不开启创作者中心")
    @C7205f(mo18698a = "基础业务")
    public boolean useCreatorCenter;
    @C6593c(mo15949a = "use_injection_jsb")
    @C7206i(mo18699a = "使用注入式jsb", mo18700b = {0, 1}, mo18701c = {"对照组-关闭", "实验组-开启"})
    @C7205f(mo18698a = "POI")
    public int useInjectionJsb;
    @C6593c(mo15949a = "use_jedi_awemelist_fragment")
    @C7204b(mo18696a = "个人发布页使用Jedi", mo18697b = "个人发布页不使用Jedi")
    @C7205f(mo18698a = "个人页")
    public boolean useJediAwemelistFragment;
    @C6593c(mo15949a = "use_live_wallpaper")
    public int useLiveWallpaper;
    @C6593c(mo15949a = "use_location_sdk")
    @C7206i(mo18699a = "开启Location SDK", mo18700b = {0, 1, 2}, mo18701c = {"对照组-关闭", "实验组-开启", "实验组-缩短高德缓存时间"})
    @C7205f(mo18698a = "POI")
    public int useLocationSDK;
    @C6593c(mo15949a = "use_new_app_alert")
    @C7206i(mo18699a = "设备激活使用新的AppLog SDK", mo18700b = {0, 1}, mo18701c = {"使用", "不使用"})
    @C7205f(mo18698a = "基础业务")
    public int useNewAppAlert;
    @C6593c(mo15949a = "push_feed_slide")
    @C7206i(mo18699a = "push_feed_slide", mo18700b = {0, 1})
    @C7205f(mo18698a = "UG和分享")
    public int usePushStyle;
    @C6593c(mo15949a = "share_useNotifySingle")
    @C7204b(mo18696a = "RecyclerView局部刷新", mo18697b = "RecyclerView全部刷新")
    @C7205f(mo18698a = "UG和分享")
    public boolean useRecyclerPartialUpdate = true;
    @C6593c(mo15949a = "use_surface_view")
    @C7204b(mo18696a = "Feed使用SurfaceView", mo18697b = "Feed使用TextureView")
    @C7205f(mo18698a = "Feed")
    public boolean useSurfaceView;
    @C6593c(mo15949a = "user_following_list_sort_type")
    @C7206i(mo18699a = "用户关注列表排序方式", mo18700b = {1, 2})
    @C7205f
    public int userFollowingListSortType = 1;
    @C6593c(mo15949a = "user_profile_init_method")
    @C7206i(mo18699a = "个人页初始话时机方案", mo18700b = {0, 1}, mo18701c = {"线上方式", "按需加载，进入个人主页后再加载"})
    @C7205f(mo18698a = "个人页")
    public int userProfileInitMethod;
    @C6593c(mo15949a = "homepage_recommend_user")
    @C7206i(mo18699a = "抖音他人页用户推荐", mo18700b = {0, 1}, mo18701c = {"关", "开"})
    @C7205f(mo18698a = "个人页")
    public int userRecommend;
    @C6593c(mo15949a = "user_recommend_card_button_style")
    @C7206i(mo18699a = "关注tab找人入口强化", mo18700b = {0, 1, 2}, mo18701c = {"关", "实验组1：回关实验", "实验组2：互相关注实验"})
    @C7205f(mo18698a = "个人页")
    public int userRecommendCardButtonStyle;
    @C6593c(mo15949a = "user_recommend_card_enhance")
    @C7206i(mo18699a = "全场景推人卡片x号强化", mo18700b = {0, 1}, mo18701c = {"关", "开"})
    @C7205f(mo18698a = "个人页")
    public int userRecommendCardEnhance;
    @C6593c(mo15949a = "user_activate")
    @C7206i(mo18699a = "用户挽留弹窗是否显示", mo18700b = {0, 1}, mo18701c = {"线上样式", "显示用户挽留弹窗"})
    @C7205f(mo18698a = "UG和分享")
    public int userRetainActive;
    @C6593c(mo15949a = "use_mix_record_button")
    @C7204b(mo18696a = "使用单击和长按融合拍摄模式", mo18697b = "不使用单击和长按拍融合模式")
    public boolean usingMixRecordButton;
    @C6593c(mo15949a = "video_sound_guide_new_user")
    @C7206i(mo18699a = "Video mute strategy", mo18700b = {0, 1, 2, 3}, mo18701c = {"0 - Play sound normally", "1 - Mute, show button, tap to unmute", "2 - Mute, then gradually increase volume", "3 - Not Mute, only show tips"})
    @C7205f(mo18698a = "UG和分享")
    public int videoSoundGuideMode;
    @C6593c(mo15949a = "video_stop_record")
    public boolean videoStopRecord;
    @C6593c(mo15949a = "visible_goods")
    @C7206i(mo18699a = "商品入口", mo18700b = {0, 1, 2}, mo18701c = {"全部不可见", "只在达人的个人页面和用户关注的tab页面可见", "全部入口可见"})
    @C7205f(mo18698a = "商业化")
    public int visibleGoods;
    @C6593c(mo15949a = "wait_time")
    @C7206i(mo18699a = "亮屏推送wait_time", mo18700b = {5, 10})
    @C7205f(mo18698a = "UG和分享")
    public int wait_time;
    @C6593c(mo15949a = "webview_radius_solution")
    @C7206i(mo18699a = "WebView圆角方案", mo18700b = {0, 1, 2}, mo18701c = {"对照组：RoundedXXXLayout方案", "实验组1：PorterDuff方案", "实验组2：不展示圆角"})
    @C7205f(mo18698a = "商业化")
    public int webViewRadiusSolution;
    @C6593c(mo15949a = "xigua_task_switch_type")
    @C7206i(mo18699a = "西瓜头号任务展示位置", mo18700b = {1, 2, 3}, mo18701c = {"POI位置", "红包位置", "晚会位置"})
    public int xiGuaTaskPosition;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AbTestModel$CommentBackgroundType */
    public interface CommentBackgroundType {
        public static final int BLACK = 0;
        public static final int WHITE = 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AbTestModel$IAutoPlay */
    public interface IAutoPlay {
    }

    public int getAntiAddictedTotalUseTime() {
        return this.antiAddictedTotalUseTime;
    }

    public int getDouyinLoginWhiteInterface() {
        return this.douyinLoginWhiteInterface;
    }

    public int getFindFascinatingMode() {
        return 1;
    }

    public int getOneBindType() {
        return this.oneBindType;
    }

    public int getOneLoginV2Type() {
        return this.oneLoginV2Type;
    }

    public long getSettingsRequestInterval() {
        return (long) this.settingsRequestInterval;
    }

    public int getShowFeedback() {
        return this.showFeedback;
    }

    public int getShowSyncHotsoon() {
        return this.showSyncHotsoon;
    }

    public int getdUseNewLoginStyle() {
        return this.dUseNewLoginStyle;
    }

    public boolean isAntiAddictedSkipLoginEnable() {
        return this.antiAddictedSkipLoginEnable;
    }

    public boolean isBindPhoneAfterThirdPartyLogin() {
        return this.mBindPhoneAfterThirdPartyLogin;
    }

    public boolean isEnableMultiAccountLogin() {
        return this.enableMultiAccountLogin;
    }

    public boolean isEnableOneClickLogin() {
        return this.enableOneClickLogin;
    }

    public boolean isEnableOneClickLoginPreGet() {
        return this.enableOneClickLoginPreGet;
    }

    public boolean isForbidSkipBindPhone() {
        return this.forbidSkipBindPhone;
    }

    public boolean isFtcBindEnable() {
        return this.ftcBindEnable;
    }

    public boolean isdBindPhoneAfterThirdPartyLogin() {
        return this.dBindPhoneAfterThirdPartyLogin;
    }

    public boolean rememberLatestLoginMethod() {
        return false;
    }

    public boolean commentReplyGroupedByConversation() {
        if (this.commentReplyGroupedByConversation == 1) {
            return true;
        }
        return false;
    }

    public boolean enableContentRoaming() {
        if (this.enableContentRoaming == 1) {
            return true;
        }
        return false;
    }

    public boolean getPhoneChangeEnable() {
        if (this.phoneChangeEnable > 0) {
            return true;
        }
        return false;
    }

    public boolean getUsePushStyle() {
        if (this.usePushStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean isDiscoverMvpEnabled() {
        if (this.discoverMvpMode != 0) {
            return true;
        }
        return false;
    }

    public boolean isEffectLikeShow() {
        if (this.showPropLike == 1) {
            return true;
        }
        return false;
    }

    public boolean isFollowListRecommand() {
        if (this.fanFollowingListRecommend > 0) {
            return true;
        }
        return false;
    }

    public boolean isI18nNewLoginPlatformStrategy() {
        if (this.i18nNewLoginPlatformStrategy == 1) {
            return true;
        }
        return false;
    }

    public boolean isInstagramShareShowDialogTip() {
        if (this.instgramShareHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isMovieLikeShow() {
        if (this.showMovieLike == 1) {
            return true;
        }
        return false;
    }

    public boolean isNotificationTabNewStyle() {
        if (this.imNotificationTabStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean isRecommentMusicByAI() {
        if (this.recommentMusicByAI == 1) {
            return true;
        }
        return false;
    }

    public boolean isShareDialogShowForward() {
        if (this.isShareDialogShowForward == 1) {
            return true;
        }
        return false;
    }

    public boolean showNewRelationFragment() {
        if (this.imNewRelationFragmentStyle == 1) {
            return true;
        }
        return false;
    }

    public boolean showReportButton() {
        if (this.showReportButton == 1) {
            return true;
        }
        return false;
    }

    public int getI18nShareButtonStyle() {
        if (this.i18nShareButtonStyle == 0) {
            return 1;
        }
        return this.i18nShareButtonStyle;
    }

    public boolean isInstagramShareShowToastTip() {
        if (this.instgramShareHashTag == 2) {
            return true;
        }
        return false;
    }

    public void setForbidSkipBindPhone(boolean z) {
        this.forbidSkipBindPhone = z;
    }
}
