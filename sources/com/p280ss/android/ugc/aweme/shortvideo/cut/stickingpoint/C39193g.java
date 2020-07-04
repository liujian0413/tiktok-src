package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g */
public final class C39193g {

    /* renamed from: a */
    public static final C39193g f101577a = new C39193g();

    /* renamed from: b */
    private static String f101578b = null;

    /* renamed from: c */
    private static String f101579c = null;

    /* renamed from: d */
    private static final String f101580d = f101580d;

    /* renamed from: e */
    private static String f101581e;

    private C39193g() {
    }

    /* renamed from: a */
    public static String m125126a() {
        return f101579c;
    }

    /* renamed from: a */
    public final void mo97482a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2) {
            C6907h.m21524a("edit_clip", (Map) m125130b(z).mo59973a("edit_way", "click").f60753a);
        } else if (z5) {
            C6907h.m21524a("edit_clip_delete", (Map) m125130b(z).f60753a);
        } else if (z3) {
            C6907h.m21524a("edit_clip_complete", (Map) m125130b(z).f60753a);
        } else if (z4) {
            C6907h.m21524a("edit_clip_cancel", (Map) m125130b(z).f60753a);
        } else if (z6) {
            C6907h.m21524a("edit_clips_order", (Map) m125130b(z).mo59973a("edit_way", "press").f60753a);
        }
    }

    /* renamed from: c */
    public final void mo97485c() {
        C6907h.m21524a("click_clip_entrance", (Map) m125132f().f60753a);
    }

    /* renamed from: b */
    public static void m125131b() {
        C6907h.m21524a("sound_sync_reminder", (Map) C22984d.m75611a().mo59973a("enter_from", "album_panel").f60753a);
    }

    /* renamed from: d */
    public final void mo97488d() {
        C6907h.m21524a("apply_smart_sync", (Map) m125132f().mo59973a("to_status", "on").f60753a);
    }

    /* renamed from: e */
    public final void mo97490e() {
        C6907h.m21524a("click_upload_entrance", (Map) m125132f().mo59973a("enter_from", "clip_edit_page").f60753a);
    }

    /* renamed from: f */
    private static C22984d m125132f() {
        C22984d a = C22984d.m75611a().mo59973a("shoot_way", f101578b).mo59973a("creation_id", f101579c).mo59973a("enter_from", f101580d);
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…(\"enter_from\", enterFrom)");
        return a;
    }

    /* renamed from: a */
    public static void m125127a(String str) {
        f101581e = str;
    }

    /* renamed from: b */
    private static C22984d m125130b(boolean z) {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("shoot_way", f101578b).mo59973a("creation_id", f101579c).mo59973a("content_source", "upload");
        String str2 = "content_type";
        if (z) {
            str = "sound_sync";
        } else {
            str = "video";
        }
        C22984d a2 = a.mo59973a(str2, str);
        C7573i.m23582a((Object) a2, "EventMapBuilder.newBuild….STICKPOINT else \"video\")");
        return a2;
    }

    /* renamed from: a */
    public final void mo97476a(AVMusic aVMusic) {
        if (aVMusic != null) {
            C6907h.m21524a("change_music", (Map) m125132f().mo59973a("content_source", "upload").mo59973a("content_type", "sound_sync").mo59973a("music_id", aVMusic.getMusicId()).mo59973a("music_rec_type", "").f60753a);
        }
    }

    /* renamed from: c */
    public final void mo97486c(List<? extends VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            long j = 0;
            if (list == null) {
                C7573i.m23580a();
            }
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f100761c;
            }
            C6907h.m21524a("smart_sync_cancel", (Map) m125132f().mo59971a("content_duration_ms", j).f60753a);
        }
    }

    /* renamed from: d */
    public final void mo97489d(List<? extends VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            long j = 0;
            if (list == null) {
                C7573i.m23580a();
            }
            int i = 0;
            int i2 = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f100761c;
                if (videoSegment.mo96899a()) {
                    i2++;
                }
            }
            String str = "edit_upload_next";
            C22984d a = m125132f().mo59971a("content_duration_ms", j).mo59970a("video_cnt", list.size() - i2).mo59970a("pic_cnt", i2);
            String str2 = "is_multi_content";
            if (list.size() > 1) {
                i = 1;
            }
            C6907h.m21524a(str, (Map) a.mo59970a(str2, i).f60753a);
        }
    }

    /* renamed from: b */
    public final void mo97483b(List<? extends VideoSegment> list) {
        int i;
        if (!C6292i.m19525a(list)) {
            long j = 0;
            if (list == null) {
                C7573i.m23580a();
            }
            int i2 = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f100761c;
                if (videoSegment.mo96899a()) {
                    i2++;
                }
            }
            C22984d a = m125132f().mo59973a("content_type", "video").mo59973a("content_source", "upload").mo59971a("content_duration_ms", j).mo59970a("video_cnt", list.size() - i2).mo59970a("pic_cnt", i2);
            String str = "is_multi_content";
            boolean z = true;
            if (list.size() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            C22984d a2 = a.mo59970a(str, i);
            CharSequence charSequence = f101581e;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                a2.mo59973a("enter_method", f101581e);
            }
            C6907h.m21524a("enter_clip_edit_page", (Map) a2.f60753a);
        }
    }

    /* renamed from: a */
    public final void mo97479a(List<? extends VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            long j = 0;
            if (list == null) {
                C7573i.m23580a();
            }
            int i = 0;
            int i2 = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f100761c;
                if (videoSegment.mo96899a()) {
                    i2++;
                }
            }
            String str = "enter_clip_edit_page";
            C22984d a = m125132f().mo59973a("content_type", "sound_sync").mo59973a("content_source", "upload").mo59971a("content_duration_ms", j).mo59970a("video_cnt", list.size() - i2).mo59970a("pic_cnt", i2);
            String str2 = "is_multi_content";
            if (list.size() > 1) {
                i = 1;
            }
            C6907h.m21524a(str, (Map) a.mo59970a(str2, i).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo97481a(boolean z) {
        String str;
        String str2 = "change_sync_mode";
        C22984d f = m125132f();
        String str3 = "to_status";
        if (z) {
            str = "sync_on";
        } else {
            str = "sync_off";
        }
        C6907h.m21524a(str2, (Map) f.mo59973a(str3, str).f60753a);
    }

    /* renamed from: b */
    public final void mo97484b(List<? extends VideoSegment> list, boolean z) {
        m125129a(list, "exit_clip_popup_confirm", z);
    }

    /* renamed from: c */
    public final void mo97487c(List<? extends VideoSegment> list, boolean z) {
        m125129a(list, "exit_clip_popup_cancel", z);
    }

    /* renamed from: a */
    public static void m125128a(String str, String str2) {
        f101578b = str;
        f101579c = str2;
    }

    /* renamed from: a */
    public final void mo97480a(List<? extends VideoSegment> list, boolean z) {
        m125129a(list, "exit_clip_popup_show", z);
    }

    /* renamed from: a */
    public final void mo97477a(AVMusic aVMusic, int i) {
        if (aVMusic != null) {
            C6907h.m21524a("select_music", (Map) m125132f().mo59973a("content_source", "upload").mo59973a("content_type", "sound_sync").mo59973a("music_id", aVMusic.getMusicId()).mo59970a("music_show_rank", i + 1).mo59973a("music_rec_type", "").mo59973a("tab_name", "recommend").f60753a);
        }
    }

    /* renamed from: a */
    private final void m125129a(List<? extends VideoSegment> list, String str, boolean z) {
        String str2;
        if (!C6292i.m19525a(list)) {
            ArrayList<VideoSegment> arrayList = new ArrayList<>();
            if (list == null) {
                C7573i.m23580a();
            }
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f100768j) {
                    arrayList.add(videoSegment);
                }
            }
            long j = 0;
            for (VideoSegment videoSegment2 : arrayList) {
                j += videoSegment2.f100761c;
            }
            C22984d f = m125132f();
            String str3 = "content_type";
            if (z) {
                str2 = "sound_sync";
            } else {
                str2 = "video";
            }
            C6907h.m21524a(str, (Map) f.mo59973a(str3, str2).mo59973a("content_source", "upload").mo59971a("content_duration_ms", j).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo97478a(AVMusic aVMusic, List<? extends VideoSegment> list, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        if (aVMusic != null && !C6292i.m19525a(list)) {
            long j = 0;
            if (list == null) {
                C7573i.m23580a();
            }
            int i = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f100761c;
                if (videoSegment.mo96899a()) {
                    i++;
                }
            }
            String str4 = "edit_upload_next";
            C22984d a = m125132f().mo59973a("music_id", aVMusic.getMusicId());
            String str5 = "music_selected_from";
            if (z3) {
                str = "recommend";
            } else {
                str = "lib";
            }
            C22984d a2 = a.mo59973a(str5, str);
            String str6 = "sync_mode";
            if (z2) {
                str2 = "sync_on";
            } else {
                str2 = "sync_off";
            }
            C22984d a3 = a2.mo59973a(str6, str2).mo59971a("content_duration_ms", j).mo59970a("video_cnt", list.size() - i).mo59970a("pic_cnt", i);
            String str7 = "is_multi_content";
            int i2 = 1;
            if (list.size() <= 1) {
                i2 = 0;
            }
            C22984d a4 = a3.mo59970a(str7, i2);
            String str8 = "smart_sync";
            if (z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C6907h.m21524a(str4, (Map) a4.mo59973a(str8, str3).f60753a);
        }
    }
}
