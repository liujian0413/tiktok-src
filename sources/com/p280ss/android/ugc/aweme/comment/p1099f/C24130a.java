package com.p280ss.android.ugc.aweme.comment.p1099f;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.comment.experiment.CommentLikedByCreatorExperiment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33233af;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.f.a */
public final class C24130a {
    /* renamed from: a */
    public static void m79256a(String str, Aweme aweme, String str2, int i, String str3, String str4) {
        m79257a(str, aweme, str2, i, str3, str4, "", "", "", "", "", "", "", "", "");
    }

    /* renamed from: a */
    public static void m79257a(String str, Aweme aweme, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        int i2 = i;
        if (aweme != null) {
            C22984d a = C22984d.m75611a();
            a.mo59974a(C6903bc.m21485d().mo75948a(str, aweme));
            String str15 = str2;
            a.mo59974a(C6903bc.m21485d().mo75947a(aweme, str2));
            String str16 = str8;
            a.mo59973a("previous_page", str8);
            if (aweme.getStatistics() != null) {
                a.mo59973a("outter_comment_cnt", String.valueOf(aweme.getStatistics().getCommentCount()));
            }
            if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
                a.mo59973a("country_name", aweme.getAuthor().getRegion());
            }
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                a.mo59973a("is_long_item", sb.toString());
            }
            if (!TextUtils.isEmpty(str4)) {
                String str17 = str4;
                a.mo59973a("enter_method", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                String str18 = str3;
                a.mo59973a("trigger_comment_id", str3);
            }
            if (aweme.getPoiStruct() != null) {
                a.mo59973a("poi_id", aweme.getPoiStruct().poiId);
            }
            if (!TextUtils.isEmpty(str5)) {
                String str19 = str5;
                a.mo59973a("playlist_type", str5);
            }
            if (!TextUtils.isEmpty(str7)) {
                String str20 = str6;
                String str21 = str7;
                a.mo59973a(str6, str7);
            }
            if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo61469a()) && ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C30187a.m98819b())) {
                a.mo59973a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo61469a());
            }
            a.mo59973a("request_id", C33230ac.m107219c(aweme));
            if (C26062g.m85608a()) {
                a.mo59973a("is_fullscreen", "1");
            }
            if (aweme.getMobParams() != null && "poi_page".equalsIgnoreCase(str)) {
                a.mo59973a("page_poi_id", (String) aweme.getMobParams().get("page_poi_id"));
                a.mo59973a("page_poi_city", (String) aweme.getMobParams().get("page_poi_city"));
                a.mo59973a("page_poi_device_samecity", (String) aweme.getMobParams().get("page_poi_device_samecity"));
                a.mo59973a("page_poi_backend_type", (String) aweme.getMobParams().get("page_poi_backend_type"));
            }
            if (C33230ac.m107226f(str)) {
                a.mo59973a("relation_type", C43122ff.m136762a(aweme) ? "follow" : "unfollow");
                a.mo59973a("video_type", C33230ac.m107247v(aweme));
                a.mo59973a("rec_uid", C33230ac.m107248w(aweme));
            }
            a.mo59971a("position", C24220a.m79551a().getPlayerManagerCurrentPosition());
            a.mo59973a("impr_type", C33230ac.m107245t(aweme));
            if (!TextUtils.isEmpty(aweme.getMixId())) {
                a.mo59973a("compilation_id", aweme.getMixId());
            }
            C24220a.m79551a().appendV4CommonParams(a, str9, str10);
            a.mo59973a("card_type", str12);
            a.mo59973a("object_id", str11);
            if (C33230ac.m107222d(str)) {
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
                C24220a.m79551a().onEventV3JsonIncludingPoiParams(aweme, "click_comment_button", a);
                return;
            }
            if (!TextUtils.isEmpty(str13)) {
                a.mo59973a("creation_id", str13);
            }
            C24220a.m79551a().onEventV3IncludingPoiParams(aweme, "click_comment_button", a);
        }
    }

    /* renamed from: a */
    public static void m79271a(String str, LinkedHashMap<String, Integer> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (Entry entry : linkedHashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(',');
                sb2.append(entry.getValue());
                sb2.append(',');
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            C6907h.m21524a("send_emoji", (Map) C22984d.m75611a().mo59973a("enter_from", "comment").mo59973a("md5", str).mo59973a("emoji_name", sb.toString()).mo59973a("cnt", sb2.toString()).f60753a);
        }
    }

    /* renamed from: a */
    public static void m79263a(String str, String str2, long j) {
        C6907h.m21524a("close_comment", (Map) m79273b(str, str2).mo59971a("duration", j).f60753a);
        C6907h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName("comment_page").setExtValueString(str2).setValue(String.valueOf(j)));
        C6907h.m21517a(C6399b.m19921a(), "close_comment", "click_shadow", 0, 0);
    }

    /* renamed from: a */
    public static void m79258a(String str, Aweme aweme, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(C6903bc.m21485d().mo75948a(str, aweme)).mo59974a(C6903bc.m21485d().mo75947a(aweme, str3)).mo59973a("comment_category", str2);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        C6907h.m21524a("enter_text", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79269a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        m79270a(str, str2, str3, str4, str5, z, z2, false);
    }

    /* renamed from: a */
    private static void m79270a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        if ("opus".equals(str2) || "collection".equals(str2)) {
            str2 = z ? "personal_homepage" : "others_homepage";
        }
        C6907h.m21519a(C6399b.m19921a(), str, str2, str3, 0, C6869c.m21381a().mo16887a("reply_uid", str5).mo16887a("reply_comment_id", str4).mo16885a("is_photo", Integer.valueOf(z2 ? 1 : 0)).mo16885a("is_retry", Integer.valueOf(0)).mo16888b());
    }

    /* renamed from: a */
    public static void m79264a(String str, String str2, String str3) {
        C6907h.m21520a(C6399b.m19921a(), "comment_at", str, str2, str3);
    }

    /* renamed from: a */
    public static void m79261a(String str, Aweme aweme, JSONObject jSONObject, boolean z, String str2) {
        if (str.equals("opus")) {
            str = z ? "personal_homepage" : "others_homepage";
        }
        C6907h.m21519a(C6399b.m19921a(), "comment", str, aweme.getAid(), 0, C6903bc.m21485d().mo75949a(jSONObject, aweme, str2));
        C6907h.m21524a("comment", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).f60753a);
    }

    /* renamed from: a */
    public static void m79266a(String str, String str2, String str3, String str4) {
        String str5 = str2;
        String str6 = str3;
        C6907h.m21519a(C6399b.m19921a(), "emoji_to_keyboard", str5, str6, 0, C6869c.m21381a().mo16887a("return_method", str).mo16887a("group_id", str3).mo16887a("enter_from", str2).mo16887a("author_id", str4).mo16888b());
        C6907h.m21524a("emoji_to_keyboard", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("return_method", str).mo59973a("group_id", str3).mo59973a("author_id", str4).f60753a);
    }

    /* renamed from: a */
    public static void m79259a(String str, Aweme aweme, String str2, String str3, String str4) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(C6903bc.m21485d().mo75948a(str, aweme)).mo59974a(C6903bc.m21485d().mo75953b(aweme, str)).mo59973a("comment_id", str2).mo59973a("enter_method", str4).mo59974a(C6903bc.m21485d().mo75947a(aweme, str3));
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        C6907h.m21524a("report_comment", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79265a(String str, String str2, String str3, Aweme aweme) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(C6903bc.m21485d().mo75948a(str, aweme)).mo59973a("comment_id", str3).mo59973a("to_user_id", str2);
        C6907h.m21524a("copy_comment", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79267a(String str, String str2, String str3, String str4, String str5) {
        String str6 = "common";
        if ("1".equals(str2)) {
            str6 = "author";
        } else if ("2".equals(str2)) {
            str6 = "following";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(str).setValue(str4).setExtValueString(str5).setJsonObject(C6869c.m21381a().mo16887a("attribute", str6).mo16887a("reply_uid", str5).mo16887a("reply_comment_id", str3).mo16888b()));
    }

    /* renamed from: a */
    public static void m79260a(String str, Aweme aweme, String str2, boolean z, String str3, String str4) {
        C22984d a = C22984d.m75611a().mo59974a(C6903bc.m21485d().mo75948a(str, aweme)).mo59974a(C6903bc.m21485d().mo75947a(aweme, str3)).mo59970a("is_success", z ? 1 : 0);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        if (z) {
            a.mo59973a("comment_id", str2);
        }
        if (C33230ac.m107222d(str)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            String str5 = "comment_user_id";
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            a.mo59973a(str5, str4);
            C6907h.m21525a("like_comment", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("like_comment", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79262a(String str, String str2) {
        C6907h.onEvent(MobClick.obtain().setEventName("delete_comment").setLabelName(str).setValue(str2));
    }

    /* renamed from: a */
    public static void m79268a(String str, String str2, String str3, String str4, String str5, Aweme aweme) {
        C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str4).setJsonObject(C6869c.m21381a().mo16887a("group_id", str2).mo16887a("request_id", str5).mo16887a("enter_from", str).mo16887a("enter_method", "click_comment_head").mo16887a("enter_type", "normal_way").mo16888b()));
        C6907h.m21524a("enter_personal_detail_backup", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("to_user_id", str4).mo59973a("group_id", str2).mo59973a("request_id", str5).mo59973a("enter_method", "click_comment_head").mo59973a("enter_type", "normal_way").f60753a);
        if (aweme != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("head").setLabelName(str).setValue(aweme.getAuthorUid()).setJsonObject(C6869c.m21381a().mo16887a("request_id", aweme.getRequestId()).mo16887a("group_id", aweme.getAid()).mo16888b()));
        }
        ((C33276r) new C33276r().mo85310b(str).mo85048a("click_comment_head")).mo85071g(aweme).mo85322o(str4).mo85252e();
        C28580o.m93830a(PAGE.PROFILE);
    }

    /* renamed from: a */
    public static void m79255a(String str, Aweme aweme, String str2) {
        C22984d a = C22984d.m75611a().mo59973a("enter_method", str).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid());
        if (C33230ac.m107222d(str2)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId()));
            C6907h.m21528b("search_comment_at", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("search_comment_at", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79272a(List list, Aweme aweme, String str) {
        C6907h.m21524a("send_comment_at", (Map) C22984d.m75611a().mo59972a("to_user_id", (Object) list).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("enter_from", str).f60753a);
    }

    /* renamed from: a */
    public static void m79248a() {
        C6907h.m21524a("favorite_emoji", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: a */
    public static void m79252a(String str) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", str);
        a.mo59973a("enter_method", "click_blank");
        C6907h.m21524a("close_comment_tab", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static String m79247a(Comment comment) {
        boolean z;
        if (comment == null) {
            return "original";
        }
        String replyId = comment.getReplyId();
        boolean a = C6307b.m19566a((Collection<T>) comment.getReplyComments());
        if (comment.getCommentType() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, "0")) {
            return "reply_to_reply";
        }
        if (z || a) {
            return "reply";
        }
        return "original";
    }

    /* renamed from: b */
    private static C22984d m79273b(String str, String str2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", str).mo59973a("group_id", str2);
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str2);
        if (awemeById != null) {
            a.mo59973a("author_id", awemeById.getAuthorUid());
        }
        return a;
    }

    /* renamed from: b */
    public static void m79274b(String str, String str2, String str3) {
        C6907h.m21524a("tap_comment", (Map) m79273b(str, str2).mo59973a("comment_id", str3).f60753a);
    }

    /* renamed from: c */
    public static void m79276c(String str, String str2, String str3) {
        C6907h.m21524a("press_comment", (Map) m79273b(str, str2).mo59973a("comment_id", str3).f60753a);
    }

    /* renamed from: d */
    public static void m79277d(String str, String str2, String str3) {
        C22984d b = m79273b(str, str2);
        b.mo59973a("parent_comment_id", str3);
        C6907h.m21524a("hide_all_reply", (Map) b.f60753a);
    }

    /* renamed from: e */
    public static void m79278e(String str, String str2, String str3) {
        C22984d b = m79273b(str, str2);
        b.mo59973a("parent_comment_id", str3);
        C6907h.m21524a("show_more_reply", (Map) b.f60753a);
    }

    /* renamed from: b */
    public static void m79275b(String str, String str2, String str3, String str4) {
        if (C6384b.m19835a().mo15292a(CommentLikedByCreatorExperiment.class, true, "enable_like_by_author", C6384b.m19835a().mo15295d().enable_like_by_author, false)) {
            C22984d b = m79273b(str, str2);
            b.mo59973a("enter_from", str);
            b.mo59973a("group_id", str2);
            b.mo59973a("author_id", str3);
            b.mo59973a("comment_id", str4);
            C6907h.m21524a("creator_like_comment_show", (Map) b.f60753a);
        }
    }

    /* renamed from: a */
    public static void m79254a(String str, Aweme aweme, long j, String str2) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(C6903bc.m21485d().mo75948a(str, aweme)).mo59974a(C6903bc.m21485d().mo75947a(aweme, str2)).mo59971a("stay_time", j);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        C6907h.m21524a("close_text", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79253a(String str, int i, String str2, String str3, String str4) {
        String str5 = "comment_panel";
        if (i == 2) {
            String str6 = str2;
            String str7 = str3;
            C6907h.m21519a(C6399b.m19921a(), "emoji_shortcut_click", str6, str7, 0, C6869c.m21381a().mo16887a("group_id", str3).mo16887a("enter_from", str2).mo16887a("author_id", str4).mo16887a("enter_method", str5).mo16888b());
            C6907h.m21524a("emoji_shortcut_click", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("group_id", str3).mo59973a("author_id", str4).mo59973a("enter_method", str5).f60753a);
        }
    }

    /* renamed from: a */
    public static void m79249a(int i, int i2, int i3, String str, String str2, Aweme aweme, String str3) {
        C22984d a = C22984d.m75611a().mo59970a("input_text_length", i).mo59970a("user_text_length", i2).mo59970a("rank", i3).mo59973a("search_keyword", str).mo59973a("to_user_id", str2).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid());
        if (C33230ac.m107222d(str3)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getRequestId()));
            C6907h.m21528b("add_comment_at", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("add_comment_at", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m79250a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        m79251a(aweme, str, str2, str3, str4, str5, str6, 0, str7, "", "", "", false, false, "", "", "", "");
    }

    /* renamed from: a */
    private static void m79251a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14) {
        String str15 = str2;
        String str16 = str;
        C33233af b = new C33233af().mo85065c(str).mo85061a(str2).mo85063b(str2);
        String str17 = str7;
        Aweme aweme2 = aweme;
        String str18 = str3;
        String str19 = str10;
        String str20 = str9;
        String str21 = str8;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        ((C33233af) ((C33233af) ((C33233af) b.mo85077q(str7).mo85071g(aweme).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)))).mo85066d(str3).mo85074k(str10).mo85073j(str9).mo85072i(str8).mo85283l(str11)).mo85284m(str12)).mo85069f(str4).mo85070g(str5).mo85062a(false).mo85067e(str6).mo85060a(0).mo85064b(false).mo85075o(str13).mo85076p(str14).mo85252e();
    }
}
