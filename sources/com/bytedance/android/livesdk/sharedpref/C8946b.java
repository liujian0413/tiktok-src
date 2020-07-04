package com.bytedance.android.livesdk.sharedpref;

import android.util.LongSparseArray;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.sharedpref.b */
public interface C8946b {

    /* renamed from: A */
    public static final C8947c<Boolean> f24349A = new C8947c<>("live_inroom_pk_tips", Boolean.valueOf(true));

    /* renamed from: B */
    public static final C8947c<Boolean> f24350B = new C8947c<>("live_inroom_pk_animation", Boolean.valueOf(false));

    /* renamed from: C */
    public static final C8947c<Set<Long>> f24351C = new C8947c<>("gift_panel_showed_manual", new HashSet());

    /* renamed from: D */
    public static final C8947c<Set<String>> f24352D = new C8947c<>("gift_panel_opened_guide_url", new HashSet());

    /* renamed from: E */
    public static final C8947c<Long> f24353E = new C8947c<>("new_gift_notify_has_showed_id", Long.valueOf(0));

    /* renamed from: F */
    public static final C8947c<Boolean> f24354F = new C8947c<>("showed_doodle_template_popup_tip", Boolean.valueOf(false));

    /* renamed from: G */
    public static final C8947c<Boolean> f24355G = new C8947c<>("gift_animation_enable_landscape", Boolean.valueOf(true));

    /* renamed from: H */
    public static final C8947c<Long> f24356H = new C8947c<>("live_start_live_anchor", Long.valueOf(0));

    /* renamed from: I */
    public static final C8947c<Integer> f24357I = new C8947c<>("live_preview_location_show_state", Integer.valueOf(0));

    /* renamed from: J */
    public static final C8947c<String> f24358J = new C8947c<>("live_start_live_mode", LiveMode.VIDEO.name());

    /* renamed from: K */
    public static final C8947c<Map<String, String>> f24359K = new C8947c<>("live_start_live_tag", new HashMap());

    /* renamed from: L */
    public static final C8947c<Boolean> f24360L = new C8947c<>("live_beauty_feedback_clicked", Boolean.valueOf(false));

    /* renamed from: M */
    public static final C8947c<Integer> f24361M = new C8947c<>("live_filter_id", Integer.valueOf(-1));

    /* renamed from: N */
    public static final C8947c<Float> f24362N = new C8947c<>("whitening_param_v2", Float.valueOf(-1.0f));

    /* renamed from: O */
    public static final C8947c<Float> f24363O = new C8947c<>("beauty_skin_param_v2", Float.valueOf(-1.0f));

    /* renamed from: P */
    public static final C8947c<Float> f24364P = new C8947c<>("big_eyes_param", Float.valueOf(-1.0f));

    /* renamed from: Q */
    public static final C8947c<Float> f24365Q = new C8947c<>("face_lift_param", Float.valueOf(-1.0f));

    /* renamed from: R */
    public static final C8947c<Integer> f24366R = new C8947c<>("beauty_level", Integer.valueOf(3));

    /* renamed from: S */
    public static final C8947c<Set<Long>> f24367S = new C8947c<>("prop_panel_showed_red_point", new HashSet());

