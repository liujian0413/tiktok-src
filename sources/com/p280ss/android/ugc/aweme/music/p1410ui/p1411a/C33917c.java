package com.p280ss.android.ugc.aweme.music.p1410ui.p1411a;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.c */
public final class C33917c {
    /* renamed from: a */
    public static void m109332a(String str, long j, String str2, int i) {
        double d;
        long length = new File(str).length();
        if (j == 0) {
            d = 0.0d;
        } else {
            d = (double) (length / j);
        }
        C6893q.m21444a("aweme_music_download_error_rate", 0, C6869c.m21381a().mo16886a("duration", Long.valueOf(j)).mo16885a("downloadStrategy", Integer.valueOf(C33915a.m109326a())).mo16883a("speed", Double.valueOf(d)).mo16886a("size", Long.valueOf(length)).mo16887a("fileUri", str2).mo16887a("hostname", C33784d.m108935c(str2)).mo16885a("source_platform", Integer.valueOf(i)).mo16888b());
    }
}
