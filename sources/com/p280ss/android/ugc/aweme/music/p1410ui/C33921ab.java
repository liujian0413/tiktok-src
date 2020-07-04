package com.p280ss.android.ugc.aweme.music.p1410ui;

import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ab */
final /* synthetic */ class C33921ab implements Runnable {

    /* renamed from: a */
    private final C34018y f88515a;

    /* renamed from: b */
    private final C43657a f88516b;

    /* renamed from: c */
    private final MusicModel f88517c;

    /* renamed from: d */
    private final int f88518d;

    /* renamed from: e */
    private final String f88519e;

    C33921ab(C34018y yVar, C43657a aVar, MusicModel musicModel, int i, String str) {
        this.f88515a = yVar;
        this.f88516b = aVar;
        this.f88517c = musicModel;
        this.f88518d = i;
        this.f88519e = str;
    }

    public final void run() {
        this.f88515a.mo86676a(this.f88516b, this.f88517c, this.f88518d, this.f88519e);
    }
}