    /* renamed from: T */
    public static final C8947c<Set<String>> f24368T = new C8947c<>("fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: U */
    public static final C8947c<Set<String>> f24369U = new C8947c<>("mt_fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: V */
    public static final C8947c<Float> f24370V = new C8947c<>("barrage_alpha", Float.valueOf(1.0f));

    /* renamed from: W */
    public static final C8947c<Float> f24371W = new C8947c<>("barrage_size", Float.valueOf(1.0f));

    /* renamed from: X */
    public static final C8947c<Integer> f24372X = new C8947c<>("barrage_local_type", Integer.valueOf(2));

    /* renamed from: Y */
    public static final C8947c<Boolean> f24373Y = new C8947c<>("barrage_enable", Boolean.valueOf(true));

    /* renamed from: Z */
    public static final C8947c<Boolean> f24374Z = new C8947c<>("room_auto_gift_thanks", Boolean.valueOf(false));

    /* renamed from: a */
    public static final C8947c<Boolean> f24375a = new C8947c<>("jump_to_room_dialog", Boolean.valueOf(false));

    /* renamed from: aA */
    public static final C8947c<Boolean> f24376aA = new C8947c<>("recharge_dialog_balance_change_tip_shown", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final C8947c<Boolean> f24377aB = new C8947c<>("recharge_dialog_big_deal_hint_shown", Boolean.valueOf(false));

    /* renamed from: aC */
    public static final C8947c<Boolean> f24378aC = new C8947c<>("live_comment_danmu_state", Boolean.valueOf(false));

    /* renamed from: aD */
    public static final C8947c<String> f24379aD = new C8947c<>("room_decoration_customize_text", "");

    /* renamed from: aE */
    public static final C8947c<Integer> f24380aE = new C8947c<>("room_decoration_text_pass_level", Integer.valueOf(31));

    /* renamed from: aF */
    public static final C8947c<Long> f24381aF = new C8947c<>("room_decoration_anchor_id", Long.valueOf(0));

    /* renamed from: aG */
    public static final C8947c<String> f24382aG = new C8947c<>("room_decoration_list", "");

    /* renamed from: aH */
    public static final C8947c<Boolean> f24383aH = new C8947c<>("show_room_decoration_toast", Boolean.valueOf(true));

    /* renamed from: aI */
    public static final C8947c<Integer> f24384aI = new C8947c<>("live_interact_pk_clean_num", Integer.valueOf(5));

    /* renamed from: aJ */
    public static final C8947c<Integer> f24385aJ = new C8947c<>("live_steal_tower", Integer.valueOf(1));

    /* renamed from: aK */
    public static final C8947c<Integer> f24386aK = new C8947c<>("live_interact_pk_refuse_count_per_day", Integer.valueOf(0));

    /* renamed from: aL */
    public static final C8947c<String> f24387aL = new C8947c<>("live_interact_pk_first_refuse_date", "");

    /* renamed from: aM */
    public static final C8947c<Boolean> f24388aM = new C8947c<>("live_pk_medal_is_in_promotion", Boolean.valueOf(false));

    /* renamed from: aN */
    public static final C8947c<Long> f24389aN = new C8947c<>("live_pk_medal_promotion_start_time", Long.valueOf(0));

    /* renamed from: aO */
    public static final C8947c<Integer> f24390aO = new C8947c<>("live_interact_pk_duration", Integer.valueOf(C34943c.f91128x));

    /* renamed from: aP */
    public static final C8947c<Integer> f24391aP = new C8947c<>("live_interact_pk_duration_index", Integer.valueOf(1));

    /* renamed from: aQ */
    public static final C8947c<Boolean> f24392aQ = new C8947c<>("live_interact_pk_setting_red_point", Boolean.valueOf(true));

    /* renamed from: aR */
    public static final C8947c<Boolean> f24393aR = new C8947c<>("live_interact_setting_red_point", Boolean.valueOf(true));

    /* renamed from: aS */
    public static final C8947c<Boolean> f24394aS = new C8947c<>("live_interact_pk_auto_match", Boolean.valueOf(false));

    /* renamed from: aT */
    public static final C8947c<Boolean> f24395aT = new C8947c<>("live_interact_pk_auto_start_match", Boolean.valueOf(false));

    /* renamed from: aU */
    public static final C8947c<String> f24396aU = new C8947c<>("live_interact_pk_theme", "");

    /* renamed from: aV */
    public static final C8947c<Boolean> f24397aV = new C8947c<>("showed_pay_channel_scroll_tip", Boolean.valueOf(false));

    /* renamed from: aW */
    public static final C8947c<Boolean> f24398aW = new C8947c<>("show_enter_other_live_room_dialog", Boolean.valueOf(true));

    /* renamed from: aX */
    public static final C8947c<Boolean> f24399aX = new C8947c<>("show_enter_other_live_room_dialog_of_hour_rank", Boolean.valueOf(true));

    /* renamed from: aY */
    public static final C8947c<Long> f24400aY = new C8947c<>("mobile_flow_show_time", Long.valueOf(0));

    /* renamed from: aZ */
    public static final C8947c<String> f24401aZ = new C8947c<>("last_first_charge_bubble_show_time", "");

    /* renamed from: aa */
    public static final C8947c<Boolean> f24402aa = new C8947c<>("game_quiz_anchor_tip_show", Boolean.valueOf(false));

    /* renamed from: ab */
    public static final C8947c<Long> f24403ab = new C8947c<>("live_guide_to_feed_show_time", Long.valueOf(0));

    /* renamed from: ac */
    public static final C8947c<String> f24404ac = new C8947c<>("gift_guide_flag", "");

    /* renamed from: ad */
    public static final C8947c<Boolean> f24405ad = new C8947c<>("live_game_quit_click", Boolean.valueOf(false));

    /* renamed from: ae */
    public static final C8947c<Boolean> f24406ae = new C8947c<>("live_share_get_diamonds_tip", Boolean.valueOf(true));

    /* renamed from: af */
    public static final C8947c<Integer> f24407af = new C8947c<>("live_game_msg_state", Integer.valueOf(0));

    /* renamed from: ag */
    public static final C8947c<Boolean> f24408ag = new C8947c<>("live_game_comment_msg_push", Boolean.valueOf(true));

    /* renamed from: ah */
    public static final C8947c<Boolean> f24409ah = new C8947c<>("live_game_gift_msg_push", Boolean.valueOf(true));

    /* renamed from: ai */
    public static final C8947c<Boolean> f24410ai = new C8947c<>("live_game_enter_msg_push", Boolean.valueOf(true));

    /* renamed from: aj */
    public static final C8947c<Boolean> f24411aj = new C8947c<>("live_anchor_show_fans_club_push", Boolean.valueOf(false));

    /* renamed from: ak */
    public static final C8947c<Boolean> f24412ak = new C8947c<>("live_anchor_show_fans_club_auto_light_4_anchor_push", Boolean.valueOf(false));

    /* renamed from: al */
    public static final C8947c<Boolean> f24413al = new C8947c<>("live_anchor_show_fans_club_auto_light_4_audience_push", Boolean.valueOf(false));

    /* renamed from: am */
    public static final C8947c<Boolean> f24414am = new C8947c<>("gesture_magic_guide_flag", Boolean.valueOf(true));

    /* renamed from: an */
    public static final C8947c<Map<String, Boolean>> f24415an = new C8947c<>("gesture_magic_guide_v2", new HashMap());

    /* renamed from: ao */
    public static final C8947c<Boolean> f24416ao = new C8947c<>("gesture_magic_switch", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final C8947c<Boolean> f24417ap = new C8947c<>("gesture_magic_switch_v2", Boolean.valueOf(false));

    /* renamed from: aq */
    public static final C8947c<Map<String, String>> f24418aq = new C8947c<>("gesture_magic_old_select_composer_path_map", new HashMap());

    /* renamed from: ar */
    public static final C8947c<Map<String, List<String>>> f24419ar = new C8947c<>("gesture_magic_select_composer_path_map", new HashMap());

    /* renamed from: as */
    public static final C8947c<Map<String, Map<String, Float>>> f24420as = new C8947c<>("live_composer_save_node_tag_value", new HashMap());

    /* renamed from: at */
    public static final C8947c<Integer> f24421at = new C8947c<>("current_sticker_page_position", Integer.valueOf(0));

    /* renamed from: au */
    public static final C8947c<Boolean> f24422au = new C8947c<>("show_backpack_tips", Boolean.valueOf(true));

    /* renamed from: av */
    public static final C8947c<Map<Long, String>> f24423av = new C8947c<>("guard_info_map", new HashMap());

    /* renamed from: aw */
    public static final C8947c<Boolean> f24424aw = new C8947c<>("vigo_show_start_live_flame_tip", Boolean.valueOf(true));

    /* renamed from: ax */
    public static final C8947c<Integer> f24425ax = new C8947c<>("vigo_show_end_live_flame_tip_count", Integer.valueOf(0));

    /* renamed from: ay */
    public static final C8947c<Boolean> f24426ay = new C8947c<>("package_purchase_showed", Boolean.valueOf(false));

    /* renamed from: az */
    public static final C8947c<String> f24427az = new C8947c<>("last_pay_channel", "");

    /* renamed from: b */
    public static final C8947c<Set<String>> f24428b = new C8947c<>("gift_list_type", new HashSet());

    /* renamed from: bA */
    public static final C8947c<Map<Long, Boolean>> f24429bA = new C8947c<>("official_red_envelope_map", new HashMap());

    /* renamed from: bB */
    public static final C8947c<Map<Long, Boolean>> f24430bB = new C8947c<>("cny_red_envelope_map", new HashMap());

    /* renamed from: bC */
    public static final C8947c<Boolean> f24431bC = new C8947c<>("official_task_packet_animation", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final C8947c<Boolean> f24432bD = new C8947c<>("has_show_koi_play_description", Boolean.valueOf(false));

    /* renamed from: bE */
    public static final C8947c<Set<String>> f24433bE = new C8947c<>("star_room_open_red_packet_rooms", new HashSet());

    /* renamed from: bF */
    public static final C8947c<Set<String>> f24434bF = new C8947c<>("star_room_open_red_packet_uids", new HashSet());

    /* renamed from: bG */
    public static final C8947c<Boolean> f24435bG = new C8947c<>("has_play_gift_failure_on_mediaplayer", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final C8947c<Boolean> f24436bH = new C8947c<>("has_shown_portal_gift_guide", Boolean.valueOf(false));

    /* renamed from: bI */
    public static final C8947c<Map<String, Boolean>> f24437bI = new C8947c<>("douyin_fansclub_tips_anchor_map", new HashMap());

    /* renamed from: bJ */
    public static final C8947c<Map<String, Double>> f24438bJ = new C8947c<>("douyin_fansclub_tips_count_map", new HashMap());

    /* renamed from: bK */
    public static final C8947c<Boolean> f24439bK = new C8947c<>("douyin_game_tips_show", Boolean.valueOf(true));

    /* renamed from: bL */
    public static final C8947c<Boolean> f24440bL = new C8947c<>("vote_tips_show", Boolean.valueOf(true));

    /* renamed from: bM */
    public static final C8947c<Boolean> f24441bM = new C8947c<>("manage_button_tips_show", Boolean.valueOf(true));

    /* renamed from: bN */
    public static final C8947c<Boolean> f24442bN = new C8947c<>("block_word_pannel_tips_show", Boolean.valueOf(true));

    /* renamed from: bO */
    public static final C8947c<LongSparseArray<String>> f24443bO = new C8947c<>("send_gift_group_count", new LongSparseArray());

    /* renamed from: bP */
    public static final C8947c<LongSparseArray<String>> f24444bP = new C8947c<>("send_prop_group_count", new LongSparseArray());

    /* renamed from: bQ */
    public static final C8947c<Boolean> f24445bQ = new C8947c<>("official_danmu_enable", Boolean.valueOf(true));

    /* renamed from: bR */
    public static final C8947c<Boolean> f24446bR = new C8947c<>("official_gift_enable", Boolean.valueOf(true));

    /* renamed from: ba */
    public static final C8947c<String> f24447ba = new C8947c<>("last_first_charge_bubble_text", "");

    /* renamed from: bb */
    public static final C8947c<List<String>> f24448bb = new C8947c<>("last_first_charge_bubble_show_info", new ArrayList());

    /* renamed from: bc */
    public static final C8947c<Integer> f24449bc = new C8947c<>("recharge_dialog_content_height", Integer.valueOf(0));

    /* renamed from: bd */
    public static final C8947c<String> f24450bd = new C8947c<>("tool_bar_first_charge_shake_times", "");

    /* renamed from: be */
    public static final C8947c<Long> f24451be = new C8947c<>("recharge_reward_popup_in_gift_dialog_timestamp", Long.valueOf(0));

    /* renamed from: bf */
    public static final C8947c<String> f24452bf = new C8947c<>("live_last_turntable_bubble", "");

    /* renamed from: bg */
    public static final C8947c<Long> f24453bg = new C8947c<>("live_last_new_drive_count", Long.valueOf(0));

    /* renamed from: bh */
    public static final C8947c<Boolean> f24454bh = new C8947c<>("live_showd_drive_panel", Boolean.valueOf(false));

    /* renamed from: bi */
    public static final C8947c<Double> f24455bi = new C8947c<>("live_last_healthy_score", Double.valueOf(0.0d));

    /* renamed from: bj */
    public static final C8947c<Long> f24456bj = new C8947c<>("live_last_punishment_time", Long.valueOf(0));

    /* renamed from: bk */
    public static final C8947c<Boolean> f24457bk = new C8947c<>("live_first_show_health_score", Boolean.valueOf(true));

    /* renamed from: bl */
    public static final C8947c<Integer> f24458bl = new C8947c<>("duty_gift_last_rules", Integer.valueOf(0));

    /* renamed from: bm */
    public static final C8947c<String> f24459bm = new C8947c<>("last_first_quit_anchor_dialog", "");

    /* renamed from: bn */
    public static final C8947c<String> f24460bn = new C8947c<>("last_first_more_anchor_guide", "");

    /* renamed from: bo */
    public static final C8947c<Integer> f24461bo = new C8947c<>("join_fans_comment_guide_times", Integer.valueOf(0));

    /* renamed from: bp */
    public static final C8947c<Long> f24462bp = new C8947c<>("latest_show_join_fans_comment_time", Long.valueOf(0));

    /* renamed from: bq */
    public static final C8947c<Boolean> f24463bq = new C8947c<>("has_show_live_long_press_clear_screen_tips", Boolean.valueOf(false));

    /* renamed from: br */
    public static final C8947c<Boolean> f24464br = new C8947c<>("has_slide_to_exit_room", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final C8947c<Integer> f24465bs = new C8947c<>("starlight_anim_guide_count", Integer.valueOf(0));

    /* renamed from: bt */
    public static final C8947c<Integer> f24466bt = new C8947c<>("starlight_text_guide_count", Integer.valueOf(0));

    /* renamed from: bu */
    public static final C8947c<Integer> f24467bu = new C8947c<>("hotsoon_wallet_page_guide_shown", Integer.valueOf(0));

    /* renamed from: bv */
    public static final C8947c<String> f24468bv = new C8947c<>("live_group_toolbar_red_dot_local", "");

    /* renamed from: bw */
    public static final C8947c<Boolean> f24469bw = new C8947c<>("show_gift_toolbar_red_dot", Boolean.valueOf(false));

    /* renamed from: bx */
    public static final C8947c<Boolean> f24470bx = new C8947c<>("click_gift_toolbar_red_dot", Boolean.valueOf(false));

    /* renamed from: by */
    public static final C8947c<Boolean> f24471by = new C8947c<>("show_gift_dialog_prop_red_dot", Boolean.valueOf(false));

    /* renamed from: bz */
    public static final C8947c<Boolean> f24472bz = new C8947c<>("has_shown_send_red_packet", Boolean.valueOf(false));

    /* renamed from: c */
    public static final C8947c<Set<String>> f24473c = new C8947c<>("gift_urls", new HashSet());

    /* renamed from: d */
    public static final C8947c<String> f24474d = new C8947c<>("assets_cache_data", "");

    /* renamed from: e */
    public static final C8947c<Long> f24475e = new C8947c<>("assets_cache_last_check_time", Long.valueOf(0));

    /* renamed from: f */
    public static final C8947c<Integer> f24476f = new C8947c<>("live_broadcast_room_type", Integer.valueOf(0));

    /* renamed from: g */
    public static final C8947c<Integer> f24477g = new C8947c<>("live_camera_type", Integer.valueOf(1));

    /* renamed from: h */
    public static final C8947c<Boolean> f24478h = new C8947c<>("live_media_camera_mirror", Boolean.valueOf(false));

    /* renamed from: i */
    public static final C8947c<String> f24479i = new C8947c<>("live_resource_current_version", "");

    /* renamed from: j */
    public static final C8947c<Integer> f24480j = new C8947c<>("live_interact_pk_clean_total_count", Integer.valueOf(5));

    /* renamed from: k */
    public static final C8947c<Integer> f24481k = new C8947c<>("live_interact_pk_total_num", Integer.valueOf(5));

    /* renamed from: l */
    public static final C8947c<String> f24482l = new C8947c<>("live_interact_pk_clean_date", "");

    /* renamed from: m */
    public static final C8947c<Boolean> f24483m = new C8947c<>("live_interact_pk_clean_tip", Boolean.valueOf(true));

    /* renamed from: n */
    public static final C8947c<Boolean> f24484n = new C8947c<>("live_interact_pk_steal_tower_tip", Boolean.valueOf(true));

    /* renamed from: o */
    public static final C8947c<Integer> f24485o = new C8947c<>("live_interact_pk_tip_show_num", Integer.valueOf(0));

    /* renamed from: p */
    public static final C8947c<String> f24486p = new C8947c<>("live_interact_pk_tip_show_date", "");

    /* renamed from: q */
    public static final C8947c<Long> f24487q = new C8947c<>("live_prop_expire_tip_time", Long.valueOf(0));

    /* renamed from: r */
    public static final C8947c<Integer> f24488r = new C8947c<>("live_link_mic_stats", Integer.valueOf(1));

    /* renamed from: s */
    public static final C8947c<String> f24489s = new C8947c<>("last_share_channel", "");

    /* renamed from: t */
    public static final C8947c<Boolean> f24490t = new C8947c<>("first_enter_live_start", Boolean.valueOf(true));

    /* renamed from: u */
    public static final C8947c<Integer> f24491u = new C8947c<>("location_hint_shown_count", Integer.valueOf(0));

    /* renamed from: v */
    public static final C8947c<Long> f24492v = new C8947c<>("current_room_id", Long.valueOf(0));

    /* renamed from: w */
    public static final C8947c<Long> f24493w = new C8947c<>("current_room_start_time", Long.valueOf(0));

    /* renamed from: x */
    public static final C8947c<Long> f24494x = new C8947c<>("current_preview_start_time", Long.valueOf(0));

    /* renamed from: y */
    public static final C8947c<Long> f24495y = new C8947c<>("live_last_active_time", Long.valueOf(0));

    /* renamed from: z */
    public static final C8947c<Long> f24496z = new C8947c<>("live_stream_video_capture_last_time", Long.valueOf(0));
}
