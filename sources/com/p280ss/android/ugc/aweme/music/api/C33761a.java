package com.p280ss.android.ugc.aweme.music.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.poi.services.POIService;

/* renamed from: com.ss.android.ugc.aweme.music.api.a */
public final class C33761a {
    /* renamed from: a */
    public static String m108896a(String str, long j, String str2) throws Exception {
        String str3;
        C19290j jVar = new C19290j("https://api2.musical.ly/aweme/v1/music/search/");
        jVar.mo51187a("cursor", j);
        jVar.mo51186a("count", 8);
        jVar.mo51188a(POIService.KEY_KEYWORD, str);
        String str4 = "source_platforms";
        if (C6399b.m19946v()) {
            str3 = "[71,74]";
        } else {
            str3 = "[22]";
        }
        jVar.mo51188a(str4, str3);
        jVar.mo51188a("search_source", str2);
        if (C6399b.m19945u()) {
            jVar.mo51188a("search_channel", "aweme_music_create");
        }
        return jVar.toString();
    }

    /* renamed from: b */
    public static String m108897b(String str, long j, String str2) throws Exception {
        String str3;
        C19290j jVar = new C19290j("https://api2.musical.ly/aweme/v1/music/search/");
        jVar.mo51187a("cursor", j);
        jVar.mo51186a("count", 8);
        jVar.mo51188a(POIService.KEY_KEYWORD, str);
        String str4 = "source_platforms";
        if (C6399b.m19946v()) {
            str3 = "[71,74]";
        } else {
            str3 = "[22]";
        }
        jVar.mo51188a(str4, str3);
        jVar.mo51188a("search_source", str2);
        jVar.mo51188a("search_source", "aweme_lyric_sticker");
        jVar.mo51188a("search_channel", "aweme_lyric");
        return jVar.toString();
    }
}
