package com.p280ss.android.ugc.aweme.feed.p1227c;

import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.playerkit.model.C44919c;

/* renamed from: com.ss.android.ugc.aweme.feed.c.af */
final /* synthetic */ class C28237af implements Runnable {

    /* renamed from: a */
    private final C28256q f74391a;

    /* renamed from: b */
    private final C44919c f74392b;

    /* renamed from: c */
    private final Video f74393c;

    /* renamed from: d */
    private final C28130ac f74394d;

    C28237af(C28256q qVar, C44919c cVar, Video video, C28130ac acVar) {
        this.f74391a = qVar;
        this.f74392b = cVar;
        this.f74393c = video;
        this.f74394d = acVar;
    }

    public final void run() {
        this.f74391a.mo71929b(this.f74392b, this.f74393c, this.f74394d);
    }
}
