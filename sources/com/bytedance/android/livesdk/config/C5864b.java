package com.bytedance.android.livesdk.config;

import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.commerce.C5852f;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.sharedpref.C8945a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.config.b */
public interface C5864b {

    /* renamed from: A */
    public static final C3338l<Boolean> f17246A = new C3338l<>("max_encode_bitrate", Boolean.valueOf(false));

    /* renamed from: B */
    public static final C3338l<Integer> f17247B = new C3338l<>("luckymoney_disappear_duration", Integer.valueOf(5));

    /* renamed from: C */
    public static final C3338l<Integer> f17248C = new C3338l<>("room_follow_notice_duration", Integer.valueOf(NormalGiftView.ALPHA_180));

    /* renamed from: D */
    public static final C3338l<String> f17249D = new C3338l<>("pay_grade_url", "");

    /* renamed from: E */
    public static final C3338l<Integer> f17250E = new C3338l<>("doodle_min_count", Integer.valueOf(10));

    /* renamed from: F */
    public static final C3338l<Integer> f17251F = new C3338l<>("doodle_max_count", Integer.valueOf(100));

    /* renamed from: G */
    public static final C3338l<Integer> f17252G = new C3338l<>("gift_repeat_timeout", Integer.valueOf(3));

    /* renamed from: H */
    public static final C3338l<Integer> f17253H = new C3338l<>("special_gift_repeat_timeout", Integer.valueOf(10));

    /* renamed from: I */
    public static final C3338l<Integer> f17254I = new C3338l<>("rate_on_withdraw_success", Integer.valueOf(-1));

    /* renamed from: J */
    public static final C3338l<Integer> f17255J = new C3338l<>("live_mosaic_stay_time", Integer.valueOf(600));

    /* renamed from: K */
    public static final C3338l<Integer> f17256K = new C3338l<>("enable_profile_recommend_user", Integer.valueOf(1));

    /* renamed from: L */
    public static final C3338l<Boolean> f17257L = new C3338l<>("enable_live_interact", Boolean.valueOf(true));

    /* renamed from: M */
    public static final C3338l<Integer> f17258M = new C3338l<>("deco_text_modify_frequency", Integer.valueOf(1));

    /* renamed from: N */
    public static final C3338l<Integer> f17259N = new C3338l<>("enable_zhima_verify", Integer.valueOf(0));

    /* renamed from: O */
    public static final C3338l<String> f17260O = new C3338l<>("exchange_score_title", ((IHostContext) C3596c.m13172a(IHostContext.class)).context().getString(R.string.ejn));

    /* renamed from: P */
    public static final C3338l<String> f17261P = new C3338l<>("exchange_score_subtitle", ((IHostContext) C3596c.m13172a(IHostContext.class)).context().getString(R.string.ffj));

    /* renamed from: Q */
    public static final C3338l<Boolean> f17262Q = new C3338l<>("block_weibo", Boolean.valueOf(false));

    /* renamed from: R */
    public static final C3338l<Boolean> f17263R = new C3338l<>("block_qzone", Boolean.valueOf(false));

    /* renamed from: S */
    public static final C3338l<Boolean> f17264S = new C3338l<>("block_weixin", Boolean.valueOf(false));

    /* renamed from: T */
    public static final C3338l<Boolean> f17265T = new C3338l<>("block_circle", Boolean.valueOf(false));

    /* renamed from: U */
    public static final C3338l<Boolean> f17266U = new C3338l<>("block_qq", Boolean.valueOf(false));

    /* renamed from: V */
    public static final C3338l<Integer> f17267V = new C3338l<>("live_record_min_duration", Integer.valueOf(3));

    /* renamed from: W */
    public static final C3338l<Integer> f17268W = new C3338l<>("live_record_max_duration", Integer.valueOf(60));

    /* renamed from: X */
    public static final C3338l<String> f17269X = new C3338l<>("frontier_url", ((IHostContext) C3596c.m13172a(IHostContext.class)).context().getString(R.string.ffj));

    /* renamed from: Y */
    public static final C3338l<Boolean> f17270Y = new C3338l<>("promotion_card_disabled", Boolean.valueOf(false));

    /* renamed from: Z */
    public static final C3338l<Boolean> f17271Z = new C3338l<>("disable_delay_red_envelope", Boolean.valueOf(false));

    /* renamed from: a */
    public static final C3338l<C5852f> f17272a = new C3338l<>("live_commerce_banner", C5852f.class);

    /* renamed from: aa */
    public static final C3338l<Boolean> f17273aa = new C3338l<>("show_live_in_end_page", Boolean.valueOf(false));

    /* renamed from: ab */
    public static final C3338l<Boolean> f17274ab = new C3338l<>("disable_live_follow_guide", Boolean.valueOf(false));

