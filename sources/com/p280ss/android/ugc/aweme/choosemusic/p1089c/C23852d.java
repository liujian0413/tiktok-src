package com.p280ss.android.ugc.aweme.choosemusic.p1089c;

import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.d */
public class C23852d extends C23848a {

    /* renamed from: b */
    private static volatile C23852d f62961b;

    private C23852d() {
    }

    /* renamed from: b */
    public final List<MusicSearchHistory> mo61933b() {
        return C33781b.m108909a("music_search_history", MusicSearchHistory.class, "music_sp");
    }

    /* renamed from: c */
    public static C23852d m78123c() {
        if (f62961b == null) {
            synchronized (C23852d.class) {
                if (f62961b == null) {
                    f62961b = new C23852d();
                }
            }
        }
        return f62961b;
    }

    /* renamed from: a */
    public final void mo61930a(List<MusicSearchHistory> list) {
        C33781b.m108910a("music_search_history", list, "music_sp");
    }
}
