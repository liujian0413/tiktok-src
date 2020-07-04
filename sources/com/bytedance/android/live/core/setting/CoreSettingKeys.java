package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.base.model.feed.C2346b;
import com.bytedance.android.live.base.model.p120a.C2334a;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public interface CoreSettingKeys {
    public static final C3338l<Boolean> APPLOG_CORE_V3_ONLY = new C3338l<>("applog_core_v3_only", Boolean.valueOf(false), "推荐用核心埋点只发V3", "false:双发", "true:只发V3");
    public static final C3338l<C2334a[]> COUNTRY_CODE_LIST = new C3338l<>("country_code_maps", C2334a[].class, "国家码下发");
    public static final C3338l<Integer> ENABLE_ALOG = new C3338l<>("enable_alog", Integer.valueOf(0), "是否开启ALOG回捞", "0:不开启", "1:开启");
    public static final C3338l<Integer> ENABLE_CUSTOM_TTPLAYER = new C3338l<>("enable_custom_ttplayer", Integer.valueOf(1), "选择礼物播放器的实现方式", "0:使用TTVideoEngine", "1:使用自定义的TTMediaPlayer");
    public static final C3338l<Boolean> ENABLE_IMAGE_DEFAULT_565 = new C3338l<>("enable_image_default_565", Boolean.valueOf(true), "是否默认开启565");
    public static final C3338l<Integer> ENABLE_MONITOR_TO_ALOG = new C3338l<>("enable_monitor_to_alog", Integer.valueOf(0), "是否开启monitor日志输出到ALog", "0:默认开启", "1:不开启");
    public static final C3338l<Integer> ENABLE_NEW_CHAT_NAME = new C3338l<>("enable_im_new_name", Integer.valueOf(0), "私信改名为聊天", "0:私信", "1:聊天");
    public static final C3338l<Integer> IMAGE_DOWNLOAD_THREAD_SIZE = new C3338l<>("image_download_thread_size", Integer.valueOf(8));
    public static final C3338l<Boolean> LIFT_CHAT_RESTRICTION = new C3338l<>("ichat_restrict_range", Boolean.valueOf(false), "是否放开私信开关", "true:表示放开限制，关注就能发私信", "false:表示互关才能发私信");
    public static final C3338l<C2346b> LIVE_FEED_PRELOAD = new C3338l<>("live_feed_preload", "feed load more配置", new C2346b(), new C2346b());
    public static final C3338l<LoginGuideConfig> LOGIN_GUIDE = new C3338l<>("login_guide_config", LoginGuideConfig.class);
    public static final C3338l<Integer> MAX_CACHE_ASHM_ENTRIES = new C3338l<>("MAX_CACHE_ASHM_ENTRIES", Integer.valueOf(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
    public static final C3338l<Integer> MAX_CACHE_ENTRIES = new C3338l<>("MAX_CACHE_ENTRIES", Integer.valueOf(AdError.SERVER_ERROR_CODE));
    public static final C3338l<Integer> MAX_CACHE_EVICTION_ENTRIES = new C3338l<>("fresco_mem", Integer.valueOf(100));
    public static final C3338l<Integer> PROFILE_DOWNLOAD_STYLE = new C3338l<>("profile_download_style", Integer.valueOf(0), "我的 tab 是否显示下载任务", "0: 不显示", "1: 显示");
    public static final C3338l<String> REGION = new C3338l<>("region", "");
    public static final C3338l<String> SHARE_DESC_SUFFIX = new C3338l<>("share_desc_suffix", "");
    public static final C3338l<String> SHARE_DESC_SUFFIX_URL = new C3338l<>("share_desc_suffix_url", "");
    public static final C3338l<Integer> TEST_FAKE_REGION = new C3338l<>("fake_regions", Integer.valueOf(0), "local_test fake国家", "0:中国", "1:摩洛哥", "2:沙特阿拉伯", "3:法国", "4:阿联酋");
    public static final C3338l<String> TRACKING_CUSTOM_UA = new C3338l<>("tracking_custom_ua_format", "", "自定义 UA");
}
