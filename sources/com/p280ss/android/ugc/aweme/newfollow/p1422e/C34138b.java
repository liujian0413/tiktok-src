package com.p280ss.android.ugc.aweme.newfollow.p1422e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lighten.core.C12125f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24467d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.experiment.C27689c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33254ay;
import com.p280ss.android.ugc.aweme.metrics.C33255az;
import com.p280ss.android.ugc.aweme.metrics.C33273o;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.metrics.C33283y;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.newfollow.e.b */
public final class C34138b {

    /* renamed from: a */
    private static long f88954a = -1;

    /* renamed from: b */
    private static Map<String, Long> f88955b = new HashMap();

    /* renamed from: c */
    private static long f88956c = -1;

    /* renamed from: a */
    public static void m109987a(String str, String str2) {
        if (f88954a != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f88954a;
            if (currentTimeMillis > 0) {
                m109964a(currentTimeMillis, str, str2);
            }
            f88954a = -1;
        }
    }

    /* renamed from: a */
    private static void m109985a(String str, long j) {
        f88955b.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m109984a(String str) {
        if (m110008d(str) == -1) {
            m109985a(str, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public static void m109977a(Aweme aweme, String str, String str2, String str3, boolean z, String str4) {
        if (aweme != null) {
            String str5 = "";
            if (!TextUtils.equals("general_search", str)) {
                TextUtils.equals("search_result", str);
            }
            ((C33253ax) ((C33253ax) new C33253ax().mo85164a(str).mo85179i(str).mo85071g(aweme).mo85283l(str2)).mo85185r(str3).mo85166a(z).mo85285n(str5)).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a())).mo85252e();
            if (TextUtils.equals(str4, "search_result") || TextUtils.equals(str4, "general_search")) {
                C26807z.f70733a.mo68582a("search_video_play", aweme, str, TextUtils.equals(str4, "search_result"));
            }
            C6869c a = C6869c.m21381a();
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            if (C34199d.m110410h()) {
                a.mo16885a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo16887a("poi_id", C33230ac.m107223e(aweme));
                a.mo16887a("poi_type", C33230ac.m107229h(aweme));
            }
            a.mo16885a("enter_fullscreen", Integer.valueOf(z ? 1 : 0));
            a.mo16887a("content_source", str3);
            a.mo16887a("tab_name", str2);
            C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
        }
    }

    /* renamed from: a */
    public static void m109975a(Aweme aweme, String str, String str2, String str3) {
        if (aweme != null) {
            String str4 = "";
            if (!TextUtils.equals("general_search", str3)) {
                TextUtils.equals("search_result", str3);
            }
            ((C33254ay) ((C33254ay) new C33254ay().mo85197a(str3).mo85200b(str3).mo85071g(aweme).mo85208f(str2).mo85283l(str)).mo85198a(false).mo85285n(str4)).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a())).mo85252e();
            C6869c a = C6869c.m21381a();
            C29893a.m97888b(a, aweme, str3);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            if (C34199d.m110410h()) {
                a.mo16885a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str3)) {
                a.mo16887a("poi_id", C33230ac.m107223e(aweme));
                a.mo16887a("poi_type", C33230ac.m107229h(aweme));
            }
            a.mo16887a("enter_from", str3);
            a.mo16887a("content_source", str2);
            a.mo16887a("tab_name", str);
            C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
        }
    }

    /* renamed from: a */
    public static void m109978a(Aweme aweme, String str, boolean z) {
        C6907h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_pause").setValue(aweme.getAid()));
        if (TextUtils.equals(str, "general_search")) {
            C22984d a = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59970a("enter_fullscreen", z ? 1 : 0);
            if (C34199d.m110410h()) {
                a.mo59970a("is_auto_play", 1);
            }
            C6907h.m21524a("video_pause", (Map) a.f60753a);
        }
    }

    /* renamed from: a */
    public static void m109973a(Aweme aweme, String str, String str2, int i, String str3, long j) {
        if (aweme != null) {
            new C33283y().mo85380d(str).mo85381e(str2).mo85071g(aweme).mo85376b(i).mo85383f(str3).mo85375a(false).mo85373a(j).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a())).mo85252e();
            C6869c a = C6869c.m21381a().mo16887a("enter_from", str).mo16887a("enter_method", "click").mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo16887a("poi_id", C33230ac.m107223e(aweme));
                a.mo16887a("poi_type", C33230ac.m107229h(aweme));
            }
            C6907h.onEvent(MobClick.obtain().setEventName("like").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
        }
    }

    /* renamed from: a */
    public static void m109971a(Aweme aweme, String str, int i) {
        if (aweme != null) {
            C6907h.m21525a("like_cancel", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme))).f60753a));
        }
    }

    /* renamed from: a */
    public static void m109972a(Aweme aweme, String str, String str2) {
        if (aweme != null && !"poi_page".equalsIgnoreCase(str)) {
            C6869c a = C6869c.m21381a().mo16887a("enter_from", str).mo16887a("enter_method", "click").mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
        }
    }

    /* renamed from: a */
    public static void m109974a(Aweme aweme, String str, String str2, int i, String str3, String str4, int i2) {
        String str5;
        if (TextUtils.equals("poi_page", str3)) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str3);
            hashMap.put("group_id", aweme.getAid());
            hashMap.put("comment_id", str);
            String str6 = "position";
            if (i2 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                str5 = sb.toString();
            } else {
                str5 = "";
            }
            hashMap.put(str6, str5);
            C6907h.m21524a("like_comment", (Map) hashMap);
            return;
        }
        String str7 = "common";
        if (1 == i) {
            str7 = "author";
        } else if (2 == i) {
            str7 = "following";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(str3).setValue(str).setExtValueString(str2).setJsonObject(C6869c.m21381a().mo16887a("attribute", str7).mo16888b()));
        C22984d a = C22984d.m75611a();
        a.mo59973a("comment_id", str);
        a.mo59974a(C29893a.m97884a(str3, aweme));
        a.mo59974a(C29893a.m97889b(aweme, str4));
        if (C33230ac.m107222d(str3)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            C6907h.m21525a("like_comment", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("like_comment", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m109982a(User user, String str, int i, String str2, String str3, String str4) {
        m109983a(user, str, i, str2, false, str3, str4);
    }

    /* renamed from: a */
    private static void m109983a(User user, String str, int i, String str2, boolean z, String str3, String str4) {
        if (user != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("homepage_follow").setJsonObject(C6869c.m21381a().mo16887a("rec_uid", user.getUid()).mo16887a("enter_from", str4).mo16887a("event_type", str).mo16885a("impr_order", Integer.valueOf(i)).mo16887a("req_id", str2).mo16888b()));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rec_uid", user.getUid());
                jSONObject.put("enter_from", str4);
                jSONObject.put("event_type", str);
                jSONObject.put("impr_order", i);
                jSONObject.put("req_id", str2);
                jSONObject.put("rec_reason", user.getRecommendReason());
                jSONObject.put("is_direct", 1);
                jSONObject.put("page_status", str3);
            } catch (JSONException unused) {
            }
            C6907h.m21525a("follow_card", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m109981a(User user, String str, int i, String str2, String str3) {
        C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("rec_uid", user.getUid()).mo59973a("enter_from", "homepage_follow").mo59973a("event_type", str).mo59970a("impr_order", i).mo59973a("req_id", str2).mo59973a("trigger_reason", str3).mo59973a("rec_reason", m110013e(user.getRecommendReason())).f60753a);
    }

    /* renamed from: a */
    public static void m109992a(boolean z) {
        C6869c a = C6869c.m21381a().mo16887a("enter_type", "card");
        if (z) {
            a.mo16887a("trigger_reason", "cold_launch");
        }
        C6907h.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("homepage_follow").setJsonObject(a.mo16888b()));
        if (z) {
            C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_type", "card").mo59973a("trigger_reason", "cold_launch").f60753a);
        }
    }

    /* renamed from: a */
    public static void m109988a(String str, String str2, int i, String str3) {
        m109991a(str, str2, false, i, str3);
    }

    /* renamed from: a */
    public static void m109991a(String str, String str2, boolean z, int i, String str3) {
        C6869c a = C6869c.m21381a().mo16887a("enter_type", "card").mo16887a("enter_from", str3).mo16887a("request_id", str);
        if (z) {
            a.mo16887a("trigger_reason", "cold_launch");
        }
        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName(str3).setValue(str2).setJsonObject(a.mo16888b()));
        C22984d a2 = C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("enter_type", "card").mo59973a("request_id", str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str)).mo59973a("to_user_id", str2).mo59973a("enter_method", "follow_card_button").mo59973a("previous_page", "homepage_follow").mo59973a("previous_page_position", "follow_card_button");
        if (z) {
            a2.mo59973a("trigger_reason", "cold_launch");
        }
        C6907h.m21524a(i == 0 ? "follow" : "follow_cancel", (Map) a2.f60753a);
    }

    /* renamed from: a */
    public static void m109989a(String str, String str2, Aweme aweme) {
        C6869c a = C6869c.m21381a().mo16887a("previous_page", "").mo16887a("author_id", aweme.getAuthorUid()).mo16887a("enter_method", "content_card");
        if (aweme.getAwemeType() == 13) {
            a.mo16887a("is_reposted", "1").mo16887a("from_group_id", aweme.getFromGroupId()).mo16887a("page_type", "list").mo16887a("repost_comment_id", aweme.getForwardCommentId());
        }
        C6907h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setValue(aweme.getAuthorUid()).setExtValueString(aweme.getAid()).setJsonObject(a.mo16888b()));
        C22984d a2 = C22984d.m75611a().mo59973a("previous_page", "").mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("to_user_id", aweme.getAuthorUid()).mo59973a("enter_method", "content_card");
        if (TextUtils.equals("follow", str)) {
            a2.mo59975b();
            a2.mo59973a("enter_from", str2);
            a2.mo59973a("previous_page", "homepage_follow");
            a2.mo59973a("previous_page_position", "content_card_button");
            a2.mo59973a("enter_method", "follow_button");
        } else if (TextUtils.equals("follow_cancel", str)) {
            a2.mo59973a("enter_from", "homepage_follow");
            a2.mo59973a("enter_method", "menu_sheet");
        } else {
            a2.mo59973a("enter_from", str2);
        }
        if (aweme.getAwemeType() == 13) {
            a2.mo59973a("is_reposted", "1").mo59973a("from_group_id", aweme.getFromGroupId()).mo59973a("page_type", "list").mo59973a("repost_comment_id", aweme.getForwardCommentId());
        }
        a2.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
        C6907h.m21525a(str, C33230ac.m107211a(a2.f60753a));
    }

    /* renamed from: a */
    public static void m109979a(User user) {
        C6907h.m21524a("follow", (Map) C22984d.m75611a().mo59973a("to_user_id", user.getUid()).mo59973a("enter_from", "homepage_follow").mo59973a("enter_type", "card").mo59973a("trigger_reason", "cold_launch").mo59973a("rec_reason", m110013e(user.getRecommendReason())).mo59975b().f60753a);
    }

    /* renamed from: a */
    public static void m109990a(String str, String str2, boolean z) {
        C6869c a = C6869c.m21381a().mo16887a("enter_type", "card").mo16887a("request_id", str2);
        if (z) {
            a.mo16887a("trigger_reason", "cold_launch").mo16887a("enter_from", "homepage_follow");
        }
        C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("homepage_follow").setValue(str).setJsonObject(a.mo16888b()));
        C6907h.m21528b("enter_personal_detail", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_type", "card").mo59973a("request_id", str2).mo59973a("to_user_id", str).mo59973a("trigger_reason", "cold_launch").mo59973a("log_pb", C28199ae.m92689a().mo71791a(str2)).f60753a));
    }

    /* renamed from: a */
    public static void m109986a(String str, User user) {
        C6907h.m21525a("enter_personal_detail", C33230ac.m107211a(C22984d.m75611a().mo59973a("to_user_id", user.getUid()).mo59973a("enter_from", "homepage_follow").mo59973a("enter_type", "card").mo59973a("trigger_reason", "cold_launch").mo59973a("rec_reason", m110013e(user.getRecommendReason())).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str)).mo59975b().f60753a));
    }

    /* renamed from: a */
    public static void m109976a(Aweme aweme, String str, String str2, String str3, String str4) {
        if (aweme != null) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("group_id", aweme.getAid());
            a.mo16887a("compilation_id", C33230ac.m107246u(aweme));
            C29893a.m97888b(a, aweme, str3);
            C29893a.m97881a(a, aweme, str4);
            if (TextUtils.equals(str3, "rec_follow")) {
                a.mo16887a("content_source", "content_card");
            }
            C6907h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(str3).setValue(str).setJsonObject(a.mo16888b()));
            C22984d b = C22984d.m75611a().mo59973a("author_id", aweme.getAuthorUid()).mo59973a("to_user_id", str).mo59973a("compilation_id", C33230ac.m107246u(aweme)).mo59973a("enter_method", TextUtils.equals(str2, "head") ? "click_head" : "click_name").mo59974a(C29893a.m97884a(str3, aweme)).mo59974a(C29893a.m97889b(aweme, str4)).mo59975b();
            if (TextUtils.equals(str3, "rec_follow")) {
                b.mo59973a("content_source", "content_card");
            }
            if (C33230ac.m107226f(str3)) {
                b.mo59973a("relation_type", C43122ff.m136762a(aweme) ? "follow" : "unfollow");
                b.mo59973a("video_type", C33230ac.m107247v(aweme));
                b.mo59973a("rec_uid", C33230ac.m107248w(aweme));
            }
            if (C33230ac.m107222d(str3)) {
                b.mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId()));
                C6907h.m21525a("enter_personal_detail", C33230ac.m107211a(b.f60753a));
                return;
            }
            C6907h.m21524a("enter_personal_detail", (Map) b.f60753a);
        }
    }

    /* renamed from: c */
    public static void m110001c() {
        m109992a(false);
    }

    /* renamed from: a */
    public static void m109963a() {
        if (f88954a == -1) {
            f88954a = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public static void m109993b() {
        if (f88956c == -1) {
            f88956c = System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public static void m110014e() {
        C6907h.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
    }

    /* renamed from: f */
    public static void m110017f() {
        C6907h.m21524a("show_history", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").f60753a);
    }

    /* renamed from: d */
    public static void m110009d() {
        C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").f60753a);
    }

    /* renamed from: c */
    public static void m110005c(String str) {
        C6907h.m21524a(str, (Map) new HashMap());
    }

    /* renamed from: e */
    private static String m110013e(String str) {
        if (C27689c.m90842b()) {
            return "super_account";
        }
        return str;
    }

    /* renamed from: a */
    public static void m109966a(Aweme aweme) {
        if (aweme != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_play").setValue(aweme.getAid()));
        }
    }

    /* renamed from: d */
    private static int m110007d(Aweme aweme) {
        int i;
        if (aweme == null) {
            return -1;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return -1;
        }
        if (aweme.getAwemeType() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        return i;
    }

    /* renamed from: b */
    public static void m109994b(Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("request_id", C33230ac.m107219c(aweme));
        hashMap.put("position", "poi_page");
        hashMap.put("host_value", C33230ac.m107205a(aweme));
        hashMap.put("room_value", C33230ac.m107215b(aweme));
        C6907h.m21524a("live_play", (Map) hashMap);
    }

    /* renamed from: c */
    public static void m110002c(Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("request_id", C33230ac.m107219c(aweme));
        hashMap.put("position", "poi_page");
        hashMap.put("host_value", C33230ac.m107205a(aweme));
        hashMap.put("room_value", C33230ac.m107215b(aweme));
        C6907h.m21524a("live_notice", (Map) hashMap);
    }

    /* renamed from: d */
    private static long m110008d(String str) {
        if (f88955b.containsKey(str)) {
            return ((Long) f88955b.get(str)).longValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static void m109998b(User user) {
        C6907h.m21524a("follow_cancel", (Map) C22984d.m75611a().mo59973a("to_user_id", user.getUid()).mo59973a("enter_from", "homepage_follow").mo59973a("enter_type", "card").mo59973a("trigger_reason", "cold_launch").mo59973a("rec_reason", m110013e(user.getRecommendReason())).mo59975b().f60753a);
    }

    /* renamed from: b */
    public static void m109999b(String str) {
        C6907h.onEvent(MobClick.obtain().setEventName("show").setLabelName("live_merge").setJsonObject(new C6909j().mo16966a("request_id", str).mo16966a("page_name", "homepage_follow").mo16966a("position", "toplist").mo16967a()));
    }

    /* renamed from: b */
    public static void m109995b(Aweme aweme, String str) {
        m110011d(aweme, "", str);
    }

    /* renamed from: e */
    public static void m110016e(String str, String str2) {
        m109990a(str, str2, false);
    }

    /* renamed from: b */
    public static void m110000b(String str, String str2) {
        if (m110008d(str) != -1) {
            long currentTimeMillis = System.currentTimeMillis() - m110008d(str);
            if (currentTimeMillis > 0) {
                m109964a(currentTimeMillis, str, str2);
            }
            m109985a(str, -1);
        }
    }

    /* renamed from: c */
    public static void m110006c(String str, String str2) {
        if (f88956c != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f88956c;
            if (currentTimeMillis > 0) {
                m109964a(currentTimeMillis, str, str2);
            }
            f88956c = -1;
        }
    }

    /* renamed from: c */
    public static void m110003c(Aweme aweme, String str) {
        String str2;
        if (aweme != null) {
            C6869c a = C6869c.m21381a().mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            C6907h.onEvent(MobClick.obtain().setEventName("enter_fullscreen").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
            C22984d a2 = C22984d.m75611a();
            a2.mo59973a("content_type", C33230ac.m107240o(aweme));
            a2.mo59974a(C29893a.m97884a(str, aweme));
            a2.mo59974a(C29893a.m97889b(aweme, C29893a.m97882a()));
            if (C33230ac.m107226f(str)) {
                String str3 = "relation_type";
                if (C43122ff.m136762a(aweme)) {
                    str2 = "follow";
                } else {
                    str2 = "unfollow";
                }
                a2.mo59973a(str3, str2);
                a2.mo59973a("video_type", C33230ac.m107247v(aweme));
                a2.mo59973a("rec_uid", C33230ac.m107248w(aweme));
            }
            if (!TextUtils.equals("general_search", str)) {
                TextUtils.equals("search_result", str);
            }
            if (C33230ac.m107222d(str)) {
                a2.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
                C6907h.m21525a("enter_fullscreen", C33230ac.m107211a(a2.f60753a));
                return;
            }
            C6907h.m21524a("enter_fullscreen", (Map) a2.f60753a);
        }
    }

    /* renamed from: d */
    public static void m110010d(Aweme aweme, String str) {
        if (aweme != null) {
            C6869c a = C6869c.m21381a().mo16887a("enter_type", "normal_way").mo16887a("enter_from", str).mo16887a("group_id", aweme.getAid()).mo16887a("compilation_id", C33230ac.m107246u(aweme)).mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthorUid()).setJsonObject(a.mo16888b()));
            C6907h.m21524a("enter_personal_detail_backup", (Map) C22984d.m75611a().mo59973a("enter_type", "normal_way").mo59973a("enter_from", "personal_homepage").mo59973a("to_user_id", aweme.getAuthorUid()).mo59973a("compilation_id", C33230ac.m107246u(aweme)).mo59974a(C29893a.m97884a(str, aweme)).mo59974a(C29893a.m97889b(aweme, C29893a.m97882a())).f60753a);
        }
    }

    /* renamed from: e */
    public static void m110015e(Aweme aweme, String str) {
        if (aweme != null && aweme.getPromotion() != null) {
            new C24467d().mo63559g(aweme.getAuthorUid()).mo63554b("video_cart_tag").mo63555c(aweme.getPromotion().getPromotionId()).mo63551a(Long.valueOf(0)).mo63557e(str).mo63556d(aweme.getAid()).mo63553a(true).mo63552a("full_screen_card").mo63550a(Integer.valueOf(aweme.getFollowStatus())).mo63558f("click_shopping_cart").mo63536a(BusinessComponentServiceUtils.getSearchAllService().mo68311a(aweme)).mo63537a();
            if (TextUtils.equals(str, "general_search")) {
                C24976t.m82182c(C12125f.m35294a(), aweme, "result_ad");
                C24976t.m82194d(C12125f.m35294a(), aweme, "result_ad");
            }
        }
    }

    /* renamed from: d */
    public static void m110012d(String str, String str2) {
        C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", str).mo59973a("trigger_reason", str2).f60753a);
    }

    /* renamed from: a */
    public static void m109970a(Aweme aweme, String str) {
        if (aweme != null) {
            C6869c a = C6869c.m21381a();
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            a.mo16887a("enter_fullscreen", "0");
            a.mo16887a("content_type", C33230ac.m107240o(aweme));
            a.mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            C6907h.onEvent(MobClick.obtain().setEventName("show").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("previous_page", str);
            hashMap.put("group_id", C33230ac.m107238m(aweme));
            hashMap.put("author_id", C33230ac.m107205a(aweme));
            hashMap.put("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            hashMap.put("content_type", C33230ac.m107240o(aweme));
            hashMap.put("enter_fullscreen", "0");
            if (aweme.isForwardAweme()) {
                hashMap.put("is_reposted", "1");
                hashMap.put("from_group_id", aweme.getFromGroupId());
                hashMap.put("from_user_id", aweme.getFromUserId());
            }
            C6907h.m21528b("show", C33230ac.m107211a((Map<String, String>) hashMap));
        }
    }

    /* renamed from: d */
    private static void m110011d(Aweme aweme, String str, String str2) {
        m109975a(aweme, str, "", str2);
    }

    /* renamed from: a */
    private static void m109964a(long j, String str, String str2) {
        if (!"poi_page".equalsIgnoreCase(str)) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("page_type", str2);
            C6907h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(str).setValue(String.valueOf(j)).setJsonObject(a.mo16888b()));
            new C33248at().mo85138a(String.valueOf(j)).mo85139b(str).mo85141d(str2).mo85252e();
        }
    }

    /* renamed from: a */
    public static void m109967a(Aweme aweme, long j, String str) {
        if (aweme != null) {
            C6869c a = C6869c.m21381a();
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            a.mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            a.mo16887a("stay_time", String.valueOf(j));
            C6907h.onEvent(MobClick.obtain().setEventName("show_time").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo16888b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("previous_page", str);
            hashMap.put("group_id", C33230ac.m107238m(aweme));
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            hashMap.put("content_type", C33230ac.m107240o(aweme));
            hashMap.put("stay_time", String.valueOf(j));
            C6907h.m21525a("show_time", C33230ac.m107211a((Map<String, String>) hashMap));
        }
    }

    /* renamed from: b */
    public static void m109996b(Aweme aweme, String str, String str2) {
        String str3;
        if (aweme != null) {
            ((C33276r) new C33276r().mo85071g(aweme).mo85310b("poi_page").mo85322o(str2).mo85048a(str)).mo85252e();
            C6869c a = C6869c.m21381a().mo16887a("request_id", C33230ac.m107219c(aweme)).mo16885a("is_photo", Integer.valueOf(m110007d(aweme))).mo16887a("poi_id", C33230ac.m107223e(aweme)).mo16887a("poi_type", C33230ac.m107229h(aweme));
            MobClick obtain = MobClick.obtain();
            if ("click_name".equalsIgnoreCase(str)) {
                str3 = "name";
            } else {
                str3 = "head";
            }
            C6907h.onEvent(obtain.setEventName(str3).setLabelName("poi_page").setValue(C33230ac.m107238m(aweme)).setExtValueLong(C33230ac.m107233j(aweme).longValue()).setJsonObject(a.mo16888b()));
        }
    }

    /* renamed from: c */
    public static void m110004c(Aweme aweme, String str, String str2) {
        if (aweme != null) {
            if ("poi_page".equalsIgnoreCase(str)) {
                ((C33273o) new C33273o().mo85299g(C33230ac.m107238m(aweme)).mo85300i(C33230ac.m107205a(aweme)).mo85301j(C33230ac.m107236k(aweme)).mo85298f(str).mo85048a("click_cover")).mo85302k(C33230ac.m107219c(aweme)).mo85303o(C33230ac.m107246u(aweme)).mo85252e();
            } else {
                C22984d b = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("enter_method", "click_cover").mo59973a("music_id", C33230ac.m107236k(aweme)).mo59973a("compilation_id", C33230ac.m107246u(aweme)).mo59974a(C29893a.m97884a(str, aweme)).mo59974a(C29893a.m97889b(aweme, str2)).mo59975b();
                if (C33230ac.m107222d(str)) {
                    b.mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId()));
                    C6907h.m21525a("enter_music_detail", C33230ac.m107211a(b.f60753a));
                } else {
                    C6907h.m21524a("enter_music_detail", (Map) b.f60753a);
                }
            }
            C6869c a = C6869c.m21381a().mo16887a("request_id", C33230ac.m107219c(aweme)).mo16885a("is_photo", Integer.valueOf(m110007d(aweme)));
            if (!"poi_page".equalsIgnoreCase(str)) {
                C29893a.m97888b(a, aweme, str);
                C29893a.m97881a(a, aweme, str2);
            }
            C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(str).setValue(aweme.getAid()).setExtValueString(C33230ac.m107236k(aweme)).setJsonObject(a.mo16888b()));
        }
    }

    /* renamed from: a */
    public static void m109980a(User user, String str, int i, String str2) {
        m109981a(user, str, i, str2, "cold_launch");
    }

    /* renamed from: a */
    public static void m109968a(Aweme aweme, long j, boolean z, String str) {
        m109969a(aweme, j, z, str, "", "");
    }

    /* renamed from: b */
    public static void m109997b(Aweme aweme, String str, String str2, String str3) {
        if (aweme != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("comment").setLabelName(str).setValue(aweme.getAid()).setJsonObject(C29893a.m97881a(C6869c.m21381a().mo16887a("enter_from", str).mo16887a("enter_method", "click").mo16887a("reply_to_comment_id", str3).mo16887a("request_id", C33230ac.m107219c(aweme)).mo16885a("is_photo", Integer.valueOf(m110007d(aweme))), aweme, str2).mo16888b()));
            C6907h.m21524a("comment", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).f60753a);
        }
    }

    /* renamed from: a */
    public static void m109965a(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str) {
        if (textExtraStruct.getType() == 1) {
            C6869c a = C6869c.m21381a();
            a.mo16887a("hashtag", textExtraStruct.getHashTagName());
            a.mo16887a("request_id", C33230ac.m107219c(aweme));
            a.mo16887a("is_photo", C33230ac.m107221d(aweme));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(str).setValue(aweme.getAid()).setExtValueString(textExtraStruct.getCid()).setJsonObject(a.mo16888b()));
            C24976t.m82016V(context, aweme);
            ((C33277s) new C33277s().mo85330f(str).mo85071g(aweme).mo85334k(textExtraStruct.getCid()).mo85048a("click_in_video_name")).mo85336p(C33230ac.m107219c(aweme)).mo85332i(C29893a.m97882a()).mo85252e();
        } else if (textExtraStruct.getType() == 2) {
            m110010d(aweme, str);
            m109976a(aweme, textExtraStruct.getUserId(), "name", str, "list");
        } else {
            C6869c a2 = C6869c.m21381a();
            C29893a.m97888b(a2, aweme, str);
            C29893a.m97881a(a2, aweme, C29893a.m97882a());
            C6907h.onEvent(MobClick.obtain().setEventName("name").setLabelName("video_at").setValue(textExtraStruct.getUserId()).setJsonObject(a2.mo16888b()));
            C22984d b = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", aweme.getAid()).mo59973a("enter_method", "video_at").mo59975b();
            b.mo59974a(C29893a.m97884a(str, aweme));
            b.mo59974a(C29893a.m97889b(aweme, C29893a.m97882a()));
            if (C33230ac.m107222d(str)) {
                b.mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId()));
                C6907h.m21525a("enter_personal_detail", C33230ac.m107211a(b.f60753a));
            } else {
                C6907h.m21524a("enter_personal_detail", (Map) b.f60753a);
            }
            C6869c a3 = C6869c.m21381a();
            a3.mo16887a("enter_method", "click_head");
            C29893a.m97888b(a3, aweme, str);
            C29893a.m97881a(a3, aweme, C29893a.m97882a());
            if (aweme.getAuthor() != null) {
                C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthor().getUid()).setJsonObject(a3.mo16888b()));
                Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("to_user_id", aweme.getAuthor().getUid()).mo59973a("group_id", aweme.getAid()).mo59973a("enter_method", "click_name").f60753a;
                map.putAll(C29893a.m97884a(str, aweme));
                map.putAll(C29893a.m97889b(aweme, C29893a.m97882a()));
                C6907h.m21524a("enter_personal_detail_backup", (Map) map);
            }
        }
    }

    /* renamed from: a */
    public static void m109969a(Aweme aweme, long j, boolean z, String str, String str2, String str3) {
        if (aweme != null) {
            String str4 = "";
            if (!TextUtils.equals("general_search", str)) {
                TextUtils.equals("search_result", str);
            }
            ((C33255az) ((C33255az) new C33255az().mo85221a(str).mo85224b(str).mo85071g(aweme).mo85218a(j).mo85230g(str3).mo85283l(str2)).mo85222a(z).mo85227e(C33230ac.m107219c(aweme)).mo85285n(str4)).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a())).mo85252e();
            C6869c a = C6869c.m21381a().mo16885a("enter_fullscreen", Integer.valueOf(z ? 1 : 0));
            C29893a.m97888b(a, aweme, str);
            C29893a.m97881a(a, aweme, C29893a.m97882a());
            if (C34199d.m110410h()) {
                a.mo16885a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo16887a("poi_id", C33230ac.m107223e(aweme));
                a.mo16887a("poi_type", C33230ac.m107229h(aweme));
            }
            a.mo16887a("content_source", str3);
            a.mo16887a("tab_name", str2);
            C6907h.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(str).setValue(aweme.getAid()).setExtValueLong(j).setJsonObject(a.mo16888b()));
        }
    }
}
