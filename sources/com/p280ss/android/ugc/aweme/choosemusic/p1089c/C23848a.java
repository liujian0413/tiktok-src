package com.p280ss.android.ugc.aweme.choosemusic.p1089c;

import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a */
public abstract class C23848a implements C23850b {

    /* renamed from: a */
    public int f62958a = 10;

    /* renamed from: b */
    private List<C23849a> f62959b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a$a */
    public interface C23849a {
        /* renamed from: a */
        void mo61897a(List<MusicSearchHistory> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo61930a(List<MusicSearchHistory> list);

    /* renamed from: a */
    public final void mo61927a() {
        m78111c(new ArrayList());
    }

    /* renamed from: c */
    private void m78111c(List<MusicSearchHistory> list) {
        m78110b(list);
        mo61930a(list);
    }

    /* renamed from: a */
    public final void mo61928a(C23849a aVar) {
        this.f62959b.add(aVar);
    }

    /* renamed from: b */
    public final void mo61931b(C23849a aVar) {
        this.f62959b.remove(aVar);
    }

    /* renamed from: b */
    private void m78110b(List<MusicSearchHistory> list) {
        for (C23849a a : this.f62959b) {
            a.mo61897a(list);
        }
    }

    /* renamed from: a */
    public final void mo61929a(MusicSearchHistory musicSearchHistory) {
        List b = mo61933b();
        if (b == null) {
            b = new ArrayList();
        }
        b.remove(musicSearchHistory);
        m78111c(b);
    }

    /* renamed from: b */
    public final void mo61932b(MusicSearchHistory musicSearchHistory) {
        List b = mo61933b();
        if (b == null) {
            b = new ArrayList();
        }
        b.remove(musicSearchHistory);
        b.add(0, musicSearchHistory);
        if (this.f62958a > 0 && b.size() > this.f62958a) {
            b.remove(b.size() - 1);
        }
        m78111c(b);
    }
}
