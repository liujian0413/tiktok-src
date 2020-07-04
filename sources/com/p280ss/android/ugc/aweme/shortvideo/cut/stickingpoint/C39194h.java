package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.facebook.common.internal.C13315l;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h */
public final class C39194h {

    /* renamed from: a */
    public static final C39194h f101582a = new C39194h();

    private C39194h() {
    }

    /* renamed from: a */
    public static void m125148a(boolean z) {
        boolean z2 = !z;
        C6893q.m21444a("stickpoint_default_alg", z2 ? 1 : 0, C38510bb.m123095a().mo96482b());
    }

    /* renamed from: a */
    public static void m125151a(boolean z, Exception exc) {
        String str;
        String str2 = "stickpoint_musiclist";
        boolean z2 = !z;
        C38510bb a = C38510bb.m123095a();
        String str3 = "exception";
        if (exc == null) {
            str = "";
        } else {
            str = C13315l.m38963c(exc);
        }
        C6893q.m21444a(str2, z2 ? 1 : 0, a.mo96481a(str3, str).mo96482b());
    }

    /* renamed from: a */
    public static void m125149a(boolean z, int i, String str) {
        String str2 = "stickpoint_beats_alg";
        if (z) {
            i = 0;
        }
        C6893q.m21444a(str2, i, C38510bb.m123095a().mo96481a("url", str).mo96482b());
    }

    /* renamed from: b */
    public static void m125154b(boolean z, int i, String str) {
        String str2 = "stickpoint_successively_alg";
        if (z) {
            i = 0;
        }
        C6893q.m21444a(str2, i, C38510bb.m123095a().mo96481a("url", str).mo96482b());
    }

    /* renamed from: a */
    public static void m125150a(boolean z, AVMusic aVMusic, Exception exc) {
        String str;
        String str2;
        String str3;
        String str4 = "stickpoint_download_music";
        boolean z2 = !z;
        C38510bb a = C38510bb.m123095a();
        String str5 = "url";
        if (aVMusic == null) {
            str = "";
        } else {
            str = aVMusic.getPath();
        }
        C38510bb a2 = a.mo96481a(str5, str);
        String str6 = "music_id";
        if (aVMusic == null) {
            str2 = "";
        } else {
            str2 = aVMusic.getMusicId();
        }
        C38510bb a3 = a2.mo96481a(str6, str2);
        String str7 = "exception";
        if (exc == null) {
            str3 = "";
        } else {
            str3 = C13315l.m38963c(exc);
        }
        C6893q.m21444a(str4, z2 ? 1 : 0, a3.mo96481a(str7, str3).mo96482b());
    }

    /* renamed from: a */
    public static void m125153a(boolean z, boolean z2, long j) {
        boolean z3 = !z;
        C6893q.m21444a("stickpoint_smart", z3 ? 1 : 0, C38510bb.m123095a().mo96480a("cast_time", Long.valueOf(j / 1000)).mo96479a("cancel", Integer.valueOf(z2 ? 1 : 0)).mo96482b());
    }

    /* renamed from: a */
    public static void m125152a(boolean z, String str, String str2, Exception exc) {
        String str3;
        String str4 = "stickpoint_download_alg";
        boolean z2 = !z;
        C38510bb a = C38510bb.m123095a().mo96481a("url", str).mo96481a("alg_type", str2);
        String str5 = "exception";
        if (exc == null) {
            str3 = "";
        } else {
            str3 = C13315l.m38963c(exc);
        }
        C6893q.m21444a(str4, z2 ? 1 : 0, a.mo96481a(str5, str3).mo96482b());
    }
}
