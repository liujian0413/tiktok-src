package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33933ai;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.c */
public final class C23888c {

    /* renamed from: a */
    private static String f63033a = null;

    /* renamed from: b */
    private static String f63034b = null;

    /* renamed from: c */
    private static int f63035c = -1;

    /* renamed from: d */
    private static String f63036d;

    /* renamed from: e */
    private static String f63037e;

    /* renamed from: f */
    private static C23891f f63038f;

    /* renamed from: a */
    public static String m78180a() {
        return f63033a;
    }

    /* renamed from: c */
    private static String m78202c(int i) {
        String str = "";
        switch (i) {
            case 0:
                return "popular_song";
            case 1:
                return "favourite_song";
            case 2:
                return "local_song";
            default:
                return str;
        }
    }

    /* renamed from: d */
    private static String m78208d() {
        return f63036d;
    }

    /* renamed from: e */
    private static int m78212e() {
        return f63035c;
    }

    /* renamed from: a */
    public static void m78194a(boolean z, String str, C23819a aVar, int i, LogPbBean logPbBean) {
        if (aVar != null) {
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", aVar.f62870a).mo59973a("music_id", str).mo59973a("category_name", aVar.f62871b).mo59973a("enter_method", aVar.f62872c).mo59973a("previous_page", aVar.f62873d).mo59970a(POIService.KEY_ORDER, i);
            if (!TextUtils.isEmpty(aVar.f62874e)) {
                a.mo59973a("category_id", aVar.f62874e);
            }
            if (!TextUtils.isEmpty(aVar.f62876g)) {
                a.mo59973a("tag_id", aVar.f62876g);
            }
            if (!TextUtils.isEmpty(aVar.f62875f)) {
                a.mo59973a("prop_id", aVar.f62875f);
            }
            if (TextUtils.equals(aVar.f62870a, "search_music")) {
                a.mo59973a("search_keyword", f63034b);
                a.mo59973a("log_pb", new C6600e().mo15979b((Object) logPbBean));
                C6907h.m21525a(z ? "favourite_song" : "cancel_favourite_song", C33933ai.m109379a(a.f60753a));
            } else if (z) {
                C6907h.m21524a("favourite_song", (Map) a.f60753a);
            }
        }
    }

    /* renamed from: a */
    public static void m78191a(String str, String str2, C23819a aVar) {
        long j;
        if (aVar != null) {
            C22984d a = C22984d.m75611a();
            C22984d a2 = a.mo59973a("to_music_id", str).mo59973a("category_name", aVar.f62871b).mo59973a("previous_page", aVar.f62873d).mo59973a("from_music_id", str2);
            String str3 = "this_music_stay_time";
            if (f63038f == null) {
                j = 0;
            } else {
                j = f63038f.mo61988b(str2);
            }
            a2.mo59971a(str3, j);
            C6907h.m21524a("click_next_music", (Map) a.f60753a);
        }
    }