    /* renamed from: ac */
    public static final C3338l<C8945a> f17275ac = new C3338l<>("live_dns_info", new C8945a());

    /* renamed from: ad */
    public static final C3338l<Integer> f17276ad = new C3338l<>("live_room_luckymoney_delay_seconds", Integer.valueOf(C34943c.f91128x));

    /* renamed from: ae */
    public static final C3338l<Integer> f17277ae = new C3338l<>("pay_methods_switch", Integer.valueOf(0));

    /* renamed from: af */
    public static final C3338l<String> f17278af = new C3338l<>("pay_methods_disabled_alert", "");

    /* renamed from: ag */
    public static final C3338l<Boolean> f17279ag = new C3338l<>("key_enable_intimacy_push", Boolean.valueOf(false));

    /* renamed from: ah */
    public static final C3338l<Set<String>> f17280ah = new C3338l<>("gift_urls", new HashSet());

    /* renamed from: ai */
    public static final C3338l<Integer> f17281ai = new C3338l<>("live_camera_type", Integer.valueOf(1));

    /* renamed from: b */
    public static final C3338l<Integer> f17282b = new C3338l<>("pay_methods_switch", Integer.valueOf(0));

    /* renamed from: c */
    public static final C3338l<String> f17283c = new C3338l<>("pay_methods_disabled_alert", "");

    /* renamed from: d */
    public static final C3338l<String> f17284d = new C3338l<>("gift_list", "");

    /* renamed from: e */
    public static final C3338l<Integer> f17285e = new C3338l<>("beauty_level", Integer.valueOf(3));

    /* renamed from: f */
    public static final C3338l<Boolean> f17286f = new C3338l<>("has_show_filter_guide.9.0", Boolean.valueOf(false));

    /* renamed from: g */
    public static final C3338l<Long> f17287g = new C3338l<>("fast_gift_hide_confirm_gift", Long.valueOf(0));

    /* renamed from: h */
    public static final C3338l<Long> f17288h = new C3338l<>("room_decoration_anchor_id", Long.valueOf(0));

    /* renamed from: i */
    public static final C3338l<Integer> f17289i = new C3338l<>("room_decoration_text_pass_level", Integer.valueOf(31));

    /* renamed from: j */
    public static final C3338l<String> f17290j = new C3338l<>("room_decoration_customize_text", "");

    /* renamed from: k */
    public static final C3338l<String> f17291k = new C3338l<>("room_decoration_list", "");

    /* renamed from: l */
    public static final C3338l<Long> f17292l = new C3338l<>("has_shown_interact_guide", Long.valueOf(0));

    /* renamed from: m */
    public static final C3338l<Boolean> f17293m = new C3338l<>("send_delay_red_envelope", Boolean.valueOf(true));

    /* renamed from: n */
    public static final C3338l<Boolean> f17294n = new C3338l<>("need_fast_gift_hint", Boolean.valueOf(true));

    /* renamed from: o */
    public static final C3338l<Boolean> f17295o = new C3338l<>("show_room_decoration_toast", Boolean.valueOf(true));

    /* renamed from: p */
    public static final C3338l<Integer> f17296p = new C3338l<>("location_hint_shown_count", Integer.valueOf(0));

    /* renamed from: q */
    public static final C3338l<Boolean> f17297q = new C3338l<>("live_interact_red_point", Boolean.valueOf(true));

    /* renamed from: r */
    public static final C3338l<Boolean> f17298r = new C3338l<>("live_interact_pk_red_point", Boolean.valueOf(true));

    /* renamed from: s */
    public static final C3338l<Boolean> f17299s = new C3338l<>("live_interact_pk_auto_match", Boolean.valueOf(false));

    /* renamed from: t */
    public static final C3338l<Boolean> f17300t = new C3338l<>("live_interact_pk_auto_start_match", Boolean.valueOf(false));

    /* renamed from: u */
    public static final C3338l<String> f17301u = new C3338l<>("live_interact_pk_theme", "");

    /* renamed from: v */
    public static final C3338l<Integer> f17302v = new C3338l<>("live_interact_pk_time", Integer.valueOf(120));

    /* renamed from: w */
    public static final C3338l<Integer> f17303w = new C3338l<>("live_interact_pk_time_index", Integer.valueOf(1));

    /* renamed from: x */
    public static final C3338l<Long> f17304x = new C3338l<>("live_last_show_red_point_time", Long.valueOf(0));

    /* renamed from: y */
    public static final C3338l<Integer> f17305y = new C3338l<>("live_interact_beauty_level", Integer.valueOf(2));

    /* renamed from: z */
    public static final C3338l<Integer> f17306z = new C3338l<>("max_encode_bitrate", Integer.valueOf(0));
}
