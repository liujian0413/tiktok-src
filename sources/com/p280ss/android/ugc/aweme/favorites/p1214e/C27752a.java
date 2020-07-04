package com.p280ss.android.ugc.aweme.favorites.p1214e;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.favorites.e.a */
public final class C27752a {

    /* renamed from: a */
    private static String f73189a = "personal_homepage";

    /* renamed from: b */
    private static boolean f73190b;

    /* renamed from: com.ss.android.ugc.aweme.favorites.e.a$a */
    public interface C27753a {
        /* renamed from: a */
        void mo71237a();
    }

    /* renamed from: b */
    public static boolean m90982b() {
        return f73190b;
    }

    /* renamed from: a */
    public static void m90973a(String str, String str2) {
        C6907h.m21524a("change_personal_collection_tab", (Map) C22984d.m75611a().mo59973a("enter_from", f73189a).mo59973a("enter_method", str).mo59973a("tab_name", str2).f60753a);
    }

    /* renamed from: a */
    public static void m90974a(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "goods").mo59973a("commodity_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m90976a(String str, String str2, String str3, boolean z) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "poi").mo59973a("sub_type", z ? "nearby" : "all").mo59973a("poi_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m90975a(String str, String str2, String str3, String str4) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("enter_tag_detail", (Map) a.mo59973a("enter_from", str2).mo59973a("enter_method", "click_collection_tag").mo59973a("tag_id", str).mo59973a("process_id", str4).f60753a);
    }

    /* renamed from: a */
    public static void m90965a() {
        C6907h.m21524a("expand_nearby_poi", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_button").f60753a);
    }

    /* renamed from: a */
    public static void m90972a(String str) {
        f73189a = str;
    }

    /* renamed from: a */
    public static void m90977a(boolean z) {
        f73190b = z;
    }

    /* renamed from: a */
    public static void m90966a(int i) {
        C6907h.m21524a("poi_collection_nearby_section_show", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("poi_cnt", String.valueOf(i)).f60753a);
    }

    /* renamed from: b */
    private static String m90979b(int i) {
        switch (i) {
            case 1:
                return "show_personal_collection";
            case 2:
                return "click_personal_collection";
            default:
                throw new IllegalArgumentException("wrong action value");
        }
    }

    /* renamed from: b */
    private static C22984d m90978b(String str, String str2) {
        return C22984d.m75611a().mo59973a(C38347c.f99553h, str).mo59973a("enter_from", str2);
    }

    /* renamed from: c */
    public static void m90983c(int i, String str) {
        C6907h.m21524a(m90979b(1), (Map) m90978b("music", "collection_music").mo59973a("music_id", str).f60753a);
    }

    /* renamed from: d */
    public static void m90985d(int i, String str) {
        C6907h.m21524a(m90979b(i), (Map) m90978b("prop", "collection_prop").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m90967a(int i, Aweme aweme) {
        C6907h.m21524a(m90979b(1), (Map) m90978b("video", "collection_video").mo59973a("author_id", C33230ac.m107205a(aweme)).mo59973a("group_id", C33230ac.m107238m(aweme)).mo59973a("music_id", C33230ac.m107236k(aweme)).mo59973a("poi_id", C33230ac.m107223e(aweme)).f60753a);
    }

    /* renamed from: b */
    public static void m90980b(int i, String str) {
        C6907h.m21524a(m90979b(1), (Map) m90978b("entertainment", "collection_entertainment").mo59973a("entertainment_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m90968a(int i, String str) {
        C6907h.m21524a(m90979b(1), (Map) m90978b("tag", "collection_tag").mo59973a("tag_id", str).f60753a);
    }

    /* renamed from: c */
    public static void m90984c(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "video").mo59973a("video_id", str).f60753a);
    }

    /* renamed from: d */
    public static void m90986d(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "music").mo59973a("music_id", str).f60753a);
    }

    /* renamed from: e */
    public static void m90987e(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "tag").mo59973a("tag_id", str).f60753a);
    }

    /* renamed from: f */
    public static void m90988f(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "entertainment").mo59973a("tag_id", str).f60753a);
    }

    /* renamed from: g */
    public static void m90989g(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a("entertainment_id", str).f60753a);
        C6907h.m21524a("enter_entertainment_detail", (Map) a.mo59973a("enter_from", str2).mo59973a("entertainment_id", str).f60753a);
    }

    /* renamed from: h */
    public static void m90990h(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("enter_music_detail", (Map) a.mo59973a("music_id", str).mo59973a("enter_from", str2).mo59973a("enter_method", "click_collection_music").f60753a);
    }

    /* renamed from: i */
    public static void m90991i(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("enter_prop_detail", (Map) a.mo59973a("enter_from", str2).mo59973a("enter_method", "click_collection_prop").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: b */
    public static void m90981b(String str, String str2, String str3) {
        C22984d a = C22984d.m75611a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo59973a("tab_name", str3);
        }
        C6907h.m21524a("click_personal_collection", (Map) a.mo59973a("enter_from", str2).mo59973a(C38347c.f99553h, "prop").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m90969a(int i, String str, boolean z) {
        String str2;
        String b = m90979b(1);
        C22984d a = m90978b("poi", "collection_poi").mo59973a("poi_id", str);
        String str3 = "sub_type";
        if (z) {
            str2 = "nearby";
        } else {
            str2 = "all";
        }
        C6907h.m21524a(b, (Map) a.mo59973a(str3, str2).f60753a);
    }

    /* renamed from: a */
    public static void m90971a(C33460e eVar, String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str2) && eVar != null) {
            C6907h.m21524a("click_personal_collection", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("tab_name", str2).mo59973a(C38347c.f99553h, "micro_app").mo59973a("microapp_id", eVar.f87343a).f60753a);
            String str4 = "mp_click";
            C22984d a = C22984d.m75611a().mo59973a("mp_id", eVar.f87343a).mo59973a("author_id", C21115b.m71197a().getCurUserId()).mo59973a("enter_from", str).mo59973a("position", "in_video_tag");
            String str5 = "_param_for_special";
            if (eVar.f87347e == 1) {
                str3 = "micro_app";
            } else {
                str3 = "micro_game";
            }
            C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).f60753a);
        }
    }

    /* renamed from: a */
    public static void m90970a(int i, String str, boolean z, String str2, String str3) {
        String str4;
        String b = m90979b(1);
        C22984d a = m90978b("poi", "collection_poi").mo59973a("poi_id", str);
        String str5 = "sub_type";
        if (z) {
            str4 = "nearby";
        } else {
            str4 = "all";
        }
        C6907h.m21524a(b, (Map) a.mo59973a(str5, str4).mo59973a("product_id", str2).mo59973a("supplier_id", str3).f60753a);
    }
}