    /* renamed from: a */
    public static void m78193a(String str, String str2, String str3, String str4, String str5) {
        C22984d dVar = new C22984d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59973a("banner_id", str3);
        }
        dVar.mo59973a("category_name", str).mo59973a("enter_method", str2).mo59973a("enter_from", str4);
        if (!TextUtils.isEmpty(str5)) {
            dVar.mo59973a("category_id", str5);
        }
        C6907h.m21524a("enter_song_category", (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m78190a(String str, String str2) {
        C6907h.m21524a("search_lyricsticker_song", (Map) m78214f().mo59973a("search_keyword", str).mo59973a("search_type", str2).f60753a);
    }

    /* renamed from: a */
    public static void m78192a(String str, String str2, String str3) {
        C6907h.m21524a("search_lyricsticker_song_result", (Map) m78214f().mo59973a("search_keyword", str).mo59973a("music_name", str2).mo59973a("music_id", str3).mo59970a("after_search", TextUtils.isEmpty(str) ^ true ? 1 : 0).f60753a);
    }

    /* renamed from: b */
    public static void m78195b() {
        m78196b(2);
    }

    /* renamed from: f */
    private static C22984d m78214f() {
        return C22984d.m75611a().mo59973a("enter_from", "lyricsticker_song_search").mo59973a("creation_id", f63036d).mo59973a("shoot_way", f63037e);
    }

    /* renamed from: c */
    public static void m78203c() {
        C6907h.m21524a("enter_search", (Map) C22984d.m75611a().mo59973a("enter_from", "change_music_page").mo59973a("creation_id", m78208d()).f60753a);
    }

    /* renamed from: b */
    public static void m78198b(String str) {
        f63036d = str;
    }

    /* renamed from: c */
    public static void m78204c(String str) {
        f63037e = str;
    }

    /* renamed from: a */
    public static void m78181a(int i) {
        f63035c = i;
    }

    /* renamed from: d */
    public static void m78209d(String str) {
        f63033a = str;
    }

    /* renamed from: e */
    public static void m78213e(String str) {
        f63034b = str;
    }

    /* renamed from: a */
    public static void m78187a(String str) {
        if (f63038f != null) {
            f63038f.mo61986a(str);
        }
    }

    /* renamed from: a */
    public static void m78182a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("tab_name", "local_song");
        hashMap.put("read_duration", String.valueOf(j));
        C6907h.m21525a("local_music_read_duration", C33933ai.m109379a(hashMap));
    }

    /* renamed from: b */
    public static void m78196b(int i) {
        C6907h.m21524a("enter_music_tab", (Map) C22984d.m75611a().mo59973a("tab_name", m78202c(i)).mo59973a("previous_page", m78180a()).f60753a);
    }

    /* renamed from: b */
    public static void m78197b(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("tab_name", "local_song");
        hashMap.put("show_duration", String.valueOf(j));
        C6907h.m21525a("local_music_show_duration", C33933ai.m109379a(hashMap));
    }

    /* renamed from: f */
    public static void m78215f(String str) {
        C6907h.m21524a("search_lyricsticker_song_empty", (Map) m78214f().mo59973a("search_keyword", str).f60753a);
    }

    /* renamed from: d */
    public static void m78210d(String str, String str2) {
        C6907h.m21524a("overwrite_song_toast_confirm", (Map) m78214f().mo59973a("music_id", str2).mo59973a("origin_music_id", str).f60753a);
    }

    /* renamed from: b */
    public static void m78199b(String str, int i) {
        C6907h.m21524a("banner_click", (Map) C22984d.m75611a().mo59973a("enter_from", "change_music_page").mo59973a("banner_id", str).mo59973a("client_order", Integer.toString(i)).f60753a);
    }

    /* renamed from: c */
    public static void m78205c(String str, int i) {
        C6907h.m21524a("banner_show", (Map) C22984d.m75611a().mo59973a("enter_from", "change_music_page").mo59973a("banner_id", str).mo59973a("client_order", Integer.toString(i)).f60753a);
    }

    /* renamed from: a */
    public static void m78183a(C23819a aVar, MusicModel musicModel) {
        if (!(aVar == null || musicModel == null || musicModel.getMusicType() == MusicType.LOCAL || m78212e() == -1)) {
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", aVar.f62870a).mo59973a("music_id", musicModel.getMusicId()).mo59973a("category_name", aVar.f62871b).mo59973a("enter_method", aVar.f62872c).mo59973a("previous_page", aVar.f62873d).mo59970a(POIService.KEY_ORDER, m78212e());
            if (!TextUtils.isEmpty(aVar.f62876g)) {
                a.mo59973a("tag_id", aVar.f62876g);
            }
            if (!TextUtils.isEmpty(aVar.f62875f)) {
                a.mo59973a("prop_id", aVar.f62875f);
            }
            if (!TextUtils.isEmpty(aVar.f62874e)) {
                a.mo59973a("category_id", aVar.f62874e);
            }
            if (TextUtils.equals(aVar.f62870a, "search_music")) {
                a.mo59973a("search_keyword", f63034b);
                a.mo59973a("log_pb", new C6600e().mo15979b((Object) musicModel.getLogPb()));
                C6907h.m21525a("play_music", C33933ai.m109379a(a.f60753a));
                return;
            }
            C6907h.m21524a("play_music", (Map) a.f60753a);
        }
    }

    /* renamed from: b */
    public static void m78200b(String str, String str2) {
        C6907h.m21524a("overwrite_song_toast_show", (Map) m78214f().mo59973a("music_id", str2).mo59973a("origin_music_id", str).f60753a);
    }

    /* renamed from: c */
    public static void m78206c(String str, String str2) {
        C6907h.m21524a("overwrite_song_toast_cancel", (Map) m78214f().mo59973a("music_id", str2).mo59973a("origin_music_id", str).f60753a);
    }

    /* renamed from: a */
    public static void m78188a(String str, int i) {
        if (f63038f == null) {
            f63038f = new C23891f();
        }
        f63038f.mo61987a(str, i);
    }

    /* renamed from: a */
    public static void m78189a(String str, C23819a aVar) {
        int i;
        long j;
        if (aVar != null && f63038f != null) {
            C22984d a = C22984d.m75611a();
            C22984d a2 = a.mo59973a("music_id", str).mo59973a("category_name", aVar.f62871b);
            String str2 = "time";
            if (f63038f == null) {
                i = 0;
            } else {
                i = f63038f.mo61989c(str);
            }
            C22984d a3 = a2.mo59970a(str2, i);
            String str3 = "stay_time";
            if (f63038f == null) {
                j = 0;
            } else {
                j = f63038f.mo61988b(str);
            }
            a3.mo59971a(str3, j).mo59973a("enter_from", aVar.f62870a).mo59973a("previous_page_position", aVar.f62873d);
            if (!TextUtils.isEmpty(aVar.f62876g)) {
                a.mo59973a("tag_id", aVar.f62876g);
            }
            if (!TextUtils.isEmpty(aVar.f62875f)) {
                a.mo59973a("prop_id", aVar.f62875f);
            }
            C6907h.m21524a("music_play_time", (Map) a.f60753a);
            f63038f = null;
        }
    }

    /* renamed from: a */
    public static void m78186a(C23819a aVar, String str, boolean z) {
        String str2;
        if (aVar != null) {
            C22984d a = C22984d.m75611a();
            C22984d a2 = a.mo59973a("enter_from", aVar.f62870a).mo59973a("music_id", str).mo59973a("category_name", aVar.f62871b);
            String str3 = "enter_method";
            if (z) {
                str2 = "click_banner";
            } else {
                str2 = "click_button";
            }
            a2.mo59973a(str3, str2);
            if (!TextUtils.isEmpty(aVar.f62874e)) {
                a.mo59973a("category_id", aVar.f62874e);
            }
            C6907h.m21524a("enter_music_detail", (Map) a.f60753a);
        }
    }

    /* renamed from: d */
    public static void m78211d(String str, String str2, String str3) {
        C6907h.m21524a("favorite_lyricsticker_song", (Map) m78214f().mo59973a("search_keyword", str).mo59973a("music_name", str2).mo59973a("music_id", str3).mo59970a("after_search", TextUtils.isEmpty(str) ^ true ? 1 : 0).f60753a);
    }

    /* renamed from: b */
    public static void m78201b(String str, String str2, String str3) {
        C6907h.m21524a("search_lyricsticker_song_unavailable", (Map) m78214f().mo59973a("search_keyword", str).mo59973a("music_name", str2).mo59973a("music_id", str3).f60753a);
    }

    /* renamed from: c */
    public static void m78207c(String str, String str2, String str3) {
        C6907h.m21524a("add_lyricsticker_song", (Map) m78214f().mo59973a("search_keyword", str).mo59973a("music_name", str2).mo59973a("music_id", str3).mo59970a("after_search", TextUtils.isEmpty(str) ^ true ? 1 : 0).f60753a);
    }

    /* renamed from: a */
    public static void m78185a(C23819a aVar, String str, int i, boolean z) {
        if (aVar != null && z) {
            C22984d dVar = new C22984d();
            dVar.mo59973a("enter_from", aVar.f62870a).mo59973a("music_id", str).mo59973a("category_name", aVar.f62871b).mo59973a("enter_method", aVar.f62872c).mo59973a("previous_page", aVar.f62873d).mo59970a(POIService.KEY_ORDER, i);
            if (!TextUtils.isEmpty(aVar.f62874e)) {
                dVar.mo59973a("category_id", aVar.f62874e);
            }
            if (!TextUtils.isEmpty(aVar.f62876g)) {
                dVar.mo59973a("tag_id", aVar.f62876g);
            }
            if (!TextUtils.isEmpty(aVar.f62875f)) {
                dVar.mo59973a("prop_id", aVar.f62875f);
            }
            C6907h.m21524a("show_music", (Map) dVar.f60753a);
        }
    }

    /* renamed from: a */
    public static void m78184a(C23819a aVar, String str, int i, LogPbBean logPbBean) {
        if (aVar != null) {
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", aVar.f62870a).mo59973a("music_id", str).mo59973a("category_name", aVar.f62871b).mo59973a("enter_method", aVar.f62872c).mo59970a(POIService.KEY_ORDER, i).mo59973a("previous_page", m78180a());
            if (!TextUtils.isEmpty(aVar.f62876g)) {
                a.mo59973a("tag_id", aVar.f62876g);
            }
            if (!TextUtils.isEmpty(aVar.f62875f)) {
                a.mo59973a("prop_id", aVar.f62875f);
            }
            if (!TextUtils.isEmpty(aVar.f62874e)) {
                a.mo59973a("category_id", aVar.f62874e);
            }
            if (TextUtils.equals(aVar.f62870a, "search_music")) {
                a.mo59973a("search_keyword", f63034b);
                a.mo59973a("log_pb", new C6600e().mo15979b((Object) logPbBean));
                C6907h.m21525a("add_music", C33933ai.m109379a(a.f60753a));
                return;
            }
            C6907h.m21524a("add_music", (Map) a.f60753a);
        }
    }
}
