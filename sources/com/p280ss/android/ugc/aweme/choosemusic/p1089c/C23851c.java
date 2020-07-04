package com.p280ss.android.ugc.aweme.choosemusic.p1089c;

import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.c */
public class C23851c extends C23848a {

    /* renamed from: b */
    private static volatile C23851c f62960b;

    private C23851c() {
    }

    /* renamed from: b */
    public final List<MusicSearchHistory> mo61933b() {
        return C33781b.m108909a("music_search_history_lyric", MusicSearchHistory.class, "music_sp");
    }

    /* renamed from: c */
    public static C23851c m78120c() {
        if (f62960b == null) {
            synchronized (C23851c.class) {
                if (f62960b == null) {
                    f62960b = new C23851c();
                }
            }
        }
        return f62960b;
    }

    /* renamed from: a */
    public final void mo61930a(List<MusicSearchHistory> list) {
        C33781b.m108910a("music_search_history_lyric", list, "music_sp");
    }
}
