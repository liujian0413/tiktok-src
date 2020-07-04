package com.p280ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33259d;
import com.p280ss.android.ugc.aweme.metrics.C33273o;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.aa */
public final class C26780aa {
    /* renamed from: a */
    private static String m87951a(int i) {
        return i == 3 ? "general_search" : i == 6 ? "search_sug" : "search_result";
    }

    /* renamed from: a */
    public static void m87960a(View view, String str, Aweme aweme, String str2) {
        if (str.equals("general_search") || str.equals("search_result") || str.equals("similar_videos") || str.equals("ecommerce")) {
            SearchContext.m87924a(view, aweme.getAid());
            C6907h.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(C6869c.m21381a().mo16887a("request_id", C33230ac.m107219c(aweme)).mo16888b()));
            C22984d dVar = new C22984d();
            dVar.mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).mo59973a("search_keyword", str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            C6907h.m21525a("feed_enter", C33230ac.m107211a(dVar.f60753a));
        }
    }

    /* renamed from: a */
    public static String m87952a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    /* renamed from: a */
    public static void m87959a(View view, String str, Aweme aweme) {
        m87960a(view, str, aweme, "");
    }

    /* renamed from: a */
    private static void m87954a(int i, String str, String str2) {
        C6869c a = C6869c.m21381a();
        if (i != 3) {
            a.mo16887a("group_id", "");
            a.mo16887a("request_id", str);
            a.mo16887a("enter_from", "search_result");
            a.mo16887a("enter_method", "click_card");
            a.mo16887a("enter_type", "normal_way");
            C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(a.mo16888b()));
            return;
        }
        a.mo16887a("enter_from", "general_search");
        a.mo16887a("enter_method", "click_card");
        a.mo16887a("enter_type", "normal_way");
        C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(a.mo16888b()));
    }

    /* renamed from: b */
    private static void m87961b(int i, String str, String str2) {
        if (i == 3) {
            C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("general_search").setValue(str));
            return;
        }
        C6869c a = C6869c.m21381a();
        if (!TextUtils.isEmpty(str2)) {
            a.mo16887a("search_keyword", str2);
            C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setExtValueString(str).setJsonObject(a.mo16888b()));
            return;
        }
        a.mo16887a("source", "recommend");
        a.mo16887a("id", str);
        C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setJsonObject(a.mo16888b()));
    }

    /* renamed from: a */
    public static void m87953a(int i, String str, int i2, String str2, String str3, String str4) {
        C33276r o = new C33276r().mo85310b(m87951a(0)).mo85323p(str2).mo85322o(str3);
        new SearchMetricsParam().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom("find_friends").setEnterMethod(str4).installToMetrics(o);
        o.mo85252e();
    }

    /* renamed from: a */
    private static void m87955a(int i, String str, String str2, C33259d dVar, int i2, String str3) {
        new SearchMetricsParam().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom(m87951a(i2)).setEnterMethod(str3).installToMetrics(dVar);
        dVar.mo85252e();
    }

    /* renamed from: a */
    public static void m87956a(View view, int i, String str, int i2, String str2, Music music, String str3) {
        SearchContext.m87924a(view, music.getMid());
        m87955a(i, str, str2, (C33259d) ((C33273o) new C33273o().mo85049a(true)).mo85301j(music.getMid()).mo85298f(m87951a(i2)).mo85302k(str2), i2, str3);
        if (i2 != 3) {
            C6869c a = C6869c.m21381a();
            if (!TextUtils.isEmpty(str)) {
                a.mo16887a("search_keyword", str);
                C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setExtValueString(music.getMid()).setJsonObject(a.mo16888b()));
            } else {
                a.mo16887a("source", "recommend");
                a.mo16887a("id", music.getMid());
                C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setJsonObject(a.mo16888b()));
            }
        } else {
            C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("general_search").setValue(music.getMid()));
        }
    }

    /* renamed from: a */
    public static void m87957a(View view, int i, String str, int i2, String str2, String str3, String str4) {
        SearchContext.m87924a(view, str3);
        m87955a(i, str, str2, (C33259d) ((C33276r) new C33276r().mo85049a(true)).mo85310b(m87951a(i2)).mo85323p(str2).mo85322o(str3), i2, str4);
        m87954a(i2, str2, str3);
    }

    /* renamed from: a */
    public static void m87958a(View view, int i, String str, int i2, String str2, String str3, String str4, String str5) {
        SearchContext.m87924a(view, str3);
        m87955a(i, str, str2, (C33259d) ((C33277s) new C33277s().mo85049a(true)).mo85334k(str3).mo85335o(str5).mo85330f(m87951a(i2)).mo85336p(str2), i2, str4);
        m87961b(i2, str3, str);
    }
}
