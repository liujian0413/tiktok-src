package com.bytedance.android.livesdk.feed.setting;

import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.livesdk.feed.feed.C5987d;

public interface LiveFeedSettings {
    public static final C3338l<Integer> AUDIENCE_PING_INTERVAL = new C3338l<>("audience_ping_interval", Integer.valueOf(600), "观众ping间隔");
    public static final C3338l<Float> DEFAULT_DURATION_SHOW_PREVIEW_TIP = new C3338l<>("default_duration_show_preview_tip", Float.valueOf(7.0f), "移动网络播流提示间隔时长(单位：天)");
    public static final C3338l<Integer> DOUYIN_LIVE_FEED_TOP_HINT = new C3338l<>("live_squre_sky_window_info", Integer.valueOf(0), "抖音直播广场天窗关注文案AB");
    public static final C3338l<Boolean> ENABLE_LIVE_FEED_DEBUG_MENU;
    public static final C3338l<Integer> FEED_LIVE_BANNER_POSITION = new C3338l<>("feed_live_banner_position", Integer.valueOf(0), "直播 Feed Banner 的位置", "0:顶部", "1:中间");
    public static final C3338l<Integer> FEED_PRELOAD = new C3338l<>("feed_preload", Integer.valueOf(4));
    public static final C3338l<C5987d> FREE_FLOW = new C3338l<>("free_flow", C5987d.class);
    public static final C3338l<Boolean> I18N_ZHIBOZHONG_ANIMATION_TAG = new C3338l<>("i18n_zhibozhong_animation_tag", Boolean.valueOf(true), "I18N 是否在feed页面显示直播中动画", "true:显示", "false:不显示");
    public static final C3338l<Boolean> LIVE_FEED_ENABLE_PREVIEW = new C3338l<>("live_feed_enable_preview", Boolean.valueOf(false), "直播是否显示预览小窗,目前只对小图生效", "true:显示", "false:不显示");
    public static final C3338l<Integer> MAIN_REFRESH_TIME_OUT = new C3338l<>("back_refresh_timeout", Integer.valueOf(1800000));
    public static final C3338l<Boolean> REFRESH_SHOW_SANDBOX_ROOM = new C3338l<>("refresh_show_sand_box_room", Boolean.valueOf(false), "下拉刷新展示测试房间");
    public static final C3338l<Integer> START_LIVE_ICON_POSITION = new C3338l<>("live_feed_tab_entrance_enabled", Integer.valueOf(0), "直播开播按钮展示位置", "0:不展示", "1:展示在左下角", "2:展示在中间下方", "3:展示在右下角");
    public static final int SWIPE_ROOM_DISABLE_FOLLOW_MASK = 2;
    public static final int SWIPE_ROOM_DISABLE_LIVE_MASK = 1;
    public static final C3338l<Boolean> VIDEO_PRELOAD_AFTER_COVER = new C3338l<>("video_preload_after_cover", Boolean.valueOf(false), "封面显示后再预加载视频");

    static {
        C3338l lVar = new C3338l("enable_live_feed_debug_menu", "启用直播Feed调试菜单", Boolean.valueOf(false), Boolean.valueOf(false), "true:双指点击打开", "false:禁用");
        ENABLE_LIVE_FEED_DEBUG_MENU = lVar;
    }
}
