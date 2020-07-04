package com.p280ss.android.ugc.aweme.music.p1410ui.p1414d;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.a */
public final class C33952a {

    /* renamed from: a */
    public static final C33953a f88585a = new C33953a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.d.a$a */
    public static final class C33953a {
        private C33953a() {
        }

        public /* synthetic */ C33953a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m109412a(String str, String str2) {
            C6907h.m21524a("video_play", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("group_id", str).mo59973a("author_id", str2).f60753a);
        }

        /* renamed from: b */
        public static void m109416b(String str, String str2) {
            C6907h.m21524a("video_play_finish", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("group_id", str).mo59973a("author_id", str2).f60753a);
        }

        /* renamed from: a */
        public static void m109415a(String str, boolean z) {
            String str2;
            String str3 = "slide_similar_song_list";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("music_id", str);
            String str4 = "action_type";
            if (z) {
                str2 = "up";
            } else {
                str2 = "down";
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
        }

        /* renamed from: a */
        public static void m109413a(String str, String str2, Long l) {
            C6907h.m21524a("play_time", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("group_id", str).mo59973a("author_id", str2).mo59972a("duration", (Object) l).f60753a);
        }

        /* renamed from: c */
        public static void m109418c(String str, String str2, String str3, String str4) {
            C6907h.m21524a("favourite_song", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("music_id", str).mo59973a("from_music_id", str3).f60753a);
        }

        /* renamed from: d */
        public static void m109419d(String str, String str2, String str3, String str4) {
            C6907h.m21524a("cancel_favourite_song", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("music_id", str).mo59973a("from_music_id", str3).f60753a);
        }

        /* renamed from: b */
        public static void m109417b(String str, String str2, String str3, String str4) {
            C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("music_id", str).mo59973a("from_music_id", str3).f60753a);
        }

        /* renamed from: a */
        public static void m109414a(String str, String str2, String str3, String str4) {
            C6907h.m21524a("show_similar_song", (Map) C22984d.m75611a().mo59973a("enter_from", "similar_song").mo59973a("music_id", str).mo59973a("similar_song_id", str3).f60753a);
        }
    }
}
