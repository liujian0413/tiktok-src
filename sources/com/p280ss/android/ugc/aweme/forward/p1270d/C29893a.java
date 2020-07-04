package com.p280ss.android.ugc.aweme.forward.p1270d;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p280ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.AbsFollowFeedDetailActivity;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.forward.d.a */
public final class C29893a {
    /* renamed from: a */
    public static String m97882a() {
        Activity g = C6405d.m19984g();
        if (g instanceof FeedDetailActivity) {
            return C22704b.f60415d;
        }
        if (g instanceof AbsFollowFeedDetailActivity) {
            return ((AbsFollowFeedDetailActivity) g).f89000g;
        }
        return "list";
    }

    /* renamed from: b */
    private static boolean m97892b() {
        Activity g = C6405d.m19984g();
        if ((g instanceof OriginDetailActivity) || ((g instanceof AbsFollowFeedDetailActivity) && ((AbsFollowFeedDetailActivity) g).f89001h)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static HashMap<String, String> m97883a(Aweme aweme, String str) {
        return C35452k.m114510a(aweme);
    }

    /* renamed from: a */
    public static HashMap<String, String> m97884a(String str, Aweme aweme) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        if (aweme != null) {
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("group_id", aweme.getAid());
        }
        return hashMap;
    }

    /* renamed from: c */
    public static void m97893c(String str, Aweme aweme) {
        C6907h.m21524a("enter_repost_detail", (Map) C22984d.m75611a().mo59973a("repost_comment_id", aweme.getForwardCommentId()).mo59973a("from_group_id", aweme.getFromGroupId()).mo59974a(m97884a(str, aweme)).f60753a);
    }

    /* renamed from: b */
    public static void m97890b(String str, Aweme aweme) {
        if (aweme != null) {
            C22984d a = C22984d.m75611a();
            a.mo59974a(m97884a(str, aweme)).mo59973a("from_group_id", aweme.getFromGroupId()).mo59973a("repost_comment_id", aweme.getForwardCommentId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                a.mo59973a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                a.mo59973a("forward_user_id", aweme.getForwardUserId());
            }
            C6907h.m21524a("enter_repost_detail", (Map) a.f60753a);
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m97889b(Aweme aweme, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aweme == null) {
            return hashMap;
        }
        if (aweme.getAwemeType() == 13) {
            hashMap.put("page_type", str);
            hashMap.put("is_reposted", "1");
            hashMap.put("repost_comment_id", aweme.getForwardCommentId());
            hashMap.put("from_group_id", aweme.getFromGroupId());
            hashMap.put("from_user_id", aweme.getFromUserId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                hashMap.put("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                hashMap.put("forward_user_id", aweme.getForwardUserId());
            }
        } else if (m97892b()) {
            hashMap.put("page_type", C22704b.f60415d);
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                hashMap.put("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                hashMap.put("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m97885a(JSONObject jSONObject, Aweme aweme, String str) {
        return m97881a(C6869c.m21382a(jSONObject), aweme, str).mo16888b();
    }

    /* renamed from: b */
    public static C6869c m97888b(C6869c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C6869c();
        }
        if (aweme != null) {
            cVar.mo16887a("enter_from", str);
            cVar.mo16887a("author_id", aweme.getAuthorUid());
            cVar.mo16887a("request_id", C33230ac.m107219c(aweme));
        }
        return cVar;
    }

    /* renamed from: a */
    public static C6869c m97881a(C6869c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C6869c();
        }
        if (aweme == null) {
            return cVar;
        }
        if (aweme.getAwemeType() == 13) {
            cVar.mo16887a("page_type", str).mo16887a("is_reposted", "1").mo16887a("repost_comment_id", aweme.getForwardCommentId()).mo16887a("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                cVar.mo16887a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                cVar.mo16887a("forward_user_id", aweme.getForwardUserId());
            }
        } else if (m97892b()) {
            cVar.mo16887a("page_type", C22704b.f60415d);
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                cVar.mo16887a("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                cVar.mo16887a("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m97886a(String str, Aweme aweme, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(m97884a(str, aweme)).mo59974a(m97889b(aweme, str2)).mo59974a(m97883a(aweme, str)).mo59973a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        C6907h.m21524a("click_repost_button", (Map) a.f60753a);
    }

    /* renamed from: b */
    public static void m97891b(String str, Aweme aweme, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        a.mo59974a(m97884a(str, aweme)).mo59974a(m97889b(aweme, str2)).mo59974a(m97883a(aweme, str)).mo59973a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59973a("country_name", aweme.getAuthor().getRegion());
        }
        C6907h.m21524a("click_comment_and_repost", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static void m97887a(String str, Aweme aweme, String str2, String str3, boolean z) {
        String str4;
        C22984d a = C22984d.m75611a();
        C22984d a2 = a.mo59974a(m97884a(str, aweme)).mo59974a(m97889b(aweme, str2)).mo59974a(m97883a(aweme, str)).mo59973a("enter_method", str3);
        String str5 = "is_success";
        if (z) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        a2.mo59973a(str5, str4);
        if (aweme != null && aweme.getAwemeType() == 13) {
            a.mo59973a("from_user_id", aweme.getFromUserId());
        }
        if ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C30187a.m98819b()) {
            a.mo59973a("tab_name", C30187a.m98818a());
        }
        if (aweme != null) {
            if (C30187a.m98819b()) {
                int i = 12000;
                if (TextUtils.equals(str, "homepage_fresh")) {
                    i = 7;
                }
                a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107206a(aweme, i)));
            } else {
                return;
            }
        }
        C6907h.m21524a("repost", (Map) a.f60753a);
    }
}
